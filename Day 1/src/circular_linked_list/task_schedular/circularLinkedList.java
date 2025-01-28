package circular_linked_list.task_schedular;

public class circularLinkedList {

    Task head;
    Task tail;

    // Add a task at the beginning
    void addAtFront(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head; // Circular link
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head; // Update tail's next pointer
        }
    }

    // Add a task at the end
    void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (tail == null) {
            head = tail = newTask;
            tail.next = head; // Circular link
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head; // Update tail's next pointer
        }
    }

    // Add a task at a specific position
    void addAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (position == 1) {
            addAtFront(taskId, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        if (temp.next == head) {
            addAtEnd(taskId, taskName, priority, dueDate);
        } else {
            newTask.next = temp.next;
            temp.next = newTask;
        }
    }

    // Remove a task by Task ID
    void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("No tasks in the scheduler!");
            return;
        }
        if (head.taskId == taskId) {
            if (head == tail) { // Only one task in the list
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head; // Maintain circular nature
            }
            System.out.println("Task with ID " + taskId + " removed.");
            return;
        }
        Task temp = head;
        while (temp.next != head && temp.next.taskId != taskId) {
            temp = temp.next;
        }
        if (temp.next == head) {
            System.out.println("Task with ID " + taskId + " not found!");
        } else {
            temp.next = temp.next.next;
            if (temp.next == head) { // If the removed task was the last one
                tail = temp;
            }
            System.out.println("Task with ID " + taskId + " removed.");
        }
    }

    // View the current task and move to the next task
    Task currentTask = null;

    void viewAndMoveToNextTask() {
        if (head == null) {
            System.out.println("No tasks in the scheduler!");
            return;
        }
        if (currentTask == null) {
            currentTask = head;
        }
        System.out.println("Current Task: Task ID: " + currentTask.taskId + ", Name: " + currentTask.taskName +
                ", Priority: " + currentTask.priority + ", Due Date: " + currentTask.dueDate);
        currentTask = currentTask.next;
    }

    // Display all tasks
    void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display!");
            return;
        }
        Task temp = head;
        System.out.println("Tasks in the Scheduler:");
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a task by Priority
    void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks in the scheduler!");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Found Task: Task ID: " + temp.taskId + ", Name: " + temp.taskName +
                        ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks found with Priority " + priority);
        }
    }
}

package circular_linked_list.task_schedular;

public class Main {
    public static void main(String[] args) {
        circularLinkedList taskScheduler = new circularLinkedList();

        // Add tasks
        taskScheduler.addAtEnd(1, "Complete Report", 2, "2025-02-01");
        taskScheduler.addAtEnd(2, "Prepare Presentation", 1, "2025-02-03");
        taskScheduler.addAtFront(3, "Code Review", 3, "2025-01-30");

        // Display tasks
        taskScheduler.displayAllTasks();

        // View and move to the next task

        taskScheduler.viewAndMoveToNextTask();
        taskScheduler.viewAndMoveToNextTask();

        // Search by priority
        taskScheduler.searchByPriority(2);

        // Remove a task by Task ID
        taskScheduler.removeByTaskId(2);

        // Display tasks after removal
        taskScheduler.displayAllTasks();
    }
}

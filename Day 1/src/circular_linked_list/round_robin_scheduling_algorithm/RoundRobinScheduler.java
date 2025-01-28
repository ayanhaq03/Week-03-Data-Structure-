package circular_linked_list.round_robin_scheduling_algorithm;

class RoundRobinScheduler {
    private Process tail;
    private int timeQuantum;

    RoundRobinScheduler(int timeQuantum) {
        this.tail = null;
        this.timeQuantum = timeQuantum;
    }

    // Add a new process at the end of the circular list
    public void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);
        if (tail == null) {
            tail = newProcess;
            tail.next = tail;
        } else {
            newProcess.next = tail.next;
            tail.next = newProcess;
            tail = newProcess;
        }
    }

    // Remove a process by Process ID
    public void removeProcess(int processID) {
        if (tail == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process current = tail.next;
        Process previous = tail;

        do {
            if (current.processID == processID) {
                if (current == tail && current.next == tail) { // Only one process in the list
                    tail = null;
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                }
                return;
            }
            previous = current;
            current = current.next;
        } while (current != tail.next);

        System.out.println("Process with ID " + processID + " not found.");
    }

    // Simulate round-robin scheduling
    public void simulate() {
        if (tail == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int processCount = 0;

        Process current = tail.next;
        System.out.println("Starting Round-Robin Scheduling...");

        while (tail != null) {
            processCount++;
            System.out.println("\nCurrent Queue:");
            displayProcesses();

            int executionTime = Math.min(current.burstTime, timeQuantum);
            current.burstTime -= executionTime;

            System.out.println("Executing Process ID: " + current.processID + " for " + executionTime + " units.");

            if (current.burstTime == 0) {
                System.out.println("Process ID: " + current.processID + " completed execution.");
                int turnAroundTime = executionTime + totalWaitingTime;
                totalTurnAroundTime += turnAroundTime;
                totalWaitingTime += executionTime;

                Process temp = current.next;
                removeProcess(current.processID);
                current = temp;

                if (tail == null) { // All processes completed
                    break;
                }
            } else {
                current = current.next;
            }
        }

        // Calculate and display average waiting time and turn-around time
        double avgWaitingTime = (double) totalWaitingTime / processCount;
        double avgTurnAroundTime = (double) totalTurnAroundTime / processCount;

        System.out.println("\nAll processes completed.");
        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turn-Around Time: " + avgTurnAroundTime);
    }

    // Display the processes in the circular queue
    public void displayProcesses() {
        if (tail == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process current = tail.next;
        do {
            System.out.println("Process ID: " + current.processID + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
            current = current.next;
        } while (current != tail.next);
    }
}
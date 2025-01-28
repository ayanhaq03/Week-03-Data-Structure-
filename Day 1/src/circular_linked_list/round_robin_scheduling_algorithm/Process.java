package circular_linked_list.round_robin_scheduling_algorithm;

class Process {
    int processID;
    int burstTime;
    int priority;
    Process next;

    Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
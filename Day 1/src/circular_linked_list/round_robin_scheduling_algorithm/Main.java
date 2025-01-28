package circular_linked_list.round_robin_scheduling_algorithm;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);

        // Add processes
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 4, 2);
        scheduler.addProcess(3, 5, 3);
        scheduler.addProcess(4, 8, 1);

        // Simulate round-robin scheduling
        scheduler.simulate();

    }
}

package stack_and_queues.cirular_tour_problem;


   import java.util.LinkedList;
import java.util.Queue;

    class circularTour{
        static class PetrolPump {
            int petrol, distance;

            PetrolPump(int p, int d) {
                this.petrol = p;
                this.distance = d;
            }
        }

        public static int findStartingPoint(int[] petrol, int[] distance) {
            int n = petrol.length;
            Queue<Integer> queue = new LinkedList<>();
            int start = 0, totalSurplus = 0, currentSurplus = 0;

            for (int i = 0; i < n; i++) {
                int diff = petrol[i] - distance[i];
                totalSurplus += diff;
                currentSurplus += diff;
                queue.add(i);

                // If at any point, currentSurplus becomes negative, reset the queue
                if (currentSurplus < 0) {
                    start = i + 1;  // Move to the next pump
                    currentSurplus = 0;
                    queue.clear();
                }
            }

            return (totalSurplus >= 0) ? start : -1;  // Check if the tour is possible
        }

        public static void main(String[] args) {
            int[] petrol = {4, 6, 7, 4};
            int[] distance = {6, 5, 3, 5};

            int startIndex = findStartingPoint(petrol, distance);

            if (startIndex == -1) {
                System.out.println("No circular tour is possible.");
            } else {
                System.out.println("Start at petrol pump: " + startIndex);
            }
        }
    }
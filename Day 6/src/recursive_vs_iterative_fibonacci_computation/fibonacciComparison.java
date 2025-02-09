package recursive_vs_iterative_fibonacci_computation;


public class fibonacciComparison {
    public static void main(String[] args) {
        int n = 30;

        // Measure recursive Fibonacci time
        long startTime = System.currentTimeMillis();
        int fibRecursive = fibonacciRecursive(n);
        long endTime = System.currentTimeMillis();
        System.out.println("Recursive Fibonacci(" + n + ") = " + fibRecursive + " | Time: " + (endTime - startTime) + "ms");

        // Measure iterative Fibonacci time
        startTime = System.currentTimeMillis();
        int fibIterative = fibonacciIterative(n);
        endTime = System.currentTimeMillis();
        System.out.println("Iterative Fibonacci(" + n + ") = " + fibIterative + " | Time: " + (endTime - startTime) + "ms");
    }

    // Recursive Fibonacci (Exponential Time Complexity O(2^n))
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci (Linear Time Complexity O(N))
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}

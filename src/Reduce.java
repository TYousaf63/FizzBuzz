public class Reduce {

    // Method that takes an integer n and returns the number of steps to reduce it to 0
    public static int reduceToZero(int n) {
        int steps = 0;

        // Loop until n becomes 0
        while (n > 0) {
            if (n % 2 == 0) {
                // If n is even, divide by 2
                n /= 2;
            } else {
                // If n is odd, subtract 1
                n -= 1;
            }
            steps++; // Increment the step counter
        }

        return steps; // Return the number of steps
    }
}
public class Multiples {
    public static void main(String[] args) {
        int limit = 1000;
        int count = 0;

        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }

        System.out.println("The number of multiples of 3 or 5 below 1000 is: " + count);
    }
}


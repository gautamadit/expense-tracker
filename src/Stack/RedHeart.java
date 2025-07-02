package Stack;

public class RedHeart {
    // ANSI escape code for red text
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        int i, j;
        int n = 6;

        for (i = n / 2; i <= n; i += 2) {
            // print spaces
            for (j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }

            // print red stars for left half of heart
            for (j = 1; j <= i; j++) {
                System.out.print(RED + "*" + RESET);
            }

            // print spaces between halves
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print red stars for right half of heart
            for (j = 1; j <= i; j++) {
                System.out.print(RED + "*" + RESET);
            }

            System.out.println();
        }

        // lower part of the heart
        for (i = n; i >= 1; i--) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(RED + "*" + RESET);
            }

            System.out.println();
        }
    }
}

public class ThreeDigitCodes {

    // Using three for loops to display unique three-digit numbers using only the digits 1, 2, 3 & 4.
    public static void main(String[] args) {
        // Initialising the variable that will show how many three-digit numbers have been generated
        int totalNums = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    // Checking to see if the numbers generated for the three-digit number from each loop are the same at all.
                    if (k != i && k != j && i != j) {
                        totalNums++;    // Add 1 to count how many numbers have been generated
                        System.out.println(i + "" + j + "" + k);    // Form the number
                    }
                }
            }
        }
        System.out.println("The total amount of three-digit numbers that are possible is: " + totalNums);
    }
}

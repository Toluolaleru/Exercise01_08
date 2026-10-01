import java.util.Scanner;

class PerfectSquare {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // I Check if there is an integer available in the input stream
        if (scanner.hasNextInt()) {
            // Read input integer
            int number = scanner.nextInt();
            
            // Created a Variable to track if number is a perfect square
            boolean isPerfectSquare = false;
            
            // used Loop from 1 to test if i * i equals number
            for (int i = 1; i * i <= number; i++) {
                if (i * i == number) {
                    isPerfectSquare = true;
                    break;
                }
            }
            
            // show Output result based on condition
            if (isPerfectSquare) {
                System.out.println(number + " is a perfect square.");
            } else {
                System.out.println(number + " is not a perfect square.");
            }
        }
        
        scanner.close();
    }
}

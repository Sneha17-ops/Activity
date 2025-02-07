import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it's a prime number: ");
        int number = scanner.nextInt();

        // Call the method to check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Numbers less than 2 are not prime
        if (n < 2) {
            return false;
        }

        // Initialize variables for the while loop
        int i = 2;
        while (i <= Math.sqrt(n)) {
            // If n is divisible by i, it's not prime
            if (n % i == 0) {
                return false;
            }
            i++;
        }

        // If no factors were found, the number is prime
        return true;
    }
}

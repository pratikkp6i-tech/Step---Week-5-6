import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Safety check for negative numbers
        if (num < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Create the array
            String[] results = new String[num + 1];

            for (int i = 0; i <= num; i++) {
                if (i == 0) {
                    results[i] = "0";
                } else if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    // Simplest way to convert int to String
                    results[i] = i + ""; 
                }
            }

            // Output the results
            for (int i = 0; i < results.length; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }
        
        sc.close();
    }
}
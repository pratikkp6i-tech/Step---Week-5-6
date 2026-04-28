import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // a. Take the input for a number
        System.out.print("Enter a number: ");
        long inputNumber = sc.nextLong();
        
        // Handle negative numbers by taking absolute value
        long temp = Math.abs(inputNumber);
        long numberCopy = temp;

        // b. Find the count of digits in the number
        int count = 0;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        // c. Find the digits in the number and save them in an array
        int[] digitsArray = new int[count];
        temp = numberCopy;
        for (int i = count - 1; i >= 0; i--) {
            digitsArray[i] = (int) (temp % 10);
            temp /= 10;
        }

        // d. Find the frequency of each digit
        // Define a frequency array of size 10 (for digits 0 through 9)
        int[] frequency = new int[10];

        // Loop through the digits array and increase the frequency of each digit
        for (int i = 0; i < digitsArray.length; i++) {
            int digit = digitsArray[i];
            frequency[digit]++;
        }

        // e. Display the frequency of each digit in the number
        System.out.println("Digit frequencies in " + inputNumber + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s).");
            }
        }

        sc.close();
    }
}
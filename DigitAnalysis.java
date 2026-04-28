import java.util.Scanner;

public class DigitAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int maxDigitSize = 10;
        int[] digits = new int[maxDigitSize];
        int index = 0;

        // Extract digits and store in array
        while (number != 0 && index < maxDigitSize) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        sc.close();
    }
}
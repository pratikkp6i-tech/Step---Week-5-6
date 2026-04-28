import java.util.Scanner;

public class DynamicDigitAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large number: ");
        long number = sc.nextLong(); // Using long for very large numbers
        
        int maxDigitSize = 10;
        int[] digits = new int[maxDigitSize];
        int index = 0;

        while (number != 0) {
            // Check if array is full
            if (index == maxDigitSize) {
                maxDigitSize += 10;
                int[] temp = new int[maxDigitSize];
                // Copy old digits to new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            
            digits[index] = (int)(number % 10);
            number = number / 10;
            index++;
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Total digits processed: " + index);
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
        sc.close();
    }
}
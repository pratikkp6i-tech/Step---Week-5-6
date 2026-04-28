import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // 1. Check if the number is natural (positive)
        if (number <= 0) {
            System.out.println("Error: Not a natural number.");
        } else {
            // 2. Create arrays large enough to avoid IndexOutOfBounds
            int[] odd = new int[number];
            int[] even = new int[number];
            int oIdx = 0;
            int eIdx = 0;

            // 3. Fill the arrays
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    even[eIdx] = i;
                    eIdx++;
                } else {
                    odd[oIdx] = i;
                    oIdx++;
                }
            }

            // 4. Print the results using the counters
            System.out.print("Odd Array: ");
            for (int i = 0; i < oIdx; i++) {
                System.out.print(odd[i] + " ");
            }

            System.out.print("\nEven Array: ");
            for (int i = 0; i < eIdx; i++) {
                System.out.print(even[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
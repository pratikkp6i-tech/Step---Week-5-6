import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        // Step 1: Get input
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        // Step 2: Check Positive, Negative, Zero, and Even/Odd
        for (int n : nums) {
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println(n + " is positive and even");
                } else {
                    System.out.println(n + " is positive and odd");
                }
            } else if (n < 0) {
                System.out.println(n + " is negative");
            } else {
                System.out.println(n + " is zero");
            }
        }

        // Step 3: Compare first and last elements
        int first = nums[0];
        int last = nums[nums.length - 1];

        if (first == last) {
            System.out.println("First and last elements are equal");
        } else if (first > last) {
            System.out.println("First element is greater than last");
        } else {
            System.out.println("First element is less than last");
        }

        sc.close();
    }
}
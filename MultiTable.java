import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] results = new int[10];

        for (int i = 0; i < 10; i++) {
            results[i] = num * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + results[i]);
        }
        sc.close();
    }
}
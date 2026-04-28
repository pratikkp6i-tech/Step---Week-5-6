import java.util.Scanner;

public class ArraySumLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index >= 10) break;
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0) break;

            values[index] = input;
            index++;
        }

        System.out.print("Numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " ");
            total += values[i];
        }
        System.out.println("\nTotal Sum: " + total);
        sc.close();
    }
}
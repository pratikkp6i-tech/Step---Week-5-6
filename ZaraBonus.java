import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        
        double totalBonusPayout = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Salary and Years of Service for employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Try again.");
                i--; // Decrement counter to retry this index
                continue;
            }
            salary[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            double bonusPercent = (years[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salary[i] * bonusPercent;
            newSalaries[i] = salary[i] + bonuses[i];

            totalBonusPayout += bonuses[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonusPayout);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        sc.close();
    }
}
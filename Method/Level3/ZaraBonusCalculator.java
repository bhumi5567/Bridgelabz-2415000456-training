package method;

public class ZaraBonusCalculator {

    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2]; // [salary, yearsOfService]
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            data[i][1] = 1 + (int)(Math.random() * 10); // Years of service (1 to 10)
        }
        return data;
    }

    public static double[][] calculateNewSalariesAndBonuses(int[][] data) {
        int n = data.length;
        double[][] results = new double[n][2]; // [newSalary, bonus]
        for (int i = 0; i < n; i++) {
            int salary = data[i][0];
            int service = data[i][1];
            double bonus = (service > 5) ? salary * 0.05 : salary * 0.02;
            results[i][1] = bonus;
            results[i][0] = salary + bonus;
        }
        return results;
    }

    public static void displayResults(int[][] data, double[][] results) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("Emp\tOldSalary\tService\tBonus\t\tNewSalary");
        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int service = data[i][1];
            double bonus = results[i][1];
            double newSalary = results[i][0];
            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f\n", i + 1, oldSalary, service, bonus, newSalary);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t\t%.2f\t\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] resultData = calculateNewSalariesAndBonuses(employeeData);
        displayResults(employeeData, resultData);
    }
}

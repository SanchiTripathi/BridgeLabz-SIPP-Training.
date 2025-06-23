package Method;
public class Bonus {

	public static void main(String[] args) {
        int numEmployees = 10;

        // Step 1: Generate salary and years of service
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Step 2: Calculate bonus and new salary
        double[][] resultData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display results
        displayResults(employeeData, resultData);
    }

    // Step 1: Generate random salary and service years
    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2]; // [][0]=salary, [][1]=years

        for (int i = 0; i < n; i++) {
            int salary = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            int years = (int)(Math.random() * 11); // 0–10 years of service
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Step 2: Calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        int n = data.length;
        double[][] result = new double[n][2]; // [][0]=bonus, [][1]=new salary

        for (int i = 0; i < n; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Step 3: Display all data in table format with totals
    public static void displayResults(int[][] employeeData, double[][] resultData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s%-15s%-15s%-15s%-15s%n", "Emp ID", "Old Salary", "Years Service", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = resultData[i][0];
            double newSalary = resultData[i][1];

            System.out.printf("%-10d%-15d%-15d%-15.2f%-15.2f%n", (i + 1), oldSalary, years, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-10s%-15.2f%-15s%-15.2f%-15.2f%n", "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }

}

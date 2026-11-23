import java.util.Scanner;
public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Employee ID: ");
		int Id = sc.nextInt();
		sc.nextLine(); // error fix
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Basic Salary: ");
		String basicSalary = sc.nextLine();

		System.out.print("Bonus Percentage: ");
        String bonusPerc = sc.nextLine();

		System.out.print("Active: ");
        Boolean active = sc.nextBoolean();

        double salary = 0;
        double bonusPercent = 0;

        try {
            salary = Double.parseDouble(basicSalary);
            bonusPercent = Double.parseDouble(bonusPerc);
            if (salary < 0 || bonusPercent < 0) {
                System.out.println("Salary and bonus cannot be negative.");
                sc.close();
                return;
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid salary or bonus input!");
            sc.close();
            return;
        }

        double bonus = salary * bonusPercent / 100;
        double finalSalary = salary + bonus;

        String uppName = name.toUpperCase();
        StringBuilder sb = new StringBuilder(name);
        String revName = sb.reverse().toString();

        System.out.println("\nEmployee ID: " + Id);
        System.out.println("Employee Name: " + uppName);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Final Salary: " + finalSalary);
        System.out.println("Active: " + active);
        System.out.println("Reversed Name: " + revName);

        if (finalSalary > 75000) {
            System.out.println("Salary above 75000: Yes");
        } else {
            System.out.println("Salary above 75000: No");
        }
    }
}
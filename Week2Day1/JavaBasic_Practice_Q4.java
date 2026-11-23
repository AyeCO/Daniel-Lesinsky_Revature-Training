public class Q4 {
	public static void main(String[] args) {
		String age = "25";
	    String salary = "45000.75";
	    String active = "true";
	
	    Integer ageInt = Integer.parseInt(age);
	    Double salaryDouble = Double.parseDouble(salary);
	    Boolean activeBool = Boolean.parseBoolean(active);
	    Double newSalary = salaryDouble * 1.1;
	       
	    System.out.println("Age: " + ageInt);
	    System.out.println("Age Data Type: " + ageInt.getClass().getSimpleName());
	
	    System.out.println("Salary: " + salaryDouble);
	    System.out.println("Salary Data Type: " + salaryDouble.getClass().getSimpleName());
	
	    System.out.println("Active: " + activeBool);
	    System.out.println("Active Data Type: " + activeBool.getClass().getSimpleName());
	
	    System.out.println("New Salary: " + newSalary);
	    System.out.println("New Salary Data Type: " + newSalary.getClass().getSimpleName());
	}
}
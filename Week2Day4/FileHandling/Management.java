package week2.day4.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Management {

	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		emps[0] = new Employee (100, "John", "IT", 70000);
		emps[1] = new Employee (101, "Josh", "Marketing", 55000);
		emps[2] = new Employee (102, "Barb", "HR", 50000);
		emps[3] = new Employee (103, "Jason", "Sales", 60000);
		emps[4] = new Employee (104, "Jill", "Management", 65000);
		
		//Write to file
		try (FileOutputStream fos = new FileOutputStream("employees.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){ 
			oos.writeObject(emps);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//Read from file
		try (FileInputStream fis = new FileInputStream("employees.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			Employee[] filedEmps = (Employee[]) ois.readObject();
			
			System.out.println("Employees from file:\n");
			for(int i = 0; i < filedEmps.length; i++) {
				System.out.println(filedEmps[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}

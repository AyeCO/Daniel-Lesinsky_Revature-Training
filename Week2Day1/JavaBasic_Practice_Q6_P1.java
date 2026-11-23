import java.util.Scanner;
public class Q6P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input:\na = ");
		int a = sc.nextInt();
		
		System.out.print("b = ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nOutput:\na = " + a);
        System.out.println("b = " + b);
		
	}
}
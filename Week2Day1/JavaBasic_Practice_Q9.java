import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String str = sc.nextLine();

		int[] frequency = new int[65536];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			frequency[ch]++;
		}
		boolean found = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (frequency[ch] == 1) {
				System.out.println("Output: " + ch);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("\nNo non-repeated character");
		}
	}
}
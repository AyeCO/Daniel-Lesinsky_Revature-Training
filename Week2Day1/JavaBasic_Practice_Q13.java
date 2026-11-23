import java.util.Scanner;
public class Q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		String str = sc.nextLine();

		StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            }
            else {
                if (word.length() > 0) {
                    result.append(word.reverse()).append(" ");
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) {
            result.append(word.reverse());
        }

        System.out.println("\nOutput:");
        System.out.println(result.toString().trim());
    }
}
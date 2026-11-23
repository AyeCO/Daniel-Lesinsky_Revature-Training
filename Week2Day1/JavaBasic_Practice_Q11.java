public class Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String str = sc.nextLine();;

		int[] lastSeen = new int[65536];
        for (int i = 0; i < lastSeen.length; i++) {
            lastSeen[i] = -1;
        }

        int start = 0;
        int maxLength = 0;
        int maxStart = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (lastSeen[ch] >= start) {
                start = lastSeen[ch] + 1;
            }

            lastSeen[ch] = i;
            int currentLength = i - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStart = start;
            }
        }

        String longestSubstring = str.substring(maxStart, maxStart + maxLength);

        System.out.println("\nOutput: " + maxLength);
        System.out.println("\nExplanation: " + longestSubstring);
	}
}
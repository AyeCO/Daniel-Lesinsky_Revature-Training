public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        boolean isAnagram = true;
        
        if(str1 == str2) {
        	isAnagram = false;
        }
        if (str1.length() != str2.length()) {
            isAnagram = false;
        }
        
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {

                if (arr1[i] > arr1[j]) {
                    char temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        // Sort second character array
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {

                if (arr2[i] > arr2[j]) {
                    char temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram = false;
                break;
            }
        }
        
        if(isAnagram) {
        	System.out.println("Output:\nAnagram");
        }
        else {
        	System.out.println("Output:\nNot Anagram");
        }
        
	}
}
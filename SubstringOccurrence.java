import java.util.Scanner;

public class SubstringOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String s = sc.next();
        System.out.print("Enter the substring: ");
        String subString = sc.next();
        sc.close();
        
        int fCount = 0;
        for (int i = 0; i <= s.length() - subString.length(); i++) {
            int j;
            for (j = 0; j < subString.length(); j++) {
                if (s.charAt(i + j) != subString.charAt(j)) {
                    break; 
                }
            }
            if (j == subString.length()) {
                fCount++;
            }
        }

        System.out.println("The substring occurs " + fCount + " times.");
    }
}

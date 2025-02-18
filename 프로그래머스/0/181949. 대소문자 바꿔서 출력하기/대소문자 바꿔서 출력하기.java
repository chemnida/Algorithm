import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        System.out.println(changeCase(a));
    }

    // Method to change the case of each letter
    public static String changeCase(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c); // Non-alphabet characters are unchanged
            }
        }
        
        return result.toString();
    }
}

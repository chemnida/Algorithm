import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        System.out.println(changeCase(a));
    }

    // 대소문자 변환 메서드
    public static String changeCase(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));  // 소문자 -> 대문자
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));  // 대문자 -> 소문자
            } else {
                result.append(c);  // 알파벳이 아닌 문자는 그대로
            }
        }
        
        return result.toString();
    }
}

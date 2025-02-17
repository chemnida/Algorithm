import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 문자열 입력받기
        String str1 = scanner.next();
        String str2 = scanner.next();
        
        // 문자열 이어 붙여 출력
        System.out.println(str1 + str2);
        
        scanner.close();
    }
}

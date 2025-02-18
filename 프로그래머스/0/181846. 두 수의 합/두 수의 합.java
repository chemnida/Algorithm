import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        // BigInteger를 사용하여 큰 수 연산 수행
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        
        BigInteger result = num1.add(num2);  // 두 수를 더함
        
        return result.toString();  // 결과를 문자열로 변환하여 반환
    }
}

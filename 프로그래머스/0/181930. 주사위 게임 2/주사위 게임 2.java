class Solution {
    public int solution(int a, int b, int c) {
        // 세 정수가 모두 다를 때
        if (a != b && a != c && b != c) {
            return a + b + c;
        }
        // 두 개의 정수가 같고, 하나만 다를 때
        else if (a == b && b != c || a == c && a != b || b == c && a != b) {
            return (a + b + c) * (a * a + b * b + c * c);
        }
        // 세 정수가 모두 같을 때
        else {
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        }
    }
}

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        
        // 등차수열의 1항부터 n항까지 순차적으로 처리
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                // i+1번째 항의 값 (a + i * d)
                sum += a + i * d;
            }
        }
        
        return sum;
    }
}

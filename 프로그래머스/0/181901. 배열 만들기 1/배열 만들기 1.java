class Solution {
    public int[] solution(int n, int k) {
        // n까지의 숫자 중 k의 배수만 담을 수 있는 배열 크기 설정
        int size = n / k;
        int[] result = new int[n / k];
        
        // k의 배수를 배열에 저장
        for (int i = 1; i <= size; i++) {
            result[i - 1] = i * k;  // i * k는 k의 배수
        }
        
        return result;
    }
}

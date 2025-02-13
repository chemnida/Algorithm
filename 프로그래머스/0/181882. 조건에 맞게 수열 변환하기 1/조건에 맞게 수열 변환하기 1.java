class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        // 배열의 각 요소를 순차적으로 처리
        for (int i = 0; i < len; i++) {
            // 50보다 크거나 같은 짝수일 경우
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            }
            // 50보다 작은 홀수일 경우
            else if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] = arr[i] * 2;
            }
        }
        
        return arr;
    }
}

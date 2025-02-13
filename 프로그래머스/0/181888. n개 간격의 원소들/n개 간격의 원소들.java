class Solution {
    public int[] solution(int[] num_list, int n) {
        // result 배열 크기 계산: n 간격으로 원소를 뽑기 때문에 num_list.length / n 크기로 할당
        int resultSize = (num_list.length + n - 1) / n;  // 결과 배열의 크기
        int[] result = new int[resultSize];
        
        // n 간격으로 원소를 result 배열에 저장
        for (int i = 0, j = 0; i < num_list.length; i += n) {
            result[j++] = num_list[i];
        }
        
        return result;
    }
}

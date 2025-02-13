class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] result = new int[len-n+1];
        
        // n번째 원소부터 끝까지 result 배열에 채우기
        for (int i = n - 1; i < len; i++) {
            result[i - (n - 1)] = num_list[i]; 
            // result 배열의 적절한 인덱스에 값 대입
        }
        return result;
    }
}


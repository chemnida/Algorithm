class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        
        for(int j = 0; j < num_list.length; j++) {
            int n = num_list[j];
            
            // n이 1이 될 때까지 연산
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;  // 짝수일 경우 2로 나눈다
                } else {
                    n = (n - 1) / 2;  // 홀수일 경우 1을 빼고 2로 나눈다
                }
                count++;  // 연산 횟수 증가
            }
        }
        
        return count;
    }
}

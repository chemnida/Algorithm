class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries를 하나씩 처리
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            // s부터 e까지 arr[i]에 1을 더함
            for (int i = s; i <= e; i++) {
                arr[i]++;
            }
        }
        
        return arr;
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0], e = query[1], k = query[2];

            // s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i] += 1
            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }
}

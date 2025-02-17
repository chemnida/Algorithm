class Solution {
    public int solution(int[][] arr) {
        int n = arr.length; // 행렬의 크기 (n x n)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0; // 대칭이 아니면 즉시 0 반환
                }
            }
        }
        return 1; // 모든 요소가 대칭이면 1 반환
    }
}
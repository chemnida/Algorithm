public class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;  // 행의 수
        int cols = arr[0].length;  // 열의 수

        // 행의 수가 열의 수보다 크면 열의 수에 맞춰서 각 행에 0을 추가
        if (rows > cols) {
            for (int i = 0; i < rows; i++) {
                int[] newRow = new int[rows];  // 열의 수를 행의 수로 맞추기 위해 새로운 배열 생성
                for (int j = 0; j < cols; j++) {
                    newRow[j] = arr[i][j];  // 기존 배열의 값을 새 배열에 복사
                }
                arr[i] = newRow;  // 새로운 배열로 업데이트
            }
        } 
        // 열의 수가 행의 수보다 크면 행의 수에 맞춰서 각 열에 0을 추가
        else if (cols > rows) {
            int[][] newArr = new int[cols][cols];  // 행의 수에 맞춰 새로운 2차원 배열 생성
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    newArr[i][j] = arr[i][j];  // 기존 배열의 값을 새로운 배열에 복사
                }
            }
            arr = newArr;  // 새로운 배열로 업데이트
        }

        return arr;  // 수정된 이차원 배열 반환
    }
}
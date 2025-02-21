class Solution {
    public int[] solution(int[] arr) {
        int start = -1, end = -1;

        // 2의 첫 번째와 마지막 위치 찾기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i; // 첫 번째 2의 위치 저장
                end = i; // 마지막 2의 위치 갱신
            }
        }

        // 2가 없는 경우 [-1] 반환
        if (start == -1) return new int[]{-1};

        // 2가 포함된 부분 배열 반환
        int[] result = new int[end - start + 1];
        System.arraycopy(arr, start, result, 0, result.length);
        return result;
    }
}

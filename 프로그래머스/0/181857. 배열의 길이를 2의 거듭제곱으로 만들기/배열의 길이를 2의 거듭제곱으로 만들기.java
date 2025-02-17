class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;

        // 배열의 길이가 2의 거듭제곱이라면 그대로 반환
        if ((len & (len - 1)) == 0) {
            return arr;
        } else {
            // 2의 거듭제곱으로 크기 맞추기 위해 추가할 크기 계산
            int size = 1;
            while (size < len) {
                size *= 2;
            }

            // 새로운 크기의 배열 생성
            int[] result = new int[size];
            // 기존 배열의 값을 복사
            for (int i = 0; i < len; i++) {
                result[i] = arr[i];
            }

            return result;
        }
    }
}

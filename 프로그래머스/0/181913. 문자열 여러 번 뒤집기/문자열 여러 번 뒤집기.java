class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray(); // 문자열을 문자 배열로 변환

        for (int[] query : queries) {
            int s = query[0], e = query[1];

            // s부터 e까지의 부분 문자열을 뒤집기 (투 포인터 사용)
            while (s < e) {
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        return new String(arr); // 문자 배열을 다시 문자열로 변환하여 반환
    }
}

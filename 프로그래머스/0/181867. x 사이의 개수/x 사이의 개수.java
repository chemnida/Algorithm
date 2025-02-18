class Solution {
    public int[] solution(String myString) {
        // "x"를 기준으로 문자열을 나눔
        String[] arr = myString.split("x",-1);
        
        // 나눠진 각 문자열의 길이를 저장할 배열 생성
        int[] len = new int[arr.length];
        
        // 각 나눠진 문자열의 길이를 배열에 저장
        for (int i = 0; i < arr.length; i++) {
            len[i] = arr[i].length();  // 각 문자열의 길이
        }
        
        return len;  // 결과 배열 반환
    }
}

class Solution {
    public String solution(String myString, String pat) {
        // myString의 길이
        int n = myString.length();
        
        // 가장 긴 부분 문자열을 찾기 위한 변수
        String longestSubstring = "";
        
        // 뒤에서부터 부분 문자열을 확인하며 찾기
        for (int i = n; i >= 1; i--) {
            // myString의 마지막 i 길이를 가져온 후 pat이 끝나는지 확인
            String substring = myString.substring(0, i);
            if (substring.endsWith(pat)) {
                longestSubstring = substring;  // 해당 부분 문자열을 저장
                break;  // 가장 긴 부분 문자열을 찾았으므로 종료
            }
        }
        
        return longestSubstring;
    }
}

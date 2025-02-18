class Solution {
    public int[] solution(String my_string) {
        // 대문자 A-Z (0~25), 소문자 a-z (26~51)을 위한 배열
        int[] counts = new int[52];
        
        // 문자열을 순차적으로 탐색
        for (char c : my_string.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                counts[c - 'A']++;  // 대문자 A-Z는 0~25 인덱스
            } else if (c >= 'a' && c <= 'z') {
                counts[c - 'a' + 26]++;  // 소문자 a-z는 26~51 인덱스
            }
        }
        
        return counts;
    }
}

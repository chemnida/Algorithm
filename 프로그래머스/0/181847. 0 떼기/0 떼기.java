class Solution {
    public String solution(String n_str) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        // 왼쪽에서 0을 건너뛰기
        while (i < n_str.length() && n_str.charAt(i) == '0') {
            i++;
        }
        
        // 나머지 문자열을 결과에 추가
        result.append(n_str.substring(i));
        
        return result.toString();
    }
}

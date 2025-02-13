class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0];  // 시작 인덱스
            int e = parts[i][1];  // 끝 인덱스
            
            result.append(my_strings[i].substring(s, e + 1));
        }
        
        return result.toString();
    }
}

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // StringBuilder로 my_string을 변환하여 수정 가능하게 함
        StringBuilder sb = new StringBuilder(my_string);
        
        // overwrite_string을 my_string의 s번 인덱스부터 덮어쓰도록 처리
        for (int i = 0; i < overwrite_string.length(); i++) {
            if (s + i < sb.length()) {
                sb.setCharAt(s + i, overwrite_string.charAt(i));  // s부터 시작해서 덮어씀
            } else {
                sb.append(overwrite_string.charAt(i));  // 나머지는 추가
            }
        }
        
        // 수정된 StringBuilder를 String으로 반환
        return sb.toString();
    }
}

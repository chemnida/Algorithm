class Solution {
    public String[] solution(String my_string) {
 // my_string을 공백을 기준으로 나누어 배열로 반환
        return my_string.trim().split("\\s+");
    }
}
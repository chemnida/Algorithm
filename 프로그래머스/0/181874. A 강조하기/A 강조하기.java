class Solution {
    public String solution(String myString) {
        // 전체 문자열을 소문자로 변환
        myString = myString.toLowerCase();
        
        // "a"는 "A"로 바꿔주기
        myString = myString.replace("a", "A");
        
        return myString;
    }
}

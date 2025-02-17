class Solution {
    public String solution(String str1, String str2) {
        StringBuilder str3 = new StringBuilder();
        
        for(int i=0; i<str1.length() ;i++){
            str3.append(str1.charAt(i));  // str1에서 문자를 추가
            str3.append(str2.charAt(i));  // str2에서 문자를 추가
        }
        return str3.toString();
    }
}
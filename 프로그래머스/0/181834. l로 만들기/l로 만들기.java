class Solution {
    public String solution(String myString) {
         StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            
            if (c < 'l'){
                result.append('l');
            } else {
                result.append(c);
            }
        } return result.toString();
    }
}

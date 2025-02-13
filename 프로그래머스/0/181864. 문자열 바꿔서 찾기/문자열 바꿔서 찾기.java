class Solution {
    public int solution(String myString, String pat) {
        String swap = myString.replace("A","X").replace("B","A").replace("X","B");
        
    if (swap.contains(pat)){
            return 1;
    } else {    
        return 0;}
    }
}
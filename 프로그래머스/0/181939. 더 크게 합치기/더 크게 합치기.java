class Solution {
    public int solution(int a, int b) {
        int aaa = Integer.parseInt(""+a+b);
        int bbb = Integer.parseInt(""+b+a);
        
        if (aaa < bbb) return bbb;
        else return aaa;
    }
}
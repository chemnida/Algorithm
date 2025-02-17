class Solution {
    public int solution(int a, int b) {
        int odd = 2*a*b;
        // ⊕ 연산 구현 (문자열로 변환 후 합치기)
        int abConcat = Integer.parseInt("" + a + b);
        
        if(abConcat > odd) return abConcat;
        else if (abConcat < odd) return odd;
        else return abConcat;
        
    }
}
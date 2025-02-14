class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split(" ");
        
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String op = parts[1];
        
        if (op.equals("+")) return a + b;
        else if (op.equals("-")) return a - b;
        else return a * b;
        
    }
}
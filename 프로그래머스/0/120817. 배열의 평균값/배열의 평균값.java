class Solution {
    public double solution(int[] numbers) {
        int avg = 0;
        
        for(int i=0; i< numbers.length; i++){
            avg += numbers[i];
        }
        
        return (double)avg / (double)numbers.length;
    }
}
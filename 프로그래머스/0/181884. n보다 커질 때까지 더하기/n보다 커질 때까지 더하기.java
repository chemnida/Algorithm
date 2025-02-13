class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        int len = numbers.length;
        
        for(int i=0; i<len ;i++){
            sum += numbers[i];
            if(sum > n){
                return sum;
            }
        }return sum;
    }
}
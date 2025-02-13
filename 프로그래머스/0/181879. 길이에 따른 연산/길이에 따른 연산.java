class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        int result = 0;
        
        if ( len >= 11){
            for(int i=0; i < len ; i++){
                result += num_list[i];
            }
        } else {
            result = 1;
            for(int i=0; i < len ; i++){
                result *= num_list[i];
            }
        }
        return result;
    }
}
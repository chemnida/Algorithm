class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] result = new int[len+1];
        
        for(int i=0; i<len ;i++){
            result[i] = num_list[i];
        }
        
        if(num_list[len-1] > num_list[len-2]){
            result[len] = num_list[len-1] - num_list[len-2];
        } else result[len] = num_list[len-1] * 2;
        
        return result;
    }
}
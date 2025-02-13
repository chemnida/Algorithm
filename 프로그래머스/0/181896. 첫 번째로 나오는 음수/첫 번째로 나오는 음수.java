class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        
        for (int i=0; i<len ;i++){
            if(num_list[i] < 0)
                return i;
        } return -1;
    }
}
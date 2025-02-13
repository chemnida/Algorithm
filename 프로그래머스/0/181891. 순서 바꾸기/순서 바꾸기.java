class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        
        int result1[] = new int[len];
        
        for (int i = n; i < len; i++) {
            result1[i-n] = num_list[i]; 
        }
        
        for (int i = 0; i < n; i++) {
            result1[i + (len - n)] = num_list[i]; 
        }
        return result1;
    }
}
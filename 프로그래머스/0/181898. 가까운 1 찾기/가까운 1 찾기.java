class Solution {
    public int solution(int[] arr, int idx) {
        int len = arr.length;
        for(int i=idx; i<len ;i++){
            if(arr[i] == 1) {
                return i;
            }
        } return -1;
    }
}
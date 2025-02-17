class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();  // 홀수 문자열
        StringBuilder even = new StringBuilder();
        
        for(int i=0; i<num_list.length;i++){
            if (num_list[i] % 2 == 0) {
                even.append(num_list[i]);
            }
            else{
                odd.append(num_list[i]);
            }
        }
        int sum = 0;
        sum = Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
        return sum;
    }
}
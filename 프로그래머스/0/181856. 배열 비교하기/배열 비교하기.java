class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int a = arr1.length;
        int b = arr2.length;
        int sum1 = 0, sum2 = 0;
        
        if (a > b) return 1;
        else if (a<b) return -1;
        else {
            for(int i=0;i<a;i++){
                sum1 += arr1[i];
            }
            for(int i=0;i<b;i++){
                sum2 += arr2[i];
            }
            if(sum1 > sum2) return 1;
            else if(sum1 < sum2) return -1;
            else return 0;
        }
    }
}
class Solution {
    public String solution(int[] numLog) {
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<numLog.length-1;i++){
            if(numLog[i] == numLog[i+1] + 1){
                result.append('s');
            }
            else if(numLog[i] == numLog[i+1] - 1){
                result.append('w');
            }
            else if(numLog[i] == numLog[i+1] - 10){
                result.append('d');
            }
            else result.append('a');
        }
        
        return result.toString();
    }
}
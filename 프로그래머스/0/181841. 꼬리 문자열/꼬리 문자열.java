class Solution {
    public String solution(String[] str_list, String ex) {
        String result ="";
        
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].contains(ex))
                continue;
            else result += str_list[i];
        }
        
        return result;
    }
}
class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder result = new StringBuilder();
        
        for (int index : index_list) {
            result.append(my_string.charAt(index));
        }

        return result.toString();
    }
}
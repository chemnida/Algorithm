import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int n:arr){ //for each문
            list.add(n);
        }
        
        for(int i : delete_list){
            int idx = list.indexOf(i); //indexOf() : 인자와 동일한 객체 있는지 찾고 없으면 -1반환
            
            if (idx != -1 ){
                list.remove(idx); //remove():리스트원소 삭제
            }
        }
        return list;
    }
}

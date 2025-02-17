import java.util.*;

class Solution {
    public int[] solution(int n) {
         List<Integer> list = new ArrayList<>(); // 동적 크기의 리스트 사용
        list.add(n); // 시작 숫자 저장
        
        while(n!=1){
            if (n%2 == 0){
                n = n/2;
        }
            else n = 3*n+1;
            list.add(n);
        } 
       return list.stream().mapToInt(i -> i).toArray();
    }
}
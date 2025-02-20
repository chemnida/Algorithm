import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) { 
                // arr[i] 값을 (arr[i] * 2)번 추가
                for (int j = 0; j < arr[i] * 2; j++) {
                    result.add(arr[i]);
                }
            } else {
                // arr[i] 개수만큼 뒤에서부터 제거
                for (int j = 0; j < arr[i]; j++) {
                    if (!result.isEmpty()) {
                        result.remove(result.size() - 1);
                    }
                }
            }
        }
        
        // ArrayList를 int 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}

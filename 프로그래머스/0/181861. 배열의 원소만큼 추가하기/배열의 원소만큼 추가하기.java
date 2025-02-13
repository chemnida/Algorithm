import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        // arr 배열을 순회하면서 원소의 값만큼 추가
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                result.add(num);
            }
        }

        // ArrayList를 int[] 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}

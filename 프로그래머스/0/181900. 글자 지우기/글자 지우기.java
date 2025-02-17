import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder result = new StringBuilder();
        
        // indices 배열을 Set으로 변환하여 빠르게 존재 여부를 확인
        Set<Integer> removeIndices = new HashSet<>();
        for (int index : indices) {
            removeIndices.add(index);
        }
        
        // my_string을 순차적으로 탐색하면서 제거할 인덱스를 제외한 문자들을 result에 추가
        for (int i = 0; i < my_string.length(); i++) {
            if (!removeIndices.contains(i)) {  // 인덱스가 제거할 리스트에 없으면 문자 추가
                result.append(my_string.charAt(i));
            }
        }
        
        return result.toString();  // StringBuilder에서 최종 문자열 반환
    }
}

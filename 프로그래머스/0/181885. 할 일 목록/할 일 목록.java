import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 아직 마치지 않은 일을 담을 리스트
        ArrayList<String> result = new ArrayList<>();
        
        // todo_list와 finished 배열을 순차적으로 확인
        for (int i = 0; i < todo_list.length; i++) {
            // 아직 마치지 않은 일은 result에 추가
            if (!finished[i]) {
                result.add(todo_list[i]);
            }
        }
        
        // 결과 배열로 변환하여 반환
        return result.toArray(new String[0]);
    }
}

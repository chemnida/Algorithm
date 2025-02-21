import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        // "a", "b", "c"를 구분자로 나누기
        String[] result = myStr.split("[abc]");

        // 빈 문자열("")을 제거
        List<String> filteredList = new ArrayList<>();
        for (String str : result) {
            if (!str.isEmpty()) {
                filteredList.add(str);
            }
        }

        // 결과가 비어 있으면 ["EMPTY"] 반환
        return filteredList.isEmpty() ? new String[]{"EMPTY"} : filteredList.toArray(new String[0]);
    }
}

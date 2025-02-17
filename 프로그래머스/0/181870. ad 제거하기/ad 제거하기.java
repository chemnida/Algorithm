import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> result = new ArrayList<>();
        
        // 배열을 순회하면서 "ad"를 포함하는 문자열을 제외
        for (String str : strArr) {
            if (!str.contains("ad")) {
                result.add(str);
            }
        }
        
        // List를 배열로 변환하여 반환
        return result.toArray(new String[0]);
    }
}

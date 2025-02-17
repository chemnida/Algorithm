import java.util.*;

public class Solution {
    public String[] solution(String myString) {
        // "x"를 기준으로 문자열 분리
        String[] parts = myString.split("x");
        
        // 빈 문자열을 제외하고 리스트에 저장
        List<String> list = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                list.add(part);
            }
        }
        
        // 사전순으로 정렬
        Collections.sort(list);
        
        // 결과 배열로 반환
        return list.toArray(new String[0]);
    }
}

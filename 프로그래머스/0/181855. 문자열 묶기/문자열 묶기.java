import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthCount = new HashMap<>();
        int maxCount = 0;

        // 문자열 길이별 개수 카운트
        for (String str : strArr) {
            int len = str.length();
            lengthCount.put(len, lengthCount.getOrDefault(len, 0) + 1);
            maxCount = Math.max(maxCount, lengthCount.get(len));
        }

        return maxCount;
    }
}

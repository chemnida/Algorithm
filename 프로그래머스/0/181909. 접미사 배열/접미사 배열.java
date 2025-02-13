import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] suffixes = new String[len];

        // 모든 접미사 생성
        for (int i = 0; i < len; i++) {
            suffixes[i] = my_string.substring(i);
        }

        // 사전순 정렬
        Arrays.sort(suffixes);

        return suffixes;
    }
}

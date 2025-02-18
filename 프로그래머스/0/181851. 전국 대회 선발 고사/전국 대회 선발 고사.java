import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> candidates = new ArrayList<>();
        
        // 참여 가능한 학생만 필터링하여 (등수, 학생 번호) 저장
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i] == true) {
                candidates.add(new int[]{rank[i], i});
            }
        }

        // 등수를 기준으로 오름차순 정렬
        candidates.sort(Comparator.comparingInt(a -> a[0]));

        // 상위 3명의 학생 번호 추출
        int a = candidates.get(0)[1];
        int b = candidates.get(1)[1];
        int c = candidates.get(2)[1];

        // 결과 계산식 적용 후 반환
        return 10000 * a + 100 * b + c;
    }
}

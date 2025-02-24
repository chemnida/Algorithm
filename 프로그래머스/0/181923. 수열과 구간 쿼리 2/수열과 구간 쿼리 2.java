import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 결과를 저장할 배열
        int[] result = new int[queries.length];
        
        // 각 쿼리마다 처리
        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            
            // s부터 e까지 범위의 값을 리스트에 담기
            List<Integer> subList = new ArrayList<>();
            for (int i = s; i <= e; i++) {
                subList.add(arr[i]);
            }
            
            // k보다 큰 값만 필터링
            subList.removeIf(num -> num <= k);
            
            // 필터링된 값들 중 가장 작은 값 찾기
            if (subList.isEmpty()) {
                result[q] = -1;
            } else {
                // 정렬 후 첫 번째 값을 선택
                Collections.sort(subList);
                result[q] = subList.get(0);
            }
        }
        
        return result;
    }
}

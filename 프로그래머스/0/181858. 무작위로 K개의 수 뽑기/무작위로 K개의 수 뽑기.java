import java.util.HashSet;

public class Solution {
    public int[] solution(int[] arr, int k) {
        // 중복된 수를 확인할 HashSet
        HashSet<Integer> seen = new HashSet<>();
        // 결과를 저장할 배열
        int[] result = new int[k];
        
        int idx = 0;  // 배열 인덱스
        // arr 배열을 순차적으로 탐색
        for (int num : arr) {
            // 중복된 수가 아니라면
            if (!seen.contains(num)) {
                // result 배열에 추가
                if (idx < k) {
                    result[idx++] = num;
                    seen.add(num);
                }
            }
        }

        // 만약 배열의 길이가 k보다 작다면, 나머지를 -1로 채운다
        while (idx < k) {
            result[idx++] = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {0, 1, 1, 2, 2, 3};
        int k1 = 3;
        int[] result1 = sol.solution(arr1, k1);
        // 결과 출력
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr2 = {0, 1, 1, 1, 1};
        int k2 = 4;
        int[] result2 = sol.solution(arr2, k2);
        // 결과 출력
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}

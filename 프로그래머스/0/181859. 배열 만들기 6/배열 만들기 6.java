import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (!stk.isEmpty() && stk.peek() == arr[i]) {
                stk.pop(); // 마지막 원소가 같으면 제거
            } else {
                stk.push(arr[i]); // 다르면 추가
            }
        }

        // 결과 배열 변환
        if (stk.isEmpty()) {
            return new int[]{-1}; // 빈 배열이면 [-1] 반환
        }

        int[] result = new int[stk.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stk.get(i);
        }

        return result;
    }
}
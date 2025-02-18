import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        
        while (i < arr.length) {  // 전체 배열을 순회
            if (stk.isEmpty()) {  // 스택이 비어있다면 현재 값 추가
                stk.push(arr[i]);
                i++;
            } else if (stk.peek() < arr[i]) {  // 최상단 값이 arr[i]보다 작으면 추가
                stk.push(arr[i]);
                i++;
            } else {  // 최상단 값이 크거나 같으면 제거
                stk.pop();
            }
        }
        
        // Stack을 int 배열로 변환
        int[] result = new int[stk.size()];
        for (int j = 0; j < result.length; j++) {
            result[j] = stk.get(j);
        }
        
        return result;
    }
}

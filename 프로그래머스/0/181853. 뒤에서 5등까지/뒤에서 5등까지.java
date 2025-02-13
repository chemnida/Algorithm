import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list); // 배열을 오름차순 정렬
        return Arrays.copyOfRange(num_list, 0, 5); // 가장 작은 5개 요소 추출
    }
}

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(num_list);
        
        // 가장 작은 5개의 수를 제외한 나머지 수들의 배열을 만듦
        int[] result = new int[num_list.length - 5];
        for (int i = 5; i < num_list.length; i++) {
            result[i - 5] = num_list[i];
        }
        
        return result;
    }
}

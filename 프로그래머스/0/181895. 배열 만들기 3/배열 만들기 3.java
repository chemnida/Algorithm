public class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // 첫 번째 구간 추출
        int a1 = intervals[0][0], b1 = intervals[0][1];
        int[] firstInterval = new int[b1 - a1 + 1];
        for (int i = a1; i <= b1; i++) {
            firstInterval[i - a1] = arr[i];
        }

        // 두 번째 구간 추출
        int a2 = intervals[1][0], b2 = intervals[1][1];
        int[] secondInterval = new int[b2 - a2 + 1];
        for (int i = a2; i <= b2; i++) {
            secondInterval[i - a2] = arr[i];
        }        
        
        // 두 배열 합치기
        int[] result = new int[firstInterval.length + secondInterval.length];
        System.arraycopy(firstInterval, 0, result, 0, firstInterval.length);
        System.arraycopy(secondInterval, 0, result, firstInterval.length, secondInterval.length);

        return result;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        int[] result;
        if (n == 1) {
            result = Arrays.copyOfRange(num_list, 0, b + 1);
        } else if (n == 2) {
            result = Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            result = Arrays.copyOfRange(num_list, a, b + 1);
        } else {
            // c 간격으로 슬라이싱 (ArrayList 활용 후 변환)
            List<Integer> tempList = new ArrayList<>();
            for (int i = a; i <= b; i += c) {
                tempList.add(num_list[i]);
            }
            result = tempList.stream().mapToInt(i -> i).toArray();
        }
        return result;
    }
}
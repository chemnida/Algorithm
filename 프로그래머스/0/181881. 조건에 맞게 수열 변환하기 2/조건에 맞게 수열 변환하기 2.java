import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        int[] prevArr;
        int[] currArr = Arrays.copyOf(arr, arr.length);

        while (true) {
            prevArr = Arrays.copyOf(currArr, currArr.length);
            currArr = transformArray(prevArr);

            if (Arrays.equals(prevArr, currArr)) {
                return count;
            }
            count++;
        }
    }

    private int[] transformArray(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                newArr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                newArr[i] = arr[i] * 2 + 1;
            } else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(sol.solution(arr)); // 결과 출력
    }
}

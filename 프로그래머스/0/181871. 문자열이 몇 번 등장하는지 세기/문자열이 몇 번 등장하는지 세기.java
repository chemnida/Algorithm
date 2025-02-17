class Solution {
    public int solution(String myString, String pat) {
        int count = 0;  // 등장 횟수
        int index = 0;  // 검색을 시작할 위치

        // pat이 myString에서 등장하는 위치를 찾는다.
        while ((index = myString.indexOf(pat, index)) != -1) {
            count++;  // pat이 한 번 등장했으면 카운트
            index++;  // 겹치는 부분도 계산해야 하므로 index를 1 증가시킨다.
        }

        return count;
    }
}

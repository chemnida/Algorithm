class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int rows = park.length;
        int cols = park[0].length;

        // 큰 크기부터 작은 크기까지 순차적으로 확인
        for (int size : mats) {
            // 크기 size에 대해 모든 위치에서 정사각형이 들어갈 수 있는지 확인
            boolean found = false; // 크기 size의 정사각형을 찾았는지 여부
            for (int i = 0; i <= rows - size; i++) {
                for (int j = 0; j <= cols - size; j++) {
                    boolean canPlace = true;
                    // 해당 위치에서 size x size 크기의 정사각형이 들어갈 수 있는지 체크
                    for (int x = i; x < i + size; x++) {
                        for (int y = j; y < j + size; y++) {
                            if (!park[x][y].equals("-1")) {  // 사람이 앉아 있는 자리라면
                                canPlace = false;
                                break;
                            }
                        }
                        if (!canPlace) break;
                    }
                    if (canPlace) {
                        found = true;
                        break;  // 이 위치에서 크기 `size`의 돗자리를 깔 수 있으면 더 이상 확인할 필요 없음
                    }
                }
                if (found) break;  // 한 크기에 대해 한 번이라도 찾으면 더 이상 진행할 필요 없음
            }

            if (found) {
                answer = Math.max(answer, size);  // 해당 크기에서 돗자리를 깔 수 있으면 answer 갱신
            }
        }

        return answer;  // 깔 수 있는 가장 큰 돗자리 크기를 반환
    }
}

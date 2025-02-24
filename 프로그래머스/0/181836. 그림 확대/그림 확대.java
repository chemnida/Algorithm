public class Solution {
    public String[] solution(String[] picture, int k) {
        // 새로운 크기의 배열을 생성할 준비 (세로 크기: picture.length * k, 가로 크기: picture[i].length() * k)
        int newHeight = picture.length * k;
        int newWidth = picture[0].length() * k;
        String[] result = new String[newHeight];
        
        // 각 행에 대해 가로 및 세로로 확대
        for (int i = 0; i < picture.length; i++) {
            StringBuilder expandedRow = new StringBuilder();
            
            // 가로로 k배 확대
            for (int j = 0; j < picture[i].length(); j++) {
                char pixel = picture[i].charAt(j);
                for (int m = 0; m < k; m++) {
                    expandedRow.append(pixel);
                }
            }
            
            // 세로로 k배 확대
            for (int n = 0; n < k; n++) {
                result[i * k + n] = expandedRow.toString();
            }
        }
        
        return result;
    }
}
class Solution {
    public static int solution(String[] order) {
        int totalPrice = 0;
        
        for (String item : order) {
            if (item.equals("anything")) {
                totalPrice += 4500;  // "아무거나"는 차가운 아메리카노로 처리
            } else if (item.contains("americano")) {
                totalPrice += 4500;  // 아메리카노는 4500원
            } else if (item.contains("cafelatte")) {
                totalPrice += 5000;  // 카페라떼는 5000원
            }
        }
        
        return totalPrice;
    }
}
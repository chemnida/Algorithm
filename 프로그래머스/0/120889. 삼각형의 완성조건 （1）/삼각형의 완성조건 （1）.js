function solution(sides) {
    // 세 변이 삼각형의 부등식을 만족하는지 확인
    if (sides[0] + sides[1] > sides[2] && sides[0] + sides[2] > sides[1] && sides[1] + sides[2] > sides[0]) {
        return 1; // 삼각형이 가능하다면 1을 반환
    } else {
        return 2; // 삼각형이 불가능하다면 2를 반환
    }
}

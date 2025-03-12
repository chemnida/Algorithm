function solution(numer1, denom1, numer2, denom2) {
    var answer = [];
    
    answer[0] = numer1 * denom2 + numer2 * denom1;
    answer[1] = denom1 * denom2;
    
     // 2️⃣ 최대공약수(GCD) 구하는 함수 (유클리드 호제법)
    function gcd(a, b) {
        return b === 0 ? a : gcd(b, a % b);
    }

    let gcdValue = gcd(answer[0], answer[1]); // 최대공약수 계산

    // 3️⃣ 약분하기
    return [answer[0] / gcdValue, answer[1] / gcdValue];
}
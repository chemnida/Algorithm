function solution(n) {
    let result = Math.floor(n / 7);
    
    if(n % 7 < 7 && n % 7 >0) result++;
    
    return result;
}
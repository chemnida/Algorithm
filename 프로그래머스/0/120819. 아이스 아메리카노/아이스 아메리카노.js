function solution(money) {
    let result = [];
    
    let x = Math.floor(money / 5500) ;
    let y = money % 5500;
    
    result.push(x);
    result.push(y);
    
    return result;
}
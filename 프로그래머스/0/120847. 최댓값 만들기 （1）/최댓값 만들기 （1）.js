function solution(numbers) {
    let max = 0;
    
    numbers = numbers.sort((a,b) => b-a);
    
    max = numbers[0] * numbers[1];
    
    return max;
}
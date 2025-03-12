function solution(array) {
    var answer = 0;
    
    array.sort((a,b) =>a-b);
    
    let middle = Math.floor(array.length / 2);
    answer = array[middle];
    return answer;
}
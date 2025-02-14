class Solution {
    public int solution(int n, String control) {
        
        for(int i=0 ;i<control.length();i++){
            char c = control.charAt(i);
            if (c == 'w') n = n +1;
            else if (c == 's') n = n - 1;
            else if (c == 'd') n = n + 10;
            else n = n - 10;
        }
        return n;
    }
}
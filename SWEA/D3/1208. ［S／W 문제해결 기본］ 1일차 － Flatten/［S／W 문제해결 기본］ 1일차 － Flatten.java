import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 10; i++) {
			int size = sc.nextInt(); // 덤프횟수
			int[] arr = new int[100]; //100선언  가로길이	
			
			for(int j=0;j<100;j++) {
				arr[j] = sc.nextInt();
			} //배열에 값 넣음
			
			for(int x=0;x<size;x++) {
				int max = 0, max_index = 0, min = 101, min_index = 0; 
				for(int y=0;y<100;y++) {
					if(arr[y] >= max) {
						max = arr[y];
						max_index = y;
					}
					if(arr[y] <= min) {
						min = arr[y];
						min_index = y;
					}
				}
				arr[max_index]--;
				arr[min_index]++; //상자 하나씩 주고받음
			}
			
			//상자 다 옮기고 최대최소 다시 해야함
			int max = 0, min = 101;
			for(int t=0;t<100;t++) {
				if(arr[t] >= max) max = arr[t];
				if(arr[t] <= min) min = arr[t];
			}
			
			System.out.println("#" + i + " " + (max-min));
			
		}
	}

}

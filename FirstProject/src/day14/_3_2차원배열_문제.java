package day14;

public class _3_2차원배열_문제 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3행 5열
		int arr[][] = {
				{3,5,2,4,1},
				{2,5,9,8,1},
				{4,9,7,5,2}
		};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
//				sum += arr[i][j];
				if(i==0|| i==arr.length-1||j==0||j==arr[i].length-1) {
					sum+=arr[i][j];
				}
			}
		}
		System.out.println(sum);
		// 일단 처음 행, 막 행 다 더하고 처음 인덱스 값 마지막 인덱스값 다 더하고 처음행과 마지막 첫인덱스, 마지막인덱스값 뺴주면 되겟다 
		
	}

}

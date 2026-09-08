package dau7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 예시문제 {

	public static void main(String[] args) {
//		0. Random 클래스를 활용하여 컴퓨터와 사용자의 '주사위 게임'을 만드세요.
//		컴퓨터와 사용자가 각각 주사위(1~6 사이의 랜덤한 수)를 3번씩 던집니다(반복문 활용).
//		3번 던져서 나온 눈의 총합을 각각 구한 뒤, 총합이 더 큰 쪽이 승리합니다. 
//		최종적으로 "컴퓨터 총합: O점, 사용자 총합: O점"을 출력하고 승자(컴퓨터 승리 / 사용자 승리 / 무승부)를 출력하세요.
		
		int userSum = 0;
		int computerSum = 0;
		Random ran = new Random();
		for(int i=1; i<=3; i++) {
			System.out.println(i+"번째 사용자의 주사위를 던집니다");
			int ranNum = ran.nextInt(6)+1;
			System.out.print("사용자의 주사위 눈 수: ");
			System.out.print(ranNum+" ");
			System.out.println();
			userSum += ranNum;
			
			System.out.println(i+"번째 컴퓨터의 주사위를 던집니다");
			ranNum = ran.nextInt(6)+1;
			System.out.print("컴퓨터의 주사위 눈 수: ");
			System.out.print(ranNum+" ");
			System.out.println();
			computerSum += ranNum;
			System.out.println();
		}
		System.out.println("컴퓨터 총합: "+computerSum+"점, 사용자 총합: "+userSum+"점");
		if(computerSum>userSum) {
			System.out.println("컴퓨터 승리");
		}else if(computerSum<userSum) {
			System.out.println("사용자 승리");
		}else {
			System.out.println("무승부");
		}
		
		
//		0. 1부터 100까지의 숫자 중 5의 배수이지만 8의 배수는 아닌 숫자들만 화면에 출력하고, 
//		마지막에 그 숫자들의 총 개수를 출력하세요.
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i%5==0&&!(i%8==0)) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count+"개");
		
		
//		0. 크기가 5인 정수형 배열을 만들고 1부터 100사이의 랜덤한 숫자 5개를 넣습니다.
//		이후 배열의 숫자들 중에서 '홀수'만 찾아내어 출력하고, 
//		마지막에 홀수가 총 몇 개 입력되었는지 카운트하여 출력하세요.
//		int oddCnt=0;
//		int arr[] = new int[5];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = ran.nextInt(100)+1;
//			if(arr[i]%2==1) {
//				System.out.print(arr[i]+" ");
//				oddCnt++;
//			}
//		}
//		System.out.println();
//		System.out.println(oddCnt+"개");
		
		
//		0. 크기가 5인 정수형 배열을 선언하고 사용자로부터 5개의 숫자를 입력받아 저장하세요.
//		그 후, 배열에 저장된 숫자들을 입력받은 순서의 반대(역순)로 화면에 출력하세요.
//		( Arrays.sort() 필요하다면 사용해도되고 안해도 되고.. )
//		(예: 10, 20, 30, 40, 50 순으로 입력했다면 50, 40, 30, 20, 10 순으로 
//				출력되어야 합니다.)
		
		int arr[] = new int[5];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+" 인덱스에 들어갈 숫자를 입력 : ");
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}

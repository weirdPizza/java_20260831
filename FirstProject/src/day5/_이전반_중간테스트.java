package day5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _이전반_중간테스트 {

	public static void main(String[] args) {
		
//		1. 10부터 50까지 중 3의 배수이면서 짝수만 화면에 출력
		for(int i=10; i<=50; i++) {
			if(i%3==0 && i%2==0) {
				System.out.print(i+" ");
//			}
//		}
//		
//		System.out.println();
//		
//		
//		2. 숫자를 두개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력
		Scanner s = new Scanner(System.in); 
//		System.out.print("숫자를 입력해주세요: "); // 2번
//		int x = s.nextInt();
//		System.out.print("다음 숫자를 입력해주세요: ");
//		int y = s.nextInt();
//		
//		if(x+y>10) {
//			System.out.println("큰 수");
//		}else {
//			System.out.println("작은 수");
//		}
//				
//		System.out.println();
//		
//		

//		3. 숫자를 하나 입력받고, 해당 숫자가 홀수인지 짝수인지 출력.
//		단, 숫자가 1~30사이 값이 아닐 경우 다시 입력하도록 함
		
//		while(true) {
//			System.out.print("숫자를 입력해주세요: ");
//			int num = s.nextInt();
//			if(num>=1&&num<=30) {
//				if(num%2==0) {
//					System.out.println("짝수");
//				}else {
//					System.out.println("홀수");
//				}
//				break;
//			}else {
//				System.out.println("1부터 30사이의 수를 다시 입력하세요");
//				continue;
//			}
//		}
		
//		4. 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 
//		큰 수 인지 아닌지 판별하기
//		(ex, 랜덤 수 : 35, 입력 수 : 40 일 경우 
//		  '입력한 수가 더 큽니다' 출력, 반대일 경우 '랜덤 숫자가 더 큽니다' 출력, 두 수가 같으면 '같습니다' 출력)
		Random ran = new Random();
//		int randNum = ran.nextInt(100)+1; 
//		System.out.print("숫자를 입력해주세요: ");
//		int userNum = s.nextInt();
//		if(randNum>userNum) {
//			System.out.println("랜덤 숫자가 더 큽니다");
//		}else if(randNum<userNum) {
//			System.out.println("입력한 수가 더 큽니다");
//		} else {
//			System.out.println("같습니다");
//		}

//		5. 2단부터 9단까지 구구단 출력
//		단, 짝수(2,4,6,8)단만 출력
		// 2단부터 9단까지 구구단 출력
		for(int i=2; i<=9; i++) {
			if(i%2==0) {
				System.out.println("==== "+i+"단 ====");
				for(int j=1; j<=9; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
			
		}
		
		// 6번
		// 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
		// 단, 0이하의 수를 입력하거나 중복된 숫자가 있으면 안내 문구를 출력 후 다시 입력 받을 것 
		// => 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 가정하고 진행하세요
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1+"번째 숫자 입력 :");
			int num = s.nextInt();
			if(num<1) {
				System.out.println("1보다 큰 숫자 입력해라");
				i--;
				continue;
			}
			arr[i] = num; // 이걸 else로 받음 됐네
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					System.out.println("중복됐으니 다시 입력");
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		// 7. 6번에서 정의한 배열에서 홀수들의 합과 짝수들이 합의 차이 구하기
		int evenSum=0;
		int oddSum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				evenSum += arr[i];
			}else {
				oddSum += arr[i];
			}
		}
		System.out.println("짝수들의 합 : "+evenSum);
		System.out.println("홀수들의 합 : "+oddSum);
		
		
//		8. 
//		기본조건
//		 - 메인메뉴는 1~2. 그외 숫자 입력 시 안내 문구 후 다시 입력
//		 - 1번 메뉴 진입 시 난이도 선택. 1~3외 값 입력 시 안내 문구 후 다시 입력
//		 - 1번 난이도는 2~5단, 2번 난이도는 6~9단, 3번 난이도는 12~19단 문제 출력
//		 - 문제는 5문제 고정. 5문제 모두 푼 후 맞춘 개수 출력
//		 - 메인 메뉴에서 2번 선택 시 종료

		
		while(true) {
			System.out.print("[ 1. 구구단 풀기, 2. 종료] : ");
			int menuNo = s.nextInt();
			if(menuNo == 1) {
				// 구구단 풀기
				while(true) { // 무한루프를 여기서 또 쓸 필요는 없었네 continue;처리로 위의 무한루프를 재사용하면 됐네
					System.out.print("[1. 쉬움(2~5단), 2. 보통(6~9단), 3. 어려움(12~19단)] : ");
					int menuNo2 = s.nextInt();
					if(menuNo2>=4) {
						System.out.println("난이도는 1~3 사이를 입력해주세요.");
					}else {
						System.out.println("======= 문제풀이를 시작합니다(5문제) ======");
						int count =0;
						for(int i=1; i<=5; i++) {
							
							int x=0;
							int y=ran.nextInt(9)+1;
							if(menuNo2 == 1) {
								x = ran.nextInt(4)+2;
							}else if(menuNo2==2) {
								x = ran.nextInt(4)+6;
							}else {
								x = ran.nextInt(8)+12;
							}
							System.out.println(i+"번 "+ x + " * " + y + " = ");
							int answer = s.nextInt();
							if(answer == x*y) {
								System.out.println("정답입니다!");
								count++;
							} else {
								System.out.println("틀렸습니다");
							}
						}
						System.out.println("총 "+count+"개 맞추셨습니다.");
						break;
					}
					
				}
			} else if(menuNo == 2) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("메뉴는 1~2 중에 선택해주세요.");
			}
		}
		
	}

}

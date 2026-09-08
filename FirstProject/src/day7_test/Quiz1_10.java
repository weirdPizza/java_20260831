package day7_test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz1_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
//		1. 아래 조건에 맞게 변수 선언 및 초기화 하고 변수를 이용하여 결과를 출력하세요.
//		- 변수명 : name 	 , 값 : 홍길동
//		- 변수명 : age  	 , 값 : 30
//		- 변수명 : addr 	 , 값 : 인천
//	출력 결과 : '홍길동의 나이는 30, 주소는 인천 입니다.'
		
//		String name = "홍길동";
//		int age = 30;
//		String addr = "인천";
//		System.out.println(name+"의 나이는 "+age+", 주소는 "+addr+"입니다.");

		
//		2. 스캐너를 통해 숫자를 입력받은 후 
//		홀수일 경우 "홀수", 짝수일 경우 "짝수"를 출력하세요.
//		단, 0이하의 숫자나 11이상의 숫자일 경우 "계산할 수 없습니다." 를 출력하시오.
		
//		System.out.print("숫자 입력: ");
//		int num = s.nextInt();
//		if(num<=0||num>=11) {
//			System.out.println("계산할 수 없습니다.");
//		}else {
//			if(num%2==0) {
//				System.out.println("짝수");
//			}else {
//				System.out.println("홀수");
//			}
//		}
		
		
//		3. 2이상 9이하의 숫자를 입력받은 후 해당 숫자의 구구단을 출력하세요.
//		2~9사이 숫자가 아닐경우 '잘못 입력된 숫자 입니다'를 출력 후 종료해주세요.
		
//		System.out.print("구구단 출력용 숫자 입력 : ");
//		int x = s.nextInt();
//		if(x<2||x>9) {
//			System.out.println("잘못 입력된 숫자입니다.");
//		}else {
//			System.out.println("==== "+x+"단 ====");
//			for(int y=1; y<=9; y++) {
//				System.out.println(x+" * "+y+" = "+x*y);
//			}
//		}
		
		
//		4. 1에서 50 사이의 숫자를 하나 입력받습니다.
//		만약 사용자가 1~50 범위를 벗어난 숫자를 입력하면, 올바른 범위의 숫자를 입력할 때까지 계속해서 다시 입력받도록 안내문을 띄웁니다. 
//		올바른 숫자가 입력되면 종료합니다.
		
//		while(true) {
//			System.out.print("1에서 50까지의 숫자 입력: ");
//			int num = s.nextInt();
//			if(num<1||num>50) {
//				System.out.println("1에서 50까지의 숫자를 입력해주세요");
//				continue;
//			}else {
//				System.out.println("좋습니다. 올바른 범위의 숫자를 입력하셨습니다.");
//				break;
//			}
//		}
		
		
//		5. 사용자로부터 세 과목(국어, 영어, 수학)의 점수를 각각 입력받아 평균을 구하세요.
//		평균이 80점 이상이면 '합격', 그렇지 않으면 '불합격'을 출력합니다. 
//		단, 세 과목 중 단 한 과목이라도 50점 미만이 있다면 평균 점수와 상관없이 
//		'과락으로 인한 불합격'을 출력해야 합니다.
		
//		System.out.print("국어 점수 입력: ");
//		int kor = s.nextInt();
//		System.out.print("영어 점수 입력: ");
//		int eng = s.nextInt();
//		System.out.print("수학 점수 입력: ");
//		int math = s.nextInt();
//		
//		int avg = (kor+eng+math)/3;
//		if(kor<50||eng<50||math<50) {
//			System.out.println("과락으로 인한 불합격");
//		}else {
//			if(avg>=80) {
//				System.out.println("합격");
//			}else {
//				System.out.println("불합격");
//			}
//		}
		
		
//		6. 크기가 10인 정수형 배열을 생성하고, 반복문을 사용하여 1부터 100 사이의 랜덤한 
//		값으로 배열을 가득 채우세요.
//		단, 마지막 숫자가 3으로 끝나는 숫자는 넣으면 안됩니다.(예 => 3, 13, 23 .. 93).
//		최종 결과를 Arrays.toString() 메소드를 통해 출력해주세요.
		
//		int arr[] = new int[10];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = ran.nextInt(100)+1;
//			if(arr[i]%10==3) {
//				i--;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
//		7. 크기가 5인 정수형 배열을 선언하고 사용자로부터 숫자를 5개 입력받아 저장하세요.
//		그 후, 사용자에게 '검색할 숫자'를 하나 더 입력받습니다. 
//		검색한 숫자가 배열에 존재한다면 "해당 숫자는 배열의 O번째에 있습니다." 
//		(인덱스 출력)라고 안내하고, 
//		존재하지 않는다면 "배열에 없는 숫자입니다."라고 출력하세요.
		
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"인덱스 숫자 입력: ");
			arr[i] = s.nextInt();
		}
		
		System.out.print("검색할 숫자 입력: ");
		int searchNum = s.nextInt();
		Boolean search = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==searchNum) {
				System.out.println("해당 숫자는 배열의 "+i+"번째에 있습니다.");
				search = true;
				break;
			}
		}
		if(search == false) {			
			System.out.println("배열에 없는 숫자입니다.");
		}
		
		
//		8. 크기가 20인 int형 배열을 생성하고, 1부터 5 사이의 랜덤한 숫자로 배열을 가득 채우세요.
//		그 다음, 배열 안에 1, 2, 3, 4, 5가 각각 몇 번씩 등장(생성)했는지 개수를 세어서 출력하세요.
//		(출력 예시 => 1: 3번, 2: 1번, 3: 4번, 4: 0번, 5: 2번)
		
//		int oneCnt = 0;
//		int twoCnt = 0;
//		int threeCnt =0;
//		int fourCnt =0;
//		int fiveCnt=0;
//		int arr[] = new int[20];
//		for(int i=0; i<arr.length; i++){
//			arr[i] = ran.nextInt(5)+1;
//			switch (arr[i]) {
//			case 1: 
//				oneCnt++;
//				break;
//			
//			case 2: 
//				twoCnt++;
//				break;
//			
//			case 3: 
//				threeCnt++;
//				break;
//			
//			case 4: 
//				fourCnt++;
//				break;
//			
//			case 5: 
//				fiveCnt++;
//				break;
//			}	
//		
//		}
//		System.out.println("1: "+oneCnt+"번, 2: "+twoCnt+"번, 3: "+threeCnt+"번, 4: "+fourCnt+"번, 5: "+fiveCnt+"번");

		
//		9. 홀짝 맞추기 게임을 만들어주세요. 랜덤으로 생성되는 숫자의 범위는 1~100 사이 값 입니다.
//		1번 메뉴로 들어가면 5문제를 출제하며, 선택한 답변에 따라 정답 및 오답을 출력합니다.
//		2번 메뉴를 선택하면 종료되며, 그 외의 값을 입력하면 다시 입력하도록 유도합니다.
//		자세한 내용을 아래 이미지를 참고해주세요.
		
//		while(true) {
//			System.out.print("[1. 홀짝 게임 시작, 2. 종료] : ");
//			int menu = s.nextInt();
//			if(menu==1) { // 홀짝게임 시작
//				int correctCnt = 0;
//				System.out.println("===== 홀짝 맞추기 게임을 시작합니다(5라운드) =====");
//				for(int i=1; i<=5; i++) {
//					int computerNum = ran.nextInt(100)+1;
//					System.out.print("["+i+"라운드] 컴퓨터가 숫자를 뽑았습니다! [1. 홀수, 2. 짝수] : ");
//					int answer = s.nextInt();
//					if((computerNum%2==0&&answer==2) || (computerNum%2==1&&answer==1)) {
//						System.out.println("정답입니다! (컴퓨터가 뽑은 숫자 : "+computerNum+")");
//						correctCnt++;
//					}else {
//						System.out.println("틀렸습니다.(컴퓨터가 뽑은 숫자 : "+computerNum+")");
//					}
//				}
//				System.out.println("총 5문제 중 "+correctCnt+"개 맞추셨습니다.");
//				System.out.println();
//			}else if(menu==2) { // 종료
//				System.out.println("종료되었습니다.");
//				break;
//			} else {
//				System.out.println("메뉴는 1~2 중에 선택해주세요.");
//				continue;
//			}
//		}

		
//		10. 배열 int arr[] = {7, 4, 5, 1, 3} 를 선언하고 '버블 정렬'을 통해 오름차순 하세요.
//				'버블 정렬'은 아래 이미지 및 설명을 통해 이해한 후 코드로 작성해주세요.
//				해당 문제는 검색을 하지 말고 풀이해보시기 바랍니다. (기존 코드는 참고하셔도 됩니다.)
		
//		int arr[] = {7,4,5,1,3};
//		
//		for(int j=0;j<arr.length-1; j++) {
//			for(int i=1; i<arr.length-j; i++) {
//				if(arr[i-1]>arr[i]) {
//					int temp=arr[i-1];
//					arr[i-1] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
	
		
		
	}
}
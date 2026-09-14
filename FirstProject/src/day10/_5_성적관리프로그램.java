package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _5_성적관리프로그램 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		ArrayList<String> stuNoList = new ArrayList<>();
		
		System.out.println("======= 성적관리 프로그램 =======");
		while(true) {
			System.out.print("[ (1) 성적등록, (2) 성적확인, (3) 성적순위, (4) 성적수정, (5) 삭제, (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) { // 성적등록
				// 메뉴 1번에 대한 조건
				// 1. 학번은 무조건 4글자. 4글자 벗어나게 입력하면 다시 입력(다시 학번 입력)하도록 유도.
				// 2. 이미 있는 학번이라면 마찬가지로 다시 입력하도록 유도.
				// 3. 각 과목의 점수를 입력받을 때 점수의 범위는 
				// 자바 : 0~40, db : 0~35, html : 0~25
				// 해당 범위 외의 숫자 입력 시 다시 입력하도록
				
				HashMap<String,Object> student = new HashMap<>();

				while(true) {
					String stuNo = MyFunction.textLength("학번 : ", 4);
					if(stuNoList.indexOf(stuNo)!=-1) { // 중복된 학번 있음
						System.out.println("이미 등록된 학번 입니다.");
					}else {
						student.put("stuNo", stuNo);
						break;
					}
				}
				
				// 내 코드
//				String stuNo = null;
//				do { // 4글자가 아니면 또는 이미 있는 학번이라면 반복
//					System.out.print("학번 : "); 
//					stuNo = s.next(); // 중복체크는 학번으로		
//					if(stuNo.length()!=4 || stuNoList.contains(stuNo)==true) {
//						System.out.println("올바른 학번을 입력해주세요");
//					}
//				}while(stuNo.length()!=4 || stuNoList.contains(stuNo)==true);
				
				
				System.out.print("이름 : ");
				String name = s.next();
				student.put("name", name);
				
				int javaScore = MyFunction.scoreScope("자바 점수 : ", 0, 40);
				student.put("java", javaScore);
				
				int dbScore = MyFunction.scoreScope("db 점수 : ", 0, 35);
				student.put("db", dbScore);

		
				int htmlScore = MyFunction.scoreScope("html 점수 : ", 0, 25);
				student.put("html", htmlScore);
				
				list.add(student);
				stuNoList.add((String) student.get("stuNo"));
				System.out.println(list);
				System.out.println(stuNoList);
				
			}else if(menu == 2) { // 성적확인
				// 학번을 입력받아서
				// 해당 학번이 존재하면
				// 해당 학생의 시험 총점을 출력
				// 해당 학번 없으면 '학번을 확인해주세요' 출력 후 메뉴로 이동
				System.out.print("성적을 확인할 학생의 학번 : ");
				String stuNo = s.next();
				
				int index = stuNoList.indexOf(stuNo);
				if(index != -1) {
					HashMap<String, Object> student = list.get(index);
					int total = (Integer)student.get("java")+(Integer)student.get("db")+(Integer)student.get("html");
					System.out.println("총점:"+total);
				}else {
					System.out.println("학번을 확인해주세요");
				}
				
				// 내 코드
//				if(stuNoList.contains(stuNo)) { // 학번 존재하므로 총 점 출력
//					HashMap<String,Object> student = list.get(stuNoList.indexOf(stuNo));
//					System.out.print("총 점 : ");
//					System.out.println((Integer)student.get("java")+(Integer)student.get("db")+(Integer)student.get("html"));
//				}else {
//					System.out.println("학번을 확인해주세요");
//					continue;
//				}
				
				
			}else if(menu == 3) {
				// 메뉴에 들어오면 학생들 전체 등수 출력
				// 5명 있으면
				// 1등 : ㅇㅇㅇ,  oo점(총점)
				// ...
				// 5등 : ㅇㅇㅇ,  oo점(총점)
				// 못 풀었으,,
//				for(int i=0; i<list.size()-1; i++) {
//					int maxIndex = i;
//					int maxTotal = MyFunction.totalScore(list.get(i));
//					for(int j=i+1; j<list.size(); j++) {
//						int total = MyFunction.totalScore(list.get(j));
//						if(maxTotal < total) {
//							maxTotal = MyFunction.totalScore(list.get(j));
//							maxIndex = j;
//						}
//					}
//					HashMap<String, Object> temp = list.get(i);
//					list.add(i,list.get(maxIndex));
//					list.add(maxIndex,temp);
//				}
//				
//				System.out.println(list);
//				
//				for(int i=0; i<list.size(); i++) {
//					HashMap<String,Object> student = list.get(i);
//					int total = MyFunction.totalScore(list.get(i));
//					System.out.println(i+1+"등 : "+student.get("name")+", "+total+"점(총점)");
//				}
				
				int scoreArr[] = new int[list.size()];
				String stuNoArr[] = new String[list.size()];
				
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> student = list.get(i);
					scoreArr[i] = (Integer)student.get("java")+(Integer)student.get("db")+(Integer)student.get("html");
					stuNoArr[i] = (String) student.get("stuNo");
				}
				
				for(int i=0; i<scoreArr.length; i++) {
					int maxIndex = i;
					for(int j=i+1; j<scoreArr.length; j++) {
						if(scoreArr[maxIndex]<scoreArr[j]) {
							maxIndex = j;
						}
					int temp = scoreArr[maxIndex];
					scoreArr[maxIndex] = scoreArr[i];
					scoreArr[i] = temp;
					
					String temp2 = stuNoArr[maxIndex];
					stuNoArr[maxIndex] = stuNoArr[i];
					stuNoArr[i] = temp2;
					}
					
				}
				
				for(int i=0; i<scoreArr.length; i++) {
					System.out.println((i+1)+"등 : " +stuNoArr[i]+", "+scoreArr[i]+"점");
				}
				
				
			} else if(menu == 4) { // 성적 수정
				// 학번을 입력받아서 해당 학번이 없으면 '학번을 확인해주세요' 출력
				// 메뉴로 이동
				// 있는 학번이면 '자바'(0~40), 'db'(0~35), 'html'(0~25) 점수를 다시 입력받아서
				// 해당 점수로 저장
				// 자바, db, html의 점수 범위는 1번 메뉴와 같다.
				String stuNo = MyFunction.textLength("성적을 확인할 학번 : ", 4);
//				System.out.print("성적을 확인할 학번 : ");
//				String stuNo = s.next();
				int index = stuNoList.indexOf(stuNo);
				if(index == -1) { // 확인할 학번 없음
					System.out.println("학번을 확인해주세요");
					continue;
				}
				else { // 확인할 학번 있음
					int java = MyFunction.scoreScope("자바 점수 : ", 0, 40);
					list.get(index).put("java", java);
					
					int db = MyFunction.scoreScope("db 점수 : ", 0, 35);
					list.get(index).put("db", db);
					
					int html = MyFunction.scoreScope("html 점수 : ", 0, 25);
					list.get(index).put("html", html);
				}
				
			}else if(menu == 5) { // 학생 삭제
				// 학번을 입력받아서 해당 학번이 없으면 '학번을 확인해주세요' 출력
				// 메뉴로 이동
				// 있는 학번인 경우 '정말 삭제하시겠습니까?' 물어보고
				// Y(대문자, 소문자 모두 포함) -> 해당 학번 가진 정보 삭제
				// 그 외 문자 입력 시 '취소되었습니다' 출력 후 메뉴로 이동
				String stuNo = MyFunction.textLength("성적을 확인할 학번 : ", 4);
				int index = stuNoList.indexOf(stuNo);
				if(index == -1) { // 확인할 학번 없음
					System.out.println("학번을 확인해주세요");
					continue;
				}else { // 확인할 학번 있음
					System.out.print("정말 삭제하시겠습니까? (y 누르면 삭제) : ");
					String input = s.next();
					if(input.toUpperCase().equals("Y")) { // 삭제 ㄱㄱ
						list.remove(index);
						stuNoList.remove(index);
						System.out.println("삭제되었습니다!");
					} else { // 삭제 안됨
						System.out.println("취소되었습니다");
						continue;
					}
					
				}
				
			}else { // 종료
				System.out.println("종료되었습니다");
				break;
			}
		}
	}

}

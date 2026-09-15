package day12;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day11.DBClass;

public class _1_성적관리프로그램_DB {
	static DBClass db = new DBClass();
	static Statement stmt = db.getStmt();
	static Scanner s = new Scanner(System.in);
	
	public static void inputScore() {
		// 성적 입력
		// 테이블명 : STUDENT, 컬럼 : STU_NO(학번), STU_NAME(이름), JAVA(자바점수), ORACLE(오라클점수), HTML(HTML점수)
		// 학번, 이름, 3개 과목의 점수를 입력받아 STUDENT 테이블에 저장
		// 조건 1. 학번은 무조건 4글자(4자리 숫자). 잘못 입력할 경우 다시 입력받도록 함.
		// 조건 2. 학번은 중복되면 안됨(PK). 학번 입력받은 후 검색해보고 없을 경우 삽입 -> 학생 검색 메소드 만들기
		//	 	  중복된 학번을 입력할 경우 알림 메시지 후 메뉴로 이동 함.
		// 조건 3. 각 과목의 점수는 0~100 사이 값이여야 함. -> 메소드로 처리하기
		// 		  잘못된 범위를 입력할 경우 다시 입력받도록 함.
		System.out.println("==== 성적등록 ====");
		while(true) {
			System.out.print("등록할 학번 입력 : ");
			try {
				String stuNo = "'"+s.next()+"'";
				
				String sql = "SELECT * FROM STUDENT WHERE STU_NO = "+stuNo;
				ResultSet rs = stmt.executeQuery(sql);
				
				if(stuNo.length() == 4 + 2 && !rs.next()) { // "'" 때문에 2글자 늘어남.
					System.out.print("이름 입력 : ");
					String stuName = "'"+s.next()+"'";
					
					int java = MyFunction.checkScore("java 성적 : ", 0, 100);
					int oracle = MyFunction.checkScore("oracle 성적 : ", 0, 100);
					int html = MyFunction.checkScore("html 성적 : ", 0, 100);
					
		
					sql = "INSERT INTO STUDENT VALUES ("+stuNo+", " +stuName+", "+java+", "+oracle+", "+html+")";
//					System.out.println(sql);
					int insertCnt = stmt.executeUpdate(sql);
					if(insertCnt > 0) {
						System.out.println("등록에 성공했습니다.");
						break;
					}else {
						System.out.println("오류로 인해 등록에 실패했습니다.");
					}
				}else if(stuNo.length()!=4 + 2){
					System.out.println("등록에 실패했습니다. 4자리 숫자를 입력해주세요.");
					continue;
				}else { // 중복 학번
					System.out.println("등록에 실패했습니다. 중복된 학번입니다.");
					return;
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
		

	public static void rank() {
		// 순위 출력
		// 1등 : ooo(학번), ooo(이름), oo점(평균점수)
		// 2등 : ooo(학번), ooo(이름), oo점(평균점수)
		// ..
		// oo등 : ooo(학번), ooo(이름), oo점(평균점수)
		System.out.println("==== 순위 출력 ====");
		try {
			String sql = "SELECT S.*, (JAVA+ORACLE+HTML)/3 AVG, ROUND((JAVA+ORACLE+HTML)/3,2) OUTPUT_AVG FROM STUDENT S ORDER BY AVG DESC";
			ResultSet rs = stmt.executeQuery(sql);
			
			int rank = 1;
			while(rs.next()) {
				System.out.println(rank+"등 : "+rs.getString("STU_NO")+", "+rs.getString("STU_NAME")+", "+rs.getInt("OUTPUT_AVG"));
				rank++;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		
	}

	public static void updateScore() {
		// 성적 수정
		// 학번을 입력받은 후 해당 학생의 과목 점수 수정
		// 입력한 학번의 학생이 없을 경우 메뉴로 이동
		// 학번이 있을 경우 새로운 메뉴 '[ (1) 자바 (2) 오라클 (3) HTML ]' 을 띄우고
		// 선택한 메뉴의 점수만 입력받아서 수정( ex : 2번 선택 후 점수 입력받으면 오라클 점수만 수정 )
		// 1~3번 외에 다른 숫자 입력 시 다시 입력받도록 하며, 점수의 범위는 0~100 사이
		System.out.println("==== 성적 수정 ====");

		try {
			ResultSet rs = MyFunction.searchStuNo("학번 입력 : ");
			String stuNo = "'"+rs.getString("STU_NO")+"'";
//			if(stuNo != null) {}
			while(true) {
				System.out.print("[ (1) 자바 (2) 오라클 (3) HTML ] : ");
				int scoreMenu = s.nextInt();
				
				if(scoreMenu>3) {
					System.out.println("다시 입력해주세요.");
				}else {
					if(scoreMenu == 1) { // 자바 성적 수정
						System.out.println("기존 java 점수 : "+rs.getInt("JAVA"));
						int newJava = MyFunction.checkScore("수정할 java 성적 입력 : ", 0, 100);

						MyFunction.updateScore("JAVA", stuNo, newJava);
						
						
					}else if(scoreMenu == 2) { // 오라클 성적 수정
						System.out.println("기존 oracle 점수 : "+rs.getInt("ORACLE"));
						int newOracle = MyFunction.checkScore("수정할 oracle 성적 입력 : ", 0, 100);
						
						MyFunction.updateScore("ORACLE", stuNo, newOracle);
						
					}else { // HTML 수정
						System.out.println("기존 html 점수 : "+rs.getInt("HTML"));
						int newHtml = MyFunction.checkScore("수정할 html 성적 입력 : ", 0, 100);
						
						MyFunction.updateScore("HTML", stuNo, newHtml);
					}
					break; 
				}
			}
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
		


	public static void removeScore() {
		// 삭제
		// 학번을 입력받은 후 해당 학번을 가진 학생 삭제
		// 따로 중복체크 없이 삭제 요청 후 삭제 여부에 따라 성공or실패 메시지 출력
		// 삭제하기전 정말 삭제할지 (Y or N) 묻고 진행
		System.out.println("==== 학생 삭제 ====");
		
		try {
			ResultSet rs = MyFunction.searchStuNo("학번 입력 : ");
			String stuNo = "'"+rs.getString("STU_NO")+"'";
			
			System.out.print("정말 삭제하시겠습니까? (Y 누르면 삭제) : ");
			String answer = s.next();
			if(answer.toUpperCase().equals("Y")) {
				
				String sql = "DELETE FROM STUDENT WHERE STU_NO = "+stuNo;
				int deleteCnt = stmt.executeUpdate(sql);
				if(deleteCnt>0) {
					System.out.println("삭제에 성공했습니다.");
				}else {
					System.out.println("삭제에 실패했습니다.");
				}
			}else {
				System.out.println("삭제가 취소되었습니다.");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}

	public static void passFail() {
		// pass or fail
		// 학번 입력 후 해당 학번 학생이 있을 경우 pass or fail 여부 알려주기
		// 학번 없을 경우 메뉴로 이동
		// pass여부는 평균 점수가 60점 이상이며, 한과목이라도 40점 미만이 있을 경우 fail
		// => 합격 : 평균 60점 이상이여야, 모두 40정 이상이여야
		// 출력할때는 평균점수와 각 과목의 점수, pass or fail 여부를 출력
		System.out.println("==== 합격 여부 ====");
		try {
			ResultSet rs = MyFunction.searchStuNo("학번 입력 : ");
			String stuNo = "'"+rs.getString("STU_NO")+"'";
			
			int java = rs.getInt("JAVA");
			int oracle = rs.getInt("ORACLE");
			int html = rs.getInt("HTML");
			
			int avg = (java+oracle+html)/3;
			if(avg>=60 && (java>=40 && oracle>=40 && html>=40)) { // 합격
				System.out.println("pass!!!");
			}else {
				System.out.println("fail...");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			while (true) {
				System.out.print("[ (1) 성적입력 (2) 순위 (3) 성적수정 (4) 삭제 (5) 합격여부 (그 외) 종료 ] : ");
				int menu = s.nextInt();

				switch (menu) {
				case 1:
					inputScore();
					break;
				case 2:
					rank();
					break;
				case 3:
					updateScore();
					break;
				case 4:
					removeScore();
					break;
				case 5:
					passFail();
					break;
				default:
					System.out.println("종료되었습니다.");
					break;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
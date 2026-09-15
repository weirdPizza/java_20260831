package day12;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day11.DBClass;

public class MyFunction {
//	학생 검색 메소드, 4글자 제한도
	static DBClass db = new DBClass();
	static Statement stmt = db.getStmt();
	static Scanner s = new Scanner(System.in);
	
	static ResultSet searchStuNo(String msg) {
		while(true) {
			System.out.print(msg);
			try {
				String stuNo = "'"+s.next()+"'";
				
				String sql = "SELECT * FROM STUDENT WHERE STU_NO = "+stuNo;
				ResultSet rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					if(stuNo.length()== 4 + 2) {
						return rs;
					}else {
						System.out.println("4자리 숫자를 입력해주세요.");
						continue;
					}
				}else {
					System.out.println("학번을 다시 입력해주세요.");
					break;
				}
			
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		return null;
		
	} 
	
	
//	과목 범위 메소드
	static int checkScore(String msg, int min, int max) {
		while(true) {
			System.out.print(msg);
			int num = s.nextInt();
			
			if(num >= min && num <= max) {
				return num;
			}else {
				System.out.println("입력에 실패했습니다. 값의 범위는 "+min+" ~ "+max+"입니다.");
			}
			
		}
		
	}
	
// 성적 수정 메소드
	static void updateScore(String subject, String stuNo, int newScore) {
		try {
			String sql = "UPDATE STUDENT SET "+subject+" = "+newScore+" WHERE STU_NO = "+stuNo;
			
			int updateCnt = stmt.executeUpdate(sql);
			
			if(updateCnt>0) {
				System.out.println("수정에 성공했습니다.");
			}else {
				System.out.println("수정에 실패했습니다.");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	
	}
	
	
}

package day11;

import java.sql.Statement;
import java.util.Scanner;

public class _3_업데이트 {

	public static void main(String[] args) {
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		Scanner s = new Scanner(System.in);
		
		try {
			// 1. 스캐너로 과일 이름 입력 받기
			// 2. 수정할 가격 입력받아서 수정하기
			System.out.print("과일 이름 : ");
			String fruitName = "'"+s.next()+"'";
			System.out.print("수정할 가격 : ");
			int newPrice = s.nextInt();
			String sql = "UPDATE FRUIT SET PRICE = "+newPrice+" WHERE FRUIT_NAME = "+fruitName;
//			System.out.println(sql);
			int updateCnt = stmt.executeUpdate(sql);
			if(updateCnt>0) {
				System.out.println("수정되었습니다!");
			}else {
				System.out.println("없는 과일입니다.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

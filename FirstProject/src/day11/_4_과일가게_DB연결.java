package day11;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class _4_과일가게_DB연결 {
	static DBClass db = new DBClass();
	static Statement stmt = db.getStmt();
	static Scanner s = new Scanner(System.in);
	
	public static void addFruit() {
		System.out.println("=== 과일 추가 ===");
		// 1. 과일 이름 입력받아서 있는 과일이면 '이미 존재하는 과일 입니다.'
		// 출력 후 메뉴로 이동
		// 2. 없는 과일이면 과일 이름, 가격, 개수를 입력받아서 
		// db에 저장
		// 3. 가격과 개수를 입력받을 때는 0 이하의 숫자를 입력할 경우
		// 경고 후 다시 입력하도록 - 메소드 구현해라
		try {
			System.out.print("추가할 과일 이름 : ");
			String fruitName = "'"+s.next()+"'";
			
			String sql = "SELECT * FROM FRUIT WHERE FRUIT_NAME = " + fruitName;
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) { // 검색한 과일 있으니 추가 못함
				System.out.println("이미 존재하는 과일입니다");
				return;
			}else { // 과일 없으니 추가 가능
				
				int newPrice = MyFunction.nonNegative("가격 입력 : " );
				
				int newCnt = MyFunction.nonNegative("개수 입력 : " );
				
				sql = "INSERT INTO FRUIT VALUES("+fruitName+", "+newPrice+", "+newCnt+")";
				System.out.println(sql);
				int resultCnt = stmt.executeUpdate(sql);
				
				if(resultCnt>0) {
					System.out.println("수정되었습니다.");
				}else {
					System.out.println("수정에 실패했습니다.");
				}
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	public static void updateFruit() {
		System.out.println("=== 가격 수정 ===");
		// 1. 과일 이름 입력받아서 있는 과일이면 현재 가격 출력
		// 없는 과일이면 '해당 과일 없습니다.' 출력 후 메뉴로 이동
		// 2. 새로운 가격을 입력받아서 해당 가격으로 수정
		
		try {
			System.out.print("가격 수정할 과일 이름 : ");
			String fruitName = "'"+s.next()+"'";
			
			String sql = "SELECT * FROM FRUIT WHERE FRUIT_NAME =" + fruitName;
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) { // 검색한 과일 있으면
				System.out.println(fruitName + "의 현재 가격은 "+rs.getInt("PRICE")+"원 입니다.");
				System.out.print("수정할 가격 입력 : ");
				int price = s.nextInt();
				sql = "UPDATE FRUIT SET PRICE = "+price+" WHERE FRUIT_NAME = "+fruitName;
				System.out.println(sql);
				int updateCnt = stmt.executeUpdate(sql);
				if(updateCnt>0) {
					System.out.println("수정되었습니다.");
				}else { // 혹시 모르니 추가해줘야 함
					System.out.println("수정에 실패했습니다.");
				}
			}else {
				System.out.println("해당 과일은 존재하지 않습니다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

		
	}
	public static void sellFruit() {
		System.out.println("=== 과일 판매 ===");
	}
	public static void checkFruit() {
		System.out.println("=== 과일 확인 ===");
		try {
			System.out.print("과일 이름 : ");
			String fruitName = "'"+s.next()+"'";
			
			String sql = "SELECT * FROM FRUIT WHERE FRUIT_NAME =" + fruitName;
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) { // 검색한 과일 있음
				System.out.print(fruitName + "의 가격은 "+rs.getInt("PRICE")+"원 입니다. ");
				System.out.println("남은 개수는 "+rs.getInt("CNT")+"개 입니다.");
			}else { // 검색한 과일 없음
				System.out.println("해당 과일은 존재하지 않습니다.");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void deleteFruit() {
		// 과일 이름 입력 받아서
		// '정말 삭제하시겠습니까?' 물어보고 y or Y 입력되면
		// db에 삭제 요청
		// 삭제 성공하면 '삭제되었습니다.'
		// 실패하면 '과일 이름을 확인해주세요.'
		
		try {
			System.out.print("삭제할 과일 이름 : ");
			String fruitName = "'"+s.next()+"'";
			
			System.out.print("정말 삭제하시겠습니까? (Y 입력 시 삭제) : ");
			String answer = s.next();
			if(answer.toUpperCase().equals("Y")) {
				String sql = "DELETE FROM FRUIT WHERE FRUIT_NAME = "+fruitName;
				int deleteCnt = stmt.executeUpdate(sql);
				
				if(deleteCnt > 0) {
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("삭제에 실패했습니다.");
				}
				
			}else {
				System.out.println("과일 이름을 다시 확인해주세요.");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		try {
			while(true) {
				System.out.print("[(1) 과일 추가, (2) 가격 수정, (3) 판매, (4) 과일 확인, (5) 삭제, (그 외) 종료] : ");
				int menu = s.nextInt();
				
				switch (menu) {
				case 1:
					addFruit();
					break;
				case 2:
					updateFruit();
					break;	
				case 3:
					sellFruit();
					break;
				case 4:
					checkFruit();
					break;
				case 5:
					deleteFruit();
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

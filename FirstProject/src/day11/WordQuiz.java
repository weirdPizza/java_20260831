package day11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class WordQuiz {
	
	public static ArrayList<HashMap<String, String>> quizList(){
		ArrayList<HashMap<String, String>> list = new ArrayList<>();
		String[] keys = {
			    "멕시코", "스페인", "프랑스", "영국", "그리스", 
			    "독일", "중국", "러시아", 
			    "일본", "대한민국", "이탈리아", "캐나다", "브라질", 
			    "인도", "이집트", "호주", "터키", "노르웨이"
		};
		String[] values = {
			    "멕시코시티", "+마드리드", "파리", "런던", "아테네", 
			    "베를린", "베이징", "모스크바", 
			    "도쿄", "서울", "로마", "오타와", "브라질리아", 
			    "뉴델리", "카이로", "캔버라", "앙카라", "오슬로"
		};
		
		for(int i=0; i<keys.length; i++) {
			HashMap<String, String> map = new HashMap<>();
			map.put(keys[i], values[i]);
			list.add(map);
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, String>> quizList = quizList();
		
		System.out.println("수도 문제 풀이 ! [-1을 입력하면 종료됩니다.]");
		System.out.println("현재 총 " + quizList.size() + "문제가 있습니다!");
		
		// 랜덤으로 키를 뽑아서 문제를 내고
		// 그에 맞는 인덱스의 답을 맞추기
		int ranArr[] = new int[quizList.size()];
		Random ran = new Random();
		
		for(int i=0; i<quizList.size(); i++) {
			int ranNum = ran.nextInt(quizList.size());
			for(int j=0; j<i; j++) {
				if(ranNum == ranArr[j]) {
					i--;
					break;
				}else {
					ranArr[i] = ranNum;
				}
			}
		} // ranArr[] 배열 완성 -> 앞부터 하나씩 꺼내서 퀴즈 인덱스로 쓰자
		System.out.println(Arrays.toString(ranArr));
		

		
		HashMap<String,String> map = new HashMap<>();
		for(int i=0; i<quizList.size(); i++) {
			int index = ranArr[i]; 
			
			
			map = quizList.get(index);
			Set<String> keys = map.keySet();
			Iterator<String> keyList = keys.iterator();
			String key = keyList.next();
			System.out.println(key);
			
					
			// 출력용
			System.out.print(key+"의 수도는? >> ");
			String answer = s.next();
			if(answer.equals(-1)) { // 종료 아님
				String correctAnswer = quizList.get(index).get(key);
				if(correctAnswer.equals(answer)) {
					System.out.println("정답!");
				}else {
					System.out.println("오답! 정답은 : "+correctAnswer);
				}
			}else { // 종료
				System.out.println("종료되었습니다.");
				break;
			}
			
			
		}
		
		
		
	}
}
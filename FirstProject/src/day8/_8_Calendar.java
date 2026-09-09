package day8;

import java.util.Calendar;

public class _8_Calendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // 캘린더 객체 생성
		int year = c.get(Calendar.YEAR); // 현재 시간을 가져온다
		
		System.out.println(year);
	}
}

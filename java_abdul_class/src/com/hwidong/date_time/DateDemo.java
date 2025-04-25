package com.hwidong.date_time;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date d = new Date();
		// Date는 mutable함.. set가능
		d.setHours(21);
		System.out.println(d);

		// @@@@@@@@@@ LocalDate사용
		// LocalDate는 생성자로 생성하는게 아님
		//-> 시간은 이미 존재하는거라 그냥 사용한다는 개념임.. 생성하는게 아니라
		LocalDate ldn = LocalDate.now();
		System.out.println(ldn);
		//-> 출력 결과: 2025-02-24
		
		
		// ### Clock타입을 받아서 만들수도 있음
		// system default zone으로 현재 LocalDate객체 만듦
		LocalDate ldc = LocalDate.now(Clock.systemDefaultZone());
		
		
		// ### ZoneId 타입의 값을 넣을 수도 있음
		System.out.println("NTYNY");
		LocalDate ldt = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println(ldt);
		
		
		// ### 내가 원하는 날짜의 LocalDate시간도 가져올 수 있음
		LocalDate ldf = LocalDate.of(2024, 12, 25);
		System.out.println(ldf);
		
		
		// ### EpochDay
		// EpochDay는 1970년 1월 1일임
		// LocalDate.ofEpochDay(int값); 의 의미는 EpochDay에서부터 아규먼트로 받은 값의 일수만큼 떨어진 날짜를 가져온다는 것
		// 예) LocalDate.ofEpochDay(7); -> 1970년 1월 8일 가져옴
		LocalDate ldfe = LocalDate.ofEpochDay(7);
		System.out.println(ldfe);
		
		// ### LocalDate에 plusDays, plusMonths, plusYears등의 메서드를 사용하여 새로운 LocalDate를 얻을 수 있음
		//-> java.time의 클래스들은 immutable이기 때문에 해당 메서드에서 리턴하는 값을 새로 받아서 사용해야 함
		ldn = ldn.plusDays(3);
		System.out.println(ldn);
		
		
		
		// @@@@@@@@@ LocalTime
		System.out.println("==================== LocalTime ====================");
		LocalTime ltn = LocalTime.now();
		LocalTime ltnc = LocalTime.now(Clock.systemDefaultZone());
		LocalTime ltzi = LocalTime.now(ZoneId.of("America/New_York"));
		
		System.out.println(ltn);
		System.out.println(ltzi);
		
		// ### plus hours, minutes, seconds등 가능
		ltn.plusHours(1);
		ltn.plusSeconds(1);
		
		
	}

}

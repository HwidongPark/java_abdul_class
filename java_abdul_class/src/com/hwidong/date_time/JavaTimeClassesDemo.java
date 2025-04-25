package com.hwidong.date_time;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaTimeClassesDemo {
	public static void main(String[] args) {
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@ ZonedDateTime @@@@@@@@@@@@@@@@@@@@");
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		//-> 2025-02-24T01:09:47.932197+09:00[Asia/Seoul]
		// ZonedDateTime은 offset과 함께 Zone Id를 갖고 있음
		
		zdt = zdt.withHour(15);
		System.out.println(zdt);
		
		ZonedDateTime zdtNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(zdtNY);
		
		

		
		System.out.println("@@@@@@@@@@@@@@@@@@@@ OffsetDateTime @@@@@@@@@@@@@@@@@@@@");
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		//-> 2025-02-24T01:10:45.222489100+09:00
		// OffsetDateTime은 Offset은 갖고 있지만 ZoneId는 없음
		System.out.println(odt.toEpochSecond());
		//-> 1740327154
		System.out.println(System.currentTimeMillis());
		//-> 1740327154282
		
		
		//OffsetDateTime은 LocalDate 등과 거의 비슷한 메서드들을 갖고 있지만,
		// 거기에 더해 withHours과 같이 직접 해당 Hour, Minute 등을 설정할 수도 있음
		odt = odt.withHour(5);
		System.out.println(odt);
		//-> 2025-02-24T05:17:01.472604400+09:00
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@ MonthDay @@@@@@@@@@@@@@@@@@@@");
		MonthDay md = MonthDay.now();
		System.out.println(md);
		
		// MonthDay에서 사용할 수 있는 메서드들
		System.out.println(md.getMonth());
		//-> FEBRUARY
		System.out.println(md.getMonthValue());
		//-> 2
		System.out.println(md.getDayOfMonth());
		//-> 24
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@ YearMonth @@@@@@@@@@@@@@@@@@@@");
		// YearMonth도 MonthDate랑 비슷
		System.out.println("@@@@@@@@@@@@@@@@@@@@ Year @@@@@@@@@@@@@@@@@@@@");
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@ Period @@@@@@@@@@@@@@@@@@@@");
		// Period class는 period of date을 알려줌
		// Period는 Date의 기간과 관련 있음
		//-> in terms of days, months, years...
		
		Period p = Period.of(2, 2, 10);
		// 2년 2개월 10일이 얼마나 시간인지.
		
		System.out.println(p.addTo(LocalDateTime.now()));
		//-> 현재 시간에 2년 2개월 10일 더한 Date를 출력
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@ Duration @@@@@@@@@@@@@@@@@@@@");
		// Duration은 duration of time을 알려줌
		// 두 시간 사이의 간격을 in terms of hours, minutes, seconds, 등의 관점으로 알려줌
		Duration d = Duration.ofHours(2);
		System.out.println(d.addTo(LocalDateTime.now()));
				
				
		System.out.println("@@@@@@@@@@@@@@@@@@@@ Instant @@@@@@@@@@@@@@@@@@@@");
		//-> capturing moment
		// GMT시간 기준으로 시간을 capture함
		// TimeZone에 independent함
		// 같은 moment of time에 만들어졌으면 같은 값을 갖게됨(timezone에 independent하기 때문에)
		Instant i = Instant.now();
		System.out.println(i);
		Instant i2 = Instant.from(zdt);
		System.out.println(i2);
		
		
	}
}

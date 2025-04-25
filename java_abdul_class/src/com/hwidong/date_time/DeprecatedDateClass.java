package com.hwidong.date_time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DeprecatedDateClass {
	public static void main(String[] args) {
		
		// @@@@@@@@@@@@@@@@ Date 클래스
		// System.currentTimeMillis()
		//-> 현재 시간을 ms로 리턴
		System.out.println(System.currentTimeMillis() / ((long) 1000 * 60 * 60 * 24 * 365 ));
		System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);
		
		
		Date d = new Date();
		
		System.out.println(d);
		
		// ### 시간을 milliseconds로 받는 메서드
		System.out.println(d.getTime());
		System.out.println(System.currentTimeMillis());
		
		
		// ### 월-일 받는 방법
		// 0 - 일, 1 - 월, 2 - 화
		System.out.println(d.getDay());
		
		// ### Month받는 방법
		// 1월 - 0, 2월 - 1, 3월 - 2, ...
		System.out.println(d.getMonth());
		
		// ### Year받는 방법
		// .getYear() 1900년 이후 몇 년 지났는지를 보여줌
		System.out.println(d.getYear() + 1900);
		
		
		Date d1 = new Date("1/1/1980");
		System.out.println(d1);
		
		
		// @@@@@@@@@@@@@@@@ Calendar class
		// ### 그레고리안 캘린더 사용
		GregorianCalendar gc = new GregorianCalendar();
		GregorianCalendar gc2 = new GregorianCalendar(2024, Calendar.DECEMBER, 25);
		
		// ### Gregorian calendar의 시간이 leap year인지 보는 메서드
		System.out.println("========== isLeapYear ==========");
		System.out.println(gc.isLeapYear(2025));
		
		
		// ### Gregorian calendar의 시간이 며칠인지 보는 메서드
		System.out.println("========== gc.get(Calendar.DATE) ==========");
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc2.get(Calendar.DATE));

		System.out.println("========== gc.get(Calendar.DAY_OF_YEAR) ==========");
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));
		System.out.println(gc2.get(Calendar.DAY_OF_YEAR));
		
		// ### Gregorian calendar의 시간이 몇월인지 보는 메서드
		System.out.println("========== gc.get(Calendar.MONTH) ==========");
		System.out.println(gc.get(Calendar.MONTH));
		System.out.println(gc2.get(Calendar.MONTH));
		
		// @@@@@@@@@@@@@@@ TimeZone
		System.out.println("TIMEZONE");
		
		// TimeZone 객체 가져오는 방법.
		//-> Calendar객체에서 TimeZone읽어옴
		TimeZone tz = gc.getTimeZone();
		System.out.println(tz);
		//-> sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null]
		
		
		// TimeZone name가져오는 방법
		System.out.println(tz.getDisplayName());
		//-> Korean Standard Time
		
		// TimeZone ID 가져오는 방법
		System.out.println(tz.getID());
		//-> Asia/Seoul
		
	}
}

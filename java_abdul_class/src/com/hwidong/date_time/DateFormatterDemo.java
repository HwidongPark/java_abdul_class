package com.hwidong.date_time;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateFormatterDemo {
	public static void main(String[] args) {
		LocalDate ldt = LocalDate.now();
		
		// Formatter정의
		// formatter객체가 시간을 어떻게 formatting할지 정의함
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// formatter객체에 date, time 등 시간객체 넣어서 formatted된 String을 리턴함
		System.out.println(df.format(ldt));
		
		// time zone의 경우 LocalDate에는 time zone이 없어서 사용 불가... zoned date time사용해야함
		ZonedDateTime zdt = ZonedDateTime.now();
		OffsetDateTime odt = OffsetDateTime.now();
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy Zz");
		
		System.out.println(df2.format(zdt));
		
		// 시간객체의 format메서드에 formatter객체를 아규먼트로 집어넣어 시간 포매팅함
		System.out.println(ldt.format(df));
		
		// 아래 두 개는 time zone이 없기 때문에 예외 발생(unchecked)
//		System.out.println(df2.format(ldt));
//		System.out.println(df2.format(odt));
		
		
		
		// 아래와같이 formatting도 가능
		System.out.println(ldt.get(ChronoField.YEAR));
	}
}

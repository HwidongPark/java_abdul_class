package com.hwidong.string_and_printing;

public class RegexExpression {
	
	public static void main(String[] args) {
		
		// . 에 대해서
		String str1 = "f";		
		System.out.println(str1.matches("."));	// true
		
		String str2 = "8";
		System.out.println(str2.matches("."));	// true 
		
		String str3 = "abc";
		System.out.println(str3.matches("."));    // false
		
		
		
		// [abc]에 대해서
		String str4 = "a";
		System.out.println(str4.matches("[abc]"));	// true
		
		String str5 = "b";
		System.out.println(str5.matches("[abc]"));	// true
		
		String str6 = "ab";
		System.out.println(str6.matches("[abc]"));	// false
		
		
		// [^abc]에 대하여
		String str7 = "a";
		System.out.println(str7.matches("[^abc]"));	// false
		
		String str8 = "p";
		System.out.println(str8.matches("[^abc]"));	// true
		
		
		// [a-z0-9]에 대해서
		String str9 = "p";
		System.out.println(str9.matches("[a-z1-9]"));	// true	
		
		String str10 = "A";
		System.out.println(str10.matches("[a-z1-9]"));	// true
		
		
		// [a-z][0-9]에 대해서
		String str11 = "az";
		System.out.println(str11.matches("[a-z][1-9]"));	// false
		
		String str12 = "b7";
		System.out.println(str12.matches("[a-z][1-9]"));	// true
		
		
		
		// ### Meta Character에 대해
		
		// \d, \D에 대해서
		//-> escape때문에 \\로 써야 함
		String str13 = "a";
		System.out.println(str13.matches("\\d"));	// false
		System.out.println(str13.matches("\\D"));	// true
		
		// \s, \S에 대해서
		System.out.println(str13.matches("\\s"));	// false
		System.out.println(" ".matches("\\s"));	// true		
		System.out.println(str13.matches("\\S"));	// true
		
		// \w, \W에 대해서
		System.out.println(str13.matches("\\w"));	// true		
		System.out.println(str13.matches("\\W"));	// false
		System.out.println("$".matches("\\W"));	// true
		
		
		
		// ### Quantifier에 대해
		String str14 = "abcdef";
		System.out.println(str14.matches(".*"));	// true
		System.out.println(str14.matches("[a-z]+"));	// true
		
		String str15 = "abcd6efg";
		System.out.println(str15.matches("[a-z]*"));	// false
		
		String str16 = "abcDefg";
		System.out.println(str16.matches("[a-z]*"));	// false
		
		String str17 = "acc";
		System.out.println(str17.matches("[abc]{3}"));	// true
		System.out.println(str17.matches("[abc]{4}"));	// false
		System.out.println(str17.matches("[abc]{2,4}"));	// true
		System.out.println(str17.matches("[abc]{3,5}"));	// true
		System.out.println(str17.matches("[abc]{4,8}"));	// false
		
		// 응용
		// 이메일 gmail만 허용		
		String str18 = "john@gmail.com";
		System.out.println(str18.matches("\\w*@gmail(.*)"));
		System.out.println(str18.matches("\\w*@gmail.*"));
		// 위에것과 아래것은 걍 똑같음.. ( ) 안에 넣어도 된다는걸 보여주고 싶었음
		
		
		

	}
	
}

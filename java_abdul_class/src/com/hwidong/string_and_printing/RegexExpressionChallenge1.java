package com.hwidong.string_and_printing;

import java.util.Arrays;

public class RegexExpressionChallenge1 {
	public static void main(String[] args) {
		// email이 gmail인지 여부 확인
		// 이메일에서 username, domain name을 찾아라.
		String email = "programmer@gmail.com";
				
		// ### 우선 이메일인지 확인해야 함
		boolean isEmail = email.matches("[\\w.-]+@.+\\..*");
		if (!isEmail ) {
			System.out.println("It is not an email.");
			return;
		}
		boolean isGmail = email.matches("[\\w.-]*@gmail\\..*");
		
		// ### Gmail이 아니면 return
		if (!isGmail) {
			System.out.println("It is not gmail.");
			return;
		}
		
		String[] usernameDomainList = email.split("@");
		String username = usernameDomainList[0];
		String domainName = usernameDomainList[1].split("\\.")[0];
		
		System.out.println("username = " + usernameDomainList[0]);
		System.out.println("domain name = " + domainName);
	}
}

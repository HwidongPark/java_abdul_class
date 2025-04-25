package com.hwidong.interfaces;

public class CallBackMethod {
	public static void main(String[] args) {
		Store store = new Store();
		MemberCustomer c1 = new MemberCustomer("Smith");
		MemberCustomer c2 = new MemberCustomer("John");
		
		store.register(c1);
		store.register(c2);
		
		store.inviteSale();
		
	}
}

class Store {
	
	MemberCustomer[] memberArray = new MemberCustomer[100];
	int count = 0;
	
	void register(MemberCustomer customer) {
		memberArray[count] =  customer;
		count++;
	}
	
	void inviteSale() {
		for (int i = 0; i < count; i++) {
			memberArray[i].callback();
		}
	}
}

class Customer {
	String name;
	
	Customer(String name) {
		this.name = name;
	}
}

class MemberCustomer extends Customer implements IMember {	
	
	MemberCustomer(String name) {
		super(name);		
	}
	
	// 이벤트 시 전화 받도록
	public void callback() {
		System.out.println("Ok, I will visit " + this.name);
	}
}

interface IMember {
	void callback();
}

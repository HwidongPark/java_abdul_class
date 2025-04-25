package com.hwidong.static_final;

public class Singleton {

	public static void main(String[] args) {
		
		CoffeeMachine coffeeMachine1 = CoffeeMachine.getInstance();
		CoffeeMachine coffeeMachine2 = CoffeeMachine.getInstance();
		CoffeeMachine coffeeMachine3 = CoffeeMachine.getInstance();
		
		System.out.println(coffeeMachine1 == coffeeMachine2);
		System.out.println(coffeeMachine2 == coffeeMachine3);
	}

}

class CoffeeMachine {
	private float coffeeQty;
	private float milkQty;
	private float waterQty;
	private float sugarQty;
	
	static private CoffeeMachine my = null;
	
	private CoffeeMachine() {
		coffeeQty = 1;
		milkQty = 1;
		waterQty = 1;
		sugarQty = 1;		
	}
	
	public void fillWater(float qty) {
		waterQty = qty;
	}
	
	public void fillSugar (float qty) {
		sugarQty = qty;		
	}
	
	public float getCoffee() {
		return 0.23f;
	}
	
	// singleton 객체 가져오는 메서드
	static CoffeeMachine getInstance() {
		if (my == null) {
			my = new CoffeeMachine();
		}
		
		return my;
	}
}

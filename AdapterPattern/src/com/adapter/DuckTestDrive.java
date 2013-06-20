package com.adapter;

public class DuckTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		Turkey duckAdapter = new DuckAdapter(duck);
		
		System.out.println("The Turkey says...");
		testTurkey(turkey);
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
		System.out.println("\nThe DuckAdapter says...");
		testTurkey(duckAdapter);
		
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
	
	static void testTurkey(Turkey turkey){
		turkey.gobble();
		turkey.fly();
	}

}

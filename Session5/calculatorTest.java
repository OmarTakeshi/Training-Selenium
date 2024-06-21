package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import excersiceJunit.Calculator;

class calculatorTest{
	@Test
	void twoPlusTwo(){
		var calculator = new Calculator();
		int x = 2, y = 2;
		int er = x + y;
		assertEquals(4, calculator.add(x,y));
		if(er != 4)
			System.out.println("Failed test add");
		else
			System.out.println("Succesful test add");
	}

	@Test
	void twoMinusTwo(){
		var calculator = new Calculator();
		int x = 2, y = 2;
		int er = x - y;
		assertEquals(4, calculator.subtract(x,y));
		if(er != 0)
			System.out.println("Failed test subtract");
		else
			System.out.println("Succesful test subtract");
	}

}

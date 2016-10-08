package com.wbl.basics;

public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calculator calculate = new Calculator();
      calculate.do_calculate('+', 25 , 15);
      calculate.do_calculate('-', 25 , 15);
      calculate.do_calculate('*', 25 , 10);
      calculate.do_calculate('/', 30 , 15);
	}

	
	public void do_calculate(char ch, int num1, int num2) {
		
		int Result = 0;
		if(ch == '+') {
			System.out.println("ADDITION");
			Result = num1 + num2;
			System.out.println("The numbers are :" + num1 +"  " + num2);
			System.out.println("The Result is:" + Result);
		} else if(ch == '-') {
			System.out.println("SUBTRACTION");
			Result = num1 - num2;
			System.out.println("The numbers are :" + num1 + "  " + num2);
			System.out.println("The Result is:" + Result);
		} else if(ch == '*') {
			System.out.println("MULTIPLICATION");
			Result = num1 * num2;
			System.out.println("The numbers are :" + num1 + "  " +  num2);
			System.out.println("The Result is:" + Result);
		} else if(ch == '/') {
			System.out.println("DIVISION");
			Result = num1 / num2;
			System.out.println("The numbers are :" + num1 +"  " +  num2);
			System.out.println("The Result is:" + Result);
		} else {
			System.out.println("invalid entry");
		}
		//System.out.println("Done...");
}
}

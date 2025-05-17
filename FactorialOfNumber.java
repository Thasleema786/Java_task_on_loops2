package com.whileLoop;

public class FactorialOfNumber {
	public static void factorial(int num) {
	if(num<=0) {
		System.out.println("Enter integer value");
	}
	int i=1,factorial=1;
	while(i<=num) {
		 factorial=factorial*i;
		i++;
	}
		System.out.println(num+" factorial is:"+factorial);
	

	}
    public static void main(String[] args) {
    	factorial(0);
		
	}
}

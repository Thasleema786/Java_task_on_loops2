package com.whileLoop;

public class NeonNumber {
	public static void number(int num) {
		int square=num*num;
		int sum=0,rem,temp=num;
		while(square!=0) {
			rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
			if(temp==sum) {
				System.out.println(num+" is a Neon Number"); 	
			}else {
				System.out.println(num+" is not a Neon Number");
			
		}
	}

	public static void main(String[] args){
		NeonNumber neon=new NeonNumber();
		neon.number(9);
			
		

	}

}

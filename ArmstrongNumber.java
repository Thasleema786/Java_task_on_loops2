package com.whileLoop;

public class ArmstrongNumber {
	public static void armstrong(int num) {
	  	  int count=0,temp=num;
	  	    while(num!=0) {
	  	    	 num=num/10;
	  	       count=count++;  
	  	    }
	  	  int sum=0, num1=num;
	  	  while(num1!=0) {
	  		  int rem=num%10;
	  		   sum+=Math.pow(rem,count);
	  		  num=num/10;
	  	  }
	  	  if(num1==sum) {
	  		  System.out.println("Number is Armstrong");
	  	  }else {
	  		  System.out.println("Not a Armstrong number");
	  	  }
	    }

              public static void main(String[] args) {
		          armstrong(1634);
			    }

			}



	



package com.example;

public class Fact {
public int fact(int n) {
	int result=1;
	for(int i=1;i<=n;i++) {
		
		result=result*i;
	}
	return result ;
}	
public static void main(String args[]) {
	Fact f=new Fact();
	System.out.println("Factorial of 7 is:"+f.fact(7));
	System.out.println("Factorial of 5 is:"+f.fact(5));
}
}

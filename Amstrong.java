package com.example;

public class Amstrong {
public void amstrong(int num) {
	int temp=num;
	int count=0;
	int sum=0;
	while(num>0) {
		int result=num%10;
		sum+=result*result*result;
		count++;
		num=num/10;
	}
	if(temp==sum) {
		System.out.println(temp+" :is a amstrong ");
	}
	else {
		System.out.println(temp+" :is not a amstrong");
	}
}	
public static void main(String args[]) {
	Amstrong a=new Amstrong();
	a.amstrong(153);
	a.amstrong(123);
	
}
}

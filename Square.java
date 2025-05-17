package com.example;

public class Square {
public void nean(int num) {
   int result=num*num;//81
   int sum=0; //
  while(result>0) {
    sum+=result%10;//0+81%10=1 +8%10=8= 8+1=9
   result=result/10;// 81/10=8 8/10=0
   }
  if(sum==num) {
	  System.out.println(num+":is a nean");
  }
  else {
 System.out.println(num+"is not a nean");
  }
}
public static void main(String args[]) {
	Square s=new Square();
      s.nean(9);
      s.nean(12);
  
	   
  }
}


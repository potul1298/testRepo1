package com.oop1.app;

public class basicmathod {

	int add(int a,int b) {
		int sum;
		sum = a+b;
		return sum;
	}//end add
	private int sub(int a,int b) {
		int sub;
		sub = a-b;
		return sub ; }
	public static void main(String[] args) {
 	
basicmathod bm = new basicmathod();
int sum = bm.add(20, 25);
System.out.println("sum other two number is:" +sum);
int sub = bm.sub(20, 25);
System.out.println("the sub  two number is:" +sub);
	}//end main
	
}//end of the class


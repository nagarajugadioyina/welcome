package com.naga;

public class AdditionBean {
	
	private int num1;
	private int num2;
	private int num3;
	
	
	public AdditionBean(int num1, int num2,int num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public void printAddition()
	{
		int add=num1+num2+num3  ;
		System.out.println("the addition of  3 numbers:"+add);
	}

}

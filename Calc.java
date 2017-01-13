package com.sist.calc;

import javax.swing.JTextField;

public class Calc {
	private int num1;
	private int num2;
	private String op;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	
	
	public int plus(){
		return num1+num2;
	}
	public int minus(){
		return num1-num2;
	}
	public int gop(){
		return num1*num2;
	}
	public int div(){
		if(num2==0)
			return 0;
		return num1/num2;
	}
	
	public void gesan(JTextField t){
		switch(op){
		case "+":
			t.setText(String.valueOf(plus()));
			System.out.printf("%d+%d=%d\n",num1,num2,plus());
			break;
		case "-":
			t.setText(String.valueOf(minus()));
			System.out.printf("%d-%d=%d\n",num1,num2,minus());
			break;		
		case "*":
			t.setText(String.valueOf(gop()));
			System.out.printf("%d*%d=%d\n",num1,num2,gop());
			break;
		case "/":
			t.setText(String.valueOf(div()));
			System.out.printf("%d/%d=%d\n",num1,num2,minus());
			break;			
		}
	}
	
	
}



















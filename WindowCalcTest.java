package com.sist.calc;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class WindowCalcTest extends JFrame implements ActionListener{
	JTextField tf1,tf2,tf3;
	JButton b;
	JComboBox box;
	
	public WindowCalcTest(){
		tf1=new JTextField(5);
		tf2=new JTextField(5);
		tf3=new JTextField(5);
		
		box=new JComboBox();
		box.addItem("+");
		box.addItem("-");
		box.addItem("*");
		box.addItem("/");
		
		JLabel la=new JLabel("=");
		b=new JButton("=");
		
		setLayout(new FlowLayout());
		add(tf1);
		add(box);
		add(tf2);
		add(la);
		add(tf3);
		add(b);
		
		setSize(350, 200);
		setVisible(true);
		b.addActionListener(this);
		
	}
	
	
	
	public static void main(String[] args){
		new WindowCalcTest();
	}

	//이벤트 처리 - 두 정수 입력 받아 연산 결과 출력
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b){
			Calc calc=new Calc();
			
			String num1=tf1.getText();
			String num2=tf2.getText();
			String op=box.getSelectedItem().toString();
			
			calc.setNum1(Integer.parseInt(num1));
			calc.setNum2(Integer.parseInt(num2));
			calc.setOp(op);
			
			calc.gesan(tf3);
			
		}
		
	}
}







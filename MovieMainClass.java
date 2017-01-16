package com.sist.inheri;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;		//Window ���õ� Ŭ����

import org.w3c.dom.events.MouseEvent;

/*
 * ��� ==> ��� ����� ������� ����� ����.
 */
public class MovieMainClass extends JFrame
							implements ActionListener,MouseListener{
	//�����Ҷ� �ٷ� �����츦 ���� => ������
	//������ =>public
	//������  : �ʱ�ȭ, �����Ҷ� �ٷ� ������ ������ ������ �ִ� ��쿡 �ַ� ���.
	/*
	 * 1)Ŭ������� ����
	 * 2)�����ε��� �����Ѵ�.
	 * 3)Ŭ������ �޸𸮿� �����Ҷ� ���
	 * 4)ȣ��ÿ�  �ݵ��   new ������()
	 */
	
	/*
	 *  JFrame : ������â
	 *  =======
	 *  	1)������Ʈ�� �÷��� ���
	 *  	  =====
	 *  	  JButton,JTextField,JComboBox...
	 *  	  =>add(button)
	 *  	2)�������� ũ�⸦ ����
	 *  	  setSize(width,heigh)
	 *  	3)������ �����ش�.
	 *  	  setVisible(true)
	 *  
	 */
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	JLabel la3;
	MoviePoster[] la=new MoviePoster[7];
	//Ŭ���� �迭 ==> null
	
	
	public MovieMainClass(){
		la1=new JLabel("ID", JLabel.RIGHT);
		la2=new JLabel("Password", JLabel.RIGHT);
		la3=new JLabel("SIST Movie Center", JLabel.CENTER);
		la3.setFont(new Font("���� ���",Font.BOLD,35));
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("�α���");
		b2=new JButton("���");
		
		setLayout(null);
		
		for(int i=0;i<7;i++){
			la[i]=new MoviePoster();
			la[i].setImage("C:\\JavaProjects\\javaLab2\\Ŭ����-���\\image\\"+(i+1)+".jpg");
			la[i].setBounds(20+(i*110), 15, 95, 150);
			add(la[i]);
		}
		
		//��ġ
		la1.setBounds(270, 220, 100, 30);
		tf.setBounds(380, 220, 100, 30);
		
		la2.setBounds(270, 260, 100, 30);
		pf.setBounds(380, 260, 150, 30);
		
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setOpaque(false);
		p.setBounds(270, 310, 260, 35);
		
		la3.setBounds(20, 480, 760, 100);
		
		add(la1);
		add(tf);
		add(la2);
		add(pf);
		add(p);
		add(la3);
		
		setSize(800, 600);
		setVisible(true);
		
		
	}
		
	public static void main(String[] args){
		new MovieMainClass();
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}













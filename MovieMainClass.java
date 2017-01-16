package com.sist.inheri;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;		//Window 관련된 클래스

import org.w3c.dom.events.MouseEvent;

/*
 * 상속 ==> 모든 기능을 마음대로 사용이 가능.
 */
public class MovieMainClass extends JFrame
							implements ActionListener,MouseListener{
	//실행할때 바로 윈도우를 수행 => 생성자
	//생성자 =>public
	//생성자  : 초기화, 실행할때 바로 수행이 가능할 내용이 있는 경우에 주로 사용.
	/*
	 * 1)클래스명과 동일
	 * 2)오버로딩을 지원한다.
	 * 3)클래스를 메모리에 저장할때 사용
	 * 4)호출시엔  반드시   new 생성자()
	 */
	
	/*
	 *  JFrame : 윈도우창
	 *  =======
	 *  	1)컴포넌트를 올려서 사용
	 *  	  =====
	 *  	  JButton,JTextField,JComboBox...
	 *  	  =>add(button)
	 *  	2)윈도우의 크기를 설정
	 *  	  setSize(width,heigh)
	 *  	3)윈도우 보여준다.
	 *  	  setVisible(true)
	 *  
	 */
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	JLabel la3;
	MoviePoster[] la=new MoviePoster[7];
	//클래스 배열 ==> null
	
	
	public MovieMainClass(){
		la1=new JLabel("ID", JLabel.RIGHT);
		la2=new JLabel("Password", JLabel.RIGHT);
		la3=new JLabel("SIST Movie Center", JLabel.CENTER);
		la3.setFont(new Font("맑은 고딕",Font.BOLD,35));
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		setLayout(null);
		
		for(int i=0;i<7;i++){
			la[i]=new MoviePoster();
			la[i].setImage("C:\\JavaProjects\\javaLab2\\클래스-상속\\image\\"+(i+1)+".jpg");
			la[i].setBounds(20+(i*110), 15, 95, 150);
			add(la[i]);
		}
		
		//배치
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













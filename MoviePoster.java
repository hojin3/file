package com.sist.inheri;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;
/*
 * 	1)JPanel 용도
 * 		-사용자가 그래픽을 통해 다양한 UI를 창출하는 일종의 캔버스.
 *  2)스윙의 그리기 기본 철학
 *  	-모든 컴포넌트는 자신의 모양을 스스로 그린다.
 *  	-컨테이너는 자신을 그린후 자식들에게 그리기 지시.
 *  3)스윙의 페인팅 메커니즘
 *  	-스윙 컴포넌트들이 그려지는 과정
 *  		-레고블럭이 아래서부터 쌓이듯이, 바탕부터 한 컴포넌트씩 그려짐.
 *  		-JComponent.paint()
 *  			: 컴포넌트 자신과 모든 자손 그리기.
 *  	
 */
public class MoviePoster extends JPanel{
	Image img;
	
	public void setImage(String name){
		//그림정보를 읽어온다.
		img=Toolkit.getDefaultToolkit().getImage(name);
	}
	
	@Override
	public void paint(Graphics g) {	//Graphics 객체
		//- 컴포넌트 그리기에 필요한 도구를 제공하는 객체(색지정,도형그리기,클리핑,이미지 그리기)
		g.drawImage(img, 0, 0, 95, 150, this);
	}
	
	
	
}

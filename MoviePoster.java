package com.sist.inheri;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;
/*
 * 	1)JPanel �뵵
 * 		-����ڰ� �׷����� ���� �پ��� UI�� â���ϴ� ������ ĵ����.
 *  2)������ �׸��� �⺻ ö��
 *  	-��� ������Ʈ�� �ڽ��� ����� ������ �׸���.
 *  	-�����̳ʴ� �ڽ��� �׸��� �ڽĵ鿡�� �׸��� ����.
 *  3)������ ������ ��Ŀ����
 *  	-���� ������Ʈ���� �׷����� ����
 *  		-������� �Ʒ������� ���̵���, �������� �� ������Ʈ�� �׷���.
 *  		-JComponent.paint()
 *  			: ������Ʈ �ڽŰ� ��� �ڼ� �׸���.
 *  	
 */
public class MoviePoster extends JPanel{
	Image img;
	
	public void setImage(String name){
		//�׸������� �о�´�.
		img=Toolkit.getDefaultToolkit().getImage(name);
	}
	
	@Override
	public void paint(Graphics g) {	//Graphics ��ü
		//- ������Ʈ �׸��⿡ �ʿ��� ������ �����ϴ� ��ü(������,�����׸���,Ŭ����,�̹��� �׸���)
		g.drawImage(img, 0, 0, 95, 150, this);
	}
	
	
	
}

package com.sist.data;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;


public class DataManager {
	
	public ArrayList<String> getAllData(){
		ArrayList<String> list=new ArrayList<>();
		
		try{
			FileReader fr=new FileReader("C:\\image\\data.txt");
			int i=0;
			String data="";
			
			//-1   EOF
			while((i=fr.read())!=-1){
				data+=String.valueOf((char)i);
			}
			fr.close();
			
			String[] str=data.split("\n");
			for(String s:str){
				list.add(s);
			}			
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}		
		return list;
	}
	
	public static void main(String[] args){
		DataManager dm=new DataManager();
		ArrayList<String> list=dm.getAllData();
		
		String[] data={"문재인","반기문","이재명","박원순","안희정","안철수","남경필","유승민","황교안"};
		//1.
		Pattern[] p=new Pattern[data.length];
		
		int[] count=new int[9];
		
		for(int i=0;i<p.length;i++){
			p[i]=Pattern.compile(data[i]);
		}
		
		//2.
		Matcher[] m=new Matcher[data.length];
		
		//3.
		for(String s:list){
			for(int i=0;i<data.length;i++){
				m[i]=p[i].matcher(s);
				if(m[i].find()){
					count[i]++;
				}
			}
		}
		
		for(int i=0;i<7;i++){
			System.out.println(data[i]+":"+count[i]);
		}
		
		
	}
}




















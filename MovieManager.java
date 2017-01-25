package com.sist.movie;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MovieManager {
	
/*	public static void main(String[] args){
		MovieManager mm=new MovieManager();
		mm.movieAllData();
	}*/
	
	public ArrayList<MovieVO> movieAllData(){
		ArrayList<MovieVO> list=new ArrayList<>();
		
		try{
			ArrayList<String> link=movieLinkData();
			int mno=1;
			for(String url:link){
				Document doc=Jsoup.connect(url).get();

				Element title=doc.select("div.box-contents div.title strong").first();

				
				Element poster=doc.select("div.box-image span.thumb-image img").first();
				

				Element reserve=doc.select("div.score strong span").first();
				/*
				 * <dd class="on">15세 이상,&nbsp;134분,&nbsp;한국</dd>

				 */
				Element grade=doc.select("div.box-image span.thumb-image span.ico-grade").first();
				Element director=doc.select("div.spec dl dd a").get(0);
				Element actor=doc.select("div.spec dl dd a").get(1);
				Element regdate=doc.select("div.spec dl dd").get(4);
				Element genre=doc.select("div.spec dl dt").get(2);
				Element like=doc.select("span.like span.count strong i").first();
/*				System.out.println(title.text()+" "
								+genre.html().replace("&nbsp;", "")+" "
								+actor.text() +" "
								+reserve.text()+" "
								+grade.text()+" "
								+director.text()+" "
								+regdate.text()+" "
								+like.text());*/
				
				
				MovieVO vo=new MovieVO();
				vo.setMno(mno);
				vo.setLink(url);
				vo.setTitle(title.text());
				
				String img=poster.attr("src");
				vo.setPoster(img);
				vo.setDirector(director.text());
				vo.setActor(actor.text());
				vo.setGrade(grade.text());
				vo.setRegdate(regdate.text());
				
				String temp=genre.html().replace("&nbsp;", "");
				temp=temp.substring(temp.indexOf(":")+1);
				vo.setGenre(temp);
				
				vo.setLike(Integer.parseInt(like.text().replace(",", "")));
				vo.setReserve(Double.parseDouble(reserve.text().substring(0, reserve.text().lastIndexOf("%"))));
				
				list.add(vo);
				mno++;
			}
			
			
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
			
		return list;
	}
	
	public ArrayList<String> movieLinkData(){
		
		ArrayList<String> list=new ArrayList<>();
		
		try{
			//web에 연결 
			Document doc=Jsoup.connect("http://www.cgv.co.kr/movies/?ft=0").get();
			/*
                <div class="box-contents">
                    <a href="/movies/detail-view/?midx=79423">
                        <strong class="title">더 킹</strong>
                    </a>
			 * 
			 */
			Elements linkElem=doc.select("div.box-contents a");
			
			int j=0;
			for(int i=0;i<linkElem.size();i++){
				if(i%2==0){
					Element a_tag=linkElem.get(i);
					String href=a_tag.attr("href");
					if(!href.equals("#"))
						list.add("http://www.cgv.co.kr"+href);
					j++;
					if(j>6) break;
				}
			}
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
			
		return list;		
	}
	
	
	public MovieVO movieDetailData(int mno){
		MovieVO vo=new MovieVO();
		ArrayList<MovieVO> list=movieAllData();
		vo=list.get(mno-1);
		
		return vo;
	}
	
}











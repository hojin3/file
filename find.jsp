<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*,com.sist.dao.*,java.text.*"%>

<%
	request.setCharacterEncoding("EUC-KR");
	String fs=request.getParameter("fs");
	String ss=request.getParameter("ss");
	
	BoardDAO dao=BoardDAO.newInstance();
	List<BoardVO> list=null;
	int count=dao.boardFindCount(fs, ss);
			
	if(count!=0){
		 list=dao.boardFindData(fs, ss);
	}
	
	
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="table.css">
<style type="text/css">
	td,th{
		font-family: ���� ���;
		font-size: 9pt;
	}
	a{
		text-decoration: none;
		color: black;
	}
	a:HOVER {
		text-decoration: underline;
		color: green;
	}
</style>
</head>
<body>
	<center>
		<img alt="�˻����" src="image/title.gif">
		<p>
		
		<table border="0" width="600" id="abc">
			<tr>
				<td align="right">
					�˻��� ����:<%=count %>��
				</td>
			</tr>
		</table>
		
		<%
			if(count==0){
		%>
			<table id="table_content" width="600">
				<tr>
					<td align="center">�˻������ �����ϴ�.</td>
				</tr>
			</table>
		<%		
			}else{
		%>
			
		<%		
			}
		%>
		
		<table width="600" id="table_content">
			<tr bgcolor="#ccccff" height="27">
				<th width="10%">��ȣ</th>
				<th width="45%">����</th>
				<th width="15%">�̸�</th>
				<th width="20%">�ۼ���</th>
				<th width="10%">��ȸ��</th>
			</tr>
			<%
				int i=0;
				String color="white";
				for(BoardVO vo:list){
					if(i%2==0) color="white";
					else color="ivory";
			%>
					<tr bgcolor="<%=color%>" height="27">
						<td width="10%" align="center"><%=vo.getNo() %></td>
						<td width="45%" align="left">
							<a href="content.jsp?no=<%=vo.getNo()%>"><%=vo.getSubject() %></a>
							<%
								SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
								String today=sdf.format(new Date());
								String dbday=vo.getRegdate().toString();
								//2017-03-10
								if(today.equals(dbday)){
							%>
								<sup><img alt="��" src="image/new.gif"></sup>
							<%		
								}
							%>
						</td>
						<td width="15%" align="center"><%=vo.getName() %></td>
						<td width="20%" align="center"><%=vo.getRegdate().toString() %></td>
						<td width="10%" align="center"><%=vo.getHit() %></td>
					</tr>					
			<%		
				i++;
				}
			%>
			
		</table>
		
		<table border="0" width="600" id="abc">
			<tr>
				<td align="right">
					<a href="list.jsp">���</a>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>



































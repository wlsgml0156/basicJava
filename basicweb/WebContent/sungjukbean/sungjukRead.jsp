<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="ssi.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukRead.jsp</title>
</head>
<body>
  <h1>*성적 상세보기*</h1>
  <p><a href="sungjukForm.jsp">[성적쓰기]</a></p>
  <p><a href="sungjukList.jsp">[성적목록]</a></p>
<%
  int sno=Integer.parseInt(request.getParameter("sno"));
  dto=dao.read(sno);  
  if(dto==null){
    out.println("글없음!!");
  }else{
%>
		<table border="1">
		<tr>
			<th>이름</th>
			<td><%=dto.getUname()%></td>
		</tr>
		<tr>
			<th>국어</th>
			<td><%=dto.getKor()%></td>
		</tr>
		<tr>
			<th>영어</th>
			<td><%=dto.getEng()%></td>
		</tr>
		<tr>
			<th>수학</th>
			<td><%=dto.getMat()%></td>
		</tr>
		<tr>
			<th>평균</th>
			<td><%=dto.getAver()%></td>
		</tr>
		<tr>
			<th>주소</th>
			<td>
			   <%=dto.getAddr()%>
<%
               //문제)주소를 한글로 출력하시오
			   String addr=dto.getAddr();
			   if(addr.equals("Seoul")){
				  out.println("서울");
			   }else if(addr.equals("Jeju")){
				  out.println("제주");
			   }else if(addr.equals("Busan")){
				  out.println("부산");
			   }//if end
%>			
			</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td><%=dto.getWdate()%></td>
		</tr>
		</table>	
		<br><br>
		<a href="sungjukUpdate.jsp?sno=<%=sno%>">[수정]</a>
		&nbsp;&nbsp;
		<a href="sungjukDel.jsp?sno=<%=sno%>">[삭제]</a>
<%	  
  }//if end
%>
</body>
</html>






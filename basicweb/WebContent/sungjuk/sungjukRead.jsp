<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
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
  //out.print(sno);
  try{
    String url     ="jdbc:oracle:thin:@localhost:1521:xe";
    String user    ="system";
    String password="1234";
    String driver  ="oracle.jdbc.driver.OracleDriver";  

    Class.forName(driver);
    Connection con=DriverManager.getConnection(url, user, password);
    
    StringBuilder sql=new StringBuilder();
	sql.append(" SELECT sno, uname, kor, eng, mat, aver, addr, wdate ");
	sql.append(" FROM sungjuk ");
	sql.append(" WHERE sno=? ");
	
	PreparedStatement pstmt=con.prepareStatement(sql.toString());
	pstmt.setInt(1, sno);
  
	ResultSet rs=pstmt.executeQuery();
	if(rs.next()){
%>
		<table border="1">
		<tr>
			<th>이름</th>
			<td><%=rs.getString("uname")%></td>
		</tr>
		<tr>
			<th>국어</th>
			<td><%=rs.getInt("kor")%></td>
		</tr>
		<tr>
			<th>영어</th>
			<td><%=rs.getInt("eng")%></td>
		</tr>
		<tr>
			<th>수학</th>
			<td><%=rs.getInt("mat")%></td>
		</tr>
		<tr>
			<th>평균</th>
			<td><%=rs.getInt("aver")%></td>
		</tr>
		<tr>
			<th>주소</th>
			<td>
			   <%=rs.getString("addr")%>
<%
               //문제)주소를 한글로 출력하시오
			   String addr=rs.getString("addr");
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
			<td><%=rs.getString("wdate")%></td>
		</tr>
		</table>	
		<br><br>
		<a href="sungjukUpdate.jsp?sno=<%=sno%>">[수정]</a>
		&nbsp;&nbsp;
		<a href="sungjukDel.jsp?sno=<%=sno%>">[삭제]</a>
<%	  
	}else{
	  out.println("해당 글 없음!!");
	}//if end
	
  }catch(Exception e){
      out.println("실패:"+e);
  }//try end
%>
</body>
</html>






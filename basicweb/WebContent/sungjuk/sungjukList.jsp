<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukList.jsp</title>
</head>
<body>
  <h1>*성적 목록*</h1>
  <p><a href="sungjukForm.jsp">[성적쓰기]</a></p>
  <table border="1">
  <tr>
    <th>이름</th>
    <th>국어</th>
    <th>영어</th>
    <th>수학</th>
    <th>등록일</th>
  </tr>
<%
  try{
    String url     ="jdbc:oracle:thin:@localhost:1521:xe";
    String user    ="system";
    String password="1234";
    String driver  ="oracle.jdbc.driver.OracleDriver";  

    Class.forName(driver);
    Connection con=DriverManager.getConnection(url, user, password);
    
    StringBuilder sql=new StringBuilder();
    sql.append(" SELECT sno, uname, kor, eng, mat, wdate");
    sql.append(" FROM sungjuk ");
    sql.append(" ORDER BY wdate DESC ");
    
    PreparedStatement pstmt=con.prepareStatement(sql.toString());
    ResultSet rs=pstmt.executeQuery();
    if(rs.next()){ //cursor가 있는지?
      do{
%>
         <tr>
         	<td><a href="sungjukRead.jsp?sno=<%=rs.getInt("sno")%>"><%=rs.getString("uname") %></a></td>
         	<td><%=rs.getInt("kor") %></td>
         	<td><%=rs.getInt("eng") %></td>
         	<td><%=rs.getInt("mat") %></td>
         	<td><%=rs.getString("wdate").substring(0,10) %></td>
         </tr>
<%        
      }while(rs.next());
        
    }else{
      out.println("<tr>");
      out.println("  <td colspan='5'>글없음!!</td>");
      out.println("</tr>");
    }//if end
        
        
  }catch(Exception e){
    out.println("실패:"+e);
  }//try end
%>
</table>

</body>
</html>






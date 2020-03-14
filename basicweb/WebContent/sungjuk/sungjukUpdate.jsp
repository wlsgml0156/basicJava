<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="ssi.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukUpdate.jsp</title>
</head>
<body>
  <h1>* 성적 수정 *</h1>
  <p><a href="sungjukForm.jsp">[성적쓰기]</a></p>
  <p><a href="sungjukList.jsp">[성적목록]</a></p>
<%
  int sno=Integer.parseInt(request.getParameter("sno"));
  
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
      <form method="post"
            action="sungjukUpdateProc.jsp">
      <input type="hidden" name="sno" value="<%=sno%>">
	  <table border="1">
	  <tr>
	    <th>이름</th>
	    <td>
	       <input type="text" name="uname"
	              maxlength="20"
	              value="<%=rs.getString("uname") %>"
	              required autofocus>
	    </td>
	  </tr>
	  <tr>
	    <th>국어</th>
	    <td>
	       <input type="number" name="kor"
	              size="5" min="0" max="100"
	              value="<%=rs.getInt("kor") %>"
	              placeholder="숫자입력">
	    </td>
	  </tr>
	  <tr>
	    <th>영어</th>
	    <td>
	       <input type="number" name="eng"
	              size="5" min="0" max="100"
	              value="<%=rs.getInt("eng") %>"
	              placeholder="숫자입력">
	    </td>
	  </tr>
	  <tr>
	    <th>수학</th>
	    <td>
	       <input type="number" name="mat"
	              size="5" min="0" max="100"
	              value="<%=rs.getInt("mat") %>"
	              placeholder="숫자입력">
	    </td>
	  </tr>
	  <tr>
	    <th>주소</th>
	    <td>
<%
           String addr=rs.getString("addr");
%>	    
	       <select name="addr">
		     <option value="Seoul" <%if(addr.equals("Seoul")){out.print("selected");}%>>서울</option>
		     <option value="Jeju"  <%if(addr.equals("Jeju")) {out.print("selected");}%>>제주</option>
		     <option value="Busan" <%if(addr.equals("Busan")){out.print("selected");}%>>부산</option>
	       </select>
	    </td>
	  </tr> 
	  <tr>
	    <td colspan="2" align="center">
	      <input type="submit" value="수정">
	      <input type="reset"  value="취소">
	    </td>
	  </tr>  
	  </table>
	  </form>

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






<%@ page contentType="text/html; charset=UTF-8"%>

<%-- 공통페이지(ssi.jsp) 가져오기 --%>
<%@ include file="ssi.jsp"%>

<%-- 액션태그 기반의 공통페이지 삽입
<jsp:include page="ssi.jsp"></jsp:include>
--%>
 
<%-- 액션태그
<jsp:forward page=""></jsp:forward> 페이지 이동
<jsp:include page=""></jsp:include> 페이지 삽입
<jsp:useBean id=""></jsp:useBean>   객체생성(new연산자)
<jsp:param value="" name=""/>       매개변수
--%>
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukDel.jsp</title>
</head>
<body>
  <h1>*성적 삭제*</h1>
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
    sql.append(" DELETE FROM sungjuk ");
    sql.append(" WHERE sno=?");
    
    PreparedStatement pstmt=con.prepareStatement(sql.toString());
    pstmt.setInt(1, sno);
    
    int cnt=pstmt.executeUpdate();
    if(cnt==0){
        out.println("<p>성적 삭제 실패했습니다</p>");
        out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
    }else{
        out.println("<script>");
        out.println("  alert('성적이 삭제되었습니다');");
        out.println("  location.href='sungjukList.jsp';");//목록페이지이동
        out.println("</script>");
    }//if end
    
  }catch(Exception e){
    out.println("실패:"+e);
  }//try end
  
  
%>
</body>
</html>






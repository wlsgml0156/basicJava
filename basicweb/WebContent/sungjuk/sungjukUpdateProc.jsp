<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="ssi.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukUpdateProc.jsp</title>
</head>
<body>
  <h1>*성적 수정*</h1>
  <p><a href="sungjukForm.jsp">[성적쓰기]</a></p>
  <p><a href="sungjukList.jsp">[성적목록]</a></p>
<%
  //1)한글 인코딩(ssi.jsp에 있으므로 생략)
  //request.setCharacterEncoding("UTF-8");
  
  //2)사용자가 수정 요청한 정보 가져오기
  int sno=Integer.parseInt(request.getParameter("sno"));
  String uname=request.getParameter("uname").trim();
  int kor     =Integer.parseInt(request.getParameter("kor").trim());
  int eng     =Integer.parseInt(request.getParameter("eng").trim());
  int mat     =Integer.parseInt(request.getParameter("mat").trim());
  String addr =request.getParameter("addr").trim();
  int aver=(kor+eng+mat)/3;
  
  try{
    String url     ="jdbc:oracle:thin:@localhost:1521:xe";
    String user    ="system";
    String password="1234";
    String driver  ="oracle.jdbc.driver.OracleDriver";  

    Class.forName(driver);
    Connection con=DriverManager.getConnection(url, user, password);
      
    StringBuilder sql=new StringBuilder();
    sql.append(" UPDATE sungjuk ");
    sql.append(" SET uname=? ");
    sql.append(" ,kor=?, eng=?, mat=?, aver=? ");
    sql.append(" ,addr=? ");
    sql.append(" ,wdate=sysdate ");
    sql.append(" WHERE sno=?");

    PreparedStatement pstmt=con.prepareStatement(sql.toString());
    pstmt.setString(1, uname);
    pstmt.setInt(2, kor);
    pstmt.setInt(3, eng);
    pstmt.setInt(4, mat);
    pstmt.setInt(5, aver);
    pstmt.setString(6, addr);
    pstmt.setInt(7, sno);
    
    int cnt=pstmt.executeUpdate();
    if(cnt==0){
        out.println("<p>성적 수정 실패했습니다</p>");
        out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
    }else{
        out.println("<script>");
        out.println("  alert('성적이 수정되었습니다');");
        out.println("  location.href='sungjukList.jsp';");//목록페이지이동
        out.println("</script>");
    }//if end
    
  }catch(Exception e){
    out.println("실패:"+e);
  }//try end
  
  
%>
</body>
</html>






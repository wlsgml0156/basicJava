<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukIns.jsp</title>
</head>
<body>
  <h1>*성적 결과*</h1>
  <p><a href="sungjukForm.jsp">[성적쓰기]</a></p>
<%
  //한글 인코딩
  request.setCharacterEncoding("UTF-8");

  //입력정보 가져와서 변수에 담기
  String uname=request.getParameter("uname").trim();
  int kor     =Integer.parseInt(request.getParameter("kor").trim());
  int eng     =Integer.parseInt(request.getParameter("eng").trim());
  int mat     =Integer.parseInt(request.getParameter("mat").trim());
  String addr =request.getParameter("addr").trim();

  //평균구하기
  int aver=(kor+eng+mat)/3;

  //출력
  out.println("이름:" + uname + "<hr>");
  out.println("국어:" + kor + "<hr>");
  out.println("영어:" + eng + "<hr>");
  out.println("수학:" + mat + "<hr>");
  out.println("평균:" + aver + "<hr>");
  out.println("주소:" + addr + "<hr>");
  out.println("요청IP:" + request.getRemoteAddr() + "<hr>");
  
//Oracle DB 저장---------------------------------------------
  try{
    //Oracle DB 연결 정보
    String url     ="jdbc:oracle:thin:@localhost:1521:xe";
    String user    ="system";
    String password="1234";
    String driver  ="oracle.jdbc.driver.OracleDriver";  

    //1)Oracle 드라이버 로딩
    // /WebContent/WEB-INF/lib/ojdbc6.jar
    Class.forName(driver);
    
    //2)Oracle DB 연결 정보
    Connection con=DriverManager.getConnection(url, user, password);
    out.println("오라클 DB 서버 연결 성공");
    
    //3)SQL문 작성
    StringBuilder sql=new StringBuilder();
    sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, aver, addr, wdate) ");
    sql.append(" VALUES ( (SELECT NVL(MAX(sno),0)+1 FROM sungjuk) ");
    sql.append("          ,?,?,?,?,?,?, sysdate) ");

    
    //4)SQL문 변환
    PreparedStatement pstmt=con.prepareStatement(sql.toString());
    pstmt.setString(1, uname);
    pstmt.setInt(2, kor);        
    pstmt.setInt(3, eng);         
    pstmt.setInt(4, mat);         
    pstmt.setInt(5, aver);         
    pstmt.setString(6, addr);

    //5)SQL문 실행
    int cnt=pstmt.executeUpdate();
    if(cnt==0){
      out.println("<p>성적 입력이 실패했습니다</p>");
      out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
    }else{
      out.println("<script>");
      out.println("  alert('성적이 입력되었습니다');");
      out.println("  location.href='sungjukList.jsp'");//목록페이지 이동
      out.println("</script>");
    }//if end
    
  }catch(Exception e){
    out.println("실패:"+e);
  }//try end
  
  
%>
</body>
</html>






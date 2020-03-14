<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>07_formok.jsp</title>
</head>
<body>
  <h1>* 성적 결과 *</h1>
<%
/*
  - request 내부 객체
    사용자가 요청한 정보를 관리하는 객체
  - request.getParameter("")
    사용자가 입력한 정보를 개별적으로 가져올때
    예)<input type=number name=kor>
       request.getParameter("kor")

  - method=get방식
    http://localhost:8090/basicweb/basic/07_formok.jsp?uname=무궁호&kor=10&eng=20&mat=30  

  - method=post방식
    http://localhost:8090/basicweb/basic/07_formok.jsp
*/
//------------------------------------------
/*
  out.print(request.getParameter("uname"));
  out.print("<hr>");
  out.print(request.getParameter("kor"));
  out.print("<hr>");
  out.print(request.getParameter("eng"));
  out.print("<hr>");
  out.print(request.getParameter("mat"));
  out.print("<hr>");
*/

  //method=post방식이면 한글이 깨짐
  //1)한글 UTF-8인코딩
  request.setCharacterEncoding("UTF-8");
  
  //2)사용자가 요청한 정보를 변수에 옮기기
  String uname=request.getParameter("uname").trim();
  int kor=Integer.parseInt(request.getParameter("kor").trim());
  int eng=Integer.parseInt(request.getParameter("eng").trim());
  int mat=Integer.parseInt(request.getParameter("mat").trim());
  
  //3)평균구하기
  int aver=(kor+eng+mat)/3;
%>  

  <table border='1'>
  <tr>
      <th>이름</th>
      <td><%=uname%></td>
  </tr>
  <tr>
      <th>국어</th>
      <td><%=kor%></td>
  </tr>
  <tr>
    <th>영어</th>
    <td><%=eng%></td>
  </tr>
  <tr>
    <th>수학</th>
    <td><%=mat%></td>
  </tr>
  <tr>
    <th>평균</th>
    <td><%=aver%></td>
  </tr>  
  </table>  
  
  
  
  
  
  
  
</body>
</html>
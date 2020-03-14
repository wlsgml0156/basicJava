<%--
  [교재] : Chapter 03 ~ 05
  
  1)JSP코드 주석추가      : Ctrl + Shift + /

    JSP Directive(지시자) : <%@ page %>
                            <%@ include %>
                            <%@ taglib %>

    한글인코딩 : 완성형(MS949) EUC-KR
                 조합형        UTF-8
                 
  2) <%@page%> 디렉티브
     language=""     생략가능
     contentType=""  필수요소
     pageEncoding="" 생략가능
  
  3) <% %> 스크립트릿(Scriptlet)
      
  4) JSP페이지에서 사용 가능한 문법
     HTML tag
     CSS        <style></style>
     JS/jQuery  <script></script>
     JSP        <% %>
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 팩키지 import --%>    
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.*"%>
    
<!DOCTYPE html>
<html>
<head>
<%-- 웹브라우저 출력시 한글 인코딩 --%>
<meta charset="UTF-8">
<title>01_jsp기초문법.</title>
</head>
<body>
  <h1>대한민국</h1>
  <hr>
  1+3=4 <br>
  솔데스크
  <hr>
  <img src="../images/devil.png">
<%
  //한줄주석
  /*JSP코드 작성 영역 */
  //출력 out.print()
  //종결문자 ;
  out.print("무궁화");
  out.print(123);
  out.print(3+4);
  out.print(1.2+3.4);
  out.print('R');
  
  /*결과확인
  http://localhost:8090/basicweb/basic/01_jsp기초문법.jsp
  http://127.0.0.1:8090/basicweb/basic/01_jsp기초문법.jsp
  http://고정IP:8090/basicweb/basic/01_jsp기초문법.jsp
  http://도메인이름:8090/basicweb/basic/01_jsp기초문법.jsp 
  */
  
  /*에러
    물리적 경로 WebContent는 외부에서 접근 불가능
    프로젝트명 basicweb으로 접근해야 한다
    http://고정IP:8090/WebContent/basic/01_jsp기초문법.jsp
  */

  //HTML태그를 사용하는 경우 ""안에서 작성한다
  out.print("<h1>천사</h1>");
  out.print("<img src='../images/angel.png'>");
  out.print("<hr>");
  
  out.print("서울");
  out.print("부산");
  out.print("제주");
  out.println("<br>");
  out.println("개나리");
  out.println("진달래");
  out.println("라일락");
%>  
  
  
<%--
    JSP코드를 주석 처리(Ctrl + Shift + /)

<%
  //스크립트릿은 문서에 여러번 가능하다
  out.print("<style>.txt{color:red}</style>");
  out.print("<span class='txt'>오필승코리아</span>");
%>
    주석 끝 --%>  
  

</body>
</html>
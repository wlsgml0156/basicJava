<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elTest3.jsp</title>
</head>
<body>
<h3>* JSP와 EL의 값 공유 *</h3>
<%
  //JSP 지역변수와 EL변수는 서로 값을 공유할 수 없다
  String uname="솔데스크";
%>
  이름(JSP) : <%=uname %><br>
  이름(EL)  : ${uname}<br>
  <hr>
  
<%
  //동일한 페이지내에서 JSP와 EL이
  //서로 값을 공유하기 위해서는
  //pageContext Scope를 활용한다 
  pageContext.setAttribute("uid", "user");
%>  
  아이디(JSP) : <%=pageContext.getAttribute("uid")%><br>
  아이디(EL)  : ${pageScope.uid}<br>
  아이디(EL)  : ${uid}<br>  
   
</body>
</html>





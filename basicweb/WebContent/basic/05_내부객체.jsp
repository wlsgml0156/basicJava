<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>05_내부객체.jsp</title>
</head>
<body>
<%
/*
- JSP 내부객체
  톰캣서버가 자동으로 생성된 객체.
  개발자는 별도의 객체를 생성하지 않고
  바로 사용만 하면 된다.
  1) out        :웹브라우저에 출력 객체
  2) request    :사용자가 요청한 정보를 관리하는 객체
  3) response   :요청한 사용자에게 응답을 관리하는 객체
  4) session    :요청한 사용자를 개별적으로 구분해서 관리하는 객체
  5) application:서버에 대한 정보를 관리해 주는 객체
  6) pageContext:JSP, JSTL, EL등 동일한 페이지내에서 
                 서로 다른 문법과의 데이터를 교류할수 있다
//---------------------------------------------------------------
  톰캣서버에 의해 아래같은 흐름으로
  소스가 자동생성되고, 
  서버에서 클래스가 실행된다
  
  test.jsp -> test_jsp.java -> test_jsp.class
  
  test_jsp.java 저장 경로
  D:\java1209\workspace
             \.metadata
             \.plugins
             \org.eclipse.wst.server.core
             \tmp0
             \work
             \Catalina
             \localhost
             \basicweb                 
*/
%>
</body>
</html>
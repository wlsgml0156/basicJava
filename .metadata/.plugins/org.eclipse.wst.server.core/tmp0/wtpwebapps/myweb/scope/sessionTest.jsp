<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionTest.jsp</title>
</head>
<body>
  <h3>세션 session</h3>
<%
/*
  	[session 내부객체]
	- HttpSession session
	- 요청한 사용자에게만 개별적 접근
	- 선언한 세션변수는 전역적 성격으로 유지된다
	- 일정시간동안 이벤트가 발생되지 않으면 자동 삭제
*/
/*
	out.print("현재 세션 유지 시간");
	out.print(session.getMaxInactiveInterval());
	out.print("초(30분)");
	out.print("<hr>");
*/
//--------------------------------------------------
//세션유지시간 변경
/*1)
	session.setMaxInactiveInterval(60*10);
	out.print("변경된 세션 유지 시간");
	out.print(session.getMaxInactiveInterval());
	out.print("초(10분)");
	out.print("<hr>");
	
	2)/WEB-INF/web.xml 배치관리자에서 등록
	  <session-config>
		<session-timeout>20</session-timeout>
	  </session-config>
*/
//---------------------------------------------
//session 변수
//->myweb프로젝트의 모든 페이지에서 공유되는 전역변수
//->별도의 자료형이 없다

//session 변수 선언
//session.setAttribute("변수명", 값)
  session.setAttribute("s_id", "soldesk");
  session.setAttribute("s_pw", "12341234");

//session 변수값 가져오기
  Object obj=session.getAttribute("s_id");
  String s_id=(String)obj;
  String s_pw=(String)session.getAttribute("s_pw");
  
  out.print("세션변수 s_id :" + s_id +"<hr>");
  out.print("세션변수 s_pw :" + s_pw +"<hr>");
  
//session변수 강제 삭제(로그아웃) -> null값 
  session.removeAttribute("s_id");
  session.removeAttribute("s_pw");
  out.print("세션변수 삭제후<hr>");
  out.print("세션변수 s_id :" + session.getAttribute("s_id"));
  out.print("세션변수 s_pw :" + session.getAttribute("s_pw"));
  
//session변수값 모두 전부 삭제  
  session.invalidate();

//session객체에서 발급해 주는 아이디
  out.print("세션 임시 아이디 : ");
  out.print(session.getId());
  out.print("<hr>");
//-------------------------------------------------------
/*
  [application 내부객체]
		  -SevlectContext application
		  -서버에 대한 정보를 관리하는 객체
		  -사용자 모두가 공유하는 전역적 성격의 객체
*/
// /bbs폴더의 실제 물리적인 경로
// 실제경로 
	out.print(application.getRealPath("/bbs"));//강추
	out.print("<hr>");	
	out.print(request.getRealPath("/bbs"));
	out.print("<hr>");
//-----------------------------------------------------
//[response 내부객체]
//->요청한 사용자에게 응답해 줄때 


  




%>  
</body>
</html>
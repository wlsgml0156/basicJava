<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>10_requestok.jsp</title>
</head>
<body>

  <h1>*request 내부객체의 다양한 메소드 결과*</h1>
<%
  //1)한글인코딩
  request.setCharacterEncoding("UTF-8");

  //2)사용자가 입력한 정보 가져오기
  out.print(request.getParameter("uid"));
  out.print("<hr>");

  //3)요청한 사용자의 다양한 정보
  out.println(request.getRemoteAddr());//요청PC의 IP
  out.println("<hr>");
  out.println(request.getRemoteHost());
  out.println("<hr>");
  out.println(request.getRemotePort());
  out.println("<hr>");
//--------------------------------------------------
  // 해당 프로젝트 이름
  // /basicweb
  out.println(request.getContextPath());
  out.println("<hr>");
  
  // 사용자 요청한 명령어만
  // /basicweb/basic/10_requestok.jsp
  out.println(request.getRequestURI());
  out.println("<hr>");
  
  //사용자 요청한 명령어 전체
  // http://localhost:8090/basicweb/basic/10_requestok.jsp
  out.println(request.getRequestURL());
  out.println("<hr>");
//--------------------------------------------
  // 내컴퓨터 입장에서 /basic폴더의 실제 물리적 경로 
  /* D:\java1209\workspace
                \.metadata
                \.plugins
                \org.eclipse.wst.server.core
                \tmp0
                \wtpwebapps
                \basicweb
                \basic
  */                
  out.println(request.getRealPath("/basic"));
  out.println("<hr>");

  out.println(application.getRealPath("/basic"));
  out.println("<hr>");
//---------------------------------------------
  //내부 변수
  //->별도의 자료형이 없다
  //request.setAttribute("변수명", 값)
  //request.getAttribute("변수명")
  
  request.setAttribute("user", "KOREA");
  request.setAttribute("kor", 100);
  
  //내부변수의 리턴형은 Object이므로 형변환해서 사용한다
  Object obj=request.getAttribute("user");
  String str=(String)obj;
  
  Integer inte=(Integer)request.getAttribute("kor");
  
  out.print(str);
  out.print("<hr>");
  out.print(inte);  
  
%>








  
</body>
</html>
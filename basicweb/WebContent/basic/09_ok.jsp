<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>09_ok.jsp</title>
</head>
<body>
  <h1>다양한 폼 컨트롤요소들 결과</h1>
<%
  //한글 인코딩
  request.setCharacterEncoding("UTF-8");

  String uid    =request.getParameter("uid").trim();
  String upw    =request.getParameter("upw").trim();
  String uname  =request.getParameter("uname").trim();
  String content=request.getParameter("content").trim();

  out.print(uid + "<hr>");
  out.print(upw + "<hr>");
  out.print(uname + "<hr>");
  out.print(content + "<hr>");
  
  //<textarea>값은 엔터를 <br>치환 출력
  content = content.replace("\n", "<br>");
  out.print(content + "<hr>");
  
  //request객체에 존재하지 않는 정보를 가져오면
  //null값이 반환된다
  out.print(request.getParameter("kor"));
  out.print("<hr>");
  
  
  //name이 동일한 값을 request객체에서 가져오기
  //예를 들어
  //<input type=text name=num>이 3개인경우
  String[] num=request.getParameterValues("num");
  for(int i=0; i<num.length; i++){
    out.print(num[i] + "<br>");
  }//for end
   
  
  out.print("<hr>");
  out.print("성별:" + request.getParameter("gender"));
  
  
  //<input type=checkbox name=agree value=Y>
  //체크를 하면 Y, 체크하지 않으면 null
  out.print("<hr>");
  out.print("약관동의:" + request.getParameter("agree"));
  
  
  //checkbox에 value가 없는 경우
  //체크를 하면 on, 체크하지 않으면 null
  out.print("<hr>");
  out.print("sms:" + request.getParameter("sms"));
  
  out.print("<hr>");
  out.print("통신회사:" + request.getParameter("telecom"));
  
  out.print("<hr>");
  out.print("페이지:" + request.getParameter("page"));
  
  
  /*
  첨부된 파일을 가져오려면
  다른 방식으로 request객체에 접근해야 한다.
  request.getParameter("attach")는 
  실제 파일을 가지고 있는 것이 아니라
  파일명이 출력됐을 뿐이다.  
  */
  out.print("<hr>");
  out.print("첨부파일:" + request.getParameter("attach"));
  
%>  
 
  
</body>
</html>
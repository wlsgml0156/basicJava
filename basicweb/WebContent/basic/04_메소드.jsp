<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_메소드.jsp</title>
</head>
<body>
  <h1>JSP 사용자 정의 함수</h1>
  큰값 : <%=max(3, 5)%>
  <hr>
  두수 사이의 차이 : <%=diff(2, 6)%>
  
<%!
  //JSP페이지에서 함수 작성 영역(많이 사용안함)
  public int max(int a, int b){
     return Math.max(a, b);
  }//max() end
   
  public int diff(int a, int b){
     int c=a-b;
     return (c<0) ? -c : c;
  }//diff() end
%>  
  
</body>
</html>
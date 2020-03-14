<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>08_calcok.jsp</title>
</head>
<body>
  <h1>* 계산결과 *</h1>
<%
  //사용자가 입력 요청한 정보(request) 가져오기
  int num1=Integer.parseInt(request.getParameter("num1").trim());
  int num2=Integer.parseInt(request.getParameter("num2").trim());
  String op=request.getParameter("op").trim();

  /* 출력결과
     3+5=8
     3-5=-2
     3*5=15
     3/5=0.6
     3%5=3   
  */
  int result1=0;      // + - * % 계산결과 저장
  double result2=0.0; // /       계산결과 저장
  
  if(op.equals("+")){
    result1=num1+num2;
  }else if(op.equals("-")){
    result1=num1-num2;
  }else if(op.equals("*")){
    result1=num1*num2;
  }else if(op.equals("/")){
    result2=(double)num1/num2;
  }else if(op.equals("%")){
    result1=num1%num2;
  }//if end 
%>
  <!-- 출력 -->
  <table border="1">
  <tr>
      <td><%=num1%></td>
      <td><%=op%></td>
      <td><%=num2%></td>
      <td>=</td>
      <td>
<%
		if(op.equals("/")){
		  out.print(result2);
		}else{
		  out.print(result1);
		}//if end
%>      
      </td>      
  </tr>
  </table>
  
</body>
</html>


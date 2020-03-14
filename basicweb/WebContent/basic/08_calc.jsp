<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>08_calc.jsp</title>
</head>
<body>
  <h1>* 계산연습 *</h1>
  <!--
  전송방식 method=get       
  http://localhost:8090/basicweb/basic/08_calcok.jsp?num1=3&op=%2B&num2=5
  -> 전송값이 URL에 그대로 노출
  
  전송방식 method=post
  http://localhost:8090/basicweb/basic/08_calcok.jsp
  -> 전송값이 URL에 노출되지 않음
  -->
  
  <form name="calcfrm"
        method="post" 
        action="08_calcok.jsp" >
  첫번째 수 : <input type="number"
                     name="num1"
                     min="0"
                     max="100" required> 
  <hr>
  연산자 :    <input type="text"
                     name="op"
                     size="3" required> 
  <hr>
  두번째 수 : <input type="number"
                     name="num2"
                     min="0"
                     max="100" required>
  <hr>
  <input type="submit" value="계산">                      
  <input type="reset"  value="취소">                      
  </form>
  
  
  
  
  
  
   
  
</body>
</html>
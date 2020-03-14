<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>09_다양한컨트롤요소들.jsp</title>
</head>
<body>
  <h1>다양한컨트롤요소들</h1>
  <!-- method=get 생략가능 -->
  <form action="09_ok.jsp">
  아이디 : <input type="text" name="uid"> 
  <hr>
  비번   : <input type="password" name="upw">
  <hr>
  이름   : <input type="text" name="uname">
  <hr>
  내용   : <textarea rows="5" cols="20" name="content"></textarea>
  <hr>
  
  숫자1 : <input type="text" name="num"> <br>
  숫자2 : <input type="text" name="num"> <br>
  숫자3 : <input type="text" name="num"> <br>
  <hr>
  
  성별 : <input type="radio" name="gender" value="M">남
         <input type="radio" name="gender" value="F">여
  <hr>
  약관동의 : 
  <input type="checkbox" name="agree" value="Y">
  
  <hr>
  SMS :
  <input type="checkbox" name="sms">
  
  <hr>
  통신회사 : <select name="telecom">
               <option value="sk">SK
               <option value="lg">LG U+
               <option value="ktf">KTF
             </select>
             
  <!-- 폼요소이지만 본문에 출력은 안되는 요소 -->           
  <input type="hidden" name="page" value="7">
  
  <hr>
  <!-- <form enctype="multipart/form-data">
       속성 추가해야 함 -->
  <input type="file" name="attach">
  
  <hr>
  <input type="submit" value="전송">
  
  </form> 
  
  
  
  
</body>
</html>
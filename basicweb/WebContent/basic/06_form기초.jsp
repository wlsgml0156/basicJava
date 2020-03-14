<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>06_form기초.jsp</title>
</head>
<body>
  <h1>* 성적 입력 *</h1>
<!--
<form></form>
사용자가 입력한 정보를 서버로 전송하기 위한 양식
name   :폼이름. 서버에서 사용
id     :폼아이디. 주로 JavaScript, jQuery에서 사용
method :전송방식. get | post. 생략시 기본은 get방식
action :서버가 받아서 처리할 결과페이지
enctype:파일을 첨부해서 전송하고자 할때
        "multipart/form-data" 추가
--------------------------------------------------
전송방식
1) method=get방식
   ->생략가능
   ->사용자가 요청한 정보가 URL 노출
   ->ok.jsp?변수1=값1&변수2=값2&변수3=값3 ...
   ->ok.jsp?uname=무궁화&kor=10&eng=20&mat=30
   ->예)검색어
   
2) method=post방식    
   ->사용자가 요청한 정보가 URL에 노출되지 않고
     패키지화 되어서 서버로 전송
   ->한글깨짐
   ->예)비번, 주민번호, 계좌번호 등    
-->  

  <form name="sungjukfrm" id="sungjukfrm"
        method="post"
        action="07_formok.jsp">
  이름 : <input type="text"
                name="uname"
                size="10" maxlength="10"
                required>
  <hr>
  국어 : <input type="number"
                name="kor"
                size="5"
                min="0" max="100">
  <hr>
  영어 : <input type="number"
                name="eng"
                size="5"
                min="0" max="100">
  <hr>
  수학 : <input type="number"
                name="mat"
                size="5"
                min="0" max="100">
  <hr>
  <input type="submit" value="전송">                
  <input type="reset"  value="취소">                
  </form>
  
  
  
  
  
  
</body>
</html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="ssi.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukUpdate.jsp</title>
</head>
<body>
  <h1>*성적 수정*</h1>
  <p>
    <a href="sungjukForm.jsp">[성적쓰기]</a>
    <a href="sungjukList.jsp">[성적목록]</a>
  </p>
<%
  int sno=Integer.parseInt(request.getParameter("sno"));
  dto=dao.read(sno);
  if(dto==null){
      out.print("해당글 없음!!");
  }else{
%>
      <form method="post" action="sungjukUpdateProc.jsp">
      <input type="hidden" name="sno" value="<%=sno%>">
	  <table border="1">
	  <tr>
	    <th>이름</th>
	    <td>
	       <input type="text" name="uname" value="<%=dto.getUname()%>"
	              maxlength="20" required autofocus>
	    </td>
	  </tr>
	  <tr>
	    <th>국어</th>
	    <td>
	       <input type="number" name="kor" value="<%=dto.getKor()%>"
	              size="5" min="0" max="100" placeholder="숫자입력">
	    </td>
	  </tr>
	  <tr>
	    <th>영어</th>
	    <td>
	       <input type="number" name="eng" value="<%=dto.getEng()%>"
	              size="5" min="0" max="100" placeholder="숫자입력">
	    </td>
	  </tr>
	  <tr>
	    <th>수학</th>
	    <td>
	       <input type="number" name="mat" value="<%=dto.getMat()%>"
	              size="5" min="0" max="100" placeholder="숫자입력">
	    </td>
	  </tr>
	  <tr>
	    <th>주소</th>
	    <td>
<%
           String addr=dto.getAddr();
%>	    
	       <select name="addr">
		     <option value="Seoul" <%if(addr.equals("Seoul")){out.print("selected");}%>>서울</option>
		     <option value="Jeju"  <%if(addr.equals("Jeju")) {out.print("selected");}%>>제주</option>
		     <option value="Busan" <%if(addr.equals("Busan")){out.print("selected");}%>>부산</option>
	       </select>
	    </td>
	  </tr> 
	  <tr>
	    <td colspan="2" align="center">
	      <input type="submit" value="전송">
	      <input type="reset"  value="취소">
	    </td>
	  </tr>  
	  </table>
	  </form>

<%	    
  }//if end
%>
  
</body>
</html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="ssi.jsp"%>
<%@ include file="../header.jsp"%>
<!-- 본문시작 pdsDelProc.jsp -->
<h3>* 사진 삭제 결과 *</h3>
<%
  String passwd =request.getParameter("passwd").trim();
  int pdsno     =Integer.parseInt(request.getParameter("pdsno"));  
  String saveDir=application.getRealPath("/storage"); 
 
  int cnt=dao.delete(pdsno, passwd, saveDir); 
  if(cnt==0){ 
    out.println("<p>비밀번호가 일치하지 않습니다!!</p>");
    out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
  }else{
    out.println("<script>");
    out.println("  alert('게시글이 삭제되었습니다');");
    out.println("  location.href='pdsList.jsp'");
    out.println("</script>");
  }//if end
%>   
<!-- 본문끝 -->
<%@ include file="../footer.jsp"%>
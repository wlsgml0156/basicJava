<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="ssi.jsp"%>
<%@ include file="../header.jsp"%>
<!-- 본문시작 bbsList.jsp -->
<h3>* 게시판 목록*</h3>
<p><a href="bbsForm.jsp">[글쓰기]</a></p>
<table class="table table-hover">
<thead>
  <tr>
	<th>제목</th>
	<th>조회수</th>
	<th>작성자</th>
	<th>작성일</th>
  </tr>
</thead>
<tbody>  
<%
  ArrayList<BbsDTO> list=dao.list(); 
  if(list==null){
      out.println("<tr>");
      out.println("  <td colspan='4'><strong>관련자료 없음!!</strong></td>");
      out.println("</tr>");
  }else{
      for(int i=0; i<list.size(); i++) {
          dto=list.get(i);   
%>
		  <tr>
		    <td style="text-align:left">
<%
                 //답변이미지 출력
                 for(int n=1; n<=dto.getIndent(); n++){
                   out.println("<img src='../images/reply.gif'>");
                 }//for end
%>		    
		         <a href="bbsRead.jsp?bbsno=<%=dto.getBbsno()%>"><%=dto.getSubject()%></a>
		    </td>
		    <td><%=dto.getReadcnt()%></td>
		    <td><%=dto.getWname()%></td>
		    <td><%=dto.getRegdt().substring(0, 10)%></td>
		  </tr>
<%          
      }//for end
  }//if end
%> 
</tbody>
</table>
<!-- 본문끝 -->
<%@ include file="../footer.jsp"%>
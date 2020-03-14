<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="ssi.jsp"%>
<%@ include file="../header.jsp"%>
<!-- 본문시작 pdsList.jsp-->
<h3>* 포토 갤러리 *</h3>
<p><a href="pdsForm.jsp">[사진올리기]</a></p>
<%
  ArrayList<PdsDTO> list=dao.list();
  if(list==null){
    out.println("관련 자료 없음!!");
  }else{
%>
    전체 글 갯수 : <%=list.size()%>
    <br>
    <table class="table">
    <tr>
       <th>제목</th>
       <th>사진</th>
       <th>작성자</th>
       <th>조회수</th>
       <th>작성일</th>
    </tr>
<%
    for(int i=0; i<list.size(); i++){
      dto=list.get(i);
%>
      <tr>
         <td><a href="pdsRead.jsp?pdsno=<%=dto.getPdsno()%>"><%=dto.getSubject()%></a></td>
         <td><img src="../storage/<%=dto.getFilename()%>" width="50"></td>
         <td><%=dto.getWname()%></td>
         <td><%=dto.getReadcnt()%></td>
         <td><%=dto.getRegdate().substring(0,10)%></td>
      </tr>
<%      
    }//for end    
    out.print("</table>");    
  }//if end
%>
<!-- 본문끝 -->
<%@ include file="../footer.jsp"%>



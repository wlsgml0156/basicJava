<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="ssi.jsp"%>
<%@ include file="../header.jsp"%>
<!-- 본문시작 pdsRead.jsp -->
<h3>* 포토 갤러리 상세보기 *</h3>
<%
  int pdsno=Integer.parseInt(request.getParameter("pdsno"));
  dto=dao.read(pdsno);
  if(dto==null){
      out.print("관련 자료 없음");
  }else{
      dao.incrementCnt(pdsno); //조회수 증가
%>
	  <table class="table">
	  <tr>
	    <th>글제목</th>
	    <td><%=dto.getSubject()%></td>
	  </tr>
	  <tr>
	    <th>사진</th>
	    <td><img src="../storage/<%=dto.getFilename()%>"></td>
	  </tr>
	  <tr>
	    <th>파일크기</th>
	    <td><%=Utility.toUnitStr(dto.getFilesize())%></td>
	  </tr>
	  <tr>
	    <th>조회수</th>
	    <td><%=dto.getReadcnt()%></td>
	  </tr>
	  <tr>
	    <th>작성일</th>
	    <td><%=dto.getRegdate()%></td>
	  </tr>
	  </table> 
	  <br>
	  <input type="button" class="btn btn-primary"  value="수정" onclick="location.href='pdsUpdate.jsp?pdsno=<%=pdsno%>'">
	  <input type="button" class="btn btn-primary"  value="삭제" onclick="location.href='pdsDel.jsp?pdsno=<%=pdsno%>'">	  	      
<%      
  }//if end
%>  
<!-- 본문끝 -->
<%@ include file="../footer.jsp"%>




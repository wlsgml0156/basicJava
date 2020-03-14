<%@ page contentType="text/html; charset=UTF-8"%>
<%-- auto.jsp 로그인상태 확인 페이지 --%>
<%
  String s_id    ="";
  String s_passwd="";
  String s_mlevel="";

  if(session.getAttribute("s_id")==null ||
     session.getAttribute("s_passwd")==null ||
     session.getAttribute("s_mlevel")==null) {
      //로그인을 하지 않았다면
      s_id    ="guest";
      s_passwd="guest";
      s_mlevel="guest";
  }else{
      s_id    =(String)session.getAttribute("s_id");
	  s_passwd=(String)session.getAttribute("s_passwd");
	  s_mlevel=(String)session.getAttribute("s_mlevel");
  }//if end

%>


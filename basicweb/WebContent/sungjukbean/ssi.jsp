<%@ page contentType="text/html; charset=UTF-8"%>

<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="net.sungjuk.*" %>

<jsp:useBean id="dao" class="net.sungjuk.SungjukDAO"></jsp:useBean>
<jsp:useBean id="dto" class="net.sungjuk.SungjukDTO"></jsp:useBean>

<%
  //ssi.jsp
  request.setCharacterEncoding("UTF-8");
%>
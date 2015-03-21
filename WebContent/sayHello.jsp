<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head><title>第一个Spring MVC实例</title></head> 
<%
String str = (String)request.getAttribute("helloWorld");
%>
<body> 
   <h1>您输入的欢迎语是<%=str%></h1>
</body> 


</html>

<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'loginresult.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   login success~<br>
   <input type="button" value="setCookie" onclick="setCookie('1111','333333')"/>
   <input type="button" value="getCookie" onclick="getCookie('1111')"> 
  </body>
  
  <script type="text/javascript">
  
  
  function getCookie(searchName){
    var cookies = document.cookie.split(";");
    for( var i = 0; i < cookies.length ; i ++){
          var cookieCrumbs = cookies[i].split("=");
          var cookieName = cookieCrumbs[0];
          var cookieValue = cookieCrumbs[1];
          if( cookieName == searchName){
                return cookieValue;
           }
    }
    return false;
}

function setCookie(cookieName, cookieValue) {
  //  var expires = new Date();
  //  expires.setTime(expires.getTime() + seconds);//seconds cookie有效时间
    document.cookie = escape(cookieName) + '=' + escape(cookieValue);
      
}
  
</script>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>  
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/cssreset.css">
        <script src="${pageContext.request.contextPath}/js/WebCalendar.js" type="text/javascript"></script>
    </head>
    <body>
    	<div class="top">
    		<div class="wenzi">
	    		<h3>咖啡屋</h3>
	    		<span>最美的时光，停留在这里.</span>
	    	</div>
    		<div class="con">
	    		<div class="left">
	    			<img src="${pageContext.request.contextPath}/images/loginbg.png" alt="" height="517">
	    		</div>
	    		<div class="right">
	    			<h3>用户注册</h3>
	    			<form action="${pageContext.request.contextPath}/user/register" method="post">
	    				<label for="username">*用户名：</label>
	    					<input type="text" name="username" id="username" value="${registerUser.username}"><br>
	    					<p>${username}</p>
	    				<label for="password">*密&nbsp;&nbsp;&nbsp;码：</label>
	    					<input type="password" name="password" id="password" value="${registerUser.password}"><br>
	    					<p>${password}</p>
	    				<label for="tel">*电&nbsp;&nbsp;&nbsp;话：</label>
	    					<input type="text" name="tel"  id="tel" value="${registerUser.tel}"><br>
	    					<p>${tel}</p>
	    				<label for="tel">*生&nbsp;&nbsp;&nbsp;日：</label>
	    					<input type="text" name="birthday" id="birthday" value="<fmt:formatDate value="${condition.auctionstarttime}" pattern="yyyy-MM-dd hh:mm:ss"/>" 
              onclick="selectDate(this,'yyyy-MM-dd hh:mm:ss')"><br>
	    					<p>${birthday}</p>
	    				<input class="bt" type="submit" value="注册">
	    			</form>
	    			<div class="re">
	    				<a href="${pageContext.request.contextPath}/index.jsp">返回首页</a> 
	    			</div>
	    		</div>
    		</div>
    	</div>
    </body>
</html>
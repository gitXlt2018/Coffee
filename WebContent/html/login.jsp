<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/cssreset.css">
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
	    			<h3>用户登录</h3>
	    			
	    			<form action="${pageContext.request.contextPath}/user/login" method="post">
	    				<label for="username">用户名：</label>
	    					<input type="text" name="username" id="username" placeholder="用户名/邮箱/手机号" value="${username}" ><br>
	    				<label for="password">密&nbsp;&nbsp;&nbsp;码：</label>
	    					<input type="password" name="password" placeholder="密码" id="password" value="${userpassword}"><br>
	    				<label class="lf" for="passwords">验证码：</label>
          					<input type="text" name="inputCode" class="inputh inputs lf" value="" id="passwords"/>
          					<p>${errorMsg}</p>
           					<span class="wordp lf">
                 			<img id="validateCode" src="${pageContext.request.contextPath}/html/Number.jsp" width="96" height="27" alt="" />
          					 </span>
           					<span class="blues lf"><a id="changeCode" href="javascript:void(0);" title="">看不清</a></span>
           					<br>
	    				<input class="bt" type="submit" value="登录">
	    			</form>
	    			<div class="re">
	    				<a href="#">忘记密码？</a>&nbsp;  
	    				<a href="register.jsp">免费注册</a>&nbsp;&nbsp;
	    				<a href="${pageContext.request.contextPath}/index.jsp">返回首页</a>
	    			</div>
	    		</div>
    		</div>
    	</div>
    </body>
</html>
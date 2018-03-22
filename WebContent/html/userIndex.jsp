<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>用户主页面</title>
	<link rel="stylesheet" href="../css/userIndex.css">
	<link rel="stylesheet" href="../css/cssreset.css">
	<script src="../js/jquery-1.11.1.min.js"></script>
	<script src="../js/jquery.mousewheel.js"></script>

	
</head>
<body>
	<!--头部-->
	<header>
		<div class="header">
			<!-- logo -->
			<div class="logo">
				<img alt="" src="../images/icon/logo.png">
			</div>
			<!-- 导航 -->
			<div class="header_nav">
				<div class="nav_fl">
					<ul class="nav">
						<li class="navitem">
							<c:if test="${sessionScope.user.usertype==0}">
							<a href="userIndex.jsp">
								<span>用户主页</span>
							</a>
							</c:if>
							<c:if test="${sessionScope.user.usertype==1}">
							<a href="userIndex.jsp">
								<span>管理员主页</span>
							</a>
							</c:if>
						</li>
						<li class="navitem">
							<c:if test="${sessionScope.user.usertype==0}">
							<a href="#">
							    <span>个人信息查询</span>
							</a>
							</c:if>
							<c:if test="${sessionScope.user.usertype==1}">
							<a href="#">
							    <span>咖啡屋管理</span>
							</a>
							<ul>
								<li>
									<a href="type.html"><p>饮品类型管理</p></a>
								</li>
								<li>
									<a href="drinkMsg.html"><p>饮品信息管理</p></a>
								</li>
								<li>
									<a href="table.html"><p>餐桌信息管理</p></a>
								</li>
								<li>
									<a href="usertable.html"><p>用户信息管理</p></a>
								</li> 
								<li>
									<a href="orderMsg.html"><p>订单信息管理</p></a>
								</li>
							</ul>
							</c:if>
							
						</li>
													
					</ul>
				</div>
				<div class="nav_fr">
					<ul class="nav">	
						<li class="navitem">
							<c:if test="${sessionScope.user.usertype==0}">
						    <a href="userMsg.jsp"><span>个人信息设置</span></a> 
						    </c:if>
						    <c:if test="${sessionScope.user.usertype==1}">
						    <a href="adminMsg.jsp"><span>个人信息查询</span></a> 
						    </c:if>
						</li>
						<li class="navitem">
							<c:if test="${sessionScope.user.usertype==0}">
							<a href="order.html">
								<span>预定餐桌</span>
							</a>
							</c:if>
							<c:if test="${sessionScope.user.usertype==1}">
							<a href="adminSet.jsp">
								<span>信息设置</span>
							</a>
							</c:if>
						</li>
						
					</ul>
				</div>
			</div>
		</div>
	</header>


	<!-- 中间部分 -->
 	<section>
		<!-- banner -->
		<div class="banner">
			<h3>咖啡 Coffee</h3>
		</div>
		<div class="coffee_nav">
			<div class="content">
				<h3>咖啡 COFFEE</h3>
				<div class="name">
					<p>当前用户： ${sessionScope.user.username}，欢迎您</p>
					<span><a href="">注销</a></span>
				</div>
			</div>

		</div>
		<!-- 店长推荐   普通用户 -->
		<c:if test="${sessionScope.user.usertype==0}">
		<div class="offer">
			<h3>店长推荐</h3>
			<i></i>
			<ul>
				<li>
					<a href="#">
						<img alt="" src="../images/drink/drink09.jpg">
						<div class="hide"></div>
						<h5>巧克力慕斯蛋糕</h5>
						<span class="ss">柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>
					</a>

				</li>
				<li>
					<a href="#">
						<img alt="" src="../images/coffee/coffee02.jpg">
						<div class="hide"></div>
						<h5>巧克力慕斯蛋糕</h5>
						<span class="ss">柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>
					</a>
				</li>
				<li>
					<a href="#">
						<img alt="" src="../images/drink/drink03.png">
						<div class="hide"></div>
						<h5>巧克力慕斯蛋糕</h5>
						<span class="ss">柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>
					</a>
				</li>
				<li>
					<a href="#">
						<img alt="" src="../images/coffee/coffee03.jpg">
						<div class="hide"></div>
						<h5>巧克力慕斯蛋糕</h5>
						<span class="ss">柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>

					</a>
				</li>
				<li>
					<a href="#">
						<img alt="" src="../images/drink/drink05.jpg">
						<div class="hide"></div>
						<h5>巧克力慕斯蛋糕</h5>
						<span class="ss">柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>
					</a>
				</li>
				<li>
					<a href="#">
						<img alt="" src="../images/drink/drink10.jpg">
						<div class="hide"></div>
						<h5>巧克力慕斯蛋糕</h5>
						<span class="ss">柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>
					</a>
				</li>
				<li>
					<a href="#">
						<img alt="" src="../images/coffee/coffee08.jpg">
						<div class="hide"></div>
						<h5>巧克力慕斯蛋糕</h5>
						<span class="ss">柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>
					</a>
				</li>
			</ul>
		</div>
		</c:if>
		<!-- 饮品信息查询    管理员 -->
		<c:if test="${sessionScope.user.usertype==1}">
		<div class="manage">
			<div class="nav">
				<form action="${pageContext.request.contextPath}/drink/queryDrink" method="post">
					饮品名称：<input type="text">
					饮品类型：<input type="text">
					饮品价格：<input type="text">
					<input type="submit" value="查询" class="bt">
				</form>
				<input type="submit" value="添加饮品" class="add">
			</div>
			<div class="list">
				<table  width=100% cellspacing="0">
	    			<thead>
	    				<tr>
	    					<th width="162px">编号</th>
	    					<th width="185px">饮品类型</th>
	    					<th width="185px">饮品名称</th>
	    					<th width="185px">饮品价格（元）</th>
	    					<th width="185px">操作</th>
	    				</tr>
	    			</thead>
	    			<tbody>
	    			<c:forEach var="drink" items="${drinkList}">
	    				<tr>
	    					<td>${drink.drinkId}</td>
	    					<td>${drink.drinkType.typename}</td>
	    					<td>${drink.drinkname}</td>
	    					<td>${drink.price}元</td>
	    					<td>
	    						<a href="">修改</a>
	    						<a href="">删除</a>
	    					</td>
	    				</tr>
	    				</c:forEach>	
	    			</tbody>
    			</table>
    			<div class="dao">
				
				</div>
			</div>	
		</div>
		</c:if>
	</section>
		
	<!-- 底部 -->
	<footer>
		<div class="foot">
			<div class="list">
				<div>
					<h4>咖啡屋</h4>
					<ul>
						<li><a href="#">简介</a></li>
						<li><a href="#">营业时间</a></li>
						<li><a href="#">门面展示</a></li>
					</ul>
				</div>
				<div>
					<h4>咖啡coffee</h4>
					<ul>
						<li><a href="newgoods.html">当季新品</a></li>
						<li><a href="coffee.html">咖啡产品</a></li>
						<li><a href="drink.html">饮料甜品</a></li>
					</ul>
				</div>
				<div>
					<h4>活动</h4>
					<ul>
						<li><a href="#">小型音乐会</a></li>
						<li><a href="#">品尝咖啡</a></li>
						<li><a href="#">面具舞会</a></li>
					</ul>
				</div>
				<div>
					<h4>关于我们</h4>
					<ul>
						<li><a href="#">品牌介绍</a></li>
						<li><a href="#">品牌历程</a></li>
						<li><a href="#">联系我们</a></li>
						<li><a href="#">寻求加盟</a></li>
					</ul>
				</div>
				<div>
					<h4>联系我们</h4>
					<ul>
						<li><a href="#">品牌合作</a></li>
						<li><a href="#">产品合作</a></li>
						<li><a href="#">加盟我们</a></li>
						<li><a href="#">包场</a></li>
						<li><a href="#">招聘</a></li>
					</ul>
				</div>
			</div>
			<div class="phone">
				<div>
					<h4>地址</h4>
					<span>北京海淀区清河小营西路27号金领时代大厦2层</span>
				</div>
				<div>
					<h4>电话</h4>
					<span class="span">400-050-1997</span>
				</div>
				
			</div>
			<div class="ma">
				<ul>
					<li>
						<img src="../images/icon/weibo.png" alt=""><br>
						<span>咖啡屋官方微博</span>
					</li>
					<li>
						<img src="../images/icon/weixin.png" alt=""><br>
						<span>咖啡屋公众号</span>
					</li>
				</ul>
			</div>
		</div>
		<div class="address">
			<p>Copyright © 2017广西大学行健文理学院.咖啡屋管理系统. All Rights Reserved 京ICP备14037141号-1 技术支持 · 计科142谢柳婷</p>
		</div>
	</footer> 
	<script src="../js/userIndex.js"></script>	
</body>
</html>
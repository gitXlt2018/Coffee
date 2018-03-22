<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>咖啡屋管理系统主页面</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/cssreset.css">
	<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.mousewheel.js"></script>
	
</head>
<body>
	<!--头部-->
	<header>
		<div class="header">
			<!-- logo -->
			<div class="logo">
				<img alt="" src="${pageContext.request.contextPath}/images/icon/logo.png">
			</div>
			<!-- 导航 -->
			<div class="header_nav">
				<div class="nav_fl">
					<ul class="nav">
						<li class="navitem">
							<a href="#">
								<span>咖啡屋</span>
							</a>
							<ul>
								<li>
									<a href="#"><p>简介</p></a>
								</li>
								<li>
									<a href="#"><p>营业时间</p></a>
								</li>
								<li>
									<a href="#"><p>门店展示</p></a>
								</li>
							</ul>
						</li>
						<li class="navitem">
							<a href="#">
							    <span>咖啡  ·  Coffee</span>
							</a>
							<ul>
								<li>
									<a href="#"><p>当季新品</p></a>
								</li>
								<li>
									<a href="#"><p>咖啡产品</p></a>
								</li>
								<li>
									<a href="#"><p>饮料甜品</p></a>
								</li>
							</ul>
						</li>		
					</ul>
				</div>
				<div class="nav_fr">
					<ul class="nav">	
						<li class="navitem">
						    <span>
						    	<a href="${pageContext.request.contextPath}/html/login.jsp">登录</a> \
						    	<a href="${pageContext.request.contextPath}/html/register.jsp">注册</a>
						    </span>
						</li>
						<li class="navitem">
							<a href="#">
								<span>关于我们</span>
							</a>
							<ul>
								<li>
									<a href="#"><p>品牌介绍</p></a>
								</li>
								<li>
									<a href="#"><p>联系我们</p></a>
								</li>
							</ul>
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
			<div class="box">
				<div class="flash">
					<ul>
						<li>
							<img src="${pageContext.request.contextPath}/images/01.jpg" alt="">
						</li>
						<li>
							<img src="${pageContext.request.contextPath}/images/02.jpg" alt="">
						</li>
						<li>
							<img src="${pageContext.request.contextPath}/images/03.jpg" alt="">
						</li>
					</ul>
					<ol>
						<li class="current"></li>
						<li></li>
						<li></li>
					</ol>
				</div>
			</div>
		</div>
	<!-- 当季新品 -->
	<div class="new">
		<h3>当季新品</h3>
		<span>
			IN THE NEW PRODUCT
		</span>
		<span></span>
		<div class="goods">
			<span class="s1"><img src="${pageContext.request.contextPath}/images/icon/turn_left.png" alt=""></span>
			<i class="s3"><img src="${pageContext.request.contextPath}/images/icon/turn_right.png" alt=""></i>
			<div class="drink">
				<ul>
					<li>
						<a href="#">
							<img alt="" src="${pageContext.request.contextPath}/images/drink/drink09.jpg">
							<div class="hide"></div>
							<h5>巧克力慕斯蛋糕</h5>
							<span>柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>
						</a>

					</li>
					<li>
						<a href="#">
							<img alt="" src="${pageContext.request.contextPath}/images/coffee/coffee02.jpg">
							<div class="hide"></div>
							<h5>巧克力慕斯蛋糕</h5>
							<span>柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>
						</a>
					</li>
					<li>
						<a href="#">
							<img alt="" src="${pageContext.request.contextPath}/images/drink/drink03.png">
							<div class="hide"></div>
							<h5>巧克力慕斯蛋糕</h5>
							<span>柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>
						</a>
					</li>
					<li>
						<a href="#">
							<img alt="" src="${pageContext.request.contextPath}/images/coffee/coffee03.jpg">
							<div class="hide"></div>
							<h5>巧克力慕斯蛋糕</h5>
							<span>柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>

						</a>
					</li>
					<li>
						<a href="#">
							<img alt="" src="${pageContext.request.contextPath}/images/drink/drink05.jpg">
							<div class="hide"></div>
							<h5>巧克力慕斯蛋糕</h5>
							<span>柔软的口感、甜蜜的味道,完美的全巧克力蛋糕经得起各种口味的挑剔....</span>
						</a>
					</li>
					
				</ul>
			</div>
		</div>
	</div>
	<!-- 门店展示 -->
	<div class="door">
		<h3>门店展示</h3>
		<span>
			STORE DISPLAY
		</span>
		<span></span>
		<div class="home">
            <ul>
            	<li><img src="${pageContext.request.contextPath}/images/home01.png" alt=""></li>
            	<li><img src="${pageContext.request.contextPath}/images/home02.jpg" alt=""></li>
            	<li><img src="${pageContext.request.contextPath}/images/home03.png" alt=""></li>
            	<li><img src="${pageContext.request.contextPath}/images/home04.png" alt=""></li>
            </ul>	
		</div>
	</div>
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
						<li><a href="#">当季新品</a></li>
						<li><a href="#">咖啡产品</a></li>
						<li><a href="#">饮料甜品</a></li>
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
						<img src="${pageContext.request.contextPath}/images/icon/weibo.png" alt=""><br>
						<span>咖啡屋官方微博</span>
					</li>
					<li>
						<img src="${pageContext.request.contextPath}/images/icon/weixin.png" alt=""><br>
						<span>咖啡屋公众号</span>
					</li>
				</ul>
			</div>
		</div>
		<div class="address">
			<p>Copyright © 2017广西大学行健文理学院.咖啡屋管理系统. All Rights Reserved 京ICP备14037141号-1 技术支持 · 计科142谢柳婷</p>
		</div>
	</footer>
	<script src="${pageContext.request.contextPath}/js/index.js"></script>
</body>
</html>
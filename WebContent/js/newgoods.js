/*
* @Author: admin
* @Date:   2017-12-01 15:50:11
* @Last Modified by:   谢柳婷
* @Last Modified time: 2017-12-02 16:50:43
*/
$(function(){
	//导航鼠标移入变色,显示div
  $('.navitem').hover(function() {
  	$(this).children('a').children('span').css('color', '#35978f');
  	$(this).children('ul').css({opacity: '1',top: '90px'});
  }, function() {
  	$(this).children('a').children('span').css('color', '#fff');
  	$(this).children('ul').css({opacity: '0',top: '100px'});
  });

//登录注册
$('.navitem span a').hover(function() {
	 $(this).css('color', '#35978f');
}, function() {
	$(this).css('color', '#fff');
});

//下拉导航
$('.navitem ul li a').hover(function() {
   $(this).children('p').css({left: '8px',color: '#fff'
   });
}, function() {
  $(this).children('p').css({left: '0px',color: '#bbb9b9'});
});

$('.drink ul li').mouseover(function(event) {
 $(this).addClass('current').siblings('li').removeClass('current');
});




});
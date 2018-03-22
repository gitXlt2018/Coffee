/*
* @Author: admin
* @Date:   2017-12-04 10:31:09
* @Last Modified by:   admin
* @Last Modified time: 2017-12-04 10:45:51
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

	//下拉导航
$('.navitem ul li a').hover(function() {
	 $(this).children('p').css({left: '8px',color: '#fff'
	 });
}, function() {
	$(this).children('p').css({left: '0px',color: '#bbb9b9'});
});

	//鼠标移入显示div
	$('.offer ul li a').hover(function() {
		$(this).children('.hide').css('opacity', '1');
		$(this).children('.offer h5').css('bottom', '230px');
		$(this).children('.offer span').css('bottom', '150px');
		$(this).children('.offer span').css('opacity', '1');
	}, function() {
		//鼠标移出
		$(this).children('.hide').css('opacity', '0');
		$(this).children('.offer h5').css('bottom', '60px');
		$(this).children('.offer span').css('bottom', '-50px');
		$(this).children('.offer span').css('opacity', '0');
	});

});
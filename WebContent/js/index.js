/*
* @Author: admin
* @Date:   2017-11-29 15:08:04
* @Last Modified by:   admin
* @Last Modified time: 2017-12-04 10:45:46
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

//banner轮播
	var num=0;
	var timer;
	var timee;
	function go(){
		var num=0;
		timer=setInterval(function(){
			num++;
			if (num>2 && num>0) {
				num=0;
			}
			$('.banner .flash ul').stop().animate({left:-(num*1920)+'px'});
			/*$('.banner .flash ul').css('left',-1920*num+'px');*/
			$('.banner .flash ol li').eq(num).addClass('current').siblings('').removeClass('current');
			
			
		},5000);

	}
	go();
	$('.banner .flash').hover(function(){
		clearInterval(timer);
	},function(){
		go();
	})
	//点击小圆点的效果
		$('.flash ol li').click(function(event) {
		$(this).addClass('current').siblings('').removeClass('current');
		num=$(this).index();
		$('.flash ul').stop().animate({left:-($(this).index()*1920)+'px'});
	});



   /*当季新品*/
	function drink(){
		timee=setInterval(function(){
			num=num+1;
			if (num>1) {
				num=0;
			}
			$('.new .goods .drink ul').stop().animate({left:-(num*312)+'px'});
			
		},3500);
	}
	drink();
	$('.new .goods .drink').hover(function(){
		clearInterval(timee);
	},function(){
		drink();
	})

	//点击左边动画效果
	$('.s1').click(function(event) {
		num=num-1;
        if(num<0)
        {
        	num=1;
        }
       $('.new .goods .drink ul').stop().animate({left:-(num*312)+'px'});
	});

	//点击右边动画效果
	$('.s3').click(function(event) {
		num=num+1;
        if(num>1)
        {
        	num=0;
        }
       $('.new .goods .drink ul').stop().animate({left:-(num*312)+'px'});
	});


	//鼠标移入显示div
	$('.drink ul li a').hover(function() {
		$(this).children('.hide').css('opacity', '1');
		$(this).children('.drink h5').css('bottom', '230px');
		$(this).children('.drink span').css('bottom', '150px');
		$(this).children('.drink span').css('opacity', '1');
	}, function() {
		//鼠标移出
		$(this).children('.hide').css('opacity', '0');
		$(this).children('.drink h5').css('bottom', '60px');
		$(this).children('.drink span').css('bottom', '-50px');
		$(this).children('.drink span').css('opacity', '0');
	});


});
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
  
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <title>福清|室内设计|室内装修</title>
    <link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
    <link rel="stylesheet" href="css/grid.css" type="text/css" media="screen"> 
    <script src="js/jquery-1.6.2.min.js" type="text/javascript"></script>
    <script src="js/jquery.galleriffic.js" type="text/javascript"></script>
    <script src="js/jquery.opacityrollover.js" type="text/javascript"></script>      
  </head>
  
  <body>
    <header>
    	<div class="row-1">
        	<div class="main">
            	<div class="container_12">
                	<div class="grid_12">
                    	<nav>
                            <ul class="menu">
                                <li><a class="active" href="index.html">关于我们</a></li>
                                <li><a href="services.html">我们的服务</a></li>
                                <li><a href="catalogue.html">成功案例</a></li>
                                <li><a href="pricing.html">价格列表</a></li>
                                <li><a href="contacts.html">联系我们</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        <div class="row-2">
        	<div class="main">
            	<div class="container_12">
                	<div class="grid_9">
                    	<h1>
                            <a class="logo" href="index.html">设计<strong>之</strong>家</a>
                            <span>Design Family</span>
                        </h1>
                    </div>
                    <div class="grid_3">
                    	<form id="search-form" method="post" enctype="multipart/form-data">
                            <fieldset>	
                                <div class="search-field">
                                    <input name="search" type="text" />
                                    <a class="search-button" href="#" onClick="document.getElementById('search-form').submit()"><span>search</span></a>	
                                </div>						
                            </fieldset>
                        </form>
                     </div>
                     <div class="clear"></div>
                </div>
            </div>
        </div>    	
    </header><div class="ic">More Website Templates  @ TemplateMonster.com - August22nd 2011!</div>
    
<!-- content -->
    <section id="content">
        <div class="bg-top">
        	<div class="bg-top-2">
                <div class="bg">
                    <div class="bg-top-shadow">
                        <div class="main">
                            <div class="gallery p3">
                            	<div class="wrapper indent-bot">
                                    <div id="gallery" class="content">
                                       <div class="wrapper">
                                           <div class="slideshow-container">
                                                <div id="slideshow" class="slideshow"></div>
                                         </div>
                                      </div>
                                    </div>
                                    <div id="thumbs" class="navigation">
                                        <ul class="thumbs noscript">
                                            <li>
                                                <a class="thumb" href="images/gallery-img1.jpg" title=""> <img src="images/thumb-1.jpg" alt="" /><span></span> </a>
                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/gallery-img2.jpg" title=""> <img src="images/thumb-2.jpg" alt="" /> <span></span></a>
                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/gallery-img3.jpg" title=""> <img src="images/thumb-3.jpg" alt="" /> <span></span></a>
                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/gallery-img4.jpg" title=""> <img src="images/thumb-4.jpg" alt="" /> <span></span></a>
                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/gallery-img5.jpg" title=""> <img src="images/thumb-5.jpg" alt="" /> <span></span></a>
                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/gallery-img6.jpg" title=""> <img src="images/thumb-6.jpg" alt="" /> <span></span></a>
                                            </li>           
                                        </ul>
                                    </div>
                                </div>
                              <div class="inner">
                                <div class="wrapper"> <span class="title img-indent3">HELLO!</span>
                                    <div class="extra-wrap indent-top2"> <strong>我们的主旨：</strong> 人可以改变环境，环境可以影响人，而设计则可以改变人和环境.  <a target="_blank" href="http://sc.chinaz.com/">设计是一种追求完美的生活态度，设计是一种追求品味的生活概念.</a> <a class="color-3" href="index.html">请让我们用心为您服务</a> </div>
                                </div>
                              </div>
                            </div>
                            <div class="container_12">
                            	<div class="wrapper">
                                	<article class="grid_12">
                                    	<h3 class="color-1">用心为您服务</h3>
                                        <div class="wrapper">
                                        	<article class="grid_6 alpha">
                                                <figure class="img-indent frame"><img src="images/page1-img1.jpg" alt="" /></figure>
                                                <div class="extra-wrap">
                                                    <div class="indent-top">
                                                        <ul class="list-1">
														      <li><a>提供服务</a></li>
                                                             <li><a href="#">提供室内设计服务</a></li>
                                                             <li class="last"><a href="#">提供装修团队介绍</a></li>
															  
                                                        </ul>
                                                    </div>
                                                </div>
                                                <div class="clear"></div>
                                            </article>
                                            <article class="grid_6 omega">
                                                <figure class="img-indent frame"><img src="images/page1-img2.jpg" alt="" /></figure>
                                                <div class="extra-wrap">
                                                    <div class="indent-top">
                                                        <ul class="list-1">
                                                             <li><a href="#">设计师-林大泡 <br>
                                                             室内设计之家<br>
                                                             首席设计师</a></li>
                                                             <li class="last"><a href="#">设计作品</a></li>
                                                        </ul>
                                                    </div>
                                                </div>
												
												
												
                                                <div class="clear"></div>
                                            </article>
                                        </div>
                                    </article>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>	
        </div>
        <div class="bg-bot">
        	<div class="main">
            	<div class="container_12">
                	<div class="wrapper">
                    	<article class="grid_4">
                        	<h3 class="prev-indent-bot">公司简介</h3>
                            <p class="prev-indent-bot"><a target="_blank" href="http://blog.templatemonster.com/2011/08/22/free-website-template-clean-style-interior/ ">设计之家</a> 是一家专为您设计温馨快乐的室内设计装饰公司.</p> 
                            公司汇聚了专业优秀的室内设计人员，将您的<a href="">需求告诉我们</a>，我们尽一切满足您的需要.
                        </article>
                        <article class="grid_4">
                        	<h3 class="prev-indent-bot">联系方式</h3>
                            <div class="quote">
                              <p class="prev-indent-bot">&nbsp;</p>
                                <h5>电话号码：18073150896</h5>
								<h5>电子邮箱：linqing.lq@taobao.com</h5>
								<h5>地址：福建省福州市福清市</h5>
								<h5>QQ：544379385</h5>
                               
                          </div>
                        </article>
                        <article class="grid_4">
                        	<h3 class="prev-indent-bot">成功案例</h3>
							<marquee style="WIDTH: 388px; HEIGHT: 200px" scrollamount="2" 

direction="up" >  
                            <time class="tdate-1" datetime="2011-08-15"><a class="link" href="#">15.08.2011</a></time>
                            <p class="prev-indent-bot">为**用户设计专修了一室两厅房，获得***女士的一致好评。</p>
                            <time class="tdate-1" datetime="2011-08-11"><a class="link" href="#">11.08.2011</a></time>
                            为**用户设计专修了一室两厅房，获得***女士的一致好评。
							</marquee>
                        </article>
                    </div>
                </div>
            </div>
        </div>
    </section>
    
	<!--==============================footer=================================-->
	<script type="text/javascript">
			$(window).load(function() {
			// We only want these styles applied when javascript is enabled
			$('div.navigation').css({'width' : '320px', 'float' : 'right'});
			$('div.content').css('display', 'block');
	
			// Initially set opacity on thumbs and add
			// additional styling for hover effect on thumbs
			var onMouseOutOpacity = 0.5;
			$('#thumbs ul.thumbs li span').opacityrollover({
				mouseOutOpacity:   onMouseOutOpacity,
				mouseOverOpacity:  0.0,
				fadeSpeed:         'fast',
				exemptionSelector: '.selected'
			});
			
			// Initialize Advanced Galleriffic Gallery
			var gallery = $('#thumbs').galleriffic({
				delay:                     7000,
				numThumbs:                 12,
				preloadAhead:              6,
				enableTopPager:            false,
				enableBottomPager:         false,
				imageContainerSel:         '#slideshow',
				controlsContainerSel:      '',
				captionContainerSel:       '',
				loadingContainerSel:       '',
				renderSSControls:          true,
				renderNavControls:         true,
				playLinkText:              'Play Slideshow',
				pauseLinkText:             'Pause Slideshow',
				prevLinkText:              'Prev',
				nextLinkText:              'Next',
				nextPageLinkText:          'Next',
				prevPageLinkText:          'Prev',
				enableHistory:             true,
				autoStart:                 7000,
				syncTransitions:           true,
				defaultTransitionDuration: 900,
				onSlideChange:             function(prevIndex, nextIndex) {
					// 'this' refers to the gallery, which is an extension of $('#thumbs')
					this.find('ul.thumbs li span')
						.css({opacity:0.5})
				},
				onPageTransitionOut:       function(callback) {
					this.find('ul.thumbs li span').css({display:'block'});
				},
				onPageTransitionIn:        function() {
					this.find('ul.thumbs li span').css({display:'none'});
				}
			});
		});
	</script>
  </body>
</html>

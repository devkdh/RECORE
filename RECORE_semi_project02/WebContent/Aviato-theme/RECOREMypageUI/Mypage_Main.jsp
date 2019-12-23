<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8");%>
<!DOCTYPE html>
<html>
<head>
<title>Recore: mypage_main</title>

<link rel="stylesheet" type="text/css" href="cssMy/Mypage_Main_CSS.css"/>
<link rel="stylesheet" href="cssMain/style.css">
<link rel="stylesheet" href="cssProd/style.css">

<style type="text/css">
  
  .testpadding{
  	padding: 40px;
  }
  
  .navtest{
  	text-align:center;
  	padding: 10px;
  }
  
  .footertest{
  	background-color: #333333;
  	text-align: center;
  	padding: 0.5em 0;
  }
  
  #productInfo{
  	text-align: center;
  	color: black;
  }
  
  #logResMy{
  	margin-left: 300px;
  	position: relative;
  	top: 50%;
  }
  .xans-myshop-orderstate .cs {
  	padding: 14px;
  }
  
  
  
  </style>
</head>
<%  %>

<body id="main"> 
     
	<div id="header" class="scroll">
		<!-- header 시작 -->
		<div id="header">
			<section class="menu">
	
	 <nav class="navtest">
	 	<a href = "index.html">RECORE로고</a>
	 </nav>
		
		<!-- recore 헤더 -->
	<div style = "background-color:#F56D3E;">
    <div class="site-mobile-menu">
      <div class="site-mobile-menu-header">
        <div class="site-mobile-menu-close mt-3">
          <span class="icon-close2 js-menu-toggle"></span>
        </div>
      </div>
      <div class="site-mobile-menu-body"></div>
    </div> <!-- .site-mobile-menu -->
 	 <div class="site-navbar-wrap" style="position: static;">
      <div class="site-navbar-top">
        <div class="container py-3">
          <div class="row align-items-center">
            <div class="col-6">
            
           00000000000000000
            
            </div>
            
            
            <!-- 로그인/회원가입/마이페이지/장바구니 -->
            
            <div class="col-6">
              <div class="d-flex ml-auto">
               	  <a href="#" class="d-flex align-items-center"></a>
                  <!-- <span class="icon-envelope mr-2"></span>  -->
                  <br>
                  <ul id = "logResMy" class="top-menu text-right list-inline">
	           <li><a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown">
	           <i></i>Login</a></li>
	           <li><a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown">
	           <i></i>Register</a></li>
	           <li><a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown">
	           <i></i>Mypage</a></li>
	           <li><a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown">
	           <i class="tf-ion-android-cart"></i></a></li>
	           </ul>
	            <div class="dropdown-menu cart-dropdown">
	            </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="site-navbar">
        <div class="container py-1">
          <div class="row align-items-center">
            <div class = "testpadding">
            
            </div>
          </div>
        </div>
      </div>
    </div>
 	</div>
		      	
</section>
</div>
	</div>
	
	<div id="wrap">
    	<div id="container">
       		 <div id="content" style="margin-top: 100px;">

				<div class="titleArea">
				    <h2>마이 쇼핑</h2>
				</div>

				<div class="xans-element- xans-myshop xans-myshop-orderstate ">
				
					<div class="title">
						<h3>나의 주문처리 현황 <span class="desc">(최근 <em>3개월</em> 기준)</span></h3>
	  				</div>
	  				
					<div class="state">
						<ul class="order">
							<li class="testwRap1" style="background: rgb(249, 249, 249);">
	               				<strong style="color: rgb(53, 53, 53);">입금전</strong>
	               				<a href="입금전링크@@@" class="count testCount1" style="color: rgb(0, 0, 0);">
	                				<span id="xans_myshop_orderstate_shppied_before_count">0</span>
	               				</a>
	           				</li>
	           				<li class="testwRap2" style="background: rgb(249, 249, 249);">
	                			<strong style="color: rgb(53, 53, 53);">배송준비중</strong>
	                			<a href="배송준비중 링크@@" class="count testCount2" style="color: rgb(0, 0, 0);">
	                				<span id="xans_myshop_orderstate_shppied_standby_count">0</span>
	                			</a>
	          				</li>
	           				<li class="testwRap3" style="background: rgb(249, 249, 249);">
	                			<strong style="color: rgb(53, 53, 53);">배송중</strong>
	                			<a href="배송중 링크@@@" class="count testCount3" style="color: rgb(0, 0, 0);">
	                				<span id="xans_myshop_orderstate_shppied_begin_count">0</span>
	                			</a>
	            			</li>
	            			<li class="testwRap4" style="background: rgb(249, 249, 249);">
	                			<strong style="color: rgb(53, 53, 53);">배송완료</strong>
	               				<a href="배송완료@@@" class="count testCount4" style="color: rgb(0, 0, 0);">
	               					<span id="xans_myshop_orderstate_shppied_complate_count">0</span>
	               				</a>
	           				</li>
	        			</ul>
						<ul class="cs">
							<li>
	                			<span class="icoDot"></span>
	                			<strong>취소 : </strong>
	                			<a href="취소연결@@@" class="count">
	                				<span id="xans_myshop_orderstate_order_cancel_count">0</span>
	                			</a>
	            			</li>
	           				<li>
	                			<span class="icoDot"></span>
	              				<strong>교환 : </strong>
	                			<a href="교환 연결@@@" class="count">
	                				<span id="xans_myshop_orderstate_order_exchange_count">0</span>
	                			</a>
	            			</li>
	           				<li>
	             			   <span class="icoDot"></span>
	             			   <strong>반품 : </strong>
	           				   <a href="반품연결@@@" class="count">
	           				 	  <span id="xans_myshop_orderstate_order_return_count">0</span>
	           				   </a>
	           				</li>
	        			</ul>
					</div>
				</div>

				<div id="myshopMain" class="xans-element- xans-myshop xans-myshop-main">
					<ul>
						<li class="shopMain order">
		           			<h3><a href="Mypage_OrderList.jsp"><strong>Order</strong><br><span>주문내역 조회</span></a></h3>
		           			<p><a href="Mypage_OrderList.jsp">고객님께서 주문하신 상품의<br> 주문내역을 확인하실 수 있습니다.</a></p>
		        		</li>
		        		<li class="shopMain profile">
		            		<h3><a href="회원정보 링크@@@"><strong>Profile</strong><br><span>회원 정보</span></a></h3>
		            		<p><a href="회원정보 링크@@@">회원이신 고객님의 개인정보를<br> 관리하는 공간입니다.</a></p>
		        		</li>
		        		<li class="shopMain board">
		           			<h3><a href="Mypage_FundingList.jsp"><strong>Funding</strong><br><span>펀딩내역 조회</span></a></h3>
		            		<p><a href="Mypage_FundingList.jsp">고객님께서 후원하신 펀딩의<br> 펀딩내역을 확인하실 수 있습니다.</a></p>
		        		</li>
		       			<li class="shopMain wishlist">
		            		<h3><a href="Mypage_WishList.jsp"><strong>Wishlist</strong><br><span>관심 상품</span></a></h3>
		            		<p><a href="Mypage_WishList.jsp">관심상품으로 등록하신<br> 상품의 목록을 보여드립니다.</a></p>
		        		</li>
		        		<li class="shopMain coupon ">
		            		<h3><a href="Mypage_Mileage2.jsp"><strong>Mileage</strong><br><span>마일리지</span></a></h3>
		            		<p><a href="Mypage_Mileage2.jsp">고객님이 보유하고 계신<br> 마일리지를 보여드립니다.</a></p>
		        		</li>
		        		<li class="shopMain board">
		           			<h3><a href="Mypage_BoardList.jsp"><strong>Board</strong><br><span>게시물 관리</span></a></h3>
		            		<p><a href="Mypage_BoardList.jsp">고객님께서 작성하신 게시물을<br> 관리하는 공간입니다.</a></p>
		        		</li>
		    		</ul>
				</div>
			</div>
	
			<hr class="layout">
			<br><br><br><br><br><br><br><br>
			<br><br><br><br><br><br><br><br>
			
			
			
			<!-- footer -->
	        <footer class="footertest">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<ul class="social-media">
					<li>
						<a href="">
							<i class="tf-ion-social-facebook"></i>
						</a>
					</li>
					<li>
						<a href="">
							<i class="tf-ion-social-instagram"></i>
						</a>
					</li>
					<li>
						<a href="">
							<i class="tf-ion-social-twitter"></i>
						</a>
					</li>
					<li>
						<a href="">
							<i class="tf-ion-social-pinterest"></i>
						</a>
					</li>
				</ul>
				<ul class="footer-menu">
					<li>
						<a href="">CONTACT</a>
					</li>
					<li>
						<a href="">SHIPPING</a>
					</li>
					<li>
						<a href="">TERMS OF SERVICE</a>
					</li>
					<li>
						<a href="">PRIVACY POLICY</a>
					</li>
				</ul>
				<p class="copyright-text">Powered by Bootstrap</p>
			</div>
		</div>
	</div>
</footer> 

			
		</div>
	</div>

</body>
</html>
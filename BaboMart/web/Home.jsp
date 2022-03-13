<%-- 
    Document   : Home.jsp
    Created on : Mar 7, 2022, 9:39:15 AM
    Author     : baobao
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Ogani Template">
        <meta name="keywords" content="Ogani, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>BaBooMart</title>

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

        <!-- Css Styles -->
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css/nice-select.css" type="text/css">
        <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
        <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="assets/css/all.min.css">
    </head>

    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        

         <!-- Header Section Begin -->
        <header class="header">
            <div class="header__top">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6 col-md-6">
                            <div class="header__top__left">
                                <ul>
                                    <li><i class="fas fa-envelope"></i> baboomart@gmail.com</li>
                                    <li>Miễn phí ship cho mọi đơn hàng dưới 99k</li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="header__top__right">
                                <div class="header__top__right__social">
                                    <a href="https://www.facebook.com/"><i class="fab fa-facebook">
                                        </i></a>
                                    <a href="https://twitter.com/"><i class="fab fa-twitter"></i></a>
                                    <a href="https://vn.linkedin.com"><i class="fab fa-linkedin"></i></a>
                                    <a href="https://www.pinterest.com/"><i class="fab fa-pinterest-p"></i></a>
                                </div>
                                <div class="header__top__right__language">
                                    <img src="img/language.png" alt="">
                                    <div>English</div>
                                    <span class="arrow_carrot-down"></span>
                                    <ul>
                                        <li><a href="#">Vietnamese</a></li>
                                        <li><a href="#">English</a></li>
                                    </ul>
                                </div>
                                <div class="header__top__right__auth">
                                    <a href="#"><i class="fa fa-user"></i> Đăng Nhập</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="header__logo">
                            <a href="./Home.jsp"><img src="img/RPReplay_Final1646660780-_1_.gif" alt=""></a>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <nav class="header__menu">
                            <ul>
                                <li class="active" ><a href="${homectr}">Trang Chủ</a></li>
                                <li ><a href="SanPham">Sản Phẩm</a></li>
                                <li><a href="./VeChungToi.jsp">Giới Thiệu</a>
                                </li>

                                <li><a href="./LienHe.jsp">Liên Hệ</a></li>
                            </ul>
                        </nav>
                    </div>
                    <div class="col-lg-3">
                        <div class="header__cart">
                            <ul>
                                <li><a href="#"><i class="fa fa-heart"></i> </a></li>
                                <li><a href="#"><i class="fa fa-shopping-bag"></i> </a></li>
                            </ul>

                        </div>
                    </div>
                </div>
                <div class="humberger__open">
                    <i class="fa fa-bars"></i>
                </div>
            </div>
        </header>
        <!-- Header Section End -->

        <!-- Hero Section Begin -->
        <section class="hero">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="hero__categories">
                            <div class="hero__categories__all">
                                <i class="fa fa-bars"></i>
                                <span>Danh Mục</span>
                            </div>
                            <ul>
                                <c:forEach items="${listDanhMucSanPham}" var="C">
                                    <li><a href="danhmuc?Madanhmuc=${C.getMadanhmuc()}">${C.getTendanhmuc()}</a></li>
                                    </c:forEach>    
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="hero__search">
                            <div class="hero__search__form">
                                <form action="Search">
                                    <div class="hero__search__categories">
                                        Tất Cả Các Loại
                                        <span class="arrow_carrot-down"></span>
                                    </div>
                                    <input type="text" placeholder="Tìm Kiếm"
                                           name="keyword"
                                           >
                                    <button type="submit" class="site-btn">Tìm Kiếm</button>
                                </form>
                            </div>
                            <div class="hero__search__phone">
                                <div class="hero__search__phone__icon">
                                    <i class="fa fa-phone"></i>
                                </div>
                                <div class="hero__search__phone__text">
                                    <h5>+98 222 466</h5>
                                    <span>Hỗ Trợ 24/7</span>
                                </div>
                            </div>
                        </div>
                        <div class="hero__item set-bg" data-setbg="img/hero/5eeecbcf6bb600bc8724bb7018717405.jpg">
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Hero Section End -->


        <!-- Categories Section Begin -->
        <section class="categories">
            <div class="container">
                <div class="row">
                    <div class="categories__slider owl-carousel">
                        <div class="col-lg-3">
                            <div class="categories__item set-bg" data-setbg="img/categories/nam1.jpg">
                                <h5><a href="#">Thời Trang Nam</a></h5>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="categories__item set-bg" data-setbg="img/categories/nu1.jpg">
                                <h5><a href="#">Thời Trang Nữ</a></h5>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="categories__item set-bg" data-setbg="img/categories/thietbidientu1.jpg">
                                <h5><a href="#">Thiết Bị Điện Tử</a></h5>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="categories__item set-bg" data-setbg="img/categories/sacdep.jpg">
                                <h5><a href="#">Sắc Đẹp</a></h5>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="categories__item set-bg" data-setbg="img/categories/chamsocnhacuajpg.jpg">
                                <h5><a href="#">Chăm Sóc Nhà Cửa</a></h5>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Categories Section End -->

        <!-- Featured Section Begin -->
        <section class="featured spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title">
                            <h2>Sản Phẩm Gần Đây</h2>
                        </div>
                        <div class="featured__controls">
                            <ul>
                                <li class="active" data-filter="*">Tất Cả</li>
                                <li data-filter=".oranges">Thời Trang Nam</li>
                                <li data-filter=".fresh-meat">Thời Trang Nữ</li>
                                <li data-filter=".vegetables">Hoa Quả</li>
                                <li data-filter=".fastfood">Thiết Bị Điện Tử</li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="row featured__filter">
                    <div class="col-lg-3 col-md-4 col-sm-6 mix oranges">
                        <div class="featured__item">
                            <div class="featured__item__pic set-bg" data-setbg="img/featured/thoitrangnam1.jpg">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                            <div class="featured__item__text">
                                <h6><a href="#">Áo Sweater Nỉ Bông Nam</a></h6>
                                <h5>300.000</h5>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6 mix fastfood">
                        <div class="featured__item">
                            <div class="featured__item__pic set-bg" data-setbg="img/featured/thietbidientu1.jpg">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                            <div class="featured__item__text">
                                <h6><a href="#">Camera Hồng Ngoại</a></h6>
                                <h5>1.500.000</h5>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6 mix oranges">
                        <div class="featured__item">
                            <div class="featured__item__pic set-bg" data-setbg="img/featured/thoitrangnam3jpg.jpg">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                            <div class="featured__item__text">
                                <h6><a href="#">Áo Somi Nam</a></h6>
                                <h5>200.000</h5>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6 mix fresh-meat">
                        <div class="featured__item">
                            <div class="featured__item__pic set-bg" data-setbg="img/featured/thoitrangnu1jpg.jpg">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                            <div class="featured__item__text">
                                <h6><a href="#">Áo Thun Đi Biển Nữ</a></h6>
                                <h5>150.000</h5>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6 mix fresh-meat">
                        <div class="featured__item">
                            <div class="featured__item__pic set-bg" data-setbg="img/featured/thoitrangnu2jpg.jpg">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                            <div class="featured__item__text">
                                <h6><a href="#">Set Đồ Dạ, Chân Váy Chữ A Nữ</a></h6>
                                <h5>800.000</h5>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6 mix fresh-meat">
                        <div class="featured__item">
                            <div class="featured__item__pic set-bg" data-setbg="img/featured/thoitrangnu3jpg.jpg">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                            <div class="featured__item__text">
                                <h6><a href="#">Áo Cardigan Có Cổ Nữ</a></h6>
                                <h5>300.000</h5>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables">
                        <div class="featured__item">
                            <div class="featured__item__pic set-bg" data-setbg="img/featured/feature-7.jpg">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                            <div class="featured__item__text">
                                <h6><a href="#">Xoài</a></h6>
                                <h5>25.000</h5>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables">
                        <div class="featured__item">
                            <div class="featured__item__pic set-bg" data-setbg="img/featured/feature-8.jpg">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                            </div>
                            <div class="featured__item__text">
                                <h6><a href="#">Táo</a></h6>
                                <h5>50.000</h5>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Featured Section End -->

        <!-- Banner Begin -->
        <div class="banner">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="banner__pic">
                            <img src="img/banner/banner-1.jpg" alt="">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="banner__pic">
                            <img src="img/banner/banner-2.jpg" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Banner End -->

        <!-- Latest Product Section Begin -->
        <section class="latest-product spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Sản Phẩm Gần Đây</h4>
                            <div class="latest-product__slider owl-carousel">
                                <div class="latest-prdouct__slider__item">
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/featured/feature-8.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Táo</h6>
                                            <span>50.000</span>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/featured/thietbidientu2.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Loa Bluetooth</h6>
                                            <span>600.000</span>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/featured/thietbidientu4.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Máy Xay Sinh Tố</h6>
                                            <span>1.250.000</span>
                                        </div>
                                    </a>
                                </div>
                                <div class="latest-prdouct__slider__item">
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/featured/feature-7.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Xoài</h6>
                                            <span>25.000</span>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/featured/thoitrangnam3jpg.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Áo Somi Nam</h6>
                                            <span>200.000</span>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/featured/thoitrangnu3jpg.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Áo Cardigan Có Cổ Nữ</h6>
                                            <span>300.000</span>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Sản Phẩm Bán Chạy</h4>
                            <div class="latest-product__slider owl-carousel">
                                <div class="latest-prdouct__slider__item">
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/sanphambanchay1.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Son Dưỡng DHC Không Màu</h6>
                                            <span>150.000</span>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/sanphambanchay2.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Sữa Rửa Mặt Cetaphil</h6>
                                            <span>300.000</span>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/sanphambanchay3.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Kính Mắt Thời Trang Đi Biển</h6>
                                            <span>15.000</span>
                                        </div>
                                    </a>
                                </div>
                                <div class="latest-prdouct__slider__item">
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/sanphambanchay4.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Áo Somi Lanh Thoáng Mát</h6>
                                            <span>150.000</span>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/sanphambanchay5.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Loa Bluetooth</h6>
                                            <span>300.000</span>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/sanphambanchay6.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <h6>Tai Nghe Boat Hero</h6>
                                            <span>500.000</span>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Review Sản Phẩm</h4>
                            <div class="latest-product__slider owl-carousel">
                                <div class="latest-prdouct__slider__item">
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/iphone 13 promax.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">

                                            <span>Iphone 13 Promax</span>
                                            <h6>Chiếc điện thoại thông minh đến từ nhà Apple</h6>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/bleu de chanel.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <span>Blue De Chanel</span>
                                            <h6>Nước hoa để khẳng định bản thân</h6>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/bioderma.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <span>Bioderma</span>
                                            <h6>Sản phẩm tẩy trang mà ai cũng nên có</h6>
                                        </div>
                                    </a>
                                </div>
                                <div class="latest-prdouct__slider__item">
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/balance vitamin c.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <span>Balance Vitamin C</span>
                                            <h6>Serum thần thánh cứu cánh mọi loại da</h6>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/foreo.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <span>Máy Rửa Mặt Foreo</span>
                                            <h6>Một sản phẩm để từ nhà Foreo</h6>
                                        </div>
                                    </a>
                                    <a href="#" class="latest-product__item">
                                        <div class="latest-product__item__pic">
                                            <img src="img/latest-product/omega seamaster 300 heritage.jpg" alt="">
                                        </div>
                                        <div class="latest-product__item__text">
                                            <span>Đồng Hồ Nam Omega Seamaster 300 Heritage</span>
                                            <h6>Thể hiện bản lĩnh phái mạnh</h6>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Latest Product Section End -->

        <!-- Blog Section Begin -->
        <section class="from-blog spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title from-blog__title">
                            <h2>Blog</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <div class="blog__item">
                            <div class="blog__item__pic">
                                <img src="img/latest-product/bodocuabangiabaonhieu.jpg" alt="">
                            </div>
                            <div class="blog__item__text">
                                <ul>
                                    <li><i class="fa fa-calendar-o"></i>15/5/2020</li>
                                    <li><i class="fa fa-comment-o"></i> 5</li>
                                </ul>
                                <h5><a href="#">Bộ Đồ Của Bạn Giá Bao Nhiêu</a></h5>
                                <p>Đồ hiệu và câu chuyện đốt tiền có thể sẽ không như bạn nghĩ</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <div class="blog__item">
                            <div class="blog__item__pic">
                                <img src="img/latest-product/goiyqua83.jpg" alt="">
                            </div>
                            <div class="blog__item__text">
                                <ul>
                                    <li><i class="fa fa-calendar-o"></i>2/3/2020</li>
                                    <li><i class="fa fa-comment-o"></i> 5</li>
                                </ul>
                                <h5><a href="#">Gợi Ý Qùa Ngày 8/3</a></h5>
                                <p>Những món quà tinh tế và hữu dụng có thể giúp bạn ghi điểm đấy</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <div class="blog__item">
                            <div class="blog__item__pic">
                                <img src="img/latest-product/review-cuon-ban-khong-thong-minh-lam-dau-revisach.com_.jpg" alt="">
                            </div>
                            <div class="blog__item__text">
                                <ul>
                                    <li><i class="fa fa-calendar-o"></i>16/7/2020</li>
                                    <li><i class="fa fa-comment-o"></i> 5</li>
                                </ul>
                                <h5><a href="#">Lật Tẩy Những Ảo Tưởng Của Não Bộ Với "Bạn Không Thông Minh Lắm Đâu"</a></h5>
                                <p>Một cuốn sách giúp bạn khám phá nhiều khía cạnh khác nhau của não bộ</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Blog Section End -->

       <!-- Footer Section Begin -->
        <footer class="footer spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6">
                        <div class="footer__about">
                            <div class="footer__about__logo">
                                <a href="./index.html"><img src="img/RPReplay_Final1646660780-_1_.gif" alt=""></a>
                            </div>
                            <ul>
                                <li>Địa Chỉ: Khu Công Nghệ Cao Hòa Lạc, Thạch Hòa, Thạch Thất, Hà Nội</li>
                                <li>Điện Thoại: +98 222 466</li>
                                <li>Email: baboomart@gmai.com</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 col-sm-6 offset-lg-1">
                        <div class="footer__widget">
                            <h6>Đường Dẫn Cần Thiết</h6>
                            <ul>
                                <li><a href="#">Về Chúng Tôi</a></li>

                                <li><a href="#">Mua Sắm An Toàn</a></li>
                                <li><a href="#">Thông Tin Giao Hàng</a></li>
                                <li><a href="#">Chính Sách Bảo Mật</a></li>

                            </ul>
                            <ul>
                                <li><a href="#">Chúng Tôi Là</a></li>
                                <li><a href="#">Dịch Vụ</a></li>

                                <li><a href="#">Liên Lạc</a></li>

                                <li><a href="#">Cam Kết</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-12">
                        <div class="footer__widget">
                            <h6>Tham Gia Cùng Chúng Tôi Ngay Bây Giờ</h6>
                            <p>Hãy để lại Email và chúng tôi sẽ gửi đến bạn thông tin cập nhật mới nhất và các ưu đãi</p>
                            <form action="#">
                                <input type="text" placeholder="Nhập Email">
                                <button type="submit" class="site-btn">Đồng Ý</button>
                            </form>
                            <div class="footer__widget__social">
                                <a href="#"><i class="fab fa-facebook"></i></a>
                                <a href="#"><i class="fab fa-instagram"></i></a>
                                <a href="#"><i class="fab fa-twitter"></i></a>
                                <a href="#"><i class="fab fa-pinterest"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="footer__copyright">
                            <div class="footer__copyright__text"><p>
                                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | Bản quyền thuộc về công ty TNHH Baboo <i></i> 
                                </p></div>
                            <div class="footer__copyright__payment"><img src="img/payment-item.png" alt=""></div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!-- Footer Section End -->

        <!-- Js Plugins -->
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/jquery.slicknav.js"></script>
        <script src="js/mixitup.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/main.js"></script>



    </body>

</html>

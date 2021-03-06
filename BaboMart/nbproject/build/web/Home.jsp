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
</head>

<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <!-- Humberger Begin -->
    <div class="humberger__menu__overlay"></div>
    <div class="humberger__menu__wrapper">
        <div class="humberger__menu__logo">
            <a href="#"><img src="img/RPReplay_Final1646660780-_1_.gif" alt=""></a>
        </div>
        <div class="humberger__menu__cart">
            <ul>
                <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
            </ul>
            <div class="header__cart__price">item: <span>$150.00</span></div>
        </div>
        <div class="humberger__menu__widget">
            <div class="header__top__right__language">
                <img src="img/language.png" alt="">
                <div>English</div>
                <span class="arrow_carrot-down"></span>
                <ul>
                    <li><a href="#">Ti???ng Vi???t</a></li>
                    <li><a href="#">English</a></li>
                </ul>
            </div>
            <div class="header__top__right__auth">
                <a href="#"><i class="fa fa-user"></i> ????ng Nh???p</a>
            </div>
        </div>
        <nav class="humberger__menu__nav mobile-menu">
            <ul>
                <li class="active"><a href="./index.html">Trang Ch???</a></li>
                <li><a href="./shop-grid.html">S???n Ph???m</a></li>
                <li><a href="#">Gi???i Thi???u</a>
                    <ul class="header__menu__dropdown">
                        <li><a href="./shop-details.html">S???n Ph???m Chi Ti???t</a></li>
                        <li><a href="./shoping-cart.html">Gi??? H??ng</a></li>
                        <li><a href="./checkout.html">Thanh To??n</a></li>
                        <li><a href="./blog-details.html">Blog</a></li>
                    </ul>
                </li>
                
                <li><a href="./contact.html">Li??n H???</a></li>
            </ul>
        </nav>
        <div id="mobile-menu-wrap"></div>
        <div class="header__top__right__social">
            <a href="https://www.facebook.com/"><i class="fa fa-facebook"></i></a>
            <a href="https://twitter.com/"><i class="fa fa-twitter"></i></a>
            <a href="https://vn.linkedin.com"><i class="fa fa-linkedin"></i></a>
            <a href="https://www.pinterest.com/"><i class="fa fa-pinterest-p"></i></a>
        </div>
        <div class="humberger__menu__contact">
            <ul>
                <li><i class="fa fa-envelope"></i> baboomart@gmail.com</li>
                <li>Mi???n ph?? ship cho m???i ????n h??ng d?????i 99k</li>
            </ul>
        </div>
    </div>
    <!-- Humberger End -->

    <!-- Header Section Begin -->
    <header class="header">
        <div class="header__top">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-6">
                        <div class="header__top__left">
                            <ul>
                                <li><i class="fa fa-envelope"></i> baboomart@gmail.com</li>
                                <li>Mi???n ph?? ship cho m???i ????n h??ng d?????i 99k</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="header__top__right">
                            <div class="header__top__right__social">
                                        <a href="https://www.facebook.com/"><i class="fa fa-facebook">
                                    </i></a>
                                <a href="https://twitter.com/"><i class="fa fa-twitter"></i></a>
                                <a href="https://vn.linkedin.com"><i class="fa fa-linkedin"></i></a>
                                <a href="https://www.pinterest.com/"><i class="fa fa-pinterest-p"></i></a>
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
                                <a href="#"><i class="fa fa-user"></i> ????ng Nh???p</a>
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
                        <a href="./index.html"><img src="img/RPReplay_Final1646660780-_1_.gif" alt=""></a>
                    </div>
                </div>
                <div class="col-lg-6">
                    <nav class="header__menu">
                        <ul>
                            <li class="active"><a href="./index.html">Trang Ch???</a></li>
                            <li><a href="./shop-grid.html">S???n Ph???m</a></li>
                            <li><a href="#">Gi???i Thi???u</a>
                                <ul class="header__menu__dropdown">
                                    <li><a href="./blog-details.html">Gi???i Thi???u</a></li>
                                    <li><a href="./shop-details.html">S???n Ph???m Chi Ti???t</a></li>
                                    <li><a href="./shoping-cart.html">????n H??ng</a></li>
                                    <li><a href="./checkout.html">Thanh To??n</a></li>
                                    
                                </ul>
                            </li>
<!--                            <li><a href="./blog.html">Blog</a></li>-->
                            <li><a href="./contact.html">Li??n H???</a></li>
                        </ul>
                    </nav>
                </div>
                <div class="col-lg-3">
                    <div class="header__cart">
                        <ul>
                            <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                            <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
                        </ul>
                        <div class="header__cart__price">item: <span>$150.00</span></div>
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
                            <span>Danh M???c</span>
                        </div>
                        <ul>
                            <c:forEach items="${listDanhMucSanPham}" var="C">
                            <li>${C.getTendanhmuc()}</li>
                            </c:forEach>     
                        </ul>
                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="hero__search">
                        <div class="hero__search__form">
                            <form action="#">
                                <div class="hero__search__categories">
                                    T???t C??? C??c Lo???i
                                    <span class="arrow_carrot-down"></span>
                                </div>
                                <input type="text" placeholder="T??m Ki???m">
                                <button type="submit" class="site-btn">SEARCH</button>
                            </form>
                        </div>
                        <div class="hero__search__phone">
                            <div class="hero__search__phone__icon">
                                <i class="fa fa-phone"></i>
                            </div>
                            <div class="hero__search__phone__text">
                                <h5>+98 222 466</h5>
                                <span>H??? Tr??? 24/7</span>
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
                            <h5><a href="#">Th???i Trang Nam</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/nu1.jpg">
                            <h5><a href="#">Th???i Trang N???</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/thietbidientu1.jpg">
                            <h5><a href="#">Thi???t B??? ??i???n T???</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/sacdep.jpg">
                            <h5><a href="#">S???c ?????p</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/chamsocnhacuajpg.jpg">
                            <h5><a href="#">Ch??m S??c Nh?? C???a</a></h5>
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
                        <h2>S???n Ph???m G???n ????y</h2>
                    </div>
                    <div class="featured__controls">
                        <ul>
                            <li class="active" data-filter="*">T???t C???</li>
                            <li data-filter=".oranges">Th???i Trang Nam</li>
                            <li data-filter=".fresh-meat">Th???i Trang N???</li>
                            <li data-filter=".vegetables">Hoa Qu???</li>
                            <li data-filter=".fastfood">Thi???t B??? ??i???n T???</li>
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
                            <h6><a href="#">??o Sweater N??? B??ng Nam</a></h6>
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
                            <h6><a href="#">Camera H???ng Ngo???i</a></h6>
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
                            <h6><a href="#">??o Somi Nam</a></h6>
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
                            <h6><a href="#">??o Thun ??i Bi???n N???</a></h6>
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
                            <h6><a href="#">Set ????? D???, Ch??n V??y Ch??? A N???</a></h6>
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
                            <h6><a href="#">??o Cardigan C?? C??? N???</a></h6>
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
                            <h6><a href="#">Xo??i</a></h6>
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
                            <h6><a href="#">T??o</a></h6>
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
                        <h4>S???n Ph???m G???n ????y</h4>
                        <div class="latest-product__slider owl-carousel">
                            <div class="latest-prdouct__slider__item">
                                <a href="#" class="latest-product__item">
                                    <div class="latest-product__item__pic">
                                        <img src="img/featured/feature-8.jpg" alt="">
                                    </div>
                                    <div class="latest-product__item__text">
                                        <h6>T??o</h6>
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
                                        <h6>M??y Xay Sinh T???</h6>
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
                                        <h6>Xo??i</h6>
                                        <span>25.000</span>
                                    </div>
                                </a>
                                <a href="#" class="latest-product__item">
                                    <div class="latest-product__item__pic">
                                        <img src="img/featured/thoitrangnam3jpg.jpg" alt="">
                                    </div>
                                    <div class="latest-product__item__text">
                                        <h6>??o Somi Nam</h6>
                                        <span>200.000</span>
                                    </div>
                                </a>
                                <a href="#" class="latest-product__item">
                                    <div class="latest-product__item__pic">
                                        <img src="img/featured/thoitrangnu3jpg.jpg" alt="">
                                    </div>
                                    <div class="latest-product__item__text">
                                        <h6>??o Cardigan C?? C??? N???</h6>
                                        <span>300.000</span>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="latest-product__text">
                        <h4>S???n Ph???m B??n Ch???y</h4>
                        <div class="latest-product__slider owl-carousel">
                            <div class="latest-prdouct__slider__item">
                                <a href="#" class="latest-product__item">
                                    <div class="latest-product__item__pic">
                                        <img src="img/latest-product/sanphambanchay1.jpg" alt="">
                                    </div>
                                    <div class="latest-product__item__text">
                                        <h6>Son D?????ng DHC Kh??ng M??u</h6>
                                        <span>150.000</span>
                                    </div>
                                </a>
                                <a href="#" class="latest-product__item">
                                    <div class="latest-product__item__pic">
                                        <img src="img/latest-product/sanphambanchay2.jpg" alt="">
                                    </div>
                                    <div class="latest-product__item__text">
                                        <h6>S???a R???a M???t Cetaphil</h6>
                                        <span>300.000</span>
                                    </div>
                                </a>
                                <a href="#" class="latest-product__item">
                                    <div class="latest-product__item__pic">
                                        <img src="img/latest-product/sanphambanchay3.jpg" alt="">
                                    </div>
                                    <div class="latest-product__item__text">
                                        <h6>K??nh M???t Th???i Trang ??i Bi???n</h6>
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
                                        <h6>??o Somi Lanh Tho??ng M??t</h6>
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
                        <h4>Review S???n Ph???m</h4>
                        <div class="latest-product__slider owl-carousel">
                            <div class="latest-prdouct__slider__item">
                                <a href="#" class="latest-product__item">
                                    <div class="latest-product__item__pic">
                                        <img src="img/latest-product/iphone 13 promax.jpg" alt="">
                                    </div>
                                    <div class="latest-product__item__text">
                                        
                                        <span>Iphone 13 Promax</span>
                                        <h6>Chi???c ??i???n tho???i th??ng minh ?????n t??? nh?? Apple</h6>
                                    </div>
                                </a>
                                <a href="#" class="latest-product__item">
                                    <div class="latest-product__item__pic">
                                        <img src="img/latest-product/bleu de chanel.jpg" alt="">
                                    </div>
                                    <div class="latest-product__item__text">
                                        <span>Blue De Chanel</span>
                                        <h6>N?????c hoa ????? kh???ng ?????nh b???n th??n</h6>
                                    </div>
                                </a>
                                <a href="#" class="latest-product__item">
                                    <div class="latest-product__item__pic">
                                        <img src="img/latest-product/bioderma.jpg" alt="">
                                    </div>
                                    <div class="latest-product__item__text">
                                        <span>Bioderma</span>
                                        <h6>S???n ph???m t???y trang m?? ai c??ng n??n c??</h6>
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
                                        <h6>Serum th???n th??nh c???u c??nh m???i lo???i da</h6>
                                    </div>
                                </a>
                                <a href="#" class="latest-product__item">
                                    <div class="latest-product__item__pic">
                                        <img src="img/latest-product/foreo.jpg" alt="">
                                    </div>
                                    <div class="latest-product__item__text">
                                        <span>M??y R???a M???t Foreo</span>
                                        <h6>M???t s???n ph???m ????? t??? nh?? Foreo</h6>
                                    </div>
                                </a>
                                <a href="#" class="latest-product__item">
                                    <div class="latest-product__item__pic">
                                        <img src="img/latest-product/omega seamaster 300 heritage.jpg" alt="">
                                    </div>
                                    <div class="latest-product__item__text">
                                        <span>?????ng H??? Nam Omega Seamaster 300 Heritage</span>
                                        <h6>Th??? hi???n b???n l??nh ph??i m???nh</h6>
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
                            <h5><a href="#">B??? ????? C???a B???n Gi?? Bao Nhi??u</a></h5>
                            <p>????? hi???u v?? c??u chuy???n ?????t ti???n c?? th??? s??? kh??ng nh?? b???n ngh??</p>
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
                            <h5><a href="#">G???i ?? Q??a Ng??y 8/3</a></h5>
                            <p>Nh???ng m??n qu?? tinh t??? v?? h???u d???ng c?? th??? gi??p b???n ghi ??i???m ?????y</p>
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
                            <h5><a href="#">L???t T???y Nh???ng ???o T?????ng C???a N??o B??? V???i "B???n Kh??ng Th??ng Minh L???m ????u"</a></h5>
                            <p>M???t cu???n s??ch gi??p b???n kh??m ph?? nhi???u kh??a c???nh kh??c nhau c???a n??o b???</p>
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
                            <li>?????a Ch???: Khu C??ng Ngh??? Cao H??a L???c, Th???ch H??a, Th???ch Th???t, H?? N???i</li>
                            <li>??i???n Tho???i: +98 222 466</li>
                            <li>Email: baboomart@gmai.com</li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 col-sm-6 offset-lg-1">
                    <div class="footer__widget">
                        <h6>???????ng D???n C???n Thi???t</h6>
                        <ul>
                            <li><a href="#">V??? Ch??ng T??i</a></li>
       
                            <li><a href="#">Mua S???m An To??n</a></li>
                            <li><a href="#">Th??ng Tin Giao H??ng</a></li>
                            <li><a href="#">Ch??nh S??ch B???o M???t</a></li>
                            
                        </ul>
                        <ul>
                            <li><a href="#">Ch??ng T??i L??</a></li>
                            <li><a href="#">D???ch V???</a></li>
                            
                            <li><a href="#">Li??n L???c</a></li>
                            
                            <li><a href="#">Cam K???t</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12">
                    <div class="footer__widget">
                        <h6>Tham Gia C??ng Ch??ng T??i Ngay B??y Gi???</h6>
                        <p>H??y ????? l???i Email v?? ch??ng t??i s??? g???i ?????n b???n th??ng tin c???p nh???t m???i nh???t v?? c??c ??u ????i</p>
                        <form action="#">
                            <input type="text" placeholder="Nh???p Email">
                            <button type="submit" class="site-btn">?????ng ??</button>
                        </form>
                        <div class="footer__widget__social">
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-pinterest"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="footer__copyright">
                        <div class="footer__copyright__text"><p>
  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | B???n quy???n thu???c v??? c??ng ty TNHH Baboo <i></i> 
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

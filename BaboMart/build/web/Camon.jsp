<%-- 
    Document   : Camon.jsp
    Created on : Mar 17, 2022, 2:27:59 AM
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
        <title>Cảm Ơn</title>

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
        <c:url value="/Home" var="homectr"/>
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
                                    <li><i class="fa fa-envelope"></i> baboomart@gmail.com</li>
                                    <li>Miễn phí ship cho mọi đơn hàng dưới 99k</li>
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
                                    <c:choose>
                                        <c:when test="${sessionScope.nguoidung != null}">
                                            <i class="fa fa-user"> ${sessionScope.nguoidung.getHoten()}</i>
                                            <a href="dangxuat"><i class="fa fa-user"></i> Đăng Xuất</a>
                                        </c:when>
                                        <c:otherwise>
                                            <a href="dangnhap"><i class="fa fa-user"></i> Đăng Nhập</a>
                                        </c:otherwise>
                                    </c:choose>
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
                                <li ><a href="${homectr}">Trang Chủ</a></li>
                                <li ><a href="SanPham">Sản Phẩm</a></li>
                                
                                <li><a href="./LienHe.jsp">Liên Hệ</a></li>
                            </ul>
                        </nav>
                    </div>
                    <div class="col-lg-3">
                        <div class="header__cart">
                            <ul>
                                <li><a href="#"><i class="fa fa-heart"></i> </a></li>
                                <li><a href="giohang1"><i class="fa fa-shopping-bag"></i><span>${sessionScope.giohang1.size()}</span> </a></li>
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
                    </div>
                </div>
            </div>
        </section>
        <!-- Hero Section End -->

        <!-- Breadcrumb Section Begin -->
        <section class="breadcrumb-section set-bg" data-setbg="img/IMG_3471.JPG">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <div class="breadcrumb__text">
                            <h2>BaBooMart</h2>
                            <div class="breadcrumb__option">
                                <a href="./Home.jsp">Trang chủ</a>
                                <span>Sản Phẩm</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Breadcrumb Section End -->

        <!-- Checkout Section Begin -->
        <section class="checkout spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <h6>Đặt Hàng Thành Công. Cảm Ơn Bạn Đã Mua Hàng
                        </h6>
                        
                        <div class="text-center">

                            <a href="SanPham" class="primary-btn cart-btn">
                                Tiếp Tục Mua Sắm</a>
                        </div>
                    </div>
                    </div>
                </div>
                
            </div>
        </section>
        <!-- Checkout Section End -->

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

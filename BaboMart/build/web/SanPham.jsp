<%-- 
    Document   : SanPham.jsp
    Created on : Mar 10, 2022, 1:49:51 PM
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
        <title>Sản Phẩm</title>

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
                                <li ><a href="${homectr}">Trang Chủ</a></li>
                                <li class="active"><a href="SanPham">Sản Phẩm</a></li>
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

        <!-- Product Section Begin -->
        <section class="product spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-5">
                        <div class="sidebar">
                            <div class="sidebar__item">
                                <h4>Danh Mục</h4>
                                <ul>
                                    <c:forEach items="${listDanhMucSanPham}" var="C">
                                        <li><a href="danhmuc?Madanhmuc=${C.getMadanhmuc()}">${C.getTendanhmuc()}</a></li>
                                        </c:forEach>     
                                </ul>
                            </div>
                            <div class="sidebar__item">

                            </div>


                            <div class="sidebar__item">
                                <div class="latest-product__text">
                                    <h4>Mới Cập Nhật</h4>
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
                        </div>
                    </div>
                    <div class="col-lg-9 col-md-7">
                        <div class="product__discount">
                            <div class="section-title product__discount__title">
                                <h2>Khuyến Mãi</h2> 
                            </div>
                            <div class="row">
                                <div class="product__discount__slider owl-carousel">   
                                    <c:forEach items="${listSanPham}" var="p">
                                        <c:if test="${p.getKhuyenmai() > 0}">
                                            <div class="col-lg-4 ">
                                                <div class="product__discount__item">
                                                    <div class="product__discount__item__pic set-bg"
                                                         data-setbg="${p.getImgUrl()}">
                                                        <div class="product__discount__percent">-${p.getKhuyenmai()}%</div>
                                                        <ul class="product__item__pic__hover">
                                                            <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                            <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                            <li><a href="themgiohang?Masanpham=${p.getMasanpham()}"><i class="fa fa-shopping-cart"></i></a></li>
                                                        </ul>
                                                    </div>
                                                    <div class="product__discount__item__text">

                                                        <h5><a href="chitiet?Masanpham=${p.getMasanpham()}">${p.getTensanpham()}</a></h5>
                                                        <div class="product__item__price">${p.getKhuyenmai()}<span>${p.getGiagoc()}</span></div>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:if>
                                    </c:forEach>
                                </div> 
                            </div>
                        </div>


                        <div class="filter__item">
                            <div class="row">
                                <div class="col-lg-4 col-md-6">
                                    <div class="filter__sort">
                                        <span>Sắp Xếp</span>
                                        <select>
                                            <option value="0">Ngẫu Nhiên</option>
                                            <option value="0">Khoảng Giá</option>
                                        </select>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="row">
                            <c:forEach items="${listSanPham1}" var="b">
                                <c:if test="${b.getKhuyenmai() eq 0}">
                                    <div class="col-lg-4 col-md-6 col-sm-6">
                                        <div class="product__item">
                                            <div class="product__item__pic set-bg" 
                                                 data-setbg="${b.getImgUrl()}">
                                                <ul class="product__item__pic__hover">
                                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                    <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                    <li><a href="themgiohang?Masanpham=${b.getMasanpham()}"><i class="fa fa-shopping-cart"></i></a></li>
                                                </ul>
                                            </div>
                                            <div class="product__item__text">
                                                <h6><a href="chitiet?Masanpham=${b.getMasanpham()}">${b.getTensanpham()}</a></h6>
                                                <h5>${b.getGiagoc()}</h5>
                                            </div>
                                        </div>
                                    </div>
                                </c:if>
                            </c:forEach>
                        </div>
                        <div class="product__pagination">
                            <c:choose>
                                <c:when test="${requestScope.listSanPham1 == null || requestScope.listSanPham1.size() == 0}" >
                                    Không Có Sản Phẩm Cần Tìm
                                </c:when>
                                <c:otherwise>

                                    <a href="SanPham?page=${page-1}"><i class="fa fa-long-arrow-left"></i></a>
                                        <c:forEach begin="1" end="${totalPage}" var="i">
                                        <a href="SanPham?page=${i}">${i}</a>
                                    </c:forEach>

                                    <a href="SanPham?page=${page+1}"><i class="fa fa-long-arrow-right"></i></a>
                                    </c:otherwise>

                            </c:choose>

                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Product Section End -->

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

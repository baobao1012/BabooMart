package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SanPham_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_url_var_value_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Ogani Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"Ogani, unica, creative, html\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>S???n Ph???m</title>\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Css Styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/all.min.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Page Preloder -->\n");
      out.write("        ");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <div id=\"preloder\">\n");
      out.write("            <div class=\"loader\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Header Section Begin -->\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class=\"header__top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                            <div class=\"header__top__left\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><i class=\"fas fa-envelope\"></i> baboomart@gmail.com</li>\n");
      out.write("                                    <li>Mi???n ph?? ship cho m???i ????n h??ng d?????i 99k</li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                            <div class=\"header__top__right\">\n");
      out.write("                                <div class=\"header__top__right__social\">\n");
      out.write("                                    <a href=\"https://www.facebook.com/\"><i class=\"fab fa-facebook\">\n");
      out.write("                                        </i></a>\n");
      out.write("                                    <a href=\"https://twitter.com/\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                                    <a href=\"https://vn.linkedin.com\"><i class=\"fab fa-linkedin\"></i></a>\n");
      out.write("                                    <a href=\"https://www.pinterest.com/\"><i class=\"fab fa-pinterest-p\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"header__top__right__language\">\n");
      out.write("                                    <img src=\"img/language.png\" alt=\"\">\n");
      out.write("                                    <div>English</div>\n");
      out.write("                                    <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\">Vietnamese</a></li>\n");
      out.write("                                        <li><a href=\"#\">English</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"header__top__right__auth\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-user\"></i> ????ng Nh???p</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3\">\n");
      out.write("                        <div class=\"header__logo\">\n");
      out.write("                            <a href=\"./Home.jsp\"><img src=\"img/RPReplay_Final1646660780-_1_.gif\" alt=\"\"></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <nav class=\"header__menu\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homectr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Trang Ch???</a></li>\n");
      out.write("                                <li class=\"active\"><a href=\"./SanPham.jsp\">S???n Ph???m</a></li>\n");
      out.write("                                <li><a href=\"./VeChungToi.jsp\">Gi???i Thi???u</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"./LienHe.jsp\">Li??n H???</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3\">\n");
      out.write("                        <div class=\"header__cart\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-heart\"></i><span>1</span> </a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-shopping-bag\"></i><span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.giohang.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span> </a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"humberger__open\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- Header Section End -->\n");
      out.write("\n");
      out.write("        <!-- Hero Section Begin -->\n");
      out.write("        <section class=\"hero\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9\">\n");
      out.write("                        <div class=\"hero__search\">\n");
      out.write("                            <div class=\"hero__search__form\">\n");
      out.write("                                <form action=\"Search\">\n");
      out.write("                                    <div class=\"hero__search__categories\">\n");
      out.write("                                        T???t C??? C??c Lo???i\n");
      out.write("                                        <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"text\" placeholder=\"T??m Ki???m\"\n");
      out.write("                                           name=\"keyword\"\n");
      out.write("                                           >\n");
      out.write("                                    <button type=\"submit\" class=\"site-btn\">T??m Ki???m</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"hero__search__phone\">\n");
      out.write("                                <div class=\"hero__search__phone__icon\">\n");
      out.write("                                    <i class=\"fa fa-phone\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"hero__search__phone__text\">\n");
      out.write("                                    <h5>+98 222 466</h5>\n");
      out.write("                                    <span>H??? Tr??? 24/7</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Hero Section End -->\n");
      out.write("\n");
      out.write("        <!-- Breadcrumb Section Begin -->\n");
      out.write("        <section class=\"breadcrumb-section set-bg\" data-setbg=\"img/IMG_3471.JPG\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 text-center\">\n");
      out.write("                        <div class=\"breadcrumb__text\">\n");
      out.write("                            <h2>BaBooMart</h2>\n");
      out.write("                            <div class=\"breadcrumb__option\">\n");
      out.write("                                <a href=\"./Home.jsp\">Trang ch???</a>\n");
      out.write("                                <span>S???n Ph???m</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Breadcrumb Section End -->\n");
      out.write("\n");
      out.write("        <!-- Product Section Begin -->\n");
      out.write("        <section class=\"product spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-5\">\n");
      out.write("                        <div class=\"sidebar\">\n");
      out.write("                            <div class=\"sidebar__item\">\n");
      out.write("                                <h4>Danh M???c</h4>\n");
      out.write("                                <ul>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("     \n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"sidebar__item\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"sidebar__item\">\n");
      out.write("                                <div class=\"latest-product__text\">\n");
      out.write("                                    <h4>M???i C???p Nh???t</h4>\n");
      out.write("                                    <div class=\"latest-product__slider owl-carousel\">\n");
      out.write("                                        <div class=\"latest-prdouct__slider__item\">\n");
      out.write("                                            <a href=\"#\" class=\"latest-product__item\">\n");
      out.write("                                                <div class=\"latest-product__item__pic\">\n");
      out.write("                                                    <img src=\"img/featured/feature-8.jpg\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"latest-product__item__text\">\n");
      out.write("                                                    <h6>T??o</h6>\n");
      out.write("                                                    <span>50.000</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\" class=\"latest-product__item\">\n");
      out.write("                                                <div class=\"latest-product__item__pic\">\n");
      out.write("                                                    <img src=\"img/featured/thietbidientu2.jpg\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"latest-product__item__text\">\n");
      out.write("                                                    <h6>Loa Bluetooth</h6>\n");
      out.write("                                                    <span>600.000</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\" class=\"latest-product__item\">\n");
      out.write("                                                <div class=\"latest-product__item__pic\">\n");
      out.write("                                                    <img src=\"img/featured/thietbidientu4.jpg\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"latest-product__item__text\">\n");
      out.write("                                                    <h6>M??y Xay Sinh T???</h6>\n");
      out.write("                                                    <span>1.250.000</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"latest-prdouct__slider__item\">\n");
      out.write("                                            <a href=\"#\" class=\"latest-product__item\">\n");
      out.write("                                                <div class=\"latest-product__item__pic\">\n");
      out.write("                                                    <img src=\"img/featured/feature-7.jpg\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"latest-product__item__text\">\n");
      out.write("                                                    <h6>Xo??i</h6>\n");
      out.write("                                                    <span>25.000</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\" class=\"latest-product__item\">\n");
      out.write("                                                <div class=\"latest-product__item__pic\">\n");
      out.write("                                                    <img src=\"img/featured/thoitrangnam3jpg.jpg\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"latest-product__item__text\">\n");
      out.write("                                                    <h6>??o Somi Nam</h6>\n");
      out.write("                                                    <span>200.000</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\" class=\"latest-product__item\">\n");
      out.write("                                                <div class=\"latest-product__item__pic\">\n");
      out.write("                                                    <img src=\"img/featured/thoitrangnu3jpg.jpg\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"latest-product__item__text\">\n");
      out.write("                                                    <h6>??o Cardigan C?? C??? N???</h6>\n");
      out.write("                                                    <span>300.000</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-md-7\">\n");
      out.write("                        <div class=\"product__discount\">\n");
      out.write("                            <div class=\"section-title product__discount__title\">\n");
      out.write("                                <h2>Khuy???n M??i</h2> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"product__discount__slider owl-carousel\">   \n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </div> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"filter__item\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                                    <div class=\"filter__sort\">\n");
      out.write("                                        <span>S???p X???p</span>\n");
      out.write("                                        <select>\n");
      out.write("                                            <option value=\"0\">Ng???u Nhi??n</option>\n");
      out.write("                                            <option value=\"0\">Kho???ng Gi??</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product__pagination\">\n");
      out.write("                            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Product Section End -->\n");
      out.write("\n");
      out.write("        <!-- Footer Section Begin -->\n");
      out.write("        <footer class=\"footer spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                        <div class=\"footer__about\">\n");
      out.write("                            <div class=\"footer__about__logo\">\n");
      out.write("                                <a href=\"./index.html\"><img src=\"img/RPReplay_Final1646660780-_1_.gif\" alt=\"\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>?????a Ch???: Khu C??ng Ngh??? Cao H??a L???c, Th???ch H??a, Th???ch Th???t, H?? N???i</li>\n");
      out.write("                                <li>??i???n Tho???i: +98 222 466</li>\n");
      out.write("                                <li>Email: baboomart@gmai.com</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6 offset-lg-1\">\n");
      out.write("                        <div class=\"footer__widget\">\n");
      out.write("                            <h6>???????ng D???n C???n Thi???t</h6>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">V??? Ch??ng T??i</a></li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"#\">Mua S???m An To??n</a></li>\n");
      out.write("                                <li><a href=\"#\">Th??ng Tin Giao H??ng</a></li>\n");
      out.write("                                <li><a href=\"#\">Ch??nh S??ch B???o M???t</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Ch??ng T??i L??</a></li>\n");
      out.write("                                <li><a href=\"#\">D???ch V???</a></li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"#\">Li??n L???c</a></li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"#\">Cam K???t</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-12\">\n");
      out.write("                        <div class=\"footer__widget\">\n");
      out.write("                            <h6>Tham Gia C??ng Ch??ng T??i Ngay B??y Gi???</h6>\n");
      out.write("                            <p>H??y ????? l???i Email v?? ch??ng t??i s??? g???i ?????n b???n th??ng tin c???p nh???t m???i nh???t v?? c??c ??u ????i</p>\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Nh???p Email\">\n");
      out.write("                                <button type=\"submit\" class=\"site-btn\">?????ng ??</button>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"footer__widget__social\">\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-pinterest\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"footer__copyright\">\n");
      out.write("                            <div class=\"footer__copyright__text\"><p>\n");
      out.write("                                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | B???n quy???n thu???c v??? c??ng ty TNHH Baboo <i></i> \n");
      out.write("                                </p></div>\n");
      out.write("                            <div class=\"footer__copyright__payment\"><img src=\"img/payment-item.png\" alt=\"\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- Footer Section End -->\n");
      out.write("\n");
      out.write("        <!-- Js Plugins -->\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.slicknav.js\"></script>\n");
      out.write("        <script src=\"js/mixitup.min.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/Home");
    _jspx_th_c_url_0.setVar("homectr");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listDanhMucSanPham}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("C");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <li><a href=\"danhmuc?Madanhmuc=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.getMadanhmuc()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.getTendanhmuc()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSanPham}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("p");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getKhuyenmai() > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <div class=\"col-lg-4 \">\n");
        out.write("                                                <div class=\"product__discount__item\">\n");
        out.write("                                                    <div class=\"product__discount__item__pic set-bg\"\n");
        out.write("                                                         data-setbg=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getImgUrl()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        <div class=\"product__discount__percent\">-");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getKhuyenmai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("%</div>\n");
        out.write("                                                        <ul class=\"product__item__pic__hover\">\n");
        out.write("                                                            <li><a href=\"#\"><i class=\"fa fa-heart\"></i></a></li>\n");
        out.write("                                                            <li><a href=\"#\"><i class=\"fa fa-retweet\"></i></a></li>\n");
        out.write("                                                            <li><a href=\"#\"><i class=\"fa fa-shopping-cart\"></i></a></li>\n");
        out.write("                                                        </ul>\n");
        out.write("                                                    </div>\n");
        out.write("                                                    <div class=\"product__discount__item__text\">\n");
        out.write("\n");
        out.write("                                                        <h5><a href=\"chitiet?Masanpham=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getMasanpham()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTensanpham()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></h5>\n");
        out.write("                                                        <div class=\"product__item__price\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getKhuyenmai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getGiagoc()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSanPham1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("b");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getKhuyenmai() eq 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"col-lg-4 col-md-6 col-sm-6\">\n");
        out.write("                                        <div class=\"product__item\">\n");
        out.write("                                            <div class=\"product__item__pic set-bg\" \n");
        out.write("                                                 data-setbg=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getImgUrl()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                <ul class=\"product__item__pic__hover\">\n");
        out.write("                                                    <li><a href=\"#\"><i class=\"fa fa-heart\"></i></a></li>\n");
        out.write("                                                    <li><a href=\"#\"><i class=\"fa fa-retweet\"></i></a></li>\n");
        out.write("                                                    <li><a href=\"#\"><i class=\"fa fa-shopping-cart\"></i></a></li>\n");
        out.write("                                                </ul>\n");
        out.write("                                            </div>\n");
        out.write("                                            <div class=\"product__item__text\">\n");
        out.write("                                                <h6><a href=\"#\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getTensanpham()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></h6>\n");
        out.write("                                                <h5>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getGiagoc()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h5>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listSanPham1 == null || requestScope.listSanPham1.size() == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    Kh??ng C?? S???n Ph???m C???n T??m\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                    <a href=\"SanPham?page=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><i class=\"fa fa-long-arrow-left\"></i></a>\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                    <a href=\"SanPham?page=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><i class=\"fa fa-long-arrow-right\"></i></a>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_forEach_3.setBegin(1);
    _jspx_th_c_forEach_3.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_3.setVar("i");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <a href=\"SanPham?page=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}

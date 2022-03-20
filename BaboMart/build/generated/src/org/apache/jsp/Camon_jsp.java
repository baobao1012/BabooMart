package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Camon_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_url_var_value_nobody.release();
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
      out.write("\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Ogani Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"Ogani, unica, creative, html\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Cảm Ơn</title>\n");
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
      out.write("                                    <li>Miễn phí ship cho mọi đơn hàng dưới 99k</li>\n");
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
      out.write("                                    <a href=\"#\"><i class=\"fa fa-user\"></i> Đăng Nhập</a>\n");
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
      out.write("\">Trang Chủ</a></li>\n");
      out.write("                                <li ><a href=\"SanPham\">Sản Phẩm</a></li>\n");
      out.write("                                <li><a href=\"./VeChungToi.jsp\">Giới Thiệu</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"./LienHe.jsp\">Liên Hệ</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3\">\n");
      out.write("                        <div class=\"header__cart\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-heart\"></i> </a></li>\n");
      out.write("                                <li><a href=\"giohang1\"><i class=\"fa fa-shopping-bag\"></i><span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.giohang1.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
      out.write("                                        Tất Cả Các Loại\n");
      out.write("                                        <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Tìm Kiếm\"\n");
      out.write("                                           name=\"keyword\"\n");
      out.write("                                           >\n");
      out.write("                                    <button type=\"submit\" class=\"site-btn\">Tìm Kiếm</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"hero__search__phone\">\n");
      out.write("                                <div class=\"hero__search__phone__icon\">\n");
      out.write("                                    <i class=\"fa fa-phone\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"hero__search__phone__text\">\n");
      out.write("                                    <h5>+98 222 466</h5>\n");
      out.write("                                    <span>Hỗ Trợ 24/7</span>\n");
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
      out.write("                                <a href=\"./Home.jsp\">Trang chủ</a>\n");
      out.write("                                <span>Sản Phẩm</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Breadcrumb Section End -->\n");
      out.write("\n");
      out.write("        <!-- Checkout Section Begin -->\n");
      out.write("        <section class=\"checkout spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h6>Đặt Hàng Thành Công. Cảm Ơn Bạn Đã Mua Hàng\n");
      out.write("                        </h6>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"checkout__form\">\n");
      out.write("                    <h4>Thông Tin Giao Hàng</h4>\n");
      out.write("                    <form action=\"thanhtoan1\" method=\"POST\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-8 col-md-6\">\n");
      out.write("                                <div class=\"checkout__input\">\n");
      out.write("                                            <label for=\"Tenkhachhang\">Họ Và Tên</label>\n");
      out.write("                                                <input type=\"text\" id=\"Tenkhachhang\" name=\"Tenkhachhang\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                <div class=\"checkout__input\">\n");
      out.write("                                            <label for=\"Diachi\">Địa Chỉ</label>\n");
      out.write("                                            <input type=\"text\" id=\"Diachi\" name=\"Diachi\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-6\">\n");
      out.write("                                        <div class=\"checkout__input\">\n");
      out.write("                                            <label for=\"SoDT\">Số điện thoại</label>\n");
      out.write("                                            <input type=\"text\" id=\"SoDT\" name=\"SoDT\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-6\">\n");
      out.write("                                        <div class=\"checkout__input\">\n");
      out.write("                                            <label for=\"Email\">Email</label>\n");
      out.write("                                            <input type=\"text\" id=\"Email\" name=\"Email\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"checkout__input\">\n");
      out.write("                                            <label for=\"Ghichu\">Ghi Chú</label>\n");
      out.write("                                            <input type=\"text\" id=\"Ghichu\" name=\"Ghichu\">\n");
      out.write("                                        </div>\n");
      out.write("<!--                                <div>\n");
      out.write("                                    <button type=\"submit\" class=\"site-btn\">Đồng Ý</button>\n");
      out.write("                                </div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                                <div class=\"checkout__order\">\n");
      out.write("                                    <h4>Giỏ Hàng</h4>\n");
      out.write("                                    <div class=\"checkout__order__products\">Sản Phẩm <span>Tổng</span></div>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    <div class=\"checkout__order__total\">Tổng Tiền<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tongtien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></div>\n");
      out.write("\n");
      out.write("                                    <div class=\"checkout__input__checkbox\">\n");
      out.write("                                        <label for=\"acc-or\">\n");
      out.write("                                            Create an account?\n");
      out.write("                                            <input type=\"checkbox\" id=\"acc-or\">\n");
      out.write("                                            <span class=\"checkmark\"></span>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adip elit, sed do eiusmod tempor incididunt\n");
      out.write("                                        ut labore et dolore magna aliqua.</p>\n");
      out.write("                                    <div class=\"checkout__input__checkbox\">\n");
      out.write("                                        <label for=\"payment\">\n");
      out.write("                                            Check Payment\n");
      out.write("                                            <input type=\"checkbox\" id=\"payment\">\n");
      out.write("                                            <span class=\"checkmark\"></span>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"checkout__input__checkbox\">\n");
      out.write("                                        <label for=\"paypal\">\n");
      out.write("                                            Paypal\n");
      out.write("                                            <input type=\"checkbox\" id=\"paypal\">\n");
      out.write("                                            <span class=\"checkmark\"></span>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button type=\"submit\" class=\"site-btn\">Đặt Hàng</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Checkout Section End -->\n");
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
      out.write("                                <li>Địa Chỉ: Khu Công Nghệ Cao Hòa Lạc, Thạch Hòa, Thạch Thất, Hà Nội</li>\n");
      out.write("                                <li>Điện Thoại: +98 222 466</li>\n");
      out.write("                                <li>Email: baboomart@gmai.com</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6 offset-lg-1\">\n");
      out.write("                        <div class=\"footer__widget\">\n");
      out.write("                            <h6>Đường Dẫn Cần Thiết</h6>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Về Chúng Tôi</a></li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"#\">Mua Sắm An Toàn</a></li>\n");
      out.write("                                <li><a href=\"#\">Thông Tin Giao Hàng</a></li>\n");
      out.write("                                <li><a href=\"#\">Chính Sách Bảo Mật</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Chúng Tôi Là</a></li>\n");
      out.write("                                <li><a href=\"#\">Dịch Vụ</a></li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"#\">Liên Lạc</a></li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"#\">Cam Kết</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-12\">\n");
      out.write("                        <div class=\"footer__widget\">\n");
      out.write("                            <h6>Tham Gia Cùng Chúng Tôi Ngay Bây Giờ</h6>\n");
      out.write("                            <p>Hãy để lại Email và chúng tôi sẽ gửi đến bạn thông tin cập nhật mới nhất và các ưu đãi</p>\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Nhập Email\">\n");
      out.write("                                <button type=\"submit\" class=\"site-btn\">Đồng Ý</button>\n");
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
      out.write("                                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | Bản quyền thuộc về công ty TNHH Baboo <i></i> \n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giohang1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("a");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <ul>\n");
          out.write("                                            <li>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.value.sanpham.getTensanpham()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.value.sanpham.getGiagoc()*a.value.getSoluong()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></li>\n");
          out.write("\n");
          out.write("                                        </ul>\n");
          out.write("                                    ");
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
}

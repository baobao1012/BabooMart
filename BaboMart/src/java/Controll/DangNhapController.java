/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DAO.NguoiDungDAO;
import Entity.NguoiDung;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author baobao
 */
public class DangNhapController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DangNhapController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DangNhapController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //kiem tra cookie
        Cookie [] cookies = request.getCookies();
        String taikhoan = null;
        String matkhau = null;
        for (Cookie cooky : cookies) {
            if(cooky.getName().equals("taikhoan")){
                taikhoan = cooky.getValue();
            }
            if(cooky.getName().equals("matkhau")){
                matkhau = cooky.getValue();
            }
            if(taikhoan!=null && matkhau!=null){
                break;
            }
        }
        if(taikhoan != null && matkhau != null){
            NguoiDung nguoidung = new NguoiDungDAO().login(taikhoan, matkhau);
            if(nguoidung != null){//cookie hop le
                request.getSession().setAttribute("nguoidung", nguoidung);
                response.sendRedirect("Home");
                return;
            }
        }
        request.getRequestDispatcher("DangNhap.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //check dang nhap
        String taikhoan = request.getParameter("taikhoan");
        String matkhau = request.getParameter("matkhau");
        boolean remember = request.getParameter("matkhau") != null;
        
        //chech tendangnhap va matkhau
        NguoiDung nguoidung = new NguoiDungDAO().login(taikhoan,matkhau);
        
        if(nguoidung != null){//hop le => luu len session 
            //remember
            if(remember){
                Cookie taikhoanCookie = new Cookie("taikhoan", taikhoan);
                taikhoanCookie.setMaxAge(60*60*24*2);//2 ngay
                Cookie matkhauCookie = new Cookie("matkhau", matkhau);
                matkhauCookie.setMaxAge(60*60*24*2);
                response.addCookie(taikhoanCookie);
                response.addCookie(matkhauCookie);
            }
            request.getSession().setAttribute("nguoidung", nguoidung);
            response.sendRedirect("Home");
        }
        else{
        //khong hop le
        request.setAttribute("error", "Tài khoản hoặc mật khẩu không hợp lệ");
        request.getRequestDispatcher("DangNhap.jsp").forward(request, response);
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

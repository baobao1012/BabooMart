/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DAO.DonHangChiTietDAO;
import DAO.DonHangDAO;
import DAO.GiaoHangDAO;
import Entity.DonHang;
import Entity.GiaoHang;
import Entity.GioHang;
import Entity.NguoiDung;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author baobao
 */
public class ThanhToanController extends HttpServlet {

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
            HttpSession session = request.getSession();
            //check dang nhap
            NguoiDung nguoidung = (NguoiDung) session.getAttribute("nguoidung");
            if(nguoidung == null){
                response.sendRedirect("dangnhap");
                return;
            }
            
            Map<Integer, GioHang> giohang1 = (Map<Integer, GioHang>) session.getAttribute("giohang1");
            if (giohang1 == null) {
                giohang1 = new LinkedHashMap<>();
            }

            //tinh tong tien
            double tongtien = 0;
            for (Map.Entry<Integer, GioHang> entry : giohang1.entrySet()) {
                Integer Masanpham = entry.getKey();
                GioHang giohang = entry.getValue();
                tongtien += giohang.getSoluong() * giohang.getSanpham().getGiagoc();
            }
            request.setAttribute("tongtien", tongtien);
            request.getRequestDispatcher("ThanhToan.jsp").forward(request, response);
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
        processRequest(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        String Tenkhachhang = request.getParameter("Tenkhachhang");
        String Diachi = request.getParameter("Diachi");
        String SoDT = request.getParameter("SoDT");
        String Email = request.getParameter("SoDT");
        String Ghichu = request.getParameter("Ghichu");

        //luu vao database
        //luu shipping
        GiaoHang giaohang = GiaoHang.builder()
                .Tenkhachhang(Tenkhachhang)
                .SoDT(SoDT)
                .Diachi(Diachi)
                .build();
        int Magiaohang = new GiaoHangDAO().createReturnID(giaohang);//tra ve magiaohang tu tang

        //luu donhang
        HttpSession session = request.getSession();
        Map<Integer, GioHang> giohang1 = (Map<Integer, GioHang>) session.getAttribute("giohang1");
        if (giohang1 == null) {
            giohang1 = new LinkedHashMap<>();
        }

        //tinh tong tien
        double tongtien = 0;
        for (Map.Entry<Integer, GioHang> entry : giohang1.entrySet()) {
            Integer Masanpham = entry.getKey();
            GioHang giohang = entry.getValue();
            tongtien += giohang.getSoluong() * giohang.getSanpham().getGiagoc();
        }
        DonHang donhang = DonHang.builder()
                .Ngaydathang(Tenkhachhang)
                .Manguoidung(1)
                .Tongtien(tongtien)
                .Ghichu(Ghichu)
                .Magiaohang(Magiaohang)
                .build();
        int Madonhang = new DonHangDAO().createReturnID(donhang);

        //luu donhangchitiet
        new DonHangChiTietDAO.savecart(Madonhang, giohang1);
        session.removeAttribute("giohang1");
        response.sendRedirect("Thanks");
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

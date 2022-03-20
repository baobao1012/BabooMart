/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DAO.SanPhamDAO;
import Entity.GioHang;
import Entity.NguoiDung;
import Entity.SanPham;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author baobao
 */
@WebServlet(name = "ThemGioHangController", urlPatterns = {"/themgiohang"})
public class ThemGioHangController extends HttpServlet {

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
            int Masanpham = Integer.parseInt(request.getParameter("Masanpham"));
            HttpSession session = request.getSession();
            //check dang nhap
            NguoiDung nguoidung = (NguoiDung) session.getAttribute("nguoidung");
            if(nguoidung == null){
                response.sendRedirect("dangnhap");
                return;
            }
            
            Map<Integer, GioHang> giohang1 = (Map<Integer, GioHang>) session.getAttribute("giohang1");
            if(giohang1 == null){
                giohang1 = new LinkedHashMap<>();
            }
            
            //Lay san pham ung voi masanpham nhan duoc
            if(giohang1.containsKey(Masanpham)){//da co tren giohang
                int sanphamcu = giohang1.get(Masanpham).getSoluong();
                giohang1.get(Masanpham).setSoluong(sanphamcu + 1);
            }
            else{//khong co tren gio hang
                SanPham sanpham = new SanPhamDAO().getMasanpham(Masanpham);
                giohang1.put(Masanpham, GioHang.builder().sanpham(sanpham).Soluong(1).build());
                
            }
            //luu len session
            session.setAttribute("giohang1", giohang1);
           String urlHistory = (String)session.getAttribute("UrlHistory");
            if(urlHistory == null)
                urlHistory="SanPham";
            response.sendRedirect(urlHistory);
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
        processRequest(request, response);
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

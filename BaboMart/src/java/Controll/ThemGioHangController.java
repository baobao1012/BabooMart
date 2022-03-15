/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DAO.SanPhamDAO;
import Entity.GioHang;
import Entity.SanPham;
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
            Map<Integer, GioHang> giohang = (Map<Integer, GioHang>) session.getAttribute("giohang");
            if (giohang == null) {
                giohang = new LinkedHashMap<>();
            }
            if (giohang.containsKey(Masanpham)) {
                //da nam trong gio hang
                int soluongcu = giohang.get(Masanpham).getSoluong();
                giohang.get(Masanpham).setSoluong(soluongcu + 1);

            } else {
                //khong nam trong gio hang
                SanPham sanpham = new SanPhamDAO().getMasanpham(Masanpham);
                giohang.put(Masanpham, GioHang.builder().sanpham(sanpham).Soluong(1).build());
            }
            //luu len session
            session.setAttribute("giohang", giohang);
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

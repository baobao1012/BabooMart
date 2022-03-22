/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DAO.SanPhamDAO;
import Entity.SanPham;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author baobao
 */
public class AddController extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        String Tensanpham = request.getParameter("name");
        String Anh = request.getParameter("image");
        Float Giagoc = Float.parseFloat(request.getParameter("price"));
        Float Khuyenmai = Float.parseFloat(request.getParameter("sale"));
        String Motangan = request.getParameter("title1");
        String Motachitiet = request.getParameter("title2");
        int Soluong = Integer.parseInt(request.getParameter("quantity"));
        int Danhmuc = Integer.parseInt(request.getParameter("category"));
        
        SanPham sanpham = SanPham.builder()
                                .Madanhmuc(Danhmuc)
                                .Tensanpham(Tensanpham)
                                .Giagoc(Giagoc)
                                .Khuyenmai(Khuyenmai)
                                .ImgUrl(Anh)
                                .Motangan(Motangan)
                                .Motachitiet(Motachitiet)
                                .Soluong(Soluong)
                                .build();
        int Masanpham = new SanPhamDAO().insert(sanpham);
        

           response.sendRedirect("quanly");
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

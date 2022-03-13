/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DAO.DanhMucSanPhamDAO;
import DAO.SanPhamDAO;
import Entity.DanhMucSanPham;
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
public class SanPhamController extends HttpServlet {

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
        final int page_size = 9;
        List<DanhMucSanPham> listDanhMucSanPham = new DanhMucSanPhamDAO().getAllDanhMuc();
        
        request.setAttribute("listDanhMucSanPham", listDanhMucSanPham);
        
        int page = 1;
        String pageStr = request.getParameter("page");
        if(pageStr != null) {
            page = Integer.parseInt(pageStr);
        }
        
        SanPhamDAO sp = new SanPhamDAO();
        int totalRow = sp.getcount();
        int totalPage = totalRow/page_size;
        if(totalRow % page_size != 0){
            totalPage += 1;
        }
        List<SanPham> listSanPham1 = new SanPhamDAO().getAllSanPhamPhanTrang(page, page_size);
        List<SanPham> listSanPham = new SanPhamDAO().getAllSanPham();
        request.setAttribute("listSanPham1", listSanPham1);
         request.setAttribute("listSanPham", listSanPham);
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("page", page);
        request.getRequestDispatcher("SanPham.jsp").forward(request, response);
        
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

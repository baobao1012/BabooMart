/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBcontext;
import Entity.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author baobao
 */
public class SanPhamDAO {

    public List<SanPham> getAllSanPham() {
        List<SanPham> list = new ArrayList<>();
        try {
            String sql = "select*from SanPham";
            Connection co = new DBcontext().getConnection();
            PreparedStatement ps = co.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
//                SanPham sanpham = new SanPham();
//                sanpham.setGiagoc(rs.getInt(4));
//                sanpham.setImgUrl(rs.getString(6));
//                sanpham.setKhuyenmai(rs.getFloat(5));
//                sanpham.setMadanhmuc(rs.getInt(2));
//                sanpham.setMasanpham(rs.getInt(1));
//                sanpham.setMotachitiet(rs.getString(8));
//                sanpham.setMotangan(rs.getString(7));
//                sanpham.setTensanpham(rs.getString(3));
//               sanpham.setSoluong(rs.getInt(9));
                SanPham sanpham = SanPham.builder().Masanpham(rs.getInt(1))
                                                    .Madanhmuc(rs.getInt(2))
                                                    .Tensanpham(rs.getString(3))
                                                    .Giagoc(rs.getFloat(4))
                                                    .Khuyenmai(rs.getFloat(5))
                                                    .Motangan(rs.getString(7))
                                                    .ImgUrl(rs.getString(6))
                                                    .Motachitiet(rs.getString(8))
                                                    .Soluong(rs.getInt(9)).build();
                list.add(sanpham);
            }
        } catch (Exception ex) {
            Logger.getLogger(DanhMucSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static void main(String[] args) {
        SanPhamDAO a = new SanPhamDAO();
       List<SanPham> list = a.getAllSanPham();
        for (SanPham sanPham : list) {
            System.out.println(sanPham);
        }
    }

    public List<SanPham> getSanPhamTuDanhMuc(int Madanhmuc) {
        List<SanPham> list = new ArrayList<>();
        try {
            String sql = "select*from SanPham where SanPham.Madanhmuc = ?";
            Connection co = new DBcontext().getConnection();
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setInt(1, Madanhmuc);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
//                SanPham sanpham = new SanPham();
//                sanpham.setGiagoc(rs.getInt(4));
//                sanpham.setImgUrl(rs.getString(6));
//                sanpham.setKhuyenmai(rs.getFloat(5));
//                sanpham.setMadanhmuc(rs.getInt(2));
//                sanpham.setMasanpham(rs.getInt(1));
//                sanpham.setMotachitiet(rs.getString(8));
//                sanpham.setMotangan(rs.getString(7));
//                sanpham.setTensanpham(rs.getString(3));
//                sanpham.setSoluong(rs.getInt(9));
               
 SanPham sanpham = SanPham.builder().Masanpham(rs.getInt(1))
                                                    .Madanhmuc(rs.getInt(2))
                                                    .Tensanpham(rs.getString(3))
                                                    .Giagoc(rs.getFloat(4))
                                                    .Khuyenmai(rs.getFloat(5))
                                                    .Motangan(rs.getString(7))
                                                    .ImgUrl(rs.getString(6))
                                                    .Motachitiet(rs.getString(8))
                                                    .Soluong(rs.getInt(9)).build();
                list.add(sanpham);
            }
        } catch (Exception ex) {
            Logger.getLogger(DanhMucSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<SanPham> getAllSanPhamPhanTrang(int page, int page_size) {
        List<SanPham> list = new ArrayList<>();
        try {
            String sql = "SELECT Masanpham,Madanhmuc,Tensanpham,Giagoc,Khuyenmai,ImgUrl, Motangan,Motachitiet, Soluong FROM \n" +
"(SELECT ROW_NUMBER() OVER (ORDER BY Tensanpham asc) as rownum, Masanpham,Madanhmuc,Tensanpham,Giagoc,Khuyenmai,ImgUrl, Motangan,Motachitiet, Soluong\n" +
"FROM SanPham) t\n" +
"WHERE \n" +
"rownum >= (? - 1)*? + 1 AND rownum <= ? * ?";
            Connection co = new DBcontext().getConnection();
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setInt(1, page);
            ps.setInt(2, page_size);
            ps.setInt(3, page);
            ps.setInt(4, page_size);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
//                SanPham sanpham = new SanPham();
//                sanpham.setMasanpham(rs.getInt("Masanpham"));
//                sanpham.setMadanhmuc(rs.getInt("Madanhmuc"));
//                sanpham.setGiagoc(rs.getInt("Giagoc"));
//                sanpham.setTensanpham(rs.getString("Tensanpham"));
//                sanpham.setKhuyenmai(rs.getInt("Khuyenmai"));
//                sanpham.setMotangan(rs.getString("Motangan"));
//                sanpham.setImgUrl(rs.getString("ImgUrl"));
//                sanpham.setMotachitiet(rs.getString("Motachitiet"));
//                sanpham.setSoluong(rs.getInt("Soluong"));

                    SanPham sanpham = SanPham.builder().Masanpham(rs.getInt("Masanpham"))
                                                    .Madanhmuc(rs.getInt("Madanhmuc"))
                                                    .Tensanpham(rs.getString("Tensanpham"))
                                                    .Giagoc(rs.getFloat("Giagoc"))
                                                    .Khuyenmai(rs.getFloat("Khuyenmai"))
                                                    .Motangan(rs.getString("Motangan"))
                                                    .ImgUrl(rs.getString("ImgUrl"))
                                                    .Motachitiet(rs.getString("Motachitiet"))
                                                    .Soluong(rs.getInt("Soluong")).build();
                list.add(sanpham);
            }
        } catch (Exception ex) {
            Logger.getLogger(DanhMucSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
     public int getcount() {
        List<SanPham> list = new ArrayList<>();
        try {
            String sql = "select count(*) as total from SanPham";
            Connection co = new DBcontext().getConnection();
            PreparedStatement ps = co.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt("total");
            }
        } catch (Exception ex) {
            Logger.getLogger(DanhMucSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public List<SanPham> search(String keyword) {
    List<SanPham> list = new ArrayList<>();
        try {
            String sql = "select*from SanPham where Tensanpham like ?";
            Connection co = new DBcontext().getConnection();
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setString(1,"%"+keyword+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SanPham sanpham = SanPham.builder().Masanpham(rs.getInt(1))
                                                    .Madanhmuc(rs.getInt(2))
                                                    .Tensanpham(rs.getString(3))
                                                    .Giagoc(rs.getFloat(4))
                                                    .Khuyenmai(rs.getFloat(5))
                                                    .Motangan(rs.getString(7))
                                                    .ImgUrl(rs.getString(6))
                                                    .Motachitiet(rs.getString(8))
                                                    .Soluong(rs.getInt(9)).build();
               
//                
                list.add(sanpham);
            }
        } catch (Exception ex) {
            Logger.getLogger(DanhMucSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public SanPham getMasanpham(int Masanpham) {

        try {
            String sql = "select*from SanPham where Masanpham = ?";
            Connection co = new DBcontext().getConnection();
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setInt(1,Masanpham);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 SanPham sanpham = SanPham.builder().Masanpham(rs.getInt(1))
                                                    .Madanhmuc(rs.getInt(2))
                                                    .Tensanpham(rs.getString(3))
                                                    .Giagoc(rs.getFloat(4))
                                                    .Khuyenmai(rs.getFloat(5))
                                                    .Motangan(rs.getString(7))
                                                    .ImgUrl(rs.getString(6))
                                                    .Motachitiet(rs.getString(8))
                                                    .Soluong(rs.getInt(9)).build();
               
//                
                return sanpham;
            }
        } catch (Exception ex) {
            Logger.getLogger(DanhMucSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

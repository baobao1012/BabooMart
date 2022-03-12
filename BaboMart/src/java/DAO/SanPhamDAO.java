/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBcontext;
import Entity.DanhMucSanPham;
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
                SanPham sanpham = new SanPham();
                sanpham.setGiagoc(rs.getInt(4));
                sanpham.setImgUrl(rs.getString(6));
                sanpham.setKhuyenmai(rs.getFloat(5));
                sanpham.setMadanhmuc(rs.getInt(2));
                sanpham.setMasanpham(rs.getInt(1));
                sanpham.setMotachitiet(rs.getString(8));
                sanpham.setMotangan(rs.getString(7));
                sanpham.setTensanpham(rs.getString(3));
               
//                SanPham sanpham = SanPham.builder().Masanpham(rs.getInt(1))
//                                                    .Madanhmuc(rs.getInt(2))
//                                                    .Tensanpham(rs.getString(3))
//                                                    .Giagoc(rs.getFloat(4))
//                                                    .Khuyenmai(rs.getFloat(5))
//                                                    .Motangan(rs.getString(7))
//                                                    .ImgUrl(rs.getString(6))
//                                                    .Motachitiet(rs.getString(8)).build();
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
            String sql = "select*from SanPham where  SanPham.Madanhmuc = ?";
            Connection co = new DBcontext().getConnection();
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setInt(1, Madanhmuc);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SanPham sanpham = new SanPham();
                sanpham.setGiagoc(rs.getInt(4));
                sanpham.setImgUrl(rs.getString(6));
                sanpham.setKhuyenmai(rs.getFloat(5));
                sanpham.setMadanhmuc(rs.getInt(2));
                sanpham.setMasanpham(rs.getInt(1));
                sanpham.setMotachitiet(rs.getString(8));
                sanpham.setMotangan(rs.getString(7));
                sanpham.setTensanpham(rs.getString(3));
               
//                SanPham sanpham = SanPham.builder().Masanpham(rs.getInt(1))
//                                                    .Madanhmuc(rs.getInt(2))
//                                                    .Tensanpham(rs.getString(3))
//                                                    .Giagoc(rs.getFloat(4))
//                                                    .Khuyenmai(rs.getFloat(5))
//                                                    .Motangan(rs.getString(7))
//                                                    .ImgUrl(rs.getString(6))
//                                                    .Motachitiet(rs.getString(8)).build();
                list.add(sanpham);
            }
        } catch (Exception ex) {
            Logger.getLogger(DanhMucSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}

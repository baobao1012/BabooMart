/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBcontext;
import Entity.DanhMucSanPham;
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
public class DanhMucSanPhamDAO {    //thao tac voi danhmucsanpham

    public List<DanhMucSanPham> getAllDanhMuc() {
        List<DanhMucSanPham> list = new ArrayList<>();
        try {
            String sql = "select*from DanhMucSanPham";
            Connection co = new DBcontext().getConnection();
            PreparedStatement ps = co.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DanhMucSanPham danhmucsanpham = new DanhMucSanPham(rs.getInt(1),rs.getString(2));
                list.add(danhmucsanpham);
            }
        } catch (Exception ex) {
            Logger.getLogger(DanhMucSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static void main(String[] args) {
        DanhMucSanPhamDAO a = new DanhMucSanPhamDAO();
        List<DanhMucSanPham> list = a.getAllDanhMuc();
        for (DanhMucSanPham danhMucSanPham : list) {
            System.out.println(danhMucSanPham);
        }
    }
}

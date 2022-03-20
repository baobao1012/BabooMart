/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBcontext;
import Entity.NguoiDung;
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
public class NguoiDungDAO {

    public NguoiDung login(String taikhoan, String matkhau) {

        try {
            String sql = "select*from Nguoidung where Taikhoan=? and Matkhau=?";
            Connection co = new DBcontext().getConnection();
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setString(1, taikhoan);
            ps.setString(2, matkhau);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
//               
                NguoiDung nguoidung = NguoiDung.builder()
                                                .Manguoidung(rs.getInt(1))
                                                .Taikhoan(rs.getString(2))
                                                .Matkhau(rs.getString(3))
                                                .Hoten(rs.getString(4))
                                                .Gioitinh(rs.getBoolean(5))
                                                .Diachi(rs.getString(6))
                                                .SoDT(rs.getString(8))
                                                .Email(rs.getString(7))
                                                .Phanquyen(rs.getString(9))
                                                .build();
                return nguoidung;
            }
        } catch (Exception ex) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBcontext;
import Entity.GioHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author baobao
 */
public class DonHangChiTietDAO {

    public static class savecart {

        public savecart(int Madonhang, Map<Integer, GioHang> giohang1) {
            try {
                String sql = "INSERT INTO [BabooMart].[dbo].[DonHangChiTiet]\n"
                        + "           ([Madonhang]\n"
                        + "           ,[Tensanpham]\n"
                        + "           ,[Giaban]\n"
                        + "           ,[Soluong])\n"
                        + "     VALUES\n"
                        + "           (?,?,?,?)";
                Connection co = new DBcontext().getConnection();
                PreparedStatement ps = co.prepareStatement(sql);
                ps.setInt(1, Madonhang);
                for (Map.Entry<Integer, GioHang> entry : giohang1.entrySet()) {
                    Integer Masanpham = entry.getKey();
                    GioHang giohang = entry.getValue();
                    ps.setString(2, giohang.getSanpham().getTensanpham());
                    ps.setDouble(3, giohang.getSanpham().getGiagoc());
                    ps.setInt(4, giohang.getSoluong());
                    ps.executeUpdate();
                }

            } catch (Exception ex) {
                Logger.getLogger(GiaoHangDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}



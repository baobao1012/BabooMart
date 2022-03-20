/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBcontext;
import Entity.DonHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author baobao
 */
public class DonHangDAO {

    public int createReturnID(DonHang donhang) {
        try {
            String sql = "INSERT INTO [BabooMart].[dbo].[DonHang]\n"
                    + "           ([Manguoidung]\n"
                    + "           ,[Tongtien]\n"
                    + "           ,[Ghichu]\n"
                    + "           ,[Magiaohang])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?)";
            Connection co = new DBcontext().getConnection();
            PreparedStatement ps = co.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, donhang.getManguoidung());
            ps.setDouble(2, donhang.getTongtien());
            ps.setString(3, donhang.getGhichu());
            ps.setInt(4,donhang.getMagiaohang());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(GiaoHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}

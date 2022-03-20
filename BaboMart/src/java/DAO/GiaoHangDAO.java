/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBcontext;
import Entity.GiaoHang;
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
public class GiaoHangDAO {

    public int createReturnID(GiaoHang giaohang) {
        try {
            String sql = "INSERT INTO [BabooMart].[dbo].[GiaoHang]\n"
                    + "           ([Tenkhachhang]\n"
                    + "           ,[SoDT]\n"
                    + "           ,[Diachi])\n"
                    + "     VALUES\n"
                    + "           (?,?,?)";
            Connection co = new DBcontext().getConnection();
            PreparedStatement ps = co.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, giaohang.getTenkhachhang());
            ps.setString(2, giaohang.getSoDT());
            ps.setString(3, giaohang.getDiachi());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(GiaoHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}

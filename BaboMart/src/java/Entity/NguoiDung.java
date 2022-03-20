/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author baobao
 */
@Builder
@Getter
@Setter
@ToString
public class NguoiDung {
    public static final String ADMIN = "ADMIN";
    public static final String USER = "USER";
    private int Manguoidung;
    private String Taikhoan;
    private String Matkhau;
    private String Hoten;
    private boolean Gioitinh;
    private String Diachi;
    private String Email;
    private String SoDT;
    private String Phanquyen;
}

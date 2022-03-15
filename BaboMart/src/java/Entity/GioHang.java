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
public class GioHang {
    private SanPham sanpham;
    private int Soluong; //so luong san pham tren gio hang

    
    
}

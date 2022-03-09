/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author baobao
 */
public class DanhMucSanPham {
    private int Madanhmuc;
    private String Tendanhmuc;

    public DanhMucSanPham(int Madanhmuc, String Tendanhmuc) {
        this.Madanhmuc = Madanhmuc;
        this.Tendanhmuc = Tendanhmuc;
    }


    public int getMadanhmuc() {
        return Madanhmuc;
    }

    public void setMadanhmuc(int Madanhmuc) {
        this.Madanhmuc = Madanhmuc;
    }

    public String getTendanhmuc() {
        return Tendanhmuc;
    }

    public void setTendanhmuc(String Tendanhmuc) {
        this.Tendanhmuc = Tendanhmuc;
    }
    

    @Override
    public String toString() {
        return "DanhMucSanPham{" + "Madanhmuc=" + Madanhmuc + ", Tendanhmuc=" + Tendanhmuc + '}';
    }

    public DanhMucSanPham() {
    }
    
    
}

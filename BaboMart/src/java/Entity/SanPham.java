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



public class SanPham {
    private int Masanpham;
    private int Madanhmuc;
    private String Tendanhmuc;
    private String Tensanpham;
    private float Giagoc;
    private float Khuyenmai;
    private String ImgUrl;
    private String Motangan;
    private String Motachitiet;
    private int Soluong; //so san pham co trong kho

//    public SanPham() {
//    }
//
//    public int getMasanpham() {
//        return Masanpham;
//    }
//
//    public void setMasanpham(int Masanpham) {
//        this.Masanpham = Masanpham;
//    }
//
//    public int getMadanhmuc() {
//        return Madanhmuc;
//    }
//
//    public void setMadanhmuc(int Madanhmuc) {
//        this.Madanhmuc = Madanhmuc;
//    }
//
//    public String getTendanhmuc() {
//        return Tendanhmuc;
//    }
//
//    public void setTendanhmuc(String Tendanhmuc) {
//        this.Tendanhmuc = Tendanhmuc;
//    }
//
//    public String getTensanpham() {
//        return Tensanpham;
//    }
//
//    public void setTensanpham(String Tensanpham) {
//        this.Tensanpham = Tensanpham;
//    }
//
//    public float getGiagoc() {
//        return Giagoc;
//    }
//
//    public void setGiagoc(float Giagoc) {
//        this.Giagoc = Giagoc;
//    }
//
//    public float getKhuyenmai() {
//        return Khuyenmai;
//    }
//
//    public void setKhuyenmai(float Khuyenmai) {
//        this.Khuyenmai = Khuyenmai;
//    }
//
//    public String getImgUrl() {
//        return ImgUrl;
//    }
//
//    public void setImgUrl(String ImgUrl) {
//        this.ImgUrl = ImgUrl;
//    }
//
//    public String getMotangan() {
//        return Motangan;
//    }
//
//    public void setMotangan(String Motangan) {
//        this.Motangan = Motangan;
//    }
//
//    public String getMotachitiet() {
//        return Motachitiet;
//    }
//
//    public int getSoluong() {
//        return Soluong;
//    }
//
//    public void setSoluong(int Soluong) {
//        this.Soluong = Soluong;
//    }
//
//    public void setMotachitiet(String Motachitiet) {
//        this.Motachitiet = Motachitiet;
//    }
//
//    @Override
//    public String toString() {
//        return Tensanpham;
//    }


}

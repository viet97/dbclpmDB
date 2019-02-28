/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author macos
 */
public class SinhVien {
    public String masv;
    public String hoten;
    public String ngaysinh;
    public String gioitinh;
    public int khoa;
    public String password;
    public int sokydahoc;
    public String chuyennganh;

    @Override
    public String toString() {
        return "SinhVien{" + "masv=" + masv + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", khoa=" + khoa + ", password=" + password + ", sokydahoc=" + sokydahoc + ", chuyennganh=" + chuyennganh + '}';
    }
    
}

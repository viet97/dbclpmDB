/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Diem;
import models.MonHoc;
import models.SinhVien;
import mysql.ConnectionSQL;

/**
 *
 * @author macos
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {    
         System.out.println(login("B15DCCN646","123456").toString());  
    }
    
    public static ArrayList<Diem> getAllMark(String masv) throws SQLException{
       ConnectionSQL conn = new ConnectionSQL();
       ResultSet rs = conn.excuteQuery(String.format("SELECT * FROM Diem WHERE `masv` = '%s'", masv));
       ArrayList<Diem> listDiem = new ArrayList<>();
       while (rs.next()) 
       { 
           Diem diem = new Diem();
           diem.diem10 = Double.parseDouble(rs.getString("diem10"));
           diem.diem4 = Double.parseDouble(rs.getString("diem4"));
           diem.diemchu = rs.getString("diemchu");
           diem.kyhoc = Integer.parseInt(rs.getString("kyhoc"));
           diem.diemthi = Double.parseDouble(rs.getString("diemthi"));
           diem.diemcc = Double.parseDouble(rs.getString("diemcc"));
           diem.diemth = Double.parseDouble(rs.getString("diemth"));
           diem.diembt = Double.parseDouble(rs.getString("diembt"));
           diem.diemkt = Double.parseDouble(rs.getString("diemkt"));
           diem.mamon = Integer.parseInt(rs.getString("mamon"));
           listDiem.add(diem);
           
       }
       return listDiem;
    }
    
    public static ArrayList<Diem> getAllMarkByKy(String masv,int ky) throws SQLException{
       ConnectionSQL conn = new ConnectionSQL();
       ResultSet rs = conn.excuteQuery(String.format("SELECT * FROM Diem WHERE `masv` = '%s' AND `kyhoc` = %d", masv,ky));
       ArrayList<Diem> listDiem = new ArrayList<>();
       while (rs.next()) 
       { 
           Diem diem = new Diem();
           diem.diem10 = Double.parseDouble(rs.getString("diem10"));
           diem.diem4 = Double.parseDouble(rs.getString("diem4"));
           diem.diemchu = rs.getString("diemchu");
           diem.kyhoc = Integer.parseInt(rs.getString("kyhoc"));
           diem.diemthi = Double.parseDouble(rs.getString("diemthi"));
           diem.diemcc = Double.parseDouble(rs.getString("diemcc"));
           diem.diemth = Double.parseDouble(rs.getString("diemth"));
           diem.diembt = Double.parseDouble(rs.getString("diembt"));
           diem.diemkt = Double.parseDouble(rs.getString("diemkt"));
           diem.mamon = Integer.parseInt(rs.getString("mamon"));
           listDiem.add(diem);
           
       }
       return listDiem;
    }
    
     public static Diem getMarkBySubject(String masv,int mamon) throws SQLException{
       ConnectionSQL conn = new ConnectionSQL();
       ResultSet rs = conn.excuteQuery(String.format("SELECT * FROM Diem WHERE `masv` = '%s' AND `mamon` = %d", masv,mamon));
       
       while (rs.next()) 
       { 
           Diem diem = new Diem();
           diem.diem10 = Double.parseDouble(rs.getString("diem10"));
           diem.diem4 = Double.parseDouble(rs.getString("diem4"));
           diem.diemchu = rs.getString("diemchu");
           diem.kyhoc = Integer.parseInt(rs.getString("kyhoc"));
           diem.diemthi = Double.parseDouble(rs.getString("diemthi"));
           diem.diemcc = Double.parseDouble(rs.getString("diemcc"));
           diem.diemth = Double.parseDouble(rs.getString("diemth"));
           diem.diembt = Double.parseDouble(rs.getString("diembt"));
           diem.diemkt = Double.parseDouble(rs.getString("diemkt"));
           diem.mamon = Integer.parseInt(rs.getString("mamon"));
           return diem;
           
       }
       return null;
    }
    
     public static MonHoc getSubjectbyId(int mamon) throws SQLException{
       ConnectionSQL conn = new ConnectionSQL();
       ResultSet rs = conn.excuteQuery(String.format("SELECT * FROM MonHoc WHERE `mamh`=%d",mamon));
      
       while (rs.next()) 
       { 
           MonHoc monhoc = new MonHoc();
           monhoc.mamh = Integer.parseInt(rs.getString("mamh"));
           monhoc.ten = rs.getString("tenmonhoc");
           monhoc.sotc = Integer.parseInt(rs.getString("sotc"));
           monhoc.cc = Integer.parseInt(rs.getString("phantramcc"));
           monhoc.bt = Integer.parseInt(rs.getString("phantrambt"));
           monhoc.th = Integer.parseInt(rs.getString("phantramth"));
           monhoc.kt = Integer.parseInt(rs.getString("phantramkt"));
           monhoc.thi = Integer.parseInt(rs.getString("phantramthi"));
           return monhoc;
           
       }
       return null;
    }
     
    public static SinhVien login(String username,String password) throws SQLException{
       ConnectionSQL conn = new ConnectionSQL();
       ResultSet rs = conn.excuteQuery(String.format("SELECT * FROM SinhVien WHERE `masv` = '%s' AND `password`='%s'", username,password));
       
       while (rs.next()) {
          SinhVien user;
          user = new SinhVien();
          user.masv = rs.getString("masv");
          user.hoten = rs.getString("hoten");
          user.ngaysinh = rs.getString("ngaysinh");
          user.gioitinh = rs.getString("gioitinh");
          user.khoa = Integer.parseInt(rs.getString("khoa"));
          user.password = rs.getString("password");
          user.sokydahoc = Integer.parseInt(rs.getString("sokydahoc"));
          user.chuyennganh = rs.getString("chuyennganh");
          return user;
       }
       return null;
    }
    
}

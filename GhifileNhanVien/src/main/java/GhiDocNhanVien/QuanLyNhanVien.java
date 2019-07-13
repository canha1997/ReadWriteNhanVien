package GhiDocNhanVien;

import model.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class QuanLyNhanVien implements iNhanVien
{
    Scanner scanner=new Scanner(System.in);
    @Override
    public void nhapNhanVien(ArrayList <NhanVien> nhanVienList) {
        String fileName="C:\\lap trinh Java tai lieu\\bai tap ve nha\\NhanVien.txt";
        NhanVien nhanvien=new NhanVien();
        System.out.println("Moi ban nhap ten nhan vien");
        nhanvien.setTen(scanner.nextLine());
        System.out.println("Moi ban nhap Id nhan vien");
        nhanvien.setID(scanner.nextLine());
        System.out.println("Moi ban nhap gioi tinh: (F/M)");
        nhanvien.setGioiTinh(scanner.nextLine());
        System.out.println("Moi ban nhap luong nhan vien");
        nhanvien.setLuong(scanner.nextInt());
        scanner.nextLine();
        nhanVienList.add(nhanvien);

        FileWriter fw = null;
        BufferedWriter bw = null;
        try
        {
           fw=new FileWriter(fileName,true);  ////append: de chi dinh noi dung khong de len file cu
           bw=new BufferedWriter(fw);
           for(NhanVien str:nhanVienList) {
               bw.write("Ten nhan vien la: "+str.getTen()+"\n");
               bw.write("ID cua nhan vien: "+str.getID()+"\n");
               bw.write("Gioi tinh la: "+str.getGioiTinh()+"\n");
               bw.write("Luong cua nhan vien la: "+str.getLuong()+"\n");
           }
            bw.close();
            System.out.println("Hoan thanh");
        }
         catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public void xoaDanhSachNhanVien() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String fileName="C:\\lap trinh Java tai lieu\\bai tap ve nha\\NhanVien.txt";
        try
        {
            fw=new FileWriter(fileName);
            bw=new BufferedWriter(fw);   ////Can nghien cuu lai dung flush khong thanh cong, nen ta da phai tao 1 file
            /// khac de len file cu
            bw.close();

        }
        catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public void hienThiNhanVien() {
        BufferedReader reader;
        try {

            reader=new BufferedReader(new FileReader("C:\\lap trinh Java tai lieu\\bai tap ve nha\\NhanVien.txt"));
            String line=reader.readLine();
            while (line !=null)
            {
                System.out.println(line);
                line=reader.readLine();
            }
            reader.close();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }

    }
    }


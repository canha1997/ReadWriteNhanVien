package GhiDocNhanVien;

import model.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern p= Pattern.compile("(F|M)");
        NhanVien nhanvien=new NhanVien();
        System.out.println("Moi ban nhap ten nhan vien");
        nhanvien.setTen(scanner.nextLine());

        while (true) {
            int flags=0;
            System.out.println("Moi ban nhap Id nhan vien");
            String test=scanner.nextLine();
            for(NhanVien nhanVien : nhanVienList) {
                if(nhanVien.getID().equals(test))
                {
                    flags=1;
                    break;
                }
            }

            if(flags==1)
            {
                System.out.println("ID Nhan vien bi trung, xin hay nhap lai");
                continue;
            }
            else
            {
             nhanvien.setID(test);
             break;
            }
        }
        while (true) {
            System.out.println("Moi ban nhap gioi tinh: (F/M)");
            nhanvien.setGioiTinh(scanner.nextLine());
            Matcher matcher=p.matcher(nhanvien.getGioiTinh());
            if(matcher.find())
            {
                break;
            }
        }
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


               bw.write("nhan vien"+"\n");
               bw.write("Ten nhan vien la: "+nhanvien.getTen()+"\n");
               bw.write("ID cua nhan vien: "+nhanvien.getID()+"\n");
               bw.write("Gioi tinh la: "+nhanvien.getGioiTinh()+"\n");
               bw.write("Luong cua nhan vien la: "+nhanvien.getLuong()+"\n");
               bw.write("end\n");



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

    @Override
    public void chinhSuaNhanVien(ArrayList <NhanVien> nhanVienList) {
        int flags=0;
        System.out.println("Nhap Id nhan vien muon chinh sua:");
        String ID=scanner.nextLine();



    }
}


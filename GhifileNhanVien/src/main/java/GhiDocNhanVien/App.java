package GhiDocNhanVien;

import model.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {

      NhanVienQuanLy();

    }
    public static void NhanVienQuanLy()
    {
        ArrayList NhanVienList=new ArrayList();
        QuanLyNhanVien quanLyNhanVien=new QuanLyNhanVien();

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int flag=0;
            System.out.println("##########Dang QUAN LY NHAN VIEN##########  ");
            System.out.println("Chon (1) de co the nhap vo thong tin cua mot nhan vien:");
            System.out.println("Chon (2) de co the xuat ra toan bo nhan vien trong list");
            System.out.println("Chon (3) de co the xoa nhan vien");
            System.out.println("Chon (4) de thoat");
            int s=sc.nextInt();
            switch (s) {
                case 1:
                    quanLyNhanVien.nhapNhanVien(NhanVienList);
                    break;
                case 2:
                    quanLyNhanVien.hienThiNhanVien();
                    break;
                case 3: quanLyNhanVien.xoaDanhSachNhanVien();
                    break;
                case 4:
                    flag=1;
                    break;
                default:break;
            }
            if(flag==1) break;
        }
    }
}

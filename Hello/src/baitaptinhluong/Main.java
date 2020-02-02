package baitaptinhluong;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        int soNhanVienToanThoiGian, soNhanVienThoiVu;
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;
        ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
         
        System.out.print("so nvttg: ");
        soNhanVienToanThoiGian = scanner.nextInt();
        System.out.println("thong tin");
        for (int i = 0; i < soNhanVienToanThoiGian; i++) {
            System.out.println("nhap thu " + (i + 1) + ": ");
            nhanVien = new NhanVienToanThoiGian();  
            nhanVien.nhapThongTin();
            arrNhanVien.add(nhanVien);
        }
         
        System.out.print("so tv: ");
        soNhanVienThoiVu = scanner.nextInt();
        System.out.println("nhP");
        for (int i = 0; i < soNhanVienThoiVu; i++) {
            System.out.println("NHAP THU " + (i + 1) + ": ");
            nhanVien = new NhanVienThoiVu();  
            nhanVien.nhapThongTin();
            arrNhanVien.add(nhanVien);
        }
         
        System.out.println("THONG TIN");
        for (NhanVien nv : arrNhanVien) {
            nv.tinhLuong();
            System.out.println(nv.toString());
        }
    }
 
}
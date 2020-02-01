package Ds;

import java.util.Scanner;
 
public class KhachSan {
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private Nguoi nguoi;    
    public KhachSan() {
        super();
    }
    public KhachSan(int soNgayTro, String loaiPhong, double giaPhong, Nguoi nguoi) {
        super();
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.nguoi = nguoi;
    }
     
    public Nguoi getNguoi() {
        return nguoi;
    }
    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }
    public void nhapThongTinCanQuanLy() {
        Scanner scanner = new Scanner(System.in);
         
       
        nguoi = new Nguoi();
        nguoi.nhapThongTinKhachTro();
         
        System.out.print("Ngay: ");
        soNgayTro = Integer.parseInt(scanner.nextLine());
        System.out.print("Loai: ");
        loaiPhong = scanner.nextLine();
        System.out.print("Gia: ");
        giaPhong = scanner.nextDouble();
    }
     
    public void hienThiThongTinCanQuanLy() {
        nguoi.hienThiThongTinKhachTro();
        System.out.println("Ngay: " + soNgayTro);
        System.out.println("Loai: " + loaiPhong);
        System.out.println("Gia: " + giaPhong);
    }
    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
}
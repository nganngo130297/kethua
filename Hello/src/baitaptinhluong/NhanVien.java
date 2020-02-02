package baitaptinhluong;
 
import java.util.Scanner;
 
public class NhanVien {
    private String tenNhanVien;
    protected long luongNhanVien;
    Scanner scanner = new Scanner(System.in);
     
    public NhanVien() {
        super();
    }
 
    public NhanVien(String tenNhanVien, long luongNhanVien) {
        super();
        this.tenNhanVien = tenNhanVien;
        this.luongNhanVien = luongNhanVien;
    }
     
    public void nhapThongTin() {
        System.out.print("TEN: ");
        tenNhanVien = scanner.nextLine();
    }
     
 
    public void tinhLuong() {
         
    }
 
    @Override
    public String toString() {
        return "TEN: " + this.tenNhanVien + ", Ln: " + 
            this.luongNhanVien + " VND";
    }
 
}
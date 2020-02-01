package Ds;

import java.util.Date;
import java.util.Scanner;
 
public class Nguoi {
    private String hoTen;
    private String soCMND;
    private String queQuan;
     
    public Nguoi() {
        super();
    }
     
    public Nguoi(String hoTen, String queQuan, String soCMND) {
        super();
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.soCMND = soCMND;
    }
     
    public String getSoCMND() {
        return soCMND;
    }
    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
     
    public void nhapThongTinKhachTro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        hoTen = scanner.nextLine();
        System.out.print("add: ");
        queQuan = scanner.nextLine();
        System.out.print("cm: ");
        soCMND = scanner.nextLine();
    }
     
    public void hienThiThongTinKhachTro() {
        System.out.println("name " + hoTen);
        System.out.println("add:" + queQuan);
        System.out.println("cm: " + soCMND);
    }
}

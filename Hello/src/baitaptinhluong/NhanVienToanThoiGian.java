package baitaptinhluong;
 
public class NhanVienToanThoiGian extends NhanVien {
    private int soNgayLamThem, choose;
    private String loaiNhanVien;
    private static long LUONG_NHAN_VIEN_LA_SEP = 20000000;
    private static long LUONG_NHAN_VIEN_BINH_THUONG = 10000000;
    private static long LUONG_LAM_THEM = 800000;
     
    public NhanVienToanThoiGian() {
        super();
    }
 
    public NhanVienToanThoiGian(int soNgayLamThem, String loaiNhanVien) {
        super();
        this.soNgayLamThem = soNgayLamThem;
        this.loaiNhanVien = loaiNhanVien;
    }
 
    public int getSoNgayLamThem() {
        return soNgayLamThem;
    }
 
    public void setSoNgayLamThem(int soNgayLamThem) {
        this.soNgayLamThem = soNgayLamThem;
    }
 
    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }
 
    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }   
     
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("NGAY: ");
        soNgayLamThem = scanner.nextInt();
        System.out.print("1 2: ");
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                loaiNhanVien = "BT";
                break;
            case 2:
                loaiNhanVien = "S";
                break;
            default:
                System.out.println("S!");
                break;
        }
    }
     
    public void tinhLuong() {
        if (loaiNhanVien.equals("BT")) {
            luongNhanVien = LUONG_NHAN_VIEN_BINH_THUONG + this.soNgayLamThem * LUONG_LAM_THEM;
        } else if (loaiNhanVien.equals("S")) {
            luongNhanVien = LUONG_NHAN_VIEN_LA_SEP + this.soNgayLamThem * LUONG_LAM_THEM;
        }
    }
     
    @Override
    public String toString() {
        return super.toString() + ", L: " + this.loaiNhanVien + 
            ", N: " + this.soNgayLamThem;
    }
}
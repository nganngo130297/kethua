package donggoi;
import java.util.Scanner;
import java.util.ArrayList;
public class KhachSan {
	private String loaiPhong;
	private int soNgayTro;
	private double gia;
	private Nguoi nguoi;

	public KhachSan(){
		super();
	}
	public KhachSan(int soNgayTro, String loaiPhong,double gia, Nguoi nguoi){
		super();
		this.soNgayTro=soNgayTro;
		this.loaiPhong=loaiPhong;
		this.gia=gia;
		this.nguoi=nguoi;
	}
	public Nguoi getNguoi() {
		return nguoi;
	}
	public void setNguoi(Nguoi nguoi) {
		this.nguoi=nguoi;
	}
	
	
	public void nhapkhach() {
		Scanner scanner=new Scanner(System.in);
		nguoi = new Nguoi();
	    nguoi.nhap(); 
		System.out.println("Nhap ngay tro: ");
		soNgayTro=Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap loai phong: ");
		loaiPhong=scanner.nextLine();
		System.out.println("Nhap gia: ");	
		gia=scanner.nextDouble();
		}
	public void xuatkhach() {
		nguoi.xuat();
		System.out.println("So ngay tro la:"+soNgayTro);
		System.out.println("Ten la:"+loaiPhong);
		System.out.print("Gia:"+gia);
	}
	public double tinhTien() {
		double kq=(double)soNgayTro*gia;
		return kq;
	}
}




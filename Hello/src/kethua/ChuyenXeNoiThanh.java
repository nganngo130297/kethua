package kethua;
import java.util.*;
@SuppressWarnings("unused")
public class ChuyenXeNoiThanh extends ChuyeXe{
	int soTuyen;
	private int soKm;
	
	public ChuyenXeNoiThanh() {
		super();
	}
	public ChuyenXeNoiThanh(int soTuyen, int soKm) {
		super();
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public int getSoKm() {
		return soKm;
	}
	public void setSoKm(int soKm) {
		this.soKm = soKm;
	}
	public void nhapChuyenXeNoiThanh() {
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		super.nhapChuyenXe();
		System.out.println("Nhap SO TUYEN: ");
		soTuyen=scanner.nextInt();
		System.out.println("nhap SO KM: ");
		soKm=scanner.nextInt();	
	}
	public void xuatChuyenXeNoiThanh() {
		super.xuatChuyenXe();
		System.out.println("SO TUYEN: "+soTuyen+"\tSO KM: "+soKm);
	}
	
	
	
	
}

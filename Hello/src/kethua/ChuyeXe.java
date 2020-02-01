package kethua;
import java.util.*;
@SuppressWarnings("unused")
public class ChuyeXe {
	private String maSo;
	private String hoTenTaiXe;
	private int soXe;
	private int doanhThu;
	
	public ChuyeXe() {
		
	}
	public ChuyeXe(String maSo, String hoTenTaiXe, int soXe, int doanhThu) {
		this.maSo = maSo;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}
	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public int getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(int doanhThu) {
		this.doanhThu = doanhThu;
	}
	public void nhapChuyenXe() {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner (System.in);
		System.out.println(" Nhap MA SO CHUYEN: ");
		maSo=scanner.nextLine();
		System.out.println("nhap HO TEN TAI XE: ");
		hoTenTaiXe=scanner.nextLine();
		System.out.println("nhap SO XE: ");
		soXe=scanner.nextInt();
		System.out.println("nhap DOANH THU: ");
		doanhThu=scanner.nextInt();
	}
	public void xuatChuyenXe() {
		System.out.println( "MA SO:"+maSo+"\tTAI XE:"+hoTenTaiXe+"\tSO XE: "+soXe+"\tDOANH THU:"+doanhThu);
	}
}

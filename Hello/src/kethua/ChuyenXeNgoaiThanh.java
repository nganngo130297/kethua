package kethua;
import java.util.*;
@SuppressWarnings("unused")
public class ChuyenXeNgoaiThanh extends ChuyeXe{
	private String noiDen;
	private int soNgayDiDuoc;
	
	public ChuyenXeNgoaiThanh() {
		super();
	}
	
	public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc) {
		super();
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	public void nhapChuyenXeNgoaiThanh() {
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		super.nhapChuyenXe();
		System.out.println("Nhap NOI DEN: ");
		noiDen=scanner.nextLine();
		System.out.println("nhap SO NGAY DI DUOC: ");
		soNgayDiDuoc=scanner.nextInt();	
	}
	public void xuatChuyenXeNgoaiThanh() {
		super.xuatChuyenXe();
		System.out.println("NOI DEN: "+noiDen+"\tSO NGAY DI DUOC: "+soNgayDiDuoc);
	}
	
	
	
	
}


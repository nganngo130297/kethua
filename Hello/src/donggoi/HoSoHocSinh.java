package donggoi;
import java.util.Scanner;

public class HoSoHocSinh {
	private String lop;
	private Person per;
	
	
	public HoSoHocSinh() {
		super();
	}
	public HoSoHocSinh(String l,Person p) {
		super();
		this.lop=l;
		this.per=p;
		
	}
	public void nhapPer() {
		Scanner scanner=new Scanner(System.in);
		per=new Person();
		per.nhapNguoi();
		System.out.println("Class: ");
		lop=scanner.nextLine();
		}
	public void xuatPer() {
		per.xuatNguoi();
		System.out.println("Name: "+lop);
	}
}

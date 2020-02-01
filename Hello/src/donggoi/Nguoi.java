package donggoi;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
public class Nguoi {
	private String hoTen,que,cm;
	public Nguoi(){
		super();
	}
	public Nguoi(String hoTen,String que,String cm){
		super();
		this.hoTen=hoTen;
		this.que=que;
		this.cm=cm;
		
	}
	public String getCM() {
		return cm;
	}
	public void setCM(String cm) {
		this.cm=cm;
	}
	public void nhap() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap ten: ");
		hoTen=scanner.nextLine();
		System.out.println("Nhap que: ");
		que=scanner.nextLine();
		System.out.println("Nhap cm: ");	
		cm=scanner.nextLine();
		}
	public void xuat() {
		System.out.println("Ten la:"+hoTen);
		System.out.println("Que:"+que);
		System.out.println("CMND:"+cm);
	}
}



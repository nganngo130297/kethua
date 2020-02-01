package so;
import java.util.Scanner;

public class SoDiem {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float toan,hoa;
		System.out.println("nhap diem toan: ");
		toan=scanner.nextFloat();
		System.out.println("nhap diem hoa: ");
		hoa=scanner.nextFloat();
		if(toan>hoa)
			System.out.print("diem toan lom hon");
		else
			System.out.print("diem hoa lom hon");
	}
}

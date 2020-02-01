package so;
import java.util.Scanner;

public class nhuan {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int nam;
	System.out.print("Nhap vao mot nam:");
	nam=scanner.nextInt();
	if(nam%100==0) {
		if(nam%400==0) {
			System.out.print("Nhuan");
		}
		else {
			System.out.print("khong");
		}
	}
	else {
		if(nam%4==0){
			System.out.print("Nhuan");
		}
		else System.out.print("khong");
	}
	
	
	}	
}

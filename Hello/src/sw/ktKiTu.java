package sw;
import java.util.Scanner;

public class ktKiTu {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch;
		System.out.println("Nhap vao mot ky tu:");
		ch=scanner.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'o':
		case 'e':
		case 'u':
		case 'i':
			System.out.println("Nguyen am");break;
		default:
			System.out.println("Khong nguyen am");
		}
		
	}
}

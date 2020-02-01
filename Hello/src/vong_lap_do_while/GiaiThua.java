package vong_lap_do_while;
import java.util.Scanner;
public class GiaiThua {

	public static void main(String[] args) {
		int n,kq=1,dem=0;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("Nhap n>=0: ");
			n=scanner.nextInt();
		}while(n<0);
		do {
			kq*=n;
			n--;
		}while(n>=1);
		System.out.println(kq);
	}

}

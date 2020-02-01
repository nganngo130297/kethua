package vong_lap_for;
import java.util.Scanner;
public class TinhTrungBinhCong {

	public static void main(String[] args) {
		int n,dem=0,so=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("nhap n:");
		n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Nhap so thu"+(i+1));
			so=scanner.nextInt();
			dem+=so;
		}
		float tb=(float)dem/n;
		System.out.println(tb);
		

	}

}

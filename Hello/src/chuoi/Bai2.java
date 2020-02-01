package chuoi;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String chuoi1="Alarm!";
		int n;
		
		do {
			System.out.println("Nhap so nguyen: ");
			n=scanner.nextInt();
		}while(n<1);
		for(int i=0;i<n;i++) {
			System.out.println(chuoi1);
		}
			
	}
}

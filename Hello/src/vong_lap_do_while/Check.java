package vong_lap_do_while;
import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
	int u=123,p=456,us,pa;
	Scanner scanner=new Scanner(System.in);
	do {
		System.out.println("Nhap username: ");
		us=scanner.nextInt();
		System.out.println("Nhap pass: ");
		pa=scanner.nextInt();
	}while(u!=us||pa!=p);
	System.out.println("Welcome"+u);

	}

}

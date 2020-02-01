package vong_lap_do_while;
import java.util.Scanner;
public class Lap {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		float z,tong=0;
		//System.out.println("nhap n");
		//n=scanner.nextInt();
		do {
			System.out.println("Nhap:");
			
			z=scanner.nextFloat();
			tong+=z;
		}while(tong<100);
		System.out.println(tong);
	}

}

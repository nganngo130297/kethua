package vong_lap_do_while;
import java.util.Scanner;
public class ChonDapAnDung {

	public static void main(String[] args) {
		char a;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("Chon mot dap an dung: ");
			System.out.println("Cach nao cho nguoi dung gan gia tri sau?");
			System.out.println("a. int number = 123 ");
			System.out.println("b. int number = \"123\" ");
			System.out.println("c. int number = '1' ");
			System.out.println("d. boolean number = 1");
			a=scanner.next().charAt(0);
			if(a !='a') System.out.println("SAI");
		}while(a !='a');
		System.out.println("DUNG");

	}

}

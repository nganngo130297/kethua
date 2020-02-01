package so;
import java.util.Scanner;
public class soSanh {
	public static void main( String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println("Nhap vao mot so: ");
		  a= scanner.nextInt();
		  if(a>5)
			  System.out.print(a+"> 5");
		  else System.out.print(a+"< 5");
	}

}

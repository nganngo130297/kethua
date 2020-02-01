package sw;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int so;
	System.out.println("Nhap so: ");
	so=scanner.nextInt();
	switch(so) {
		case 2: 
			System.out.println("Thu hai: ");
			break;
		case 3: 
			System.out.println("Thu ba: ");
			break;
		case 4: 
			System.out.println("Thu tu: ");
			break;
		case 5: 
			System.out.println("Thu nam: ");
			break;
		case 6: 
			System.out.println("Thu sau: ");
			break;
		case 7: 
			System.out.println("Thu bay: ");
			break;
		case 8: 
			System.out.println("Chu nhat: ");
			break;
		default : 
			System.out.println("dell co");
			
	}
}
}

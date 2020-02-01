package sw;
import java.util.Scanner;
public class sinh {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int nam;
		String n1="",n2="";
		System.out.println("Nhap vao so nam: ");
		nam=scanner.nextInt();
		int Can=nam%10;
		switch(Can) {
			case 0: n1="canh" ;break;
			case 1: n1="tan" ;break;
			case 2: n1="nham" ;break;
			case 3: n1="quy" ;break;
			case 4: n1="giap" ;break;
			case 5: n1="at" ;break;
			case 6: n1="binh" ;break;
			case 7: n1="dinh" ;break;
			case 8: n1="mau" ;break;
			case 9: n1="ky" ;break;
		}
		int Chi=nam%12;
		switch(Chi) {
			case 0: n2="than" ;break;
			case 1: n2="dau" ;break;
			case 2: n2="tuc" ;break;
			case 3: n2="hoi" ;break;
			case 4: n2="ty" ;break;
			case 5: n2="suu" ;break;
			case 6: n2="dan" ;break;
			case 7: n2="meo" ;break;
			case 8: n2="thinh" ;break;
			case 9: n2="ty" ;break;
			case 10: n2="ngo" ;break;
			case 11: n2="mui" ;break;
		}
		System.out.println(n1+" "+n2);
	}
}


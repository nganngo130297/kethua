package chuoi;
import java.util.Scanner;
public class SoSanh {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String chuoi1;int dem=0;
		System.out.println("Nhap vao mot chuoi1");
		chuoi1=scanner.nextLine();
		for(int i=0;i<chuoi1.length();i++) {
			char c=chuoi1.charAt(i);
			if(c=='a') {
				dem+=1;
			}
		}
		System.out.print(dem);
}
}

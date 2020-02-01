package chuoi;
import java.util.Scanner;
import java.util.*;
public class In {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String chuoi1,chuoi2;int dem=0;
		char a;
		System.out.println("Nhap chuoi tu ban phim:");
		chuoi1=scanner.nextLine();
		chuoi2=new StringBuilder(chuoi1).reverse().toString();
		chuoi2.toString();
		
		for(int i=0;i<chuoi1.length();i++) {
			if(chuoi1.charAt(i)!=chuoi2.charAt(i)) {
				dem+=1;
				
				
			}
			
		}if(dem!=0) System.out.print("no");
		else System.out.print("yes" );
		}
		

	//}

}


package mang;
import java.util.Scanner;
public class DoiXung {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n,k,dem=0,kt=0;
		do {
			System.out.println("nhap so phan tu:");
			n=scanner.nextInt();
		}while(n<=0);
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap phan tu thu "+(i+1));
			a[i]=scanner.nextInt();
			
		}
		System.out.println("Nhap so nguyen k:");
		k=scanner.nextInt();
		for(int i=0;i<n;i++) {
			dem+=1;
			if(a[i]==k) {
				kt+=1;
				System.out.println("Co ton tai so=k tai vi tri"+(dem-1));
				break;
			}
//			else {
//				
//
//			}
			
		} if(kt==0)System.out.println("KHONG TON TAI");
		
	}

}

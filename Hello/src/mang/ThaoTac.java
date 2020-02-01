package mang;
import java.util.Scanner;
public class ThaoTac {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n,tong=0,min,max;
		System.out.println("Nhap n: ");
		n=scanner.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap phan tu thu nhat: ");
			a[i]=scanner.nextInt();
			tong+=a[i];
		}
		min=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]<min) min=a[i];
		}
		max=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]>max) max=a[i];
		}
		System.out.println("SO LON NHAT: "+max);
		System.out.println("SO NHO NHAT: "+min);
		System.out.println("TONG: "+tong);
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n-1;j++) {
				if(a[j]>a[i]) {
					int tam=a[j];
					a[j]=a[i];
					a[i]=tam;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print("\t"+a[i]);
		}
	}

}

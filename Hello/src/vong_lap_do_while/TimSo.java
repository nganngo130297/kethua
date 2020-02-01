package vong_lap_do_while;
import java.util.Scanner;
public class TimSo {
	public static void main(String[] args) {
		int n,m=0,dem=0;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("Nhap n>=0: ");
			n=scanner.nextInt();
		}while(n<0);
	while(m<n) {
		dem+=1;
		m+=dem;
		}
	if(m>=n) {
			dem-=1;
		System.out.println(dem);
}
}
}

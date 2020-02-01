package so;
import java.util.Scanner;
public class NhomTuoi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String ten;
		int tuoi;
		System.out.println("Nhap ten:");
		ten=scanner.nextLine();
		System.out.println("Nhap tuoi: ");
		tuoi=scanner.nextInt();
		if(tuoi<16)
			System.out.print("Ban"+ten+"o tuoi vi thanh nien");
		else {
			if(tuoi>=16 && tuoi<=18)
				System.out.print("Ban"+ten+"o tuoi truong thanh");
			else System.out.print("Ban"+ten+"da gia");
		}
	}

}

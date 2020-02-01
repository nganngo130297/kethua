package donggoi;
import java.util.Scanner;
import java.util.ArrayList;
public class qLy {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		HoSoHocSinh hoso;
		System.out.println("Nhap n: ");
		n=scanner.nextInt();
		ArrayList<HoSoHocSinh> mang= new ArrayList<>();
		for(int i=0;i<mang.size();i++) {
		hoso=new HoSoHocSinh();
		hoso.nhapPer();
		mang.add(hoso);
		}
		for(int i=0;i<mang.size();i++) {
			mang.get(i).xuatPer();
		}
		
		

	}

}

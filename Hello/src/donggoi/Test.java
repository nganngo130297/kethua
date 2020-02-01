package donggoi;

import java.util.Scanner;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
		int n;
		KhachSan khachsan;
		System.out.println("nhap n: ");
		n = Integer.parseInt(scanner.nextLine());
		ArrayList <KhachSan> k= new ArrayList<>();
		for(int i=0;i<n;i++) {
			khachsan=new KhachSan();
			System.out.println("Nhap thong tin khach hang");
			khachsan.nhapkhach();
			k.add(khachsan);
		}
			
		for (int i = 0; i < k.size(); i++) {
            k.get(i).xuatkhach();
            
            
        }
//		System.out.println("Nhap so cmnd: ");
//		String so= scanner.nextLine();
//		
//		for (int i = 0; i < k.size(); i++) {
//			if(k.get(i).getNguoi().getCM().equalsIgnoreCase(so))
//            System.out.println("So tien: "+k.get(i).tinhTien());
//            
//            
//        }
		System.out.println("aaaaaaa");
        String tim = scanner.nextLine();
       for (int i = 0; i < k.size(); i++) {
           if (k.get(i).getNguoi().getCM().equalsIgnoreCase(tim)) {
                System.out.println("S = " + k.get(i).tinhTien());
            }
        }
		
		
		

	}

}

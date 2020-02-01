package Ds;



import java.util.ArrayList;
import java.util.Scanner;
 
public class Test {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n; 
        KhachSan khachSan;
         
       
        ArrayList<KhachSan> arrKhachSan = new ArrayList<>();
         
        System.out.println("n: ");
        n = Integer.parseInt(scanner.nextLine());
         
        for (int i = 0; i < n; i++) {
            khachSan = new KhachSan();
           
            khachSan.nhapThongTinCanQuanLy();
            arrKhachSan.add(khachSan);
        }
         

        for (int i = 0; i < arrKhachSan.size(); i++) {
            System.out.println("\nthong tin khach");
            arrKhachSan.get(i).hienThiThongTinCanQuanLy();
        }
         

//        System.out.println("\nnhap CMND");
//        String tim = scanner.nextLine();
//        for (int i = 0; i < arrKhachSan.size(); i++) {
//            if (arrKhachSan.get(i).getNguoi().getSoCMND().equalsIgnoreCase(tim)) {
//                System.out.println("Money = " + arrKhachSan.get(i).tinhTien());
//            }
//        }
    }
 
}


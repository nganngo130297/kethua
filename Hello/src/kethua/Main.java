package kethua;
import java.util.*;
@SuppressWarnings("unused")

public class Main {
	public static void main(String[] args) {
		int n,m;
		int tong1=0,tong2=0;
		char chon2,chon3,chon4;
		String chon;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Nhap so chuyen xe noi thanh: ");
		n=scanner.nextInt();
		System.out.println(" Nhap so chuyen xe ngoai thanh: ");
		m=scanner.nextInt();
		List<ChuyenXeNoiThanh> noi= new ArrayList<>();
		List<ChuyenXeNgoaiThanh> ngoai= new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println(" nhap xe NOI THANH thu "+(i+1)+":");
			ChuyenXeNoiThanh chuyennoi=new ChuyenXeNoiThanh();
			chuyennoi.nhapChuyenXeNoiThanh();
			tong1+=chuyennoi.getDoanhThu();
			noi.add(chuyennoi);
			}
		for(int i=0;i<m;i++) {
			System.out.println(" nhap xe NGOAI THANH thu "+(i+1)+":");
			ChuyenXeNgoaiThanh chuyenngoai=new ChuyenXeNgoaiThanh();
			chuyenngoai.nhapChuyenXeNgoaiThanh();
			tong2+=chuyenngoai.getDoanhThu();
			ngoai.add(chuyenngoai);
			}
		System.out.println("Ban muon tim kiem danh sach noi thanh hay ngoai thanh ???");
		System.out.println("A.CHUYEN XE NOI THANH ");
		System.out.println("B.CHUYEN XE NGOAI THANH ");
		chon=scanner.nextLine(); 
		do {
			System.out.println("Nhap A hoac B");
			chon2=scanner.next().charAt(0);
		}while(!(Character.toString(chon2).equals("A")||Character.toString(chon2).equals("B")));
		switch(chon2) {
			case 'A': 
				System.out.println("Ban da chon chuyen xe noi thanh");
				System.out.println("Tong doanh thu: "+tong1);
				for(int i=0;i<noi.size();i++) {
					System.out.println("chuyen xe thu "+(i+1));
					noi.get(i).xuatChuyenXeNoiThanh();
				}
				System.out.println("------------------------------------------");
				System.out.println("Ban muon sap xep theo tieu chi nao?");
				System.out.println("A. So tuyen");
				System.out.println("B. Doanh thu");
				chon=scanner.nextLine(); 
				do {
					System.out.println("Nhap A hoac B");
					chon3=scanner.next().charAt(0);
				}while(!(Character.toString(chon3).equals("A")||Character.toString(chon3).equals("B")));
				if(Character.toString(chon3).equals("A")==true) {
					Collections.sort(noi, new NameComparator());
					for (ChuyenXeNoiThanh st : noi) {
						System.out.println("So tuyen: "+st.getSoTuyen() + "\tSo km: "+st.getSoKm() 
						+ "\tMA SO: "+st.getMaSo()+"\ttai xe: "+st.getHoTenTaiXe()+"\tdoanh thu: "+st.getDoanhThu());
			
					}
				}
				else {
					Collections.sort(noi, new DoanhThu());
					for (ChuyenXeNoiThanh st : noi) {
						System.out.println("doanh thu: "+st.getDoanhThu()+ "\tSo km: "+st.getSoKm() 
						+ "\tMA SO: "+st.getMaSo()+"\ttai xe: "+st.getHoTenTaiXe()+"\tSo tuyen: "+st.getSoTuyen() );
			
					}
				}
				String tim3=scanner.nextLine();
				System.out.println("Nhap MA SO CHUYEN XE ban muon tim kiem: ");
				String tim=scanner.nextLine();
				for (int i=0;i<noi.size();i++) {
					if(tim.equalsIgnoreCase(noi.get(i).getMaSo())) {
						System.out.println("Ket qua la: ");
						noi.get(i).xuatChuyenXeNoiThanh();
					}
				}
				    
					
				break;
			case 'B':
				System.out.println("Ban da chon chuyen xe ngoai thanh");
				System.out.println("Tong doanh thu: "+tong2);
				for(int i=0;i<ngoai.size();i++) {
					System.out.println("chuyen xe thu "+(i+1));
					ngoai.get(i).xuatChuyenXeNgoaiThanh();
				}
				System.out.println("------------------------------------------");
				System.out.println("Ban muon sap xep theo tieu chi nao?");
				System.out.println("A. So ngay di duoc");
				System.out.println("B. Noi den");
				chon=scanner.nextLine(); 
				do {
					System.out.println("Nhap A hoac B");
					chon4=scanner.next().charAt(0);
				}while(!(Character.toString(chon4).equals("A")||Character.toString(chon4).equals("B")));
				if(Character.toString(chon4).equals("A")==true) {
					Collections.sort(ngoai, new NameComparator2());
					for (ChuyenXeNgoaiThanh st : ngoai) {
						System.out.println("So ngay di duoc"+st.getSoNgayDiDuoc()+"\tNoi den: "+st.getNoiDen()
						+ "\tMA SO: "+st.getMaSo()+"\ttai xe: "+st.getHoTenTaiXe()+"\tdoanh thu: "+st.getDoanhThu());
			
					}
				}
				else {
					Collections.sort(ngoai, new NoiDen());
					for (ChuyenXeNgoaiThanh st : ngoai) {
						System.out.println("\tNoi den: "+st.getNoiDen()+"\tSo ngay di duoc"+st.getSoNgayDiDuoc()
						+ "\tMA SO: "+st.getMaSo()+"\ttai xe: "+st.getHoTenTaiXe()+"\tdoanh thu: "+st.getDoanhThu());
			
					}
				}
				String tim5=scanner.nextLine();
				System.out.println("Nhap MA SO CHUYEN XE ban muon tim kiem: ");
				String tim6=scanner.nextLine();
				for (int i=0;i<ngoai.size();i++) {
					if(tim6.equalsIgnoreCase(ngoai.get(i).getMaSo())) {
						System.out.println("Ket qua la: ");
						ngoai.get(i).xuatChuyenXeNgoaiThanh();
					}
				}
				break;
		}
		
		
		
		
	}

}

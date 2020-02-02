package vehinh;
import java.util.*;
public class RightTriangle extends Shape{
	private int canhVuong;

	public RightTriangle() {
		super();
	}
	public RightTriangle(int canhVuong) {
		super();
		if(canhVuong<1||canhVuong>20) {
			System.out.println("Nhap lai");
		}
		this.canhVuong = canhVuong;
	}
	public int getCanhVuong() {
		return canhVuong;
	}
	public void setCanhVuong(int canhVuong) {
		
		this.canhVuong = canhVuong;
	}
	public void draw() {
		for(int i=0;i<canhVuong;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}System.out.print("\n");
		}
	}

	
	
}

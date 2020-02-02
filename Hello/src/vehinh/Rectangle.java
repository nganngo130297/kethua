package vehinh;
import java.util.*;
@SuppressWarnings("unused")
public class Rectangle extends Shape{
	private int dai,rong;

	public Rectangle() {
		super();
	}
	public Rectangle(int dai, int rong) {
		super();
		if ((dai < 1) || (dai > 15)) {
            System.out.println("dai tu 1 den 15");
            return;
        }
         
        if (dai < rong) {
            System.out.println("dai lon hon rong");
            return;
        }
		this.dai = dai;
		this.rong = rong;
	}
	public int getDai() {
		return dai;
	}
	public void setDai(int dai) {
		this.dai = dai;
	}
	public int getRong() {
		return rong;
	}
	public void setRong(int rong) {
		 if ((rong) < 1 || (rong > 15)) {
	            System.out.println("rong=>1 va <=15");
	        }
		this.rong = rong;
	}
	public void draw() {
		for(int i=0;i<rong;i++) {
			if(i==0||i==(rong-1)) {
				for(int j=0;j<dai;j++) {
					System.out.print("*");
				}
				System.out.print("\n\n");
			}
			else {
				for(int k=0;k<dai;k++) {
					if(k==0|| k==(dai-1)) {
						System.out.print("*");
					}
					else System.out.print(" ");
			
				}System.out.print("\n\n");
			}
			
			}
		
	}

	
	
	
}

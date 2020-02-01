package toan_tu;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Tinh {
	public static final float PI = 3.14f;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#.##");
		System.out.println("Nhap vao ban kinh");
		float r=scanner.nextFloat();
		float theTich=(float)4/3*PI*r*r*r;
		float dienTich=4*PI*r*r;
		System.out.print("The tich la: "+f.format(theTich));
		System.out.print("Be mat la: "+f.format(dienTich));
	}

}

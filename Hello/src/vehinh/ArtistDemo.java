package vehinh;
import java.util.*;
@SuppressWarnings("unused")
public class ArtistDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap dai: ");
		int chieuDai = scanner.nextInt();
		System.out.println("Nhap rong: ");
		int chieuRong = scanner.nextInt();
		Rectangle n=new Rectangle(chieuDai,chieuRong);
		n.draw();
		System.out.println("Nhap canh vuong: ");
		int canh = scanner.nextInt();
		RightTriangle m=new RightTriangle(canh);
		m.draw();
		
		System.out.println("-----");
		Shape shape = new Rectangle(8, 4);
		Artist artist = new Artist();
        artist.drawShape(shape);
         
        System.out.println("\ncanh vuong 20");
        shape = new RightTriangle(20);  
        artist = new Artist();
        artist.drawShape(shape);

	}

}

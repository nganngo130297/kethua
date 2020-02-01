package chuoi;
import java.util.Scanner;
public class a {
	Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Đây là phương thức main có đối số truyền vào là 1 chuỗi các ký tự.");
    }
 
    public static void main(String args) {
        System.out.println("Đây là phương thức main có đối số truyền vào là 1 chuỗi ký tự.");
    }
     
    public static void main() {
        System.out.println("Đây là phương thức main không có đối số.");
    }
}

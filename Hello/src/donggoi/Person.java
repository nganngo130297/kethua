package donggoi;
import java.util.Scanner;
public class Person {
	private String name;
	private String sex;
	private String address;
	
	public Person() {
		
	}
	public Person(String n, String s, String a) {
		this.name=n;
		this.sex=s;
		this.address=a;
	}
	public void nhapNguoi() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Name: ");
		name=scanner.nextLine();
		System.out.println("Sex: ");
		sex=scanner.nextLine();
		System.out.println("Address: ");
		address=scanner.nextLine();
		}
	public void xuatNguoi() {
		System.out.println("Name: "+name);
		System.out.println("Sex: "+sex);
		System.out.println("Address: "+address);
	}
	
}

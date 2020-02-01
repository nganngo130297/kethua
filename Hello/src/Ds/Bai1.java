package Ds;
import java.util.Scanner;
import java.util.ListIterator;
import java.util.List;
import java.util.LinkedList;
public class Bai1 {
	public static void main(String[] args) {
	    String colors[] = {"black", "yellow", "green", "blue", "violet", "silver"};
	    String colors2[] = {"gold", "white", "brown", "blue", "gray", "silver"};
	         
	    // khai báo 2 List có Class triển khai là LinkedList
	    List<String> list = new LinkedList<>();
	    List<String> list2 = new LinkedList<>();
	         
	    // thêm các phần tử có trong 2 mảng
	    // vào trong list và list2
	    for (int count = 0; count < colors.length; count++) {
	        list.add(colors[count]);
	        list2.add(colors2[count]);
	    }
	         
	    // thêm các phần tử của list2 vào trong list
	    // và list2 trở về null (không có phần tử nào)
	    list.addAll(list2);
	    list2 = null;
	         
	    // hiển thị các phần tử có trong list
	    System.out.println("Phan tu trong list: ");
	    for (int count = 0; count < list.size(); count++) {
	        System.out.print(list.get(count) + "\t");
	    }
	         
	    // chuyển các phần tử trong list thành chữ hoa
	    ListIterator<String> listIterator = list.listIterator();
	    while (listIterator.hasNext()) {
	        String str = listIterator.next();
	        listIterator.set(str.toUpperCase());
	    }
	    System.out.println("\nphan tu list sau chuyen doi: ");
	    for (int count = 0; count < list.size(); count++) {
	        System.out.print(list.get(count) + "\t");
	    }
	         
	    // xóa phần tử trong phạm vi 4 đến 6 trong list
	    // sử dụng phương thức clear()
	    list.subList(4, 7).clear();
	    System.out.println("\nPhan tu trong list sau khi xoa ");
	    for (int count = 0; count < list.size(); count++) {
	        System.out.print(list.get(count) + "\t");
	    }
	         
	    // đảo list sử dụng ListIterator
	    // listIterator này sẽ trỏ tới phần tử cuối cùng trong list
	    listIterator = list.listIterator(list.size());
	    System.out.println("\nlist Sau dao nguoc: ");
	    while (listIterator.hasPrevious()) {
	        System.out.print(listIterator.previous() + "\t");
	    }
	}
}

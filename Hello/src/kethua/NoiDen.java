package kethua;
import java.util.*;
public class NoiDen implements Comparator<ChuyenXeNgoaiThanh> {
	public int compare(ChuyenXeNgoaiThanh s1, ChuyenXeNgoaiThanh s2) {
		return s1.getNoiDen().compareTo(s2.getNoiDen());
	}
}
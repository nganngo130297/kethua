package kethua;
import java.util.*;

public class NameComparator2 implements Comparator<ChuyenXeNgoaiThanh> {
	public int compare(ChuyenXeNgoaiThanh s1, ChuyenXeNgoaiThanh s2) {
			if (s1.getSoNgayDiDuoc() == s2.getSoNgayDiDuoc())
				return 0;
			else if (s1.getSoNgayDiDuoc() > s2.getSoNgayDiDuoc())
				return 1;
			else
				return -1;
}

}

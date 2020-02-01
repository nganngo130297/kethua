package kethua;
import java.util.*;

public class DoanhThu implements Comparator<ChuyenXeNoiThanh> {
	public int compare(ChuyenXeNoiThanh s1, ChuyenXeNoiThanh s2) {
			if (s1.getDoanhThu() == s2.getDoanhThu())
				return 0;
			else if (s1.getDoanhThu() > s2.getDoanhThu())
				return 1;
			else
				return -1;
}

}
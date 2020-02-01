package kethua;
import java.util.*;

public class NameComparator implements Comparator<ChuyenXeNoiThanh> {
	public int compare(ChuyenXeNoiThanh s1, ChuyenXeNoiThanh s2) {
			if (s1.getSoTuyen() == s2.getSoTuyen())
				return 0;
			else if (s1.getSoTuyen() > s2.getSoTuyen())
				return 1;
			else
				return -1;
}

}

package queue;

import java.util.Comparator;

public class CompareSt implements Comparator<OctBatch> {

	@Override
	public int compare(OctBatch st1, OctBatch st2) {
		if(st1.result>st2.result) {
			return -1;
		}
		return 1;
	}

}

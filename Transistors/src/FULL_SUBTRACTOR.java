
public class FULL_SUBTRACTOR {
	HALF_SUBTRACTOR first;
	HALF_SUBTRACTOR second;
	OR_GATE or;
	
	public FULL_SUBTRACTOR(boolean borrow, boolean input1, boolean input2) {
		first = new HALF_SUBTRACTOR(input1, input2);
		second = new HALF_SUBTRACTOR(first.getDifference(), borrow);
		or = new OR_GATE();
		or.A.input = first.getBorrow();
		or.B.input = second.getBorrow();
	}
	
	public boolean getDifference() {
		return second.getDifference();
	}
	
	public boolean getBorrow() {
		return or.GetOutput();
	}
	
}

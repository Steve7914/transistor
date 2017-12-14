
public class HALF_SUBTRACTOR {
	XOR_GATE xor;
	AND_GATE and;
	Not_Gate not;
	
	public HALF_SUBTRACTOR(boolean input1, boolean input2) {
		and = new AND_GATE();
		xor = new XOR_GATE();
		not = new Not_Gate();
		not.input = input1;
		and.A.input = not.GetOutput();
		and.B.input = input2;
		xor.A.input = input1;
		xor.B.input = input2;
	}
	
	public boolean getDifference() {
		return xor.GetOutput();
	}
	
	public boolean getBorrow() {
		return and.GetOutput();
	}
}

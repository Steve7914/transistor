
public class HALF_ADDER {
	XOR_GATE XOR;
	AND_GATE AND;
	
	
	public HALF_ADDER(boolean input1, boolean input2) {
		XOR = new XOR_GATE();
		AND = new AND_GATE();
		AND.B.input = input1;
		AND.A.input = input2;
		XOR.A.input = input1;
		XOR.B.input = input2;
	}
	
	public boolean getSum() {
		return XOR.GetOutput();
	}
	
	public boolean getCarry() {
		return AND.GetOutput();
	}
}

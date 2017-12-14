
public class FULL_ADDER {
	HALF_ADDER first;
	HALF_ADDER second;
	OR_GATE or;
	
	public FULL_ADDER(boolean input1, boolean input2, boolean carry) {
		first = new HALF_ADDER(input1, input2);
		second = new HALF_ADDER(first.getSum(), carry);
		or = new OR_GATE();
		or.A.input = first.getCarry();
		or.B.input = second.getCarry();
	}
	
	public boolean getSum() {
		return second.getSum();
	}
	
	public boolean getCarry() {
		return or.GetOutput();
	}
	
}

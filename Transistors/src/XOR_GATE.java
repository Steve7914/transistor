public class XOR_GATE {
	Transistor A = new Transistor();
	Transistor B = new Transistor();
	AND_GATE first = new AND_GATE();
	AND_GATE second = new AND_GATE();
	OR_GATE Or = new OR_GATE();
	Not_Gate Not = new Not_Gate();
	
	public XOR_GATE() {

	}
	
	public boolean GetOutput() {
		first.A.input = A.input;
		first.B.input = B.input;
		Or.A.input = A.input;
		Or.B.input = B.input;
		Not.input = first.GetOutput();
		second.A.input = Not.GetOutput();
		second.B.input = Or.GetOutput();
		return second.GetOutput();
	}
}

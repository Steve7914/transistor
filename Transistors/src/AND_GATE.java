
public class AND_GATE {
	Transistor A;
	Transistor B;
	
	public boolean GetOutput() {
		if (A.GetOutput() && B.GetOutput())
			return true;
		else return false;
	}
	
	public AND_GATE() {
		A = new Transistor();
		B = new Transistor();
		
	}
}

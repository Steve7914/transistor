
public class NAND_GATE {
	Transistor A;
	Transistor B;
	
	public boolean GetOutput() {
		if (A.GetOutput() && B.GetOutput())
			return false;
		else return true;
	}
	
	public NAND_GATE() {
		A = new Transistor();
		B = new Transistor();
		
	}
}

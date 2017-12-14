
public class Eight_Bit_One_Multiplier {
	AND_GATE first;
	AND_GATE second;
	AND_GATE third;
	AND_GATE fourth;
	AND_GATE fifth;
	AND_GATE sixth;
	AND_GATE seventh;
	AND_GATE eighth;
	boolean[] result;
	
	public AND_GATE setAndGate(boolean bit1, boolean bit2) {
		AND_GATE and = new AND_GATE();
		and.A.input = bit1;
		and.B.input = bit2;
		return and;
	}
	
	
	public Eight_Bit_One_Multiplier(boolean[] bits1, boolean bits2) {
		first = setAndGate(bits1[0], bits2);
		second = setAndGate(bits1[1], bits2);
		third = setAndGate(bits1[2], bits2);
		fourth = setAndGate(bits1[3], bits2);
		fifth = setAndGate(bits1[4], bits2);
		sixth = setAndGate(bits1[5], bits2);
		seventh = setAndGate(bits1[6], bits2);
		eighth = setAndGate(bits1[7], bits2);
		boolean[] temp = {
				first.GetOutput(), second.GetOutput(), 
				third.GetOutput(), fourth.GetOutput(), 
				fifth.GetOutput(), sixth.GetOutput(), 
				seventh.GetOutput(), eighth.GetOutput()
		};
		result = temp;
	}
	
	public boolean[] getResult() {
		return result;
	}
}

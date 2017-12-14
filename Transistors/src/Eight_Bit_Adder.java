
public class Eight_Bit_Adder {
	int[] bits1;
	int[] bits2;
	HALF_ADDER first;
	FULL_ADDER second;
	FULL_ADDER third;
	FULL_ADDER fourth;
	FULL_ADDER fifth;
	FULL_ADDER sixth;
	FULL_ADDER seventh;
	FULL_ADDER eighth;
	boolean overflow;
	boolean[] result;
	public Eight_Bit_Adder(boolean[] bits1, boolean[] bits2) {
		overflow = false;
		first = new HALF_ADDER(bits1[7], bits2[7]);
		second = new FULL_ADDER(first.getCarry(), bits1[6], bits2[6]);
		third = new FULL_ADDER(second.getCarry(), bits1[5], bits2[5]);
		fourth = new FULL_ADDER(third.getCarry(), bits1[4], bits2[4]);
		fifth = new FULL_ADDER(fourth.getCarry(), bits1[3], bits2[3]);
		sixth = new FULL_ADDER(fifth.getCarry(), bits1[2], bits2[2]);
		seventh = new FULL_ADDER(sixth.getCarry(), bits1[1], bits2[1]);
		eighth = new FULL_ADDER(seventh.getCarry(), bits1[0], bits2[0]);
		boolean[] temp = {
					eighth.getSum(), seventh.getSum(), 
					sixth.getSum(), fifth.getSum(),
					fourth.getSum(), third.getSum(),
					second.getSum(), first.getSum()
				};
		
		result = temp;
		if (eighth.getCarry()) {
			//System.out.println("OVERFLOW");
			overflow = true;
		}
			
	}
	public boolean[] getResult() {
		return result;
	}
}

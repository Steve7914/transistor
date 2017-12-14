
public class Eight_Bit_Subtractor {
	int[] bits1;
	int[] bits2;
	HALF_SUBTRACTOR first;
	FULL_SUBTRACTOR second;
	FULL_SUBTRACTOR third;
	FULL_SUBTRACTOR fourth;
	FULL_SUBTRACTOR fifth;
	FULL_SUBTRACTOR sixth;
	FULL_SUBTRACTOR seventh;
	FULL_SUBTRACTOR eighth;
	boolean overflow;
	boolean[] result;
	public Eight_Bit_Subtractor(boolean[] bits1, boolean[] bits2) {
		overflow = false;
		first = new HALF_SUBTRACTOR(bits1[7], bits2[7]);
		second = new FULL_SUBTRACTOR(first.getBorrow(), bits1[6], bits2[6]);
		third = new FULL_SUBTRACTOR(second.getBorrow(), bits1[5], bits2[5]);
		fourth = new FULL_SUBTRACTOR(third.getBorrow(), bits1[4], bits2[4]);
		fifth = new FULL_SUBTRACTOR(fourth.getBorrow(), bits1[3], bits2[3]);
		sixth = new FULL_SUBTRACTOR(fifth.getBorrow(), bits1[2], bits2[2]);
		seventh = new FULL_SUBTRACTOR(sixth.getBorrow(), bits1[1], bits2[1]);
		eighth = new FULL_SUBTRACTOR(seventh.getBorrow(), bits1[0], bits2[0]);
		boolean[] temp = {
					eighth.getDifference(), seventh.getDifference(), 
					sixth.getDifference(), fifth.getDifference(),
					fourth.getDifference(), third.getDifference(),
					second.getDifference(), first.getDifference()
				};
		
		result = temp;
		if (eighth.getBorrow()) {
			overflow = true;
		}
			
	}
	public boolean[] getResult() {
		return result;
	}
}

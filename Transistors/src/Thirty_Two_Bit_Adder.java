
public class Thirty_Two_Bit_Adder {

	int[] bits1;
	int[] bits2;
	Eight_Bit_Adder first;
	Eight_Bit_Continuer second;
	Eight_Bit_Continuer third;
	Eight_Bit_Continuer fourth;
	
	boolean overflow;
	boolean[] result;
	
	public static boolean[] combineTwoArrays(boolean[] first, boolean[] second) {
		boolean[] result = new boolean[first.length + second.length];
		System.arraycopy(first, 0, result, 0, first.length);
		System.arraycopy(second, 0, result, first.length, second.length);
		
		return result;
	}
	
	public boolean[] concat(boolean[] first, boolean[] second, 
			boolean[] third, boolean[] fourth) {
		
		boolean[] first_second = combineTwoArrays(first, second);
		boolean[] third_fourth = combineTwoArrays(third, fourth); 
		
		boolean[] result = 
				combineTwoArrays(first_second, third_fourth);

		return result;
	}
	 
	public Thirty_Two_Bit_Adder(boolean[] bits1, boolean[] bits2) {
		overflow = false;
		
		boolean[] FirstEightBits1 = {bits1[24], bits1[25], bits1[26],
				bits1[27], bits1[28], bits1[29], bits1[30], bits1[31]};
		
		boolean[] FirstEightBits2 = {bits2[24], bits2[25], bits2[26],
				bits2[27], bits2[28], bits2[29], bits2[30], bits2[31]};
		first = new Eight_Bit_Adder(FirstEightBits1, FirstEightBits2);
		//
		
		boolean[] EightSixteenBits1 = {bits1[16], bits1[17], bits1[18],
				bits1[19], bits1[20], bits1[21], bits1[22], bits1[23]};
		
		boolean[] EightSixteenBits2 = {bits2[16], bits2[17], bits2[18],
				bits2[19], bits2[20], bits2[21], bits2[22], bits2[23]};
		second = new Eight_Bit_Continuer(EightSixteenBits1, EightSixteenBits2, first.eighth.getCarry());
		//
		
		boolean[] SixteenTwentyFourBits1 = {bits1[8], bits1[9], bits1[10],
				bits1[11], bits1[12], bits1[13], bits1[14], bits1[15]};
		
		boolean[] SixteenTwentyFourBits2 = {bits2[8], bits2[9], bits2[10],
				bits2[11], bits2[12], bits2[13], bits2[14], bits2[15]};
		third = new Eight_Bit_Continuer(SixteenTwentyFourBits1, SixteenTwentyFourBits2, second.getCarry());
		//
		
		boolean[] TwentyFourThirtyTwoBits1 = {bits1[0], bits1[1], bits1[2],
				bits1[3], bits1[4], bits1[5], bits1[6], bits1[7]};
		
		boolean[] TwentyFourThirtyTwoBits2 = {bits2[0], bits2[1], bits2[2],
				bits2[3], bits2[4], bits2[5], bits2[6], bits2[7]};
		fourth = new Eight_Bit_Continuer(TwentyFourThirtyTwoBits1, TwentyFourThirtyTwoBits2, third.getCarry());
		//

		
		boolean[] temp = concat(fourth.getResult(), 
				third.getResult(), second.getResult(), first.getResult());
		
		result = temp;
		if (fourth.getCarry()) {
			System.out.println("OVERFLOW");
			overflow = true;
		}
			
	}
	public boolean[] getResult() {
		return result;
	}
}

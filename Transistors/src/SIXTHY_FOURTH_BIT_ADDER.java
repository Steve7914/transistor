
public class SIXTHY_FOURTH_BIT_ADDER {

	int[] bits1;
	int[] bits2;
	Eight_Bit_Adder first;
	Eight_Bit_Adder second;
	Eight_Bit_Adder third;
	Eight_Bit_Adder fourth;
	Eight_Bit_Adder fifth;
	Eight_Bit_Adder sixth;
	Eight_Bit_Adder seventh;
	Eight_Bit_Adder eighth;
	boolean overflow;
	boolean[] result;
	
	public boolean[] combineTwoArrays(boolean[] first, boolean[] second) {
		boolean[] result = new boolean[first.length + second.length];
		System.arraycopy(first, 0, result, 0, first.length);
		System.arraycopy(second, 0, result, first.length, second.length);
		
		return result;
	}
	
	public boolean[] concat(boolean[] first, boolean[] second, 
			boolean[] third, boolean[] fourth, boolean[] fifth, 
			boolean[] sixth, boolean[] seventh, boolean[] eighth) {
		
		boolean[] first_second = combineTwoArrays(first, second);
		boolean[] third_fourth = combineTwoArrays(third, fourth); 
		boolean[] fifth_sixth = combineTwoArrays(fifth, sixth);
		boolean[] seventh_eighth = combineTwoArrays(seventh, eighth);
		
		boolean[] first_second_third_fourth = 
				combineTwoArrays(first_second, third_fourth);
		boolean[] fifth_sixth_seventh_eighth = 
				combineTwoArrays(fifth_sixth, seventh_eighth);
		
		boolean[] result = 
				combineTwoArrays(first_second_third_fourth,
						fifth_sixth_seventh_eighth);
		return result;
	}
	 
	public SIXTHY_FOURTH_BIT_ADDER(boolean[] bits1, boolean[] bits2) {
		overflow = false;
		boolean[] FirstEightBits1 = {bits1[0], bits1[1], bits1[2],
				bits1[3], bits1[4], bits1[5], bits1[6], bits1[7]};
		boolean[] FirstEightBits2 = {bits2[0], bits2[1], bits2[2],
				bits2[3], bits2[4], bits2[5], bits2[6], bits2[7]};
		first = new Eight_Bit_Adder(FirstEightBits1, FirstEightBits2);
		//
		boolean[] EightSixteenBits1 = {bits1[8], bits1[9], bits1[10],
				bits1[11], bits1[12], bits1[13], bits1[14], bits1[15]};
		boolean[] EightSixteenBits2 = {bits2[8], bits2[9], bits2[10],
				bits2[11], bits2[12], bits2[13], bits2[14], bits2[15]};
		second = new Eight_Bit_Adder(EightSixteenBits1, EightSixteenBits2);
		//
		boolean[] SixteenTwentyFourBits1 = {bits1[16], bits1[17], bits1[18],
				bits1[19], bits1[20], bits1[21], bits1[22], bits1[23]};
		boolean[] SixteenTwentyFourBits2 = {bits2[16], bits2[17], bits2[18],
				bits2[19], bits2[20], bits2[21], bits2[22], bits2[23]};
		third = new Eight_Bit_Adder(SixteenTwentyFourBits1, SixteenTwentyFourBits2);
		//
		boolean[] TwentyFourThirtyTwoBits1 = {bits1[24], bits1[25], bits1[26],
				bits1[27], bits1[28], bits1[29], bits1[30], bits1[31]};
		boolean[] TwentyFourThirtyTwoBits2 = {bits2[24], bits2[25], bits2[26],
				bits2[27], bits2[28], bits2[29], bits2[30], bits2[31]};
		fourth = new Eight_Bit_Adder(TwentyFourThirtyTwoBits1, TwentyFourThirtyTwoBits2);
		//
		boolean[] ThirtyTwoFourthyBits1 = {bits1[32], bits1[33], bits1[34],
				bits1[35], bits1[36], bits1[37], bits1[38], bits1[39]};
		boolean[] ThirtyTwoFourthyBits2 = {bits2[32], bits2[33], bits2[34],
				bits2[35], bits2[36], bits2[37], bits2[38], bits2[39]};
		fifth = new Eight_Bit_Adder(ThirtyTwoFourthyBits1, ThirtyTwoFourthyBits2);
		//
		boolean[] FourthyFourthyEightBits1 = {bits1[40], bits1[41], bits1[42],
				bits1[43], bits1[44], bits1[45], bits1[46], bits1[47]};
		boolean[] FourthyFourthyEightBits2 = {bits2[40], bits2[41], bits2[42],
				bits2[43], bits2[44], bits2[45], bits2[46], bits2[47]};
		sixth = new Eight_Bit_Adder(FourthyFourthyEightBits1, FourthyFourthyEightBits2);
		//
		boolean[] FourthyEightFifthySixBits1 = {bits1[48], bits1[49], bits1[50],
				bits1[51], bits1[52], bits1[53], bits1[54], bits1[5]};
		boolean[] FourthyEightFifthySixBits2 = {bits2[48], bits2[49], bits2[50],
				bits2[51], bits2[52], bits2[53], bits2[54], bits2[55]};
		seventh = new Eight_Bit_Adder(FourthyEightFifthySixBits1, FourthyEightFifthySixBits2);
		//
		boolean[] FifthySixSixtyFourBits1 = {bits1[56], bits1[57], bits1[58],
				bits1[59], bits1[60], bits1[61], bits1[62], bits1[63]};
		boolean[] FifthySixSixtyFourBits2 = {bits2[56], bits2[57], bits2[58],
				bits2[59], bits2[60], bits2[61], bits2[62], bits2[63]};
		eighth = new Eight_Bit_Adder(FifthySixSixtyFourBits1, FifthySixSixtyFourBits2);
		
		/*
		boolean[][] temp = {
					eighth.getResult(), seventh.getResult(), 
					sixth.getResult(), fifth.getResult(),
					fourth.getResult(), third.getResult(),
					second.getResult(), first.getResult()
				};
		
		*/
		
		boolean[] temp = concat(eighth.getResult(), seventh.getResult(), 
				sixth.getResult(), fifth.getResult(), fourth.getResult(), 
				third.getResult(), second.getResult(), first.getResult());
		
		result = temp;
		if (eighth.eighth.getCarry()) {
			System.out.println("OVERFLOW");
			overflow = true;
		}
			
	}
	public boolean[] getResult() {
		return result;
	}
}

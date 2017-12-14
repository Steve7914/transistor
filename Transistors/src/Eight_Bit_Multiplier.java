
public class Eight_Bit_Multiplier {
	Eight_Bit_One_Multiplier first;
	Eight_Bit_One_Multiplier second;
	Eight_Bit_One_Multiplier third;
	Eight_Bit_One_Multiplier fourth;
	Eight_Bit_One_Multiplier fifth;
	Eight_Bit_One_Multiplier sixth;
	Eight_Bit_One_Multiplier seventh;
	Eight_Bit_One_Multiplier eighth;
	
	Thirty_Two_Bit_Adder first_second;
	Thirty_Two_Bit_Adder third_fourth;
	Thirty_Two_Bit_Adder fifth_sixth;
	Thirty_Two_Bit_Adder seventh_eighth;
	
	Thirty_Two_Bit_Adder first_second_third_fourth;
	Thirty_Two_Bit_Adder fifth_sixth_seventh_eighth;
	
	Thirty_Two_Bit_Adder all;
	
	boolean FirstSum;
	boolean SecondSum;
	boolean ThirdSum;
	boolean FourthSum;
	boolean FifthSum;
	boolean SixthSum;
	boolean SeventhSum;
	boolean[] result;
	
	public boolean[] ConvertEightBitThirtyTwo(boolean[] src) {
		boolean[] firstPart = new boolean[32 - src.length];
		for (int i = 0; i < firstPart.length; i++) {
			firstPart[i] = false;
		}
		boolean[] result = Thirty_Two_Bit_Adder.combineTwoArrays(
				firstPart, src);
		return result;
	}
	
	
	public boolean[] shift(boolean[] src, int offset) {
		
		int lenght = src.length + offset;
		boolean[] result = new boolean[lenght];
		boolean firstpart = true;
		
		for (int i = 0; i < lenght; i++) {
			if (i < src.length) {
				firstpart = false;
			}
			
			if (firstpart) {
				result[i] = src[i];
			} else {
				result[i] = false;
			}
		}
		return result;
		
	}
	
	public Eight_Bit_Multiplier(boolean[] bits1, boolean[] bits2) {
		first = new Eight_Bit_One_Multiplier(bits1, bits2[7]);
		second = new Eight_Bit_One_Multiplier(bits1, bits2[6]);
		third = new Eight_Bit_One_Multiplier(bits1, bits2[5]);
		fourth = new Eight_Bit_One_Multiplier(bits1, bits2[4]);
		fifth = new Eight_Bit_One_Multiplier(bits1, bits2[3]);
		sixth = new Eight_Bit_One_Multiplier(bits1, bits2[2]);
		seventh = new Eight_Bit_One_Multiplier(bits1, bits2[1]);
		eighth = new Eight_Bit_One_Multiplier(bits1, bits2[0]);
		
		boolean[] firstOne = 
				ConvertEightBitThirtyTwo(first.getResult());
		boolean[] secondOne = 
				ConvertEightBitThirtyTwo(shift(
						second.getResult(), 1));
		boolean[] thirdOne = 
				ConvertEightBitThirtyTwo(shift(
						second.getResult(), 2));
		boolean[] fourthOne = 
				ConvertEightBitThirtyTwo(shift(
						second.getResult(), 3));
		boolean[] fifthOne = 
				ConvertEightBitThirtyTwo(shift(
						second.getResult(), 4));
		boolean[] sixthOne = 
				ConvertEightBitThirtyTwo(shift(
						second.getResult(), 5));
		boolean[] seventhOne = 
				ConvertEightBitThirtyTwo(shift(
						second.getResult(), 6));
		boolean[] eighthOne = 
				ConvertEightBitThirtyTwo(shift(
						second.getResult(), 7));
		
		first_second = new Thirty_Two_Bit_Adder(
				firstOne, secondOne);
		third_fourth = new Thirty_Two_Bit_Adder(
				thirdOne, fourthOne);
		fifth_sixth = new Thirty_Two_Bit_Adder(
				fifthOne, sixthOne);
		seventh_eighth = new Thirty_Two_Bit_Adder(
				seventhOne, eighthOne);
		
		first_second_third_fourth = 
				new Thirty_Two_Bit_Adder(first_second.getResult(), 
						third_fourth.getResult());
		fifth_sixth_seventh_eighth = 
				new Thirty_Two_Bit_Adder(fifth_sixth.getResult(),
						seventh_eighth.getResult());
		
		all = new Thirty_Two_Bit_Adder(
				first_second_third_fourth.getResult(),
				fifth_sixth_seventh_eighth.getResult());
		
		result = all.getResult();
	}
	
	public boolean[] getResult() {
		return result;
	}
}

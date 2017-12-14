
public class Main {
	
	public static boolean[] ConvertfromIntArray(int[] bits) {
		boolean[] binary = new boolean[bits.length];
		for (int i = 0; i < bits.length; i++) {
			if (bits[i] == 0)
				binary[i] = false;
			else binary[i] = true;
		}
		return binary;
	}
	
	public static int[] ConvertfromBinary(boolean[] binary) {
		int[] bits = new int[binary.length];
		for (int i = 0; i < binary.length; i++) {
			if (binary[i])
				bits[i] = 1;
			else bits[i] = 0;
		}
		return bits;
	}
	
	public static int convertBinaryInt(int[] bits) {
		int num = 0;
		for (int i = bits.length; i > 0; i--) {
			num = num + (int) (num + Math.pow(bits[bits.length - i], i));
		}
		return num;
	}
	
	public static void saybool(boolean test) {
		if (test)
			System.out.println(" true ");
		else System.out.println(" false ");
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		final double startTime = System.nanoTime();
		//int[] bits1 = {
				//0,0,0,0,1,0,0,0,1,0,0,1,1,1,0,0,1,0,0,1,1,0,
				//1,0,1,0,1,0,0,0,1,0};
		//int[] bits2 = {0,0,0,0,0,1,0,1,0,0,1,1,1,1,0,1,1,0,1,0,1,
				//0,1,0,0,1,1,0,0,0,0,1};
		
		int[] bits1 = {
				0,0,1,1,1,0,1,0
		};
		
		int bits2[] = {
				1,0,0,0,1,0,1,1 
		};
		
		//Binary_Converter convert1 = new Binary_Converter(bits1);
		//Binary_Converter convert2 = new Binary_Converter(bits2);
		System.out.println(convertBinaryInt(bits1));
		System.out.println(convertBinaryInt(bits2));
		boolean[] binary1 = ConvertfromIntArray(bits1);
		boolean[] binary2 = ConvertfromIntArray(bits2);
		
		//System.out.println(convert1.num);
		//System.out.println(convert2.num);
		
		//Thirty_Two_Bit_Adder add = new Thirty_Two_Bit_Adder(binary1, binary2);
		//boolean[] resultsum = add.getResult();
		//int[] bitssum = ConvertfromBinary(resultsum);
		//System.out.println(convertBinaryInt(bitssum));
		
		//Thirty_Two_Bit_Subtractor sub = new Thirty_Two_Bit_Subtractor(binary1, binary2);
		//boolean[] resultsub = sub.getResult();
		//int[] bitssub = ConvertfromBinary(resultsub);
		//System.out.println(convertBinaryInt(bitssub));
		
		Eight_Bit_Multiplier multiply = new Eight_Bit_Multiplier(
				binary1, binary2);
		//Eight_Bit_One_Multiplier multiply = new Eight_Bit_One_Multiplier(
		//		binary2, true);
		boolean[] resultMultiply = multiply.getResult();
		int[] bitsMultiply = ConvertfromBinary(resultMultiply);
		System.out.println(convertBinaryInt(bitsMultiply));
		
		final double endTime = System.nanoTime();
		
		System.out.println(
				"Time with Programmable Transistors: " + 
		(endTime - startTime) + " Nanoseconds");
		System.out.println("Time in Milliseconds: "
				+ ((endTime - startTime) / 10000000));
		
		final long start = System.nanoTime();
		
		int answersum = (convertBinaryInt(bits1) + 
				convertBinaryInt(bits2));
		int answersub = (convertBinaryInt(bits1) - convertBinaryInt(bits2));
		final long end = System.nanoTime();
		System.out.println(
				"Time w/o Virtual Transistors: " +
		(end - start) + " Nanoseconds");
		System.out.println("Time in Milliseconds: " +
		((end - start) / 10000000));
		System.out.println(answersum + " " + answersub);
		
		
		/*
		//OR
		OR_GATE t = new OR_GATE();
		t.A.ChangeInput();
		t.B.ChangeInput();
		//Both On
		saybool(t.GetOutput());
		t.A.ChangeInput();
		saybool(t.GetOutput());
		t.B.ChangeInput();
		saybool(t.GetOutput());
		//Both Off
		t.A.ChangeInput();
		saybool(t.GetOutput());
		System.out.println();
		*/
		/*
		//XOR
		XOR_GATE e = new XOR_GATE();
		e.A.input = true;
		e.B.input = true;
		//Both On
		saybool(e.GetOutput());
		e.A.input = false;
		saybool(e.GetOutput());
		e.B.input = false;
		saybool(e.GetOutput());
		//Both Off
		e.A.input = true;
		saybool(e.GetOutput());
		System.out.println();
		*/
		
		/*
		//And
		AND_GATE r = new AND_GATE();
		r.A.ChangeInput();
		r.B.ChangeInput();
		//Both On
		saybool(r.GetOutput());
		r.A.ChangeInput();
		saybool(r.GetOutput());
		r.B.ChangeInput();
		saybool(r.GetOutput());
		//Both Off
		r.A.ChangeInput();
		saybool(r.GetOutput());
		System.out.println();
		*/
		
		//Half-Adder
		/*
		HALF_ADDER firstHalf = new HALF_ADDER(false, false);
		HALF_ADDER secondHalf = new HALF_ADDER(false, true);
		HALF_ADDER thirdHalf = new HALF_ADDER(true, false);
		HALF_ADDER fourthHalf = new HALF_ADDER(true, true);
		
		saybool(firstHalf.getCarry());
		saybool(firstHalf.getSum());
		System.out.println();
		saybool(secondHalf.getCarry());
		saybool(secondHalf.getSum());
		System.out.println();
		saybool(thirdHalf.getCarry());
		saybool(thirdHalf.getSum());
		System.out.println();
		saybool(fourthHalf.getCarry());
		saybool(fourthHalf.getSum());
		System.out.println();
		System.out.println();
		*/
		/*
		//Full-Adder
		FULL_ADDER first = new FULL_ADDER(false, false, false);
		FULL_ADDER second = new FULL_ADDER(false, false, true);
		FULL_ADDER third = new FULL_ADDER(false, true, false);
		FULL_ADDER fourth = new FULL_ADDER(true, false, false);
		FULL_ADDER fifth = new FULL_ADDER(false, true, true);
		FULL_ADDER sixth = new FULL_ADDER(true, true, false);
		FULL_ADDER seventh = new FULL_ADDER(true, true, true);
		saybool(first.getCarry());
		saybool(first.getSum());
		System.out.println();
		saybool(second.getCarry());
		saybool(second.getSum());
		System.out.println();
		saybool(third.getCarry());
		saybool(third.getSum());
		System.out.println();
		saybool(fourth.getCarry());
		saybool(fourth.getSum());
		System.out.println();
		saybool(fifth.getCarry());
		saybool(fifth.getSum());
		System.out.println();
		saybool(sixth.getCarry());
		saybool(sixth.getSum());
		System.out.println();
		saybool(seventh.getCarry());
		saybool(seventh.getSum());
		*/
		
		/*
		HALF_SUBTRACTOR firstHalf = new HALF_SUBTRACTOR(false, false);
		HALF_SUBTRACTOR secondHalf = new HALF_SUBTRACTOR(false, true);
		HALF_SUBTRACTOR thirdHalf = new HALF_SUBTRACTOR(true, false);
		HALF_SUBTRACTOR fourthHalf = new HALF_SUBTRACTOR(true, true);
		
		saybool(firstHalf.getDifference());
		saybool(firstHalf.getBorrow());
		System.out.println();
		saybool(secondHalf.getDifference());
		saybool(secondHalf.getBorrow());
		System.out.println();
		saybool(thirdHalf.getDifference());
		saybool(thirdHalf.getBorrow());
		System.out.println();
		saybool(fourthHalf.getDifference());
		saybool(fourthHalf.getBorrow());
		System.out.println();
		System.out.println();
		*/
		
		/*
		FULL_SUBTRACTOR first = new FULL_SUBTRACTOR(false, false, false);
		FULL_SUBTRACTOR second = new FULL_SUBTRACTOR(false, false, true);//
		FULL_SUBTRACTOR third = new FULL_SUBTRACTOR(false, true, false);//
		FULL_SUBTRACTOR fourth = new FULL_SUBTRACTOR(false, true, true);//
		FULL_SUBTRACTOR fifth = new FULL_SUBTRACTOR(true, false, false);//
		FULL_SUBTRACTOR sixth = new FULL_SUBTRACTOR(true, false, true);//
		FULL_SUBTRACTOR seventh = new FULL_SUBTRACTOR(true, true, false);//
		FULL_SUBTRACTOR eighth = new FULL_SUBTRACTOR(true, true, true);//
		saybool(first.getDifference());
		saybool(first.getBorrow());
		System.out.println();
		saybool(second.getDifference());
		saybool(second.getBorrow());
		System.out.println();
		saybool(third.getDifference());
		saybool(third.getBorrow());
		System.out.println();
		saybool(fourth.getDifference());
		saybool(fourth.getBorrow());
		System.out.println();
		saybool(fifth.getDifference());
		saybool(fifth.getBorrow());
		System.out.println();
		saybool(sixth.getDifference());
		saybool(sixth.getBorrow());
		System.out.println();
		saybool(seventh.getDifference());
		saybool(seventh.getBorrow());
		System.out.println();
		saybool(eighth.getDifference());
		saybool(eighth.getBorrow());
		*/
	}
}

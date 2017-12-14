
public class Binary_Converter {
	int[] bits;
	int num;
	boolean[] binary;
	
	public Binary_Converter() {
		
	}
	
	public Binary_Converter(int[] bits) {
		this.bits = bits;
		for (int i = bits.length; i > 0; i--) {
			this.num = this.num + (int) (num + Math.pow(bits[bits.length - i], i));
			
		}
		
		boolean[] binary = new boolean[bits.length];
		for (int i = 0; i < bits.length; i++) {
			if (bits[i] == 0)
				binary[i] = false;
			else binary[i] = true;
		}
		this.binary = binary;
	}
	/*
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
	*/
	public Binary_Converter(int num) {
		this.num = num;
		String bytes = Integer.toBinaryString(num);
		int[] temp = new int[bytes.length()];
		
		for (int i = 0; i < bytes.length(); i++) {
			temp[i] = Character.getNumericValue(bytes.charAt(i));
		}
		this.bits = temp;
		
		boolean[] binary = new boolean[bits.length];
		for (int i = 0; i < bits.length; i++) {
			if (bits[i] == 0)
				binary[i] = false;
			else binary[i] = true;
		}
		this.binary = binary;
	}
}

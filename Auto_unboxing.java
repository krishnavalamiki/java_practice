package Autoboxing;

public class Auto_unboxing {

	public static void main(String[] args) {
		// wrapper classes assigned to the data types..
		Integer I = 100;
		Long L = 6300838419l;
		Double D = 33.3;
		Float F = 36.5f;
		Character C = 'S';
		
		// assigned data types..
		int i = I;
		long l = L;
		float f = F;
		double d  = D;
		char c = C;
		
        System.out.println(i+3);
        System.out.println(l+4);
        System.out.println(f+5);
        System.out.println(d+6);
        System.out.println(c+7);

	}

}

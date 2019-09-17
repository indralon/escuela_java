class HolaMundo {
	public static void main(String[] args) {
		System.out.println("Hola mundo!");
		String nombre = "tu";
		System.out.println("Hola " + nombre +"!");
		byte elByte = 127;
		System.out.println("Byte: " + elByte);
		int numero = 1000;
		System.out.println("Int: " + numero);
		float decimalFloat = 1.2345678901f;
		System.out.println("float: " + decimalFloat);
		double decimalDoble = 1.23456789014453343434;
		System.out.println("double: " + decimalDoble);
		
		long entLargo = 12345678955644543l;
		System.out.println("Long: " + entLargo);
		
		char chaca = 66;
		System.out.println("char: " + chaca);
	
		char[] chars = {'a','b','K'};
		System.out.println(chars[2]);
	
		for(int i = 0; i < chars.length; i = i + 1) {
			System.out.println(chars[i]);
		}
		/*
		 yasca plasca
		*/
	}
}


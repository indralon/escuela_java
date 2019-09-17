class EstructurasControl {
	public static void main (String[] argumentos) {
		for (int i = 0; i < argumentos.length; i++) {
			System.out.println(argumentos[i]);
			System.out.println(i);
		}
		int n = 0;
		System.out.println(n);
		
		for(n = 2; n <= 4; n++) {
			System.out.println("Yeeah");
		}
		System.out.println(n);
		
		
		boolean siEjecutar = 5 < 3 && 20 == 20;
		if (siEjecutar) {
			System.out.println("Es cierto");
		}
		else 
			System.out.println("La condicion es false");
		
		int valor = 1;
		switch (valor) {
			case 0:
				System.out.println("Ue ueh");
				System.out.println("ueh ueh");
			case 1:
				System.out.println("uo uoh");
				break;
			default:
				System.out.println("ua uah");
		}
	}
}
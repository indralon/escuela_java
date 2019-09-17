class Operadores {
	public static void main (String[] argumentos) {
		if (argumentos[0] == "aa") {
			System.out.println("Quieres dos AA");
		}
		else {
			System.out.println("Quieres otra cosa");
		}
		
		System.out.println(argumentos[0].equals("aa") ? "Quieres dos AA" : "Quieres otra cosa");
	}
}
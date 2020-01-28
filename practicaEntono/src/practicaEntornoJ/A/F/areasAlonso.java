package practicaEntornoJ.A.F;

public class areasAlonso {
	public static void areaTriangulo() {
		System.out.println("Necesito la base");
		int b = Leer.entero();
		System.out.println("Necesito la altura");
		int a = Leer.entero();
		int area = (b * a) / 2;
		System.out.println("El area es =" + area);

	}

	public static void areaCuadrado() {
		System.out.println("Necesito el lado");
		int lado = Leer.entero();
		int area = lado ^ 2;
		System.out.println("El area es =" + area);

	}

	public static void areaRectangulo() {
		System.out.println("Necesito el lado");
		int b = Leer.entero();
		System.out.println("Necesito la base");
		int a = Leer.entero();
		int area = b * a;
		System.out.println("El area es =" + area);

	}

}

package practicaEntornoJ.A.F;

public class areasAlonso {
	public static int areaTriangulo() {
		System.out.println("Necesito la base");
		int b = Leer.entero();
		System.out.println("Necesito la altura");
		int a = Leer.entero();
		int area = (b * a) / 2;

		return area;
	}

	public int areaCuadrado() {
		System.out.println("Necesito el lado");
		int lado = Leer.entero();
		int area = lado ^ 2;
		return area;
	}

	public int areaRectangulo() {
		System.out.println("Necesito el lado");
		int b = Leer.entero();
		System.out.println("Necesito la base");
		int a = Leer.entero();
		int area = b * a;
		return area;
	}

}

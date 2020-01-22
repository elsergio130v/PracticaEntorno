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
	
}

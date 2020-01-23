package practicaEntornoJ.A.F;

public class AreaJC {

	public static double areaCuadrilateroConvexo() {
		System.out.println("Introduce la primera diagonal");
		double a = Leer.decimal();
		System.out.println("Introduce la segunda diagonal");
		double b = Leer.decimal();
		System.out.println("Introduce el angulo de las diagonales");
		double angulo = Leer.decimal();
		double resultado = 0.5*a*b*(Math.toDegrees(Math.sin(angulo)));
		
		return resultado;
	}
	
	public static double areaCirculo() {
		System.out.println("Introduce el radio");
		double r = Leer.decimal();
		double area = Math.PI*Math.pow(Math.PI, r);
		return area;
	}
	
	public static double areaElipse() {
		System.out.println("Introduce el primer Semieje");
		double a = Leer.decimal();
		System.out.println("Introduce el segundo Semieje");
		double b = Leer.decimal();
		double area = Math.PI*a*b;
		return area;

	}
}

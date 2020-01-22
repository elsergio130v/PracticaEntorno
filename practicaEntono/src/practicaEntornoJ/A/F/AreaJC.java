package practicaEntornoJ.A.F;

public class AreaJC {

	public static double areaCuadrilateroConvexo() {
		double a = Leer.decimal();
		double b = Leer.decimal();
		double angulo = Leer.decimal();
		double resultado = 0.5*a*b*(Math.toDegrees(Math.sin(angulo)));
		
		return resultado;
	}
	
	public static double areaCirculo() {
		double r = Leer.decimal();
		double area = Math.PI*Math.pow(Math.PI, r);
		return area;
	}
	
	public static double areaElipse() {
		double a = Leer.decimal();
		double b = Leer.decimal();
		double area = Math.PI*a*b;
		return area;
//		as
	}
}

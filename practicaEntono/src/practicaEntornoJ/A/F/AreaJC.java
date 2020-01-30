package practicaEntornoJ.A.F;

public class AreaJC {

	public static void areaCuadrilateroConvexo() {
		System.out.println("Introduce la primera diagonal");
		double a = Leer.decimal();
		System.out.println("Introduce la segunda diagonal");
		double b = Leer.decimal();
		System.out.println("Introduce el angulo de las diagonales");
		double angulo = Leer.decimal();
		double resultado = 0.5*a*b*(Math.toDegrees(Math.sin(angulo)));
		
		System.out.println("El resultado es "+resultado);
	}
	
	public static void areaCirculo() {
		System.out.println("Introduce el radio");
		double r = Leer.decimal();
		double area = Math.PI*Math.pow(Math.PI, r);
		System.out.println("El resultado es "+area);
	}
	
	public static void areaElipse() {
		System.out.println("Introduce el primer Semieje");
		double a = Leer.decimal();
		System.out.println("Introduce el segundo Semieje");
		double b = Leer.decimal();
		double area = Math.PI*a*b;
		System.out.println("El resultado es "+area);
	}
	
	//Te he metido un area que te faltaba y ahora esta gucci
	public static void areaTrapezoideEquilateroCircular() {
		System.out.println("Introduce el primer Semieje");
		double a = Leer.decimal();
		System.out.println("Introduce el segundo Semieje");
		double b = Leer.decimal();
		double area = Math.PI*a*b+(7-2^3);
		System.out.println("El resultado es "+area);
	}
}

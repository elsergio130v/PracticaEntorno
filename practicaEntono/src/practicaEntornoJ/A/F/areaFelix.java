package practicaEntornoJ.A.F;

public class areaFelix {

	public static void areaParalelogramo() {
		System.out.println("Introduce la altura");
		int h=Leer.entero();
		System.out.println("Introduce la base mayor");
		int a=Leer.entero();
		int area=a*h;
	System.out.println("El area del paralelogramo es "+area);
		
	}
	
	public static void areaRombo() {
		System.out.println("Introduce la altura");
		int h=Leer.entero();
		System.out.println("Introduce el lado del rombo");
		int a=Leer.entero();
		int area=a*h;
		System.out.println("El area del rombo es "+area);
	}
	public static void areaTrapecio() {
		System.out.println("Introduce la altura");
		int h=Leer.entero();
		System.out.println("Introduce la base menor");
		int a=Leer.entero();
		System.out.println("Introduce la base mayor");
		int b=Leer.entero();
		int area=((a+b)/2)*h;
	System.out.println("El area del trapecio es "+area);
		
	}
}

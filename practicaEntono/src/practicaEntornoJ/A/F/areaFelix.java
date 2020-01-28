package practicaEntornoJ.A.F;

public class areaFelix {

	public int areaParalelogramo() {
		System.out.println("Introduce la altura");
		int h=Leer.entero();
		System.out.println("Introduce la base mayor");
		int a=Leer.entero();
		int area=a*h;
		return area;
		
	}
	
	public int areaRombo() {
		System.out.println("Introduce la altura");
		int h=Leer.entero();
		System.out.println("Introduce el lado del rombo");
		int a=Leer.entero();
		int area=a*h;
		return area;	
	}
	public int areaTrapecio() {
		System.out.println("Introduce la altura");
		int h=Leer.entero();
		System.out.println("Introduce la base menor");
		int a=Leer.entero();
		System.out.println("Introduce la base mayor");
		int b=Leer.entero();
		int area=((a+b)/2)*h;
		return area;	
		
	}
}

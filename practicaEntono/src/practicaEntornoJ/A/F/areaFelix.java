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
	
	//En el area del rombo en internet sale que es la multiplicacion de las diagonales dividido entre 2
	//Creo que el area que habeis puesto no es el area del rombo si no mas bien del cuadrado,
	//Estas dos se suelen confundir pero no son iguales, por eso yo usaria esto.
	
	public static void areaRombo() {
		System.out.println("Introduce una Diagonal")
		int diagonalUno=Leer.entero();
		System.out.println("Introduce otra Diagonal")
		int diagonaldos=Leer.entero();
		int area=(diagonalUno*diagonalDos)/2
		System.out.println("El area del rombo es"+area)
		
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

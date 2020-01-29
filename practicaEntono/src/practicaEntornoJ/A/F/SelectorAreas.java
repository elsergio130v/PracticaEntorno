package practicaEntornoJ.A.F;

public class SelectorAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// selector
		System.out.println("Que area quieres calcular ");
		System.out.println("Area del tringulo ---------------> Tecla 1");
		System.out.println("Area del cuadrado ---------------> Tecla 2");
		System.out.println("Area del rectangulo ---------------> Tecla 3");
		System.out.println("Area del cuadrilatero Convexo -----> Tecla 4");
		System.out.println("Area del circulo ---------------> Tecla 5");
		System.out.println("Area del elipse ---------------> Tecla 6");
		System.out.println("Area del paralelogramo ---------------> Tecla 7");
		System.out.println("Area del rombo ---------------> Tecla 8");
		System.out.println("Area del trapecio ---------------> Tecla 9");
		int eleccion = Leer.entero();
		
		//llevar a cabo la eleccion
		switch (eleccion) {
		case 1:
			areasAlonso.areaTriangulo();
			break;
		case 2:
			areasAlonso.areaCuadrado();
			break;
		case 3:
			areasAlonso.areaRectangulo();
			break;
		case 4:
			AreaJC.areaCuadrilateroConvexo();
			break;
		case 5:
			AreaJC.areaCirculo();
			break;
		case 6:
			AreaJC.areaElipse();
			break;
		case 7:
			areaFelix.areaParalelogramo();
			break;
		case 8:
			areaFelix.areaRombo();
			break;
		case 9:
			areaFelix.areaTrapecio();
			break;
		}

	}

}

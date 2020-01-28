package practicaEntornoJ.A.F;

public class SelectorAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// selector
		System.out.println("Que area quieres calcular ");
		System.out.println("Area del tringulo ---------------> Tecla 1");
		System.out.println("Area del cuadrado ---------------> Tecla 2");
		System.out.println("Area del rectangulo ---------------> Tecla 3");
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

		}

	}

}

package S1N1Ejercicio1AgustinaHeredia;

public class InstrumentoViento extends Instrumento {

	public InstrumentoViento(String nombre, double precio) {
		super(nombre, precio);
		
	}
	
	public String tocar(){
		return "Esta sonando un intrumento de viento";
	}
}

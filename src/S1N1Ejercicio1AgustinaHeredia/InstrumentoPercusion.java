package S1N1Ejercicio1AgustinaHeredia;

public class InstrumentoPercusion extends Instrumento{

	public InstrumentoPercusion(String nombre, double precio) {
		super(nombre, precio);
		
	}
	public String tocar(){
		return "Esta sonando un intrumento de percusión";
	}

}

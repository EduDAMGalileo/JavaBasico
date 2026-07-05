package ejercicios.poo.encapsulamiento;

public class Termometro {
	private double temperatura;
	private String tipo;
	
	public Termometro(double temperatura) {
		setTemperatura(temperatura);
	}
	
	public Termometro(double temperatura, String tipo) {
		setTemperatura(temperatura);
		this.tipo=tipo;
	}
	
	public double getTemperatura(){
		return temperatura;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setTemperatura(double temperatura) {
		if (temperatura >= -273.15) {
			this.temperatura=temperatura;
		}else {
			System.out.println("No es fisicamente posible bajar del cero absoluto");
		}
	}

}

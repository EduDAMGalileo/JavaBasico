package ejercicios.poo.herencia;

public class EnsamblajePremium extends EnsamblajeMovil{

	@Override
	protected void colocarPantalla() {
		System.out.println("Colocando pantalla OLED curva");
		
	}
	
	//No se pueden modificar los métodos marcados como final en la superclase
	
	/* 
	protected void fabricar() {
		
	}*/

	@Override
	protected void empaquetar() {
		System.out.println("Empaquetando en caja de lujo con auriculares");
	}

}

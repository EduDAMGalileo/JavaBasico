package ejercicios.poo.records;

public class AppCanciones {
	public static void main (String[] args) {
		CancionLegacy cancion1 = new CancionLegacy ("Mi agüita amarilla", "Toreros muertos", 210);
		
		CancionModerna cancion2 = new CancionModerna ("Mi agüita amarilla", "Toreros muertos", 210);
		CancionModerna cancion3 = new CancionModerna (null, null, 159);
		
		System.out.println(cancion1.toString());
		System.out.println("Canción: " + cancion1.getTitulo() + " del grupo: " 
				+ cancion1.getArtista() + " y dura " + cancion1.getDuracion() + " segundos");
		
		
		System.out.println(cancion2.toString());
		System.out.println("Canción: " + cancion2.titulo() + " del grupo: " + cancion2.artista() +
			" y dura " + cancion2.duracion() + " segundos" );
		
		System.out.println(cancion3.toString());
	}

}

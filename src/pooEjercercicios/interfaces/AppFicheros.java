package pooEjercercicios.interfaces;

public class AppFicheros {
	public static void main (String[] args) {
		// 1. Creamos ficheros individuales 

		DocumentoPDF doc1 = new DocumentoPDF(500000); // Válido (0.5MB) 
		ImagenJPG img1 = new ImagenJPG(1920, 1080);   // Válido (2MP aprox) 
		VideoMp4 vid1 = new VideoMp4(120);            // Válido (2 min) 
		DocumentoPDF doc2 = new DocumentoPDF(2000000); // Inválido (2MB) 

		// 2. Prueba de método estático 
		System.out.println("¿Es doc1 válido? " + ValidadorService.validarFichero(doc1)); 
		System.out.println("¿Es doc2 válido? " + ValidadorService.validarFichero(doc2)); 

		// 3. Prueba de validación por lotes (Lote 1: Todo correcto) 
		Validable[] lote1 = {doc1, img1, vid1}; 
		ValidadorService service1 = new ValidadorService(lote1); 
		System.out.println("¿Lote 1 íntegro?: " + service1.validarTodo()); 

		// 4. Prueba de validación por lotes (Lote 2: Contiene un error) 
		Validable[] lote2 = {doc1, img1, vid1, doc2}; 
		ValidadorService service2 = new ValidadorService(lote2); 
		System.out.println("¿Lote 2 íntegro?: " + service2.validarTodo()); 

	} 
}


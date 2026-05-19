package noTanBasicos.genericos;

public class AppCajas {
 public static void main(String[] args) {
     
     // Instanciamos una caja para Strings
     // El operador diamante <> infiere el tipo automáticamente
     Caja<String> cajaDeTexto = new Caja<>();
     cajaDeTexto.guardar("Mensaje secreto");
     
     // RECUPERACIÓN: No hay casting. 'obtener()' ya devuelve un String.
     String contenido = cajaDeTexto.obtener();
     System.out.println("Contenido de la caja de texto: " + contenido);


     // Instanciamos una caja para nuestro propio dominio (Records)
     Caja<Tarea> cajaDeTarea = new Caja<>();
     cajaDeTarea.guardar(new Tarea("Aprender Genéricos", 5));
     
     Tarea miTarea = cajaDeTarea.obtener();
     System.out.println("Tarea recuperada: " + miTarea.descripcion());


     //LA PRUEBA DE SEGURIDAD (Type Safety)
     Caja<Integer> cajaDeNumeros = new Caja<>();
     cajaDeNumeros.guardar(14);
     
     // ¿Qué pasa si intentamos esto?
     //cajaDeNumeros.guardar("Hola"); // ¡ERROR DE COMPILACIÓN! 
     // El compilador sabe que esta caja es SOLO para Integers.
     
     // ¿Y si intentamos recuperar un String de una caja de Integers?
     //String valor = (String) cajaDeNumeros.obtener(); // ERROR DE COMPILACIÓN
     //Pero nos avisa antes de petar
     
     System.out.println("Número en la caja: " + cajaDeNumeros.obtener());
 }
}
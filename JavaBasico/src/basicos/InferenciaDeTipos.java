package basicos;

public class InferenciaDeTipos {
    public static void main(String[] args) {
        // Forma tradicional
        String mensaje;
        int numeroDeIntentos;
        double precio;

        // Usando 'var'
        var mensajeConVar = "Hola, mundo"; // El compilador infiere que es un String
        var intentosConVar = 3;             // El compilador infiere que es un int
        var precioConVar = 29.99;           // El compilador infiere que es un double

        //No hay errores al asignar
        mensaje = mensajeConVar;
        numeroDeIntentos = intentosConVar;
        precio = precioConVar;
        
        //Por mostrar algo
        System.out.println("La variable 'mensajeConVar' es de tipo String.");
        System.out.println("La variable 'intentosConVar' es de tipo int.");
        System.out.println("La variable 'precioConVar' es de tipo double.");

        // Una vez inferido, el tipo es fijo y no se puede cambiar.
        // intentosConVar = "hola"; // ¡ERROR DE COMPILACIÓN! No se puede asignar un String a un int.
    }
}
package basicos;
public class VariablesYConstantes {
    public static void main(String[] args) {

        //Declaramos una constante, las constantes se inicializan siempre
        final int ANIO_NACIMIENTO=1984;

        //Declaramos algunas variables, y además las inicializamos
        int edad = 41;
        double altura = 1.81;
        String nombre = "Eduardo";
        boolean activo = true;

        //Varias variables en una sola línea
        int a = 1, b = 2, c = 3;

        //Varias variables en una sola línea sin inicializar
        int x, y, z;

        //Podemos mostrar el contenido de las variables
        System.out.println("Me llamo: " + nombre + " tengo " + edad + " años y mido " + altura);
        System.out.println("¿Me encuentro activo? " + activo);

        //Podemos cambiar el contenido de esas variables, por eso se llaman así
        edad= 42;
        nombre = "Pedro";

        //Si mostramos lo mismo vemos que la salida cambia
        System.out.println("Me llamo: " + nombre + " tengo " + edad + " años y mido " + altura);
        System.out.println("¿Me encuentro activo? " + activo);

        //Podemos mostrar el contenido de las constantes
        System.out.println("Nací en el año: " + ANIO_NACIMIENTO);
/*
        //Vamos a declarar variables sin inicializarlas
        int noInicializada;

        //Si intentamos mostrar su contenido obtendremos un error
        System.out.println("El valor de la variable es: " + noInicializada);

 */

    }
}

package basicos;
public class OperadoresArtimeticosConcatenacion {
    public static void main(String[] args) {
        //Operadores aritméticos
        int a = 10, b = 4, c = 3;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int divisionEntera = a / c;
        int resto = a % c;

        System.out.println("El resultado de sumar " + a + " y " + b + " es: " + suma );
        System.out.println("El resultado de restar " + a + " y " + b + " es: " + resta );
        System.out.println("El resultado de multiplicar " + a + " por " + b + " es: " + multiplicacion );
        System.out.println("El resultado de dividir " + a + " entre " + c + " es: " + divisionEntera );
        System.out.println("El resto de devidir " + a + " entre " + c + " es: " + resto );

       

        //Operadores de concatenación
        String nombre = "Eduardo";
        String saludo = "Hola, " + nombre;
        System.out.println(saludo);

        //También se pueden utilizar directamente en la salida
        System.out.println(saludo + " qué tal estás");

        //Cuidado con contatenar enteros en un String
        int x = 7;
        int y = 5;
        String concat = "Concatenando enteros: " + x + y + " ¡¡ojo!!";
        System.out.println(concat);

        //Precedencia de operaciones
        int resultado1 = 3 + 4 * 2;
        int resultado2 = (3 + 4) * 2;

        System.out.println("Podemos observar que " + resultado1 +
                " es distinto de " + resultado2);



    }

}

package ejercicios;

//Ejercicio que se planteó, sin métodos y sin StringBuilder (que aun no se han visto)
public class CamelCaseMalo {

    public static void main(String[] args) {
        
        //En lugar de pedir al usuario lo ponemos aquí
        String fraseOriginal = "  convertir esta FRASE a camel Case  ";
        System.out.println("Frase Original: '" + fraseOriginal + "'");

        //Pasamos todo a mínúsculas y quitamos espacios delante y detrás
        String fraseLimpia = fraseOriginal.toLowerCase().trim();

        String resultado = ""; // Empezamos con un String vacío
        boolean convertirAMayuscula = false;

        for (int i = 0; i < fraseLimpia.length(); i++) {
            char caracterActual = fraseLimpia.charAt(i);
            
            if (caracterActual == ' ') {
                // Si encontramos un espacio, activamos la bandera y saltamos al siguiente carácter.
            	convertirAMayuscula = true;
                continue; 
            }
            
            //Si el anterior fue un espacio
            if (convertirAMayuscula) {
                resultado = resultado + Character.toUpperCase(caracterActual);
                convertirAMayuscula = false;
            } else {
                resultado = resultado + caracterActual;
            }
        }

        System.out.println("Resultado con concatenación: '" + resultado + "'");
    }
}
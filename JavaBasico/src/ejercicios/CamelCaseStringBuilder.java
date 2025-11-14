package ejercicios;

//Sin metodos, que aun no los vimos, empieza a ser una necesidad
//Ver ejemplo de CamelCaseMalo
public class CamelCaseStringBuilder {

    public static void main(String[] args) {
        
        String fraseOriginal = "  convertir   esta FRASE a camel   Case  ";
        System.out.println("Frase Original: '" + fraseOriginal + "'");

        String fraseLimpia = fraseOriginal.toLowerCase().trim();

        // --- Preparación para la construcción---
        // Creamos un StringBuilder en lugar de un String vacío.
        StringBuilder constructor = new StringBuilder();
        
        boolean convertirAMayuscula = false;

        // --- Recorrer la frase (igual) ---
        for (int i = 0; i < fraseLimpia.length(); i++) {
            char caracterActual = fraseLimpia.charAt(i);

            // --- Aplicar la lógica (con .append()) ---
            
            if (caracterActual == ' ') {
                convertirAMayuscula = true;
                continue; 
            }
            
            if (convertirAMayuscula) {
                // Usamos .append() para añadir el carácter. ¡Es muy eficiente!
                constructor.append(Character.toUpperCase(caracterActual));
                convertirAMayuscula = false;
            } else {
                // Usamos .append() aquí también.
                constructor.append(caracterActual);
            }
        }

        // ---Obtener el resultado final (NUEVO PASO) ---
        // Convertimos el contenido del StringBuilder a un String final.
        String resultadoFinal = constructor.toString();
        
        System.out.println("Resultado con StringBuilder: '" + resultadoFinal + "'");
    }
}
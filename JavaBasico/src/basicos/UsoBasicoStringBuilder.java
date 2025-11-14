package basicos;

public class UsoBasicoStringBuilder {
    public static void main(String[] args) {
        // Crear un StringBuilder vacío.
        StringBuilder sb = new StringBuilder();

        // Construir el String pieza por pieza.
        sb.append("Hola, ");
        sb.append("Mundo");
        sb.append("!");
        sb.append(" (");
        
        // Puede añadir otros tipos de datos.
        sb.append(2025); 
        sb.append(')');

        // Convertir a un String final.
        String resultado = sb.toString();

        System.out.println(resultado);
    }
}

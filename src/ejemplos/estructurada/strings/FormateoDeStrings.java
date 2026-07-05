package ejemplos.estructurada.strings;

public class FormateoDeStrings {
    public static void main(String[] args) {
        String producto = "Portátil";
        int cantidad = 2;
        double precioUnitario = 1250.758;
        
        System.out.println("Con String.format");
        System.out.println("-----------------");
        // --- Forma tradicional con concatenación ---
        double totalConca = cantidad * precioUnitario;
        String resumenConca = "Resumen: Ha comprado " + cantidad + " unidades de '" + producto +
                              "'. Total a pagar: " + totalConca + "€.";
        System.out.println(resumenConca);
        


        // --- Forma moderna y limpia con String.format() ---
        String plantilla = "Resumen: Ha comprado %d unidades de '%s'. Total a pagar: %.2f€.";
        String resumenFormateado = String.format(plantilla, cantidad, producto, cantidad * precioUnitario);
        
        System.out.println(resumenFormateado);
        
        //System.out.print
        System.out.println("\n Con System.out.print");
        System.out.println("----------------------");
        String[] productos = {"Manzana", "Leche", "Pan"};
        double[] precios = {1.99, 0.85, 2.50};
        int[] cantidades = {4, 1, 2};

        System.out.println("\n--- TICKET DE COMPRA ---");
        System.out.printf("%-15s %10s %10s%n", "PRODUCTO", "CANTIDAD", "PRECIO");
        System.out.println("-------------------------------------");

        for (int i = 0; i < productos.length; i++) {
            // %-15s: String, alineado a la izquierda, en un espacio de 15 caracteres.
            // %10d: Entero, alineado a la derecha, en un espacio de 10 caracteres.
            // %.2f: Flotante, con 2 decimales.
            // %n: Salto de línea.
            System.out.printf("%-15s %10d %10.2f€%n", productos[i], cantidades[i], precios[i]);
        }
        
    }
}
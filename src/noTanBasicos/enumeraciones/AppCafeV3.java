package noTanBasicos.enumeraciones;

public class AppCafeV3 {
    public static void main(String[] args) {
        double precioBase = 2.50;

        System.out.println("Simulación de precios para café base de " + precioBase + "€:");
        System.out.println("---------------------------------------------------------");

        for (TamanoCafeV3 tamano : TamanoCafeV3.values()) {
            // Invocamos el MISMO método, pero se ejecuta un CÓDIGO DISTINTO 
            // dependiendo de la instancia (PEQUENO, MEDIANO o GRANDE).
            double sobrecoste = tamano.calcularSobrecoste(precioBase);
            double precioFinal = precioBase + sobrecoste;

            System.out.printf("Tamaño: %-8s | Sobrecoste: %5.2f€ | Total: %5.2f€%n", 
                              tamano, sobrecoste, precioFinal);
        }
    }
}
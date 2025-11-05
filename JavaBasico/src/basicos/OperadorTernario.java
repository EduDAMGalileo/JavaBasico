package basicos;

public class OperadorTernario {

	public static void main(String[] args) {

        double nota = 6.5;
        String resultado;

        // --- Forma tradicional con if-else ---
        if (nota >= 5.0) {
            resultado = "Aprobado";
        } else {
            resultado = "Suspenso";
        }
        System.out.println("Resultado con if-else: " + resultado);


        // --- Misma lógica con el operador ternario ---
        // Es mucho más conciso para asignaciones simples.
        resultado = (nota >= 5.0) ? "Aprobado" : "Suspenso";
        System.out.println("Resultado con ternario: " + resultado);

        
        // Otro ejemplo: Calcular un descuento
        double precioBase = 100.0;
        boolean esClienteVIP = true;
        
        // Si es cliente VIP, tiene un 20% de descuento (multiplica por 0.8), si no, no tiene (multiplica por 1.0)
        double precioFinal = precioBase * (esClienteVIP ? 0.8 : 1.0);
        
        System.out.println("El precio final para el cliente es: " + precioFinal + "€");
	}

}

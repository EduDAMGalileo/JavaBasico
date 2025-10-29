package basicos;

public class Cast {

	public static void main(String[] args) {
		//IMPLICITA
		
		// Guardar un int en una variable double
        int miEntero = 10;
        double miDouble = miEntero; // Conversión implícita y segura

        System.out.println("El int original: " + miEntero);
        System.out.println("El double después de la conversión: " + miDouble); // Se mostrará 10.0

        // Otro ejemplo
        short numeroPequeno = 120;
        long numeroGrande = numeroPequeno; // Un short siempre cabe en un long

        System.out.println("El short original: " + numeroPequeno);
        System.out.println("El long después de la conversión: " + numeroGrande);
        
        
        
        //EXPLÍCITA
        // Intentar guardar un double en una variable int
        double miDouble2 = 9.78;
        //int miEntero2 = miDouble2; // ¡ERROR DE COMPILACIÓN! Java no lo permite automáticamente.

        // Realizamos la conversión explícita (casting)
        int miEntero2 = (int) miDouble2;

        System.out.println("El double original: " + miDouble2);
        System.out.println("El int después del casting: " + miEntero2); // Se mostrará 9

        // --- ¡CUIDADO! La información se pierde ---
        // La parte decimal simplemente se TRUNCA (se corta), no se redondea.

        // Otro ejemplo de pérdida de información por desbordamiento (overflow)
        int numeroGrande2 = 130;
        // byte miByte2 = numeroGrande2; // ¡ERROR DE COMPILACIÓN! 130 no cabe en un byte (-128 a 127)

        byte miByte2 = (byte) numeroGrande2; // Forzamos la conversión
        
        System.out.println("El int original: " + numeroGrande2);
        System.out.println("El byte después del casting: " + miByte2); // Muestra -126
        // El resultado es un número extraño porque el valor ha "dado la vuelta" (overflow).
	}

}

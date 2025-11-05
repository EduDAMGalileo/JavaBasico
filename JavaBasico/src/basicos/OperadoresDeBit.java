package basicos;

public class OperadoresDeBit {
	
    public static void main(String[] args) {
    	
        int a = 5; // Binario: ...00000101 (son 32 bits en total)
        int b = 3; // Binario: ...00000011 (son 32 bits en total)

        System.out.println("--- Operadores a Nivel de Bits ---");
        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");
        System.out.println("------------------------------------\n");

        // AND (&)
        int resultadoAnd = a & b; // 0101 & 0011 = 0001
        System.out.println("a & b  = " + resultadoAnd + " (" + Integer.toBinaryString(resultadoAnd) + ")");

        // OR (|)
        int resultadoOr = a | b; // 0101 | 0011 = 0111
        System.out.println("a | b  = " + resultadoOr + " (" + Integer.toBinaryString(resultadoOr) + ")");

        // XOR (^)
        int resultadoXor = a ^ b; // 0101 ^ 0011 = 0110
        System.out.println("a ^ b  = " + resultadoXor + " (" + Integer.toBinaryString(resultadoXor) + ")");

        // NOT (~)
        int resultadoNot = ~a;
        System.out.println("~a     = " + resultadoNot + " (" + Integer.toBinaryString(resultadoNot) + ")");
        
        System.out.println("\n--- Operadores de Desplazamiento ---");
        
        // Desplazamiento a la izquierda (<<)
        int resultadoShiftLeft = a << 1; // 5 * 2 = 10
        System.out.println("a << 1 = " + resultadoShiftLeft + " (" + Integer.toBinaryString(resultadoShiftLeft) + ")");

        // Desplazamiento a la derecha (>>)
        int resultadoShiftRight = a >> 1; // 5 / 2 = 2 (división entera)
        System.out.println("a >> 1 = " + resultadoShiftRight + " (" + Integer.toBinaryString(resultadoShiftRight) + ")");
    }
}


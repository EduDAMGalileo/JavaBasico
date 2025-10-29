package basicos;

public class OperadoresLogicosYMas {

	public static void main(String[] args) {

        // --- 1. Operadores de Incremento y Decremento ---
        System.out.println("--- 1. Operadores de Incremento y Decremento ---");
        
        int contador = 5;
        System.out.println("Valor inicial del contador: " + contador);

        // Incremento (++)
        contador++; // Equivale a: contador = contador + 1;
        System.out.println("Después de contador++: " + contador); 

        // Decremento (--)
        contador--; // Equivale a: contador = contador - 1;
        System.out.println("Después de contador--: " + contador); 
        System.out.println();

        // Diferencia entre PRE-incremento (++variable) y POST-incremento (variable++)
        // Se nota cuando se usa en la misma línea que otra operación (como una asignación o impresión).

        // POST-incremento: Primero usa el valor, LUEGO lo incrementa.
        int a = 5;
        System.out.println("--- POST-incremento (a++) ---");
        System.out.println("El valor de 'a' es: " + a);
        System.out.println("Usando en una impresión (a++): " + (a++)); 
        System.out.println("El valor final de 'a' es: " + a);          
        System.out.println();
        
        // PRE-incremento: Primero incrementa el valor, LUEGO lo usa.
        int b = 5;
        System.out.println("--- PRE-incremento (++b) ---");
        System.out.println("El valor de 'b' es: " + b);
        System.out.println("Usando en una impresión (++b): " + (++b)); 
        System.out.println("El valor final de 'b' es: " + b);          
        System.out.println("\n--------------------------------------------------\n");


        // --- 2. Operadores de Comparación (o Relacionales) ---
        // El resultado de una comparación es siempre un valor booleano (true o false).
        System.out.println("--- 2. Operadores de Comparación (Relacionales) ---");
        
        int num1 = 10;
        int num2 = 5;
        int num3 = 10;
        
        System.out.println("Valores: num1=" + num1 + ", num2=" + num2 + ", num3=" + num3);
        
        boolean resultado;

        // Igualdad (==)
        resultado = (num1 == num2);
        System.out.println("¿num1 == num2? " + resultado);
        resultado = (num1 == num3);
        System.out.println("¿num1 == num3? " + resultado);

        // Desigualdad (!=)
        resultado = (num1 != num2);
        System.out.println("¿num1 != num2? " + resultado);

        // Mayor que (>)
        resultado = (num1 > num2); 
        System.out.println("¿num1 > num2? " + resultado);

        // Menor que (<)
        resultado = (num1 < num2); 
        System.out.println("¿num1 < num2? " + resultado);

        // Mayor o igual que (>=)
        resultado = (num1 >= num3); // 
        System.out.println("¿num1 >= num3? " + resultado);

        // Menor o igual que (<=)
        resultado = (num2 <= num1); // 
        System.out.println("¿num2 <= num1? " + resultado);
        System.out.println("\n--------------------------------------------------\n");


        // --- 3. Operadores Lógicos ---
        // Se usan para combinar expresiones booleanas.
        System.out.println("--- 3. Operadores Lógicos ---");
        
        boolean esMayorDeEdad = true;
        boolean tieneCarnet = false;
        
        System.out.println("Valores: esMayorDeEdad=" + esMayorDeEdad + ", tieneCarnet=" + tieneCarnet);

        // AND Lógico (&&): Devuelve true solo si AMBAS expresiones son true.
        boolean puedeConducir = esMayorDeEdad && tieneCarnet; 
        System.out.println("¿Puede conducir? (esMayorDeEdad && tieneCarnet): " + puedeConducir);

        // OR Lógico (||): Devuelve true si AL MENOS UNA de las expresiones es true.
        boolean puedeEntrarAlLocal = esMayorDeEdad || tieneCarnet; 
        System.out.println("¿Puede entrar al local? (esMayorDeEdad || tieneCarnet): " + puedeEntrarAlLocal);

        // NOT Lógico (!): Invierte el valor booleano.
        boolean noEsMayorDeEdad = !esMayorDeEdad; 
        System.out.println("¿NO es mayor de edad? (!esMayorDeEdad): " + noEsMayorDeEdad);
        
        // Ejemplo combinado
        int edad = 20;
        int nivelAcceso = 8;
        System.out.println("\nValores combinados: edad=" + edad + ", nivelAcceso=" + nivelAcceso);
        boolean esAdmin = (edad > 18) && (nivelAcceso > 7); 
        System.out.println("¿Es administrador? ((edad > 18) && (nivelAcceso > 7)): " + esAdmin);

	}

}

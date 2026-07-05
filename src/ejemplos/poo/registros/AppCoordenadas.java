package ejemplos.poo.registros;

public class AppCoordenadas {
    public static void main(String[] args) {

        // --- ESCENARIO 1: LA VERSIÓN LEGACY (FRÁGIL) ---
        // Problema: Es mutable. Cualquier parte del código puede cambiarla.
        CoordenadaLegacy cLegacy = new CoordenadaLegacy(40.41, -3.70);
        cLegacy.setLatitud(50.00); // Alguien cambia el dato sin permiso (Efecto secundario)
        
        System.out.println("LEGACY:");
        System.out.println("Acceso: " + cLegacy.getLatitud());
        System.out.println("ToString: " + cLegacy.toString()); // Depende de que hayamos generado bien el método
        System.out.println("---------------------------------");


        // --- ESCENARIO 2: LA VERSIÓN INMUTABLE MANUAL ---
        // Ventaja: Es segura (Thread-safe).
        // Problema: La clase ocupa 50 líneas de código para algo muy simple.
        CoordenadaInmutable cInmutable = new CoordenadaInmutable(40.41, -3.70);
        
        // cInmutable.setLatitud(50.00); // ¡ERROR DE COMPILACIÓN! El compilador nos protege.
        
        System.out.println("INMUTABLE MANUAL:");
        System.out.println("Acceso: " + cInmutable.getLatitud());
        System.out.println("ToString: " + cInmutable.toString());
        System.out.println("---------------------------------");


        // --- ESCENARIO 3: LA REVOLUCIÓN (RECORD) ---
        // Ventaja: Todo lo anterior en 1 sola línea de código.
        Coordenada cRecord = new Coordenada(40.41, -3.70);
        Coordenada cRecordCopia = new Coordenada(40.41, -3.70);

        System.out.println("RECORD (JAVA 14+):");
        // Observad el cambio de sintaxis: No usamos 'get'. 
        // Accedemos al componente de forma directa y transparente.
        System.out.println("Acceso: " + cRecord.latitud()); 
        
        // El toString() viene "de fábrica" y es perfecto.
        System.out.println("ToString: " + cRecord); 

        // Comparación de igualdad: Java compara los DATOS, no las direcciones de memoria.
        // El equals() y hashCode() funcionan automáticamente sin haber escrito una línea.
        boolean sonIguales = cRecord.equals(cRecordCopia);
        System.out.println("¿Son iguales por contenido?: " + sonIguales);
        System.out.println("---------------------------------");
    }
}
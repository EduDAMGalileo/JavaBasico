package ejemplos.colecciones.listas;

public class appBatallaListas {
    public static void main(String[] args) {
        BatallaListas app = new BatallaListas();
        
        // Cuidado: Si ejecutas esto en casa con un número muy alto en ArrayList,
        // tu programa podría quedarse "congelado" varios segundos o minutos.
        int cantidadLogs = 100000; 
        
        app.demostrarDesastreDesplazamiento(cantidadLogs);
        
        // Sugerimos limpieza a la JVM para que la segunda prueba sea justa
        System.gc(); 
        try { Thread.sleep(500); } catch (Exception e){} 
        
        app.demostrarEficienciaNodos(cantidadLogs);
    }


}

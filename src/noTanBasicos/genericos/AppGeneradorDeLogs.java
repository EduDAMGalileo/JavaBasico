package noTanBasicos.genericos;

public class AppGeneradorDeLogs {
    public static void main(String[] args) {
    	
        //Esto son realmente dos métodos distintos
        GeneradorDeLogs.registrarV1(303);
        GeneradorDeLogs.registrarV1("Hola");
        
    	
        // El compilador infiere el tipo automáticamente en cada llamada
        GeneradorDeLogs.registrar("Inicio de sesión"); 
        GeneradorDeLogs.registrar(200);                
        GeneradorDeLogs.registrar(new Tarea("Test", 1)); 
        

    }
}
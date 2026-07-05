package ejemplos.colecciones.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class AppSistemaVotacion {

    public static void main(String[] args) {
        SistemaVotacion app = new SistemaVotacion();
        
        // Demostración del comportamiento del Set
        Set<String> censoElectoral = new HashSet<>();
        
        app.registrarVotanteProfesional(censoElectoral, "12345678Z"); // Voto válido
        app.registrarVotanteProfesional(censoElectoral, "98765432X"); // Voto válido
        app.registrarVotanteProfesional(censoElectoral, "12345678Z"); // Rechazado automáticamente
        
        System.out.println("Total de votos válidos: " + censoElectoral.size()); // Imprimirá 2
    }

}

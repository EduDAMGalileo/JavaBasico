package laboratorios.enumeracion;


import java.util.Arrays;
import java.util.List;
 
public enum Estado {
 
    CREADA {
        @Override
        public List<Estado> siguientes() {
            return Arrays.asList(ASIGNADA, CANCELADA);
        }
    },
    ASIGNADA {
        @Override
        public List<Estado> siguientes() {
            return Arrays.asList(EN_PROGRESO, CANCELADA);
        }
    },
    EN_PROGRESO {
        @Override
        public List<Estado> siguientes() {
            return Arrays.asList(RESUELTA, CANCELADA);
        }
    },
    RESUELTA {
        @Override
        public List<Estado> siguientes() {
            return Arrays.asList();   // estado terminal
        }
    },
    CANCELADA {
        @Override
        public List<Estado> siguientes() {
            return Arrays.asList();   // estado terminal
        }
    };
 
    /**
     * Devuelve la lista de estados a los que se puede ir desde este.
     * Cada valor del enum define los suyos propios.
     */
    public abstract List<Estado> siguientes();
 
    /**
     * Indica si la transición a 'destino' está permitida desde el estado actual.
     */
    public boolean puedeIrA(Estado destino) {
        return siguientes().contains(destino);
    }
}

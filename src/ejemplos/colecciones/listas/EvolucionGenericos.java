package ejemplos.colecciones.listas;

import java.util.ArrayList;

public class EvolucionGenericos {
	public static void main (String[] args) {
		//demostrarPeligroAntiguo();
		demostrarSeguridadModerna();
	}

    public static void demostrarPeligroAntiguo() {
        // MALA PRÁCTICA (Tipos Crudos / Raw Types - Java 1.4 y anterior)
        // No usamos <T>. Esta lista admite cualquier Object.
        ArrayList listaAntigua = new ArrayList(); 
        
        listaAntigua.add(new Cliente("111A", "Ana"));
        listaAntigua.add(new Cliente("222B", "Luis"));
        
        // ¡Peligro! Un compañero despistado mete una cadena de texto sin querer
        listaAntigua.add("Esto es un simple texto"); 
        
        // El compilador no se queja. Todo parece correcto.
        for (int i = 0; i < listaAntigua.size(); i++) {
            // Obligados a usar el casteo explícito (Cliente)
            // Cuando 'i' valga 2, intentará castear el String a Cliente.
            // RESULTADO: ¡ClassCastException en tiempo de ejecución y la app se cierra!
            Cliente c = (Cliente) listaAntigua.get(i); 
            System.out.println(c.getNombre());
        }
    }

    public static void demostrarSeguridadModerna() {
        // ESTÁNDAR (Uso de Genéricos - Java 5 en adelante)
        // Obligamos a la lista a admitir única y exclusivamente objetos Cliente.
        ArrayList<Cliente> listaModerna = new ArrayList<>();
        
        listaModerna.add(new Cliente("111A", "Ana"));
        listaModerna.add(new Cliente("222B", "Luis"));
        
        // Si nuestro compañero intenta colar un texto...
        //listaModerna.add("Esto es un simple texto"); 
        // RESULTADO: Error de COMPILACIÓN. El código ni siquiera se ejecuta. 
        // El error se detecta y se soluciona en el acto.
        
        for (int i = 0; i < listaModerna.size(); i++) {
            // Como la lista está tipada con <Cliente>, get(i) devuelve un Cliente real.
            // Ya no hay casteo. El código es 100% seguro.
            Cliente c = listaModerna.get(i);
            System.out.println(c.getNombre());
        }
    }
}
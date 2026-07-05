package ejemplos.poo;

public class Sociov2 {
    private int numeroCarnet;
    private String nombre;

    public Sociov2(int numero, String nombre) {
        this.numeroCarnet = numero;
        this.nombre = nombre;
    }

    // SOBRESCRIBIMOS toString: Para que el objeto sepa presentarse
    @Override
    public String toString() {
        return "Socio #" + numeroCarnet + " [" + nombre + "]";
    }

    // SOBRESCRIBIMOS equals: Dos socios son iguales si tienen el mismo carnet
    @Override
    public boolean equals(Object obj) {
        // 1. Si apuntan a la misma memoria, son el mismo
        if (this == obj) return true;
        // 2. Si el otro es nulo o de otra clase, no son iguales
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // 3. Comparamos el dato que nos interesa (el carnet)
        Sociov2 otroSocio = (Sociov2) obj;
        return this.numeroCarnet == otroSocio.numeroCarnet;
    }
}

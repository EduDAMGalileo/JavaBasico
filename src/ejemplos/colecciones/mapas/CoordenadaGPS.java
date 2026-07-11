package ejemplos.colecciones.mapas;

import java.util.Objects;

public class CoordenadaGPS {
    private double latitud;
    private double longitud;

    public CoordenadaGPS(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    // Sobrescribimos equals para que el Mapa sepa identificar si dos coordenadas son la misma
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoordenadaGPS that = (CoordenadaGPS) o;
        return Double.compare(that.latitud, latitud) == 0 && 
               Double.compare(that.longitud, longitud) == 0;
    }

    // EL PUNTO CRÍTICO: 
    // No hay caché. Cada vez que alguien invoque este método, la CPU 
    // tiene que ejecutar la clase Objects, hacer conversiones de Double 
    // y multiplicar. Parece rápido, pero multiplicado por millones...
    @Override
    public int hashCode() {
        return Objects.hash(latitud, longitud);
    }
}
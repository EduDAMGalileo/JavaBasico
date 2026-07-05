package ejemplos.poo.registros;

//ESTÁNDAR DE LA INDUSTRIA (Enfoque pre-Java 14): 
//Aplicación estricta de la inmutabilidad para garantizar la seguridad.

public final class CoordenadaInmutable {
 
 // Atributos declarados como 'final' (Sellados tras el constructor)
 private final double latitud;
 private final double longitud;

 public CoordenadaInmutable(double latitud, double longitud) {
     this.latitud = latitud;
     this.longitud = longitud;
 }

 // Solo Getters. Ausencia total de Setters.
 public double getLatitud() {
     return latitud;
 }

 public double getLongitud() {
     return longitud;
 }

 // Modificación funcional: En lugar de mutar, retornamos una copia nueva
 // Esto evita muchos problemas en programación concurrente
 public CoordenadaInmutable conNuevaLatitud(double nuevaLatitud) {
     // El objeto original permanece intacto. Nace un nuevo objeto.
     return new CoordenadaInmutable(nuevaLatitud, this.longitud);
 }
}

package noTanBasicos.enumeraciones;

//ESTÁNDAR DE LA INDUSTRIA: 
//Polimorfismo interno mediante métodos específicos de la constante.
public enum TamanoCafeV3 {
 
 PEQUENO(250) {
     @Override
     public double calcularSobrecoste(double precioBase) {
         return 0.0; // Sin sobrecoste
     }
 },
 
 MEDIANO(350) {
     @Override
     public double calcularSobrecoste(double precioBase) {
         return 0.50; // Sobrecoste fijo
     }
 },
 
 GRANDE(500) {
     @Override
     public double calcularSobrecoste(double precioBase) {
         return precioBase * 0.20; // Sobrecoste porcentual dinámico
     }
 };

 private final int volumenMl;

 private TamanoCafeV3(int volumenMl) {
     this.volumenMl = volumenMl;
 }

 // Método abstracto: Obliga a CADA constante a proporcionar su propia implementación
 public abstract double calcularSobrecoste(double precioBase);
}

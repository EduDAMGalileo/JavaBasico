package noTanBasicos.enumeraciones;

//Clase refactorizada con Seguridad de Tipos.
public class PedidoCafeModerno {
 
 private TamanoCafe tamanoActual;

 public PedidoCafeModerno(TamanoCafe tamanoActual) {
     this.tamanoActual = tamanoActual;
 }

 public void setTamano(TamanoCafe nuevoTamano) {
     this.tamanoActual = nuevoTamano;
 }
}

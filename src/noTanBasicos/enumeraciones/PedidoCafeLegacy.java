package noTanBasicos.enumeraciones;

//MALA PRÁCTICA / CÓDIGO HEREDADO: 
//Modelado de estados utilizando constantes enteras ("Variables Mágicas").

public class PedidoCafeLegacy {
 
 public static final int TAMANO_PEQUENO = 0;
 public static final int TAMANO_MEDIANO = 1;
 public static final int TAMANO_GRANDE = 2;

 private int tamanoActual;

 public PedidoCafeLegacy(int tamanoActual) {
     this.tamanoActual = tamanoActual;
 }

 public void setTamano(int nuevoTamano) {
     this.tamanoActual = nuevoTamano;
 }
}

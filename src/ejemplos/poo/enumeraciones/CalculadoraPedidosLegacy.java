package ejemplos.poo.enumeraciones;

//MALA PRÁCTICA: 
//Lógica de negocio esparcida fuera de la entidad propietaria de los datos.

public class CalculadoraPedidosLegacy {

 public double calcularSobrecoste(TamanoCafe tamano) {
     switch (tamano) {
         case PEQUENO:
             return 0.0;
         case MEDIANO:
             return 0.50;
         case GRANDE:
             return 1.20;
         default:
             throw new IllegalArgumentException("Tamaño desconocido");
     }
 }
}


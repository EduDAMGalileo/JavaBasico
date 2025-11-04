package basicos;
public class EstructurasCondicionales {
    public static void main(String[] args) {



        //Estructuras condicionales

        //if
    	
    	  int edad = 20;

          if (edad >= 18) {
              System.out.println("El usuario es mayor de edad.");
              System.out.println("Acceso permitido al contenido.");
          }

      
    
    
        //if-else
          
          int numero = -5;

          if (numero >= 0) {
              System.out.println("El número es positivo o cero.");
          } else {
              System.out.println("El número es negativo.");
          }
      

    	//if-else if-else
          int temperatura = 22;

          if (temperatura < 10) {
              System.out.println("Clima: Frío");
          } else if (temperatura < 25) {
              System.out.println("Clima: Templado");
          } else {
              System.out.println("Clima: Caluroso");
          }

        //switch
          char opcion = 'C';

          switch (opcion) {
              case 'A':
                  System.out.println("Has seleccionado la Opción A.");
                  break;
              case 'B':
                  System.out.println("Has seleccionado la Opción B.");
                  break;
              case 'C':
                  System.out.println("Has seleccionado la Opción C.");
                  break;
              default:
                  System.out.println("Opción no válida.");
          }


    }
}

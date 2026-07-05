package ejemplos.poo.herencia;

public class Transaccion {
 private String id;

 // Método FINAL: El orden de estos pasos es ley. Nadie puede alterarlo.
 public final void ejecutarTransaccion() {
     conectarBanco();
     boolean ok = validarFondos();
     if (ok) {
         realizarTransferencia();
         System.out.println("Transacción " + id + " completada con éxito.");
     }
 }

 // Métodos normales: El hijo SÍ puede (y debe) anularlos para darles su propia lógica
 protected void conectarBanco() { 
	 /* Lógica base */
	 }
 protected boolean validarFondos() { 
	 /* Lógica base */
	 return true; 
	 }
 protected void realizarTransferencia() { 
	 /* Lógica base */ 
	 }
}


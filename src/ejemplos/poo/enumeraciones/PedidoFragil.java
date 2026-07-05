package ejemplos.poo.enumeraciones;

//MALA PRÁCTICA: El sistema es un "pasivo" que acepta cualquier texto.

class PedidoFragil {
 private String titulo;
 private String estado; // "PENDIENTE", "PAGADO", "ENTREGADO"

 public PedidoFragil(String titulo) {
     this.titulo = titulo;
     this.estado = "PENDIENTE";
 }

 public void setEstado(String nuevoEstado) {
     // No hay control real. El String es demasiado "ancho".
     this.estado = nuevoEstado;
 }

 public String getEstado() { 
	 return estado; 
	 }
}

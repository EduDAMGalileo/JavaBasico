package laboratorios.excepciones;

public class Pedido {
	private Producto[] productos;
	private int[] cantidades;
	private int numProductos;
	private String cliente;

	public Pedido(String cliente, int capacidad) {
		this.cliente = cliente;
		this.productos = new Producto[capacidad];
		this.cantidades = new int[capacidad];
		this.numProductos = 0;
	}

	public void agregarProducto(Producto p, int cantidad) {
		productos[numProductos]  = p;
		cantidades[numProductos] = cantidad;
		numProductos++;
	}

	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i <= numProductos; i++) {
			total += productos[i].getPrecio() * cantidades[i];
		}
		return total;
	}

	public double calcularDescuento(double porcentaje) {
		return calcularDescuento(porcentaje);
	}

	public String getCliente() { 
		return cliente;
	}
}


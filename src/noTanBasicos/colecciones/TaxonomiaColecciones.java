package noTanBasicos.colecciones;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class TaxonomiaColecciones {
	

	public  void demostrarFaltaDeVision(List<Cliente> lista) {
		// MALA PRÁCTICA (Reinventando la rueda):
		// El programador necesita que no haya clientes duplicados, pero decide
		// usar una List y hacer la comprobación manualmente.
		Cliente nuevoCliente = new Cliente("111A", "Ana");

		// Esto supone un alto coste de rendimiento (la lista debe recorrerse entera
		// cada vez para buscar coincidencias) y ensucia la lógica de negocio.
		if (!lista.contains(nuevoCliente)) {
			lista.add(nuevoCliente);
			System.out.println("Cliente añadido a la lista manualmente.");
		}
	}

	public  void demostrarVisionEstructural() {
		// ESTÁNDAR DE LA INDUSTRIA (Usando la rama correcta del Framework)

		// 1. RAMA SET: Elegimos Set cuando nuestra regla de negocio es la "Unicidad"
		Set<Cliente> conjuntoUnico = new HashSet<>();
		Cliente ana = new Cliente("111A", "Ana");

		conjuntoUnico.add(ana); // Se añade con éxito
		conjuntoUnico.add(ana); // Es ignorado silenciosamente. ¡Cero esfuerzo manual!
		System.out.println("Tamaño del Set: " + conjuntoUnico.size()); // Imprimirá 1

		// 2. RAMA LIST: Elegimos List cuando importa el orden y la posición
		List<Cliente> secuencia = new ArrayList<>();
		secuencia.add(ana); // Ocupa el índice 0
		secuencia.add(ana); // Ocupa el índice 1. (Tolerancia a duplicados)
		System.out.println("Tamaño de la List: " + secuencia.size()); // Imprimirá 2

		// 3. ESTRUCTURA INDEPENDIENTE MAP: Clave-Valor (No hereda de Collection)
		Map<String, Cliente> diccionario = new HashMap<>();
		// No usamos add(), usamos put(K, V). La clave es el DNI, el valor es el objeto.
		diccionario.put("111A", ana); 
		// Búsqueda instantánea en el futuro sin necesidad de bucles:
		Cliente encontrada = diccionario.get("111A"); 
	}
}


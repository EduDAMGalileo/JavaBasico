package noTanBasicosEjercicios.records;

import java.util.Objects;

public class CancionLegacy {
	private String titulo;
	private String artista;
	private int duracion;
	
	public CancionLegacy(String titulo, String artista, int duracion) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getArtista() {
		return artista;
	}

	public int getDuracion() {
		return duracion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(artista, duracion, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CancionLegacy other = (CancionLegacy) obj;
		return Objects.equals(artista, other.artista) && duracion == other.duracion
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "CancionLegacy [titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + "]";
	}
	
}

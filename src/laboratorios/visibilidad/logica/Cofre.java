package laboratorios.visibilidad.logica; 
 
public class Cofre { 
    public String etiqueta = "Cofre de Madera";      // Público 
    protected String claveSecreta = "12345";         // Protegido 
    String contenido = "Monedas de oro";              // Por defecto (Default) 
    private double dineroReal = 5000.0;               // Privado 
} 
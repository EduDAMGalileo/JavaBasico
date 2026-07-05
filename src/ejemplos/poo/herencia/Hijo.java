package ejemplos.poo.herencia;

public class Hijo extends Padre {
    public void test() {
        this.datoPublico = 1;     
        this.datoProtegido = 2;   
        //this.datoPrivado = 3;  // ERROR: El hijo NO lo ve
    }
}
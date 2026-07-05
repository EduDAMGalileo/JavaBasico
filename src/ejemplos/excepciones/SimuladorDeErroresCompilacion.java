package ejemplos.excepciones;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileReader;
import java.sql.DriverManager;

public class SimuladorDeErroresCompilacion {

    public static void main(String[] args) {
        
        System.out.println("Iniciando operaciones de riesgo...");

        /* 
         * RIESGO 1: Interacción con el reloj del Sistema Operativo.
         * La instrucción Thread.sleep(milisegundos) ordena a la CPU que congele 
         * el programa. Java sabe que otro proceso del sistema podría interrumpir 
         * este "sueño" forzosamente.
         *
         * EL IDE SUBRAYA EN ROJO ESTA LÍNEA:
         * "Unhandled exception type InterruptedException"
         */
        Thread.sleep(3000); 

        
        /* 
         * RIESGO 2: Conversión estricta de formatos.
         * La clase SimpleDateFormat intenta traducir un String a un objeto Date.
         * Java no puede garantizar que el texto contenido en la variable respete
         * realmente el formato especificado ("dd/MM/yyyy").
         *
         * EL IDE SUBRAYA EN ROJO ESTA LÍNEA:
         * "Unhandled exception type ParseException"
         */
        SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
        String textoFecha = "Hola, esto no es una fecha";
        Date miFecha = conversor.parse(textoFecha); 


        /* 
         * RIESGO 3: Carga dinámica de clases en memoria.
         * Class.forName() intenta buscar y cargar una clase en la memoria RAM 
         * utilizando únicamente su nombre como texto. Java no puede asegurar 
         * que esa clase realmente exista en el proyecto.
         *
         * EL IDE SUBRAYA EN ROJO ESTA LÍNEA:
         * "Unhandled exception type ClassNotFoundException"
         */
        Class<?> claseDinamica = Class.forName("com.miapp.ClaseSecreta");


        /* 
         * RIESGO 4: Acceso al sistema de archivos del disco duro.
         * FileReader intenta abrir un documento. El archivo podría haber sido 
         * borrado, renombrado, o el usuario podría no tener permisos de lectura.
         * 
         * EL IDE SUBRAYA: "Unhandled exception type FileNotFoundException"
         */
        FileReader archivo = new FileReader("C:/mis_datos/configuracion.txt");


        /* 
         * RIESGO 5: Conexión remota a un motor de Base de Datos.
         * DriverManager intenta establecer un enlace por red. El servidor 
         * podría estar apagado, no haber internet o la contraseña ser errónea.
         * 
         * EL IDE SUBRAYA: "Unhandled exception type SQLException"
         */
        DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "1234");


        System.out.println("Esta línea jamás llegará a compilarse.");
    }
}
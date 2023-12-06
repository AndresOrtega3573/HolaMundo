import java.text.*;
import java.util.Locale;
import java.util.Scanner;


public class OutputVariable {
    public static void main(String[] args) {


        System.out.printf("%d %n", numero);
        System.out.printf("%08d %n", numero);
        System.out.printf("%+d %n" , numero);
        Locale.setDefault(Locale.US);
        DecimalFormat formato1 =  new DecimalFormat( "###,###.##");
        String valorFormato1 = formato1.format(numero);
        System.out.printf("%s %n", valorFormato1);

        //primeraParte
        System.out.println("Manejo de operador condicional");

        //Obtener status

        status = (grade>=7)? "APROBADO": "REPROBADO";
        System.out.println(status);

        // Investigar y escribir el código para modificar la clase OutputVariable.java para
        // que lea por el dispositivo de entrada estándar (teclado) el valor de la variable status
        //RESPUESTA:  Para introducir variables en un programa de Java, puedes utilizar la clase Scanner que se encuentra en el paquete java.util.


    }
}
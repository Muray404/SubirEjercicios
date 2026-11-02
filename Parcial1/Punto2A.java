package Parcial1;


import java.util.Scanner;

/*
Pensamiento computacional


Abstracción: (problema)
* ¿Que se solicita finalmente? (problema)
R/ se solicita hallar el promedio diario de consumo de MB en una semana


* ¿Que informacion es relevante dado el problema anterior?
R/ consumo <= 500 = bajo consumo y consumo > 500 = consumo alto , Solicitar cantidad de MB consumidas y los días de uso (7).


Descomposición:
* ¿Que acciones se requieren?
R/ diasDeConsumo, megasConsumidas, promedioSemanal (MB/7), determinacion (consumo alto o bajo)


* Reutilización de funciones:
R/ Se puede reutilizar Scanner, ingreso de enteros. No reutilizamos funciones


*Diseño de algoritmos (CODIGO):
*/


public class Punto2A {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




        final int diasDeConsumo = 7;
        System.out.println( "\n" + "----------CALCULADOR DE CONSUMO----------"  + "\n");
        int megasConsumidas = leerEntero(input, "¿Cuantas megas consumiste en la semana?: ");
        int promedioSemanal = promedioMegasConsumidas(diasDeConsumo, megasConsumidas);
        String determinacion = determinacion(promedioSemanal);
        String mensaje = mensaje(diasDeConsumo, megasConsumidas, promedioSemanal, determinacion);




        System.out.println(mensaje);


    }
//    ----------------------------------------------------------------------------------------------


    public static int leerEntero(Scanner input, String pregunta) {
        System.out.println(pregunta);
        return input.nextInt();
    }


    //---------------------------------------------------------------------------------------------------------------
    public static int promedioMegasConsumidas(int dias, int megas) {
        return megas / dias;
    }


    //---------------------------------------------------------------------------------------------------------------
    public static String determinacion(int promedio) {




        if (promedio < 500) {
            return " FELICITACIONES POR EL USO RESPONSABLES DE TUS MB \n CONSIDERACIÓN: CONSUMO BAJO";
        } else {
            return "TE ESTAS PASANDO DE LOS LIMITES \n CONSIDERACIÓN: \n ¡¡¡CONSUMO ALTO!!!!";
        }
    }


    //---------------------------------------------------------------------------------------------------------------
    public static String mensaje(int dias, int megas, int promedio, String determinacionConsumo) {




        return  "\n" + "Consumiste un total de: " + megas + "MB" +  "\n" + " En un rango de tiempo de: " + dias + " dias"
                +   "\n" + " Promedio de consumo diario es: " + promedio + "MB" + "\n \n" + determinacionConsumo;
    }
}

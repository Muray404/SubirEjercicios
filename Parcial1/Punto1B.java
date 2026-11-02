package Parcial1;

import java.util.Scanner;

public class Punto1B {

    static void main (String[] args){
        Scanner input = new Scanner(System.in);

        boolean tieneMembresia = leerBoolean(input, "¿Tiene membresia?: ");

//        ----------------------------------------------------------------------------------------------------
        if (tieneMembresia){
            boolean membresiaFamiliar = leerBoolean(input, "¿Tiene membresía familiar?: ");

//            ------------------------------------------------------------------------
            if (!membresiaFamiliar){
                int antiguedad = leerInt(input, "¿Cuantos meses lleva suscrito?: ");

                if (antiguedad >=12){
                    int calificaciones = leerInt(input, "¿Cuantas veces ha calificado peliculas?");

                    if (calificaciones >=5){
                        System.out.println("BENEFICIO: UN MES GRATUITO - POR TENER UNA ANTIGUEDAD MINIMA DE 12 MESES Y HABER CALIFICADO A 5 PELICULAS - ¡¡¡¡¡FELICIDADES!!!!!");
                    }
                    else {
                        System.out.println("NO CUENTA CON BENEFICIOS - NECESITA CALIFICAR A MAS DE 5 PELICULAS PARA OBTENER ESTE BENEFICIO");
                    }
                }
                else {
                    System.out.println("NO CUENTA CON BENEFICIOS - COMO MINIMO NECESITA TENER MAS DE 12 MESES DE MEMBRESÍA CON NOSOTROS PARA OBTENER ESTE BENEFICIO");
                }



//                --------------------------------------------------------------------------
            }

            else {
                System.out.println("BENEFICIO: UN MES GRATUITO POR TENER PLAN FAMILIAR - ¡¡¡¡¡FELICIDADES!!!!!");

            }
//            -------------------------------------------------------------------------------
        }

        else {
            System.out.println("NO CUENTA CON BENEFICIOS - TIENE QUE TENER MEMBRESÍA, CONTAR CON UNA ANTIGUEDAD DE 12 MESES Y HABER CALIFICADO A 5 PELICULAS PARA OBTENER ESTE BENEFICIO");
        }
//        ----------------------------------------------------------------------------------

    }
//    --------------------------------------------------------------------------------------------------

    public static boolean leerBoolean (Scanner input, String pregunta){
        System.out.println(pregunta);
        return input.nextBoolean();
    }


    public static int leerInt (Scanner input, String pregunta){
        System.out.println(pregunta);
        return input.nextInt();
    }

}

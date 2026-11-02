package LDPU1;

import java.util.Scanner;

public class EjercicioParcial2 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int edad = edadJoven(input,"Que edad tiene?: ");

        boolean permiso = tienePermiso(input, "¿Tiene permiso de sus padres?: ");



    }

    public static int edadJoven (Scanner input, String pregunta){
        System.out.println(pregunta);
        return input.nextInt();
    }

    public static boolean tienePermiso (Scanner input, String pregunta){
        System.out.println(pregunta);
        return input.nextBoolean();
    }


    public static int fechaPago (Scanner input, String pregunta){
        System.out.println(pregunta);
        return input.nextInt();
    }

    public static double calcularPrecioEntrada (boolean pagoTardio){
        final double precioFijo = 150000;

        if (pagoTardio){
            return precioFijo * 1.08;
        }
        else {
            return precioFijo;
        }
    }



}

package Parcial1;


import java.util.Scanner;


public class Punto1A {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println( "\n"  + "----------CONTROLADOR DE INGRESO A BIBLIOTECA----------" + "\n");
        boolean indentificacion = identificarPersona(input, "¿Eres docente? (TRUE/FALSE): ");


        if (indentificacion) {
            System.out.println("PUEDE INGRESAR--- BIENVENIDO SR DOCENTE");
        } else {
            int edad = tieneEdadMinima(input, "¿Cuantos años tienes?");




            if (edad >= 16) {




                boolean carnet = tieneCarnet(input, "¿Tiene carnet estudiantil VIGENTE? (TRUE/FALSE): ");




                if (carnet) {
                    System.out.println("PUEDE INGRESAR --- BIENVENIDO FUTUFO PROFESIONAL");
                } else {
                    System.out.println("NO PUEDE INGRESAR - ES NECESARIO TENER CARNET ESTUDIANTIL VIGENTE");
                }
            } else {
                System.out.println("NO PUEDE INGRESAR - ES NECESARIO TENER UNA EDAD MAYOR A 16 - TE FALTA MINIMO " + (16 - edad) + " AÑOS");
            }
        }




    }
//    --------------------------------------------------------------------


    public static boolean identificarPersona(Scanner input, String pregunta) {
        System.out.println(pregunta);
        return input.nextBoolean();
    }


    //    --------------------------------------------------------------------
    public static int ingresarEntero(Scanner input, String pregunta) {
        System.out.println(pregunta);
        return input.nextInt();
    }


    //    --------------------------------------------------------------------
    public static int tieneEdadMinima(Scanner input, String pregunta) {
        System.out.println(pregunta);
        return input.nextInt();
    }


    //    --------------------------------------------------------------------
    public static boolean tieneCarnet(Scanner input, String pregunta) {
        System.out.println(pregunta);
        return input.nextBoolean();
    }
}


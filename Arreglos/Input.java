package Arreglos;

import java.util.Scanner;

public class Input {

   static Scanner input = new Scanner(System.in);

   public static int leerEntero(String mensaje){
       System.out.println(mensaje);
       return input.nextInt();
   }
    public static double leerDouble(String mensaje) {
        System.out.println(mensaje);
        return input.nextDouble();
    }
    public static float leerFloat(String mensaje) {
        System.out.println(mensaje);
        return input.nextFloat();
    }
    public static boolean leerBoolean(String mensaje) {
        System.out.println(mensaje);
        return input.nextBoolean();
    }
    public static String leerTexto(String mensaje) {
        System.out.println(mensaje);
        return input.nextLine();
    }
    public static char leerCharacter(String mensaje) {
        System.out.println(mensaje);
        return input.next().charAt(0);
    }


}

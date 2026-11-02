package LDPU1;

import java.util.Scanner;

public class RetoN1 {

    static void main (String[] args){

        Scanner input = new Scanner(System.in);
        int edad;

        System.out.println("Escribe tu edad: "); //1
        edad = input.nextInt();

        System.out.println("¿Tiene permiso de un adulto? (True o False): "); //2
        boolean  tienePermisoAdulto = input.nextBoolean();

        if (edad>=15 || tienePermisoAdulto){
            System.out.println("Puede ingresar a la sala");
        }
        else {
            System.out.println("NO puede ingresar, NO cuenta con la edad minima");
        }

    }
}

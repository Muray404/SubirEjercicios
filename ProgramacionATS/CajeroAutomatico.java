package ProgramacionATS;

import java.util.Scanner;

public class CajeroAutomatico {

    void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("----------Bienvenido a BBVA----------");
        System.out.println("Escribe la opcion que buscas: \n 1. Ingresar dinero a tu cuenta \n 2. Retirar dinero de tu cuenta \n 3. Salir");

        byte opcion = input.nextByte();
//-----------------------------------------------------------------------------------------------------------
        if (opcion == 1){
            System.out.println("----Ingresar dinero a tu cuenta ----");
            System.out.println("¿Cuanto deseas depositar a tu cuenta?");

            double ingreso = input.nextDouble();

            System.out.println("Dinero depositado, por la cantidad de: " + ingreso);
            System.out.println("SALDO TOTAL DE: " + (1000 + ingreso));
        }
//        --------------------------------------------------------------------------------------------------
        else if (opcion == 2) {
            System.out.println("---- Retirar dinero a tu cuenta ----");
            System.out.println("¿Cuanto deseas retirar a tu cuenta?");

            double egreso = input.nextDouble();

            if (egreso <=1000){
                System.out.println("Dinero retirado, por la cantidad de: " + egreso);
                System.out.println("SALDO TOTAL DE: " + (1000 - egreso));
            }
            else {
                System.out.println("¡¡¡¡SALDO INSUFIENTE, prueba con una cantidad mas baja!!!!");
            }
        }

//        ----------------------------------------------------------------------------------------------------
        else if (opcion == 3) {
            System.out.println("Saliste del BANCO BBVA");
        }

        else {
            System.out.println("ERROR - DEBES ELEGIR UNA OPCION ESTABLECIDA");
        }
    }
}

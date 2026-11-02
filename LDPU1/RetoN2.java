package LDPU1;

import java.util.Scanner;

public class RetoN2 {

    static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("¿Eres estudiante? (True o False): ");
        boolean estudiante = input.nextBoolean();

        System.out.println("Ingresa tu saldo disponible: ");
        float saldoDisponible = input.nextFloat();

        if (estudiante == true && saldoDisponible >=1500){
            System.out.println("----Acceso permitido----");
        }
        else {
            System.out.println("----Acceso NO permitido----");
        }
    }
}

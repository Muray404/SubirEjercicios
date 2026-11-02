package LDPU1;

import java.util.Scanner;

public class RetoN3 {

    static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("¿Es de noche en este momento? (True o False): ");
        boolean noche = input.nextBoolean();

        System.out.println("¿Cuenta con mensualidad activa? (True o False): ");
        boolean mensualidad = input.nextBoolean();

        System.out.println("¿Paga tarifa extra? (True o False): ");
        boolean tarifaExtra = input.nextBoolean();

        if (noche && (mensualidad || tarifaExtra)){
            System.out.println("Tiene acceso\nPuede ingresar");
        }
        else {
            System.out.println("NO tiene acceso");
        }

    }
}

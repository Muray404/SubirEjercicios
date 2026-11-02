package ProgramacionATS;

import java.util.Scanner;

public class Calculadora {

    void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int numero1 = input.nextInt();

        System.out.println("Escribe la operacion que quieres realizar: ");
        char operador = input.next().charAt(0);

        System.out.println("Escribe otro numero: ");
        int numero2 = input.nextInt();

        if (operador == 'S' || operador == 's'){
            System.out.println( "La suma de: " + numero1 + " y " + numero2 + " es: "+ (numero1 + numero2));
        }
        else if (operador == 'R' || operador == 'r'){
            System.out.println("La resta entre: " + numero1 + " y " + numero2 + " es: " + (numero1 - numero2));
        }
        else if (operador == 'P' || operador == 'p' || operador == 'M' || operador == 'm') {
            System.out.println("La mutiplicacion de: " + numero1 + " y " + numero2 + " es: " + (numero1 * numero2));
        }
        else if (operador == 'D' || operador == 'd') {
            System.out.println("La division entre: " + numero1 + " y " + numero2 + " es: " + (numero1 / numero2));
        }

    }

}

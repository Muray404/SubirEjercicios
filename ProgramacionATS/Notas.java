package ProgramacionATS;

import java.util.Scanner;

public class Notas {

    void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Escribe tu calificacion: ");

        float nota = input.nextFloat();



        if (nota <3){
            System.out.println("Nota insuficiente");
        }
        else if (nota >=3 && nota <4){
            System.out.println("Suficiente");
        }
        else if (nota >=4 && nota <4.5) {
            System.out.println("Bien");
        }
        else if (nota >=4.5 && nota < 5) {
            System.out.println("Notable");
        }
        else if (nota == 5) {
            System.out.println("Sobresaliente");
        }
        else {
            System.out.println("INVALIDO - fuera de rango -");
        }

    }
}

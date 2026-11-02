package ProgramacionATS;

import java.util.Scanner;

public class CambioDeMasa {

    static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        float peso;
        char masa;

        System.out.println("--CAMBIO DE MASA-- \n Puedes cambiar tus KILOGRAMOS a: \n Gramos \n Toneladas \n  " + "Escribe la cantidad de KG: ");

        peso = input.nextFloat();

        System.out.println("peso: " + peso + "\n Escribe a que quieres convertir (gramo o tonelada)");
        masa = input.next().charAt(0);

        if (masa == 'g'){
            System.out.println("La cantidad de " + peso + " KG en gramos es: " + (peso*1000) + "g");
        }
        else if (masa == 't') {
            System.out.println("La cantidad de " + peso + " KG en toneladas es: " + (peso/1000) + "T");
        }
        else {
            System.out.println("ERROR - debes elegir o gramo o tonelada");
        }
    }
}

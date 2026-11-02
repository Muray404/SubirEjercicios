package ProgramacionATS;
import java.util.Scanner;
public class Practica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double [] numeros  = new double [5];

        double sumaPositivos = 0;
        double sumaNegativos = 0;
        int cantidadCeros = 0;

        for (int i=0; i<5; i++){
            numeros[i] = Input.leerEntero("Escribe el numero " +(i+1)+": ");

            if (numeros[i]>0){
                sumaPositivos += numeros[i];
            }
            else if (numeros[i]<0){
                sumaNegativos += numeros[i];
            }
            else {
                cantidadCeros++;
            }
        }

        System.out.println("La media de los numeros positivos es: " + (sumaPositivos/ numeros.length));
        System.out.println("La media de los numeros negativos es: " + (sumaNegativos/ numeros.length));
        System.out.println("La cantidad de ceros es: " + cantidadCeros);

    }
}

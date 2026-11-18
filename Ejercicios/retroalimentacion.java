package Ejercicios;

import java.util.Locale;

public class Practicas2 {

    void main(String[] args) {

        int nPalabras = Input.leerEntero("Escribe la cantidad de palabras a analizar: ");

        String[] palabras = new String[nPalabras];

        for (int i = 0; i < nPalabras; i++) {
            palabras[i] = Input.leerTexto("Escribe la palabra " + (i + 1) + ": ");
        }
        //-----------------------------------------------------------------------------------------------------
        for (int i = 0; i < nPalabras; i++) {
            int vocales = contadorVocales(palabras[i]);
        }


        //-----------------------------------------------------------------------------------------------------

    }

//-------------------------------MAIN LIMITE----------------------------------------------------------------------

    static int contadorVocales (String palabras){
        int vocales = 0;
        palabras = palabras.toLowerCase();


        for (int i =0; i<palabras.length(); i++){

            char letra = palabras.charAt(i);

            switch (letra){
                case 'a', 'b', 'c', 'd':
                    vocales++;
                    break;
            }
        }
        return vocales;
    }
//    ---------------------------------------------------------------------------------------------------

}

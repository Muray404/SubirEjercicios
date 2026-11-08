package Ejercicios;

import java.util.Scanner;

public class Punto1 {

//    -------------------- MAIN --------------------------------------
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int palabras = Input.leerEntero("Ingrese cuantas palabras va a analizar: ");
        String[] textos = new String[palabras];

        for (int i = 0; i < palabras; i++) {
            textos[i] = Input.leerTexto("Ingrese la palabra " + (i + 1) + ": ");
        }

        int totalPalindromos = 0;

        for (int i = 0; i < palabras; i++) {

            boolean palindromo = CalcularPalindromo(textos[i]);
            int vocales = contarVocales(textos[i]);

            if (palindromo) {
                totalPalindromos++;
            }

            System.out.println("\nPalabra " + (i + 1) + ": " + textos[i]);
            System.out.println("Cantidad de vocales: " + vocales);
            System.out.println("Es palindromo: " + palindromo);
        }
        System.out.println("\nTotal de palindromos: " + totalPalindromos);


        System.out.println("\n Palabra con mas vocales: "+ palabraMasVocales(textos));

    }
//    -------------------- MAIN --------------------------------------


// ---------------------------FUNCION 1 ----------------------------

    public static boolean CalcularPalindromo(String texto) {
        boolean palindromo = true;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length() / 2; i++) {
            if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                palindromo = false;
            }
        }
        return palindromo;
    }
//---------------------------FUNCION 2 ---------------------------------------

    public static int contarVocales(String texto) {
        int vocales = 0;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u') {

                vocales++;
            }
        }
        return vocales;
    }

//----------------------------FUNCION 3 ----------------------------------------------

    private static String palabraMasVocales(String[] textos) {
        String palabraConMasVocales = textos[0];

        for (int i = 1; i < textos.length; i++) {
            if (contarVocales(palabraConMasVocales) < contarVocales(textos[i])) {
                palabraConMasVocales = textos[i];
            }
        }

        return palabraConMasVocales;
    }
    }

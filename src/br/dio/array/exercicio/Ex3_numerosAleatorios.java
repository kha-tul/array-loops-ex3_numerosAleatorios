package br.dio.array.exercicio;

import java.util.Random;

public class Ex3_numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt( 100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Sucessores dos Numeros aleatorios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.println((numero+1) + " ");
        }

        System.out.println("\n Antecessores dos Numeros aleatorios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.println((numero-1) + " ");
        }


    }
}

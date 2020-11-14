package app;

import java.io.*;
import java.util.*;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class HeapSortIniciar {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        HeapSort heap = new HeapSort();
        int[] vetorDesordenado = {};
        int opcao;
        int valor;

        System.out.print("\n Programa HeapSrot");

        do {
            System.out.print("\n***********************************");
            System.out.print("\nEntre com a opcao:");
            System.out.print("\n ----1: Inserir");
            System.out.print("\n ----2: Exibir");
            System.out.print("\n ----3: Sair do programa");
            System.out.print("\n***********************************");
            System.out.print("\n-> ");
            opcao = le.nextInt();
    
            switch(opcao) {
                case 1: {
                    System.out.print("\n Informe o valor -> ");
                    valor = le.nextInt();
                    vetorDesordenado = ArrayUtils.add(vetorDesordenado, valor);
                    break;
                }
                case 2: {
                    System.out.print("\n Vetor Original: " + ArrayUtils.toString(vetorDesordenado));
                    
                    heap.heapsort(vetorDesordenado);

                    System.out.print("\n Vetor Ordenado: " + ArrayUtils.toString(vetorDesordenado));
                    
                    break;
                }
            }
        } while(opcao != 3);
    }
}
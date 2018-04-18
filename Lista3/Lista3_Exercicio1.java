/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author leomara
 */
public class Lista3_Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // Lista 3 de Exercícios de Algoritmos
        //Questão 1
        
        Scanner inf = new Scanner (System.in);
        int maior = 0, menor = 1000000, aux;
        int num[] = new int [15];
        
        for(int i = 0; i < 15; i++){
            System.out.println("Informe um valor: ");
            num[i] = inf.nextInt();
            aux = num[i];
            if (menor > aux){
                menor = num[i];
            }
            if (maior < aux){
                maior = num[i];
            }
        }
        
        System.out.println("O maior valor é "+maior+ " e o menor é "+menor);
    }
    
}

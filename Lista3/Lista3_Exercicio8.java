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
public class Lista3_Exercicio8 {
    
    public static void main(String[] args) {
        // Lista 3 de Exercícios de Algoritmos
        //Questão 8
        
        int numero;
        int j = 0;
        int k = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = in.nextInt();
        
        //Contadores j e k que são o valor do contador 0 menos o número digitado
        j = j - numero;
        k = k - numero;

        System.out.println("Os números pares são: ");
        while(j < numero){
            j++;
            //Identificar os números pares
            if(j % 2 == 0){
                System.out.println(j);
            }

        }
        
        System.out.println("Os números ímpares são: ");
        while(k < numero){
            k++;
            //Identificar os números ímpares
            if(k % 2 != 0){
                System.out.println(k);
            }
        }
        
    }
    
}

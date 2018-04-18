/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author leomara
 */
public class Lista1_Exercicio5 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lista 1 de Exercícios de Algoritmos
        //Questão 5
        int num;
                      
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Informe um número inteiro: ");
        
        num = numero.nextInt();
        
        double quadrado = Math.pow(num, 2);
                
        System.out.println("O quadrado do número é: "+quadrado); 
    }
}

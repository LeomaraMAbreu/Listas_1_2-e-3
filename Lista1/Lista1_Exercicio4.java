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
public class Lista1_Exercicio4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lista 1 de Exercícios de Algoritmos  
        //Questão 4
        int A, B;
        int X;
        
        Scanner valor = new Scanner (System.in);      
         
        System.out.println("Informe o valor de A: ");
        A = valor.nextInt();
        System.out.println("Informe o valor de B: ");
        B = valor.nextInt();        
        //Troca o valor de A para B e vice versa
        X=A;
        A=B;
        B=X;
        
        //Imprime o valor de B em A      
        System.out.println("O valor de A: "+A);        
        //Imprime o valor de A em B
        System.out.println("O valor de B: "+B);
    }
    
}

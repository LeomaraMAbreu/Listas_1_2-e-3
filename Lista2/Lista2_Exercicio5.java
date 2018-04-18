/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author leomara
 */
public class Lista2_Exercicio5 {
    
     /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Lista 2 de Exercícios de Algoritmos
       //Questão 5
       
       int valor1, valor2, valor3, soma, mult, opcao;
       double media;
                
        Scanner valor = new Scanner (System.in);
        
        System.out.println("Informe o 1º valor: ");
        
        valor1 = valor.nextInt();
        
        System.out.println("Informe o 2º valor: ");
        
        valor2 = valor.nextInt();
        
        System.out.println("Informe o 3º valor: ");
        
        valor3 = valor.nextInt();
        
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 - Calcular média.");
        System.out.println("2 - Calcular a soma.");
        System.out.println("3 - Calcular multiplicação.");
        
         opcao = valor.nextInt();
        
        if(opcao == 1){
            
           media = valor1 + valor2 + valor3 /3;
            System.out.println("A média é: "+media);
        }
        if (opcao == 2){
            
            soma = valor1 + valor2 + valor3;
            System.out.println("A soma é: "+soma);
        }
        else if(opcao == 3){
            
            mult = valor1 * valor2 * valor3;
            System.out.println("A multiplicação é: "+mult);
        }
    }
    
}

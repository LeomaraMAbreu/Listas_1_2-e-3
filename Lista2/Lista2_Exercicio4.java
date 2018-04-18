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
public class Lista2_Exercicio4 {
    
     /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Lista 2 de Exercícios de Algoritmos
       //Questão 4
       
       int valor1, valor2, valor3, opcao,c = 0, d = 0;
                
        Scanner valor = new Scanner (System.in);
        
        System.out.println("Informe o 1º valor: ");
        
        valor1 = valor.nextInt();
        
        System.out.println("Informe o 2º valor: ");
        
        valor2 = valor.nextInt();
        
        System.out.println("Informe o 3º valor: ");
        
        valor3 = valor.nextInt();
        
        Scanner op = new Scanner (System.in);
        
        System.out.println("Informe C ou D: ");
        
        opcao = op.nextInt();
         
        if (opcao == c){
        if (valor1 < valor2){
            if (valor2 < valor3){
                                     
                System.out.println(valor1+"\n"+valor2+"\n"+valor3);
                
            }
            else if (valor1 < valor3){
                
                System.out.println(valor1+"\n"+valor3+"\n"+valor2);
            }
      
    }
        if (opcao == d){
            if(valor2 < valor3){
                    if(valor1 < valor3){
                    
                    System.out.println(valor2+"\n"+valor1+"\n"+valor3);
                    
                    }
                    else{
                    
                    System.out.println(valor2+"\n"+valor3+"\n"+valor1);
                         }                    
                    }
                    else{
                    
                    System.out.println(valor3+"\n"+valor2+"\n"+valor1);
                    
                    }
            }
        }
    }
    
}

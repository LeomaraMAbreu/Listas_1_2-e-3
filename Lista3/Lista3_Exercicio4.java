/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

/**
 *
 * @author leomara
 */
public class Lista3_Exercicio4 {
    
    public static void main(String[] args) {
        // Lista 3 de Exercícios de Algoritmos
        //Questão 4
        
        // Números entre 1000 e 1999 que são divisíveis por 11 dão o resto 5
        for(int n = 1000; n <= 1999; n++){
            if(n % 11 == 5){
               
               //Imprime os números divisíveis por 11 que dão resto 5
               System.out.println(n);
           }
       }
    }
    
}

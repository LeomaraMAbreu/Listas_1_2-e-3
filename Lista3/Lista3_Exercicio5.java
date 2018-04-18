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
public class Lista3_Exercicio5 {
    
    public static void main(String[] args) {
        // Lista 3 de Exercícios de Algoritmos
       //Questão 5
       
       int valor = 0,
        pares = 0,
        impares = 0;
        
        Scanner dados = new Scanner(System.in);
            //Laço de repetição para ser executado enquanto o valor for menor do que 1000
            while(true){
                System.out.println("Informe um valor inteiro positivo: ");
                    valor = dados.nextInt();
                    if(valor > 1000){
                        break;
                    }
                    //Se o valor for menor do que 1000 e for par o sistema faz a soma dos números pares informados
                    if (valor % 2 == 0) {
                        pares += valor;
                    //Se o valor for ímpar e menor do que 1000, o sistema faz a soma dos números impares informados       
                    } else {
                        impares += valor;
                    }
             }
             //O sistema apresenta na tela o resultado da soma dos valores pares e ímpares
             System.out.println("Soma dos números PARES: " + pares);
             System.out.println("Soma dos números ÍMPARES: " + impares);
        
    }
    
}

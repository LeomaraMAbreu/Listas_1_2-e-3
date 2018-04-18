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
public class Lista1_Exercicio3 {
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Lista 1 de Exercícios de Algoritmos
        //Questão 3
        double raio;
        double altura;
        double PI = 3.14;
                
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o raio: ");
        
        raio = entrada.nextDouble();
        
        System.out.println("Informe a altura: ");
        
        altura = entrada.nextDouble();
        
        double volume = PI * (raio * raio) * altura;
        
        System.out.println("O valor do volume da lata de óleo é: "+volume);
    }
    
}

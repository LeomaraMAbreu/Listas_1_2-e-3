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
public class Lista2_Exercicio3 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lista 2 de Exercícios de Algoritmos
       //Questão 3
        
        double nota1, nota2, nota3;
        double maior;
        double media;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a 1ª nota: ");
        
        nota1 = entrada.nextDouble();
        
        System.out.println("Informe a 2ª nota: ");
        
        nota2 = entrada.nextDouble();
        
        System.out.println("Informe a 3ª nota: ");
        
        nota3 = entrada.nextDouble();
        
        if (nota1 > nota2 && nota1 > nota3){
            
            System.out.println("A 1ª nota é maior que a 2ª e 3ª nota.");
        }
        if (nota2 > nota1 && nota2 > nota3){
            
            System.out.println("A 2ª nota é maior que a 1ª e 3ª nota.");
        }        
        if (nota3 > nota2 && nota3 > nota1){
            
            System.out.println("A 3ª nota é maior que a 1ª e 2ª nota.");
        }
        else if(nota1 == nota2 && nota2 == nota3){
           System.out.println("Todas as notas são iguais!"); 
        }
        
        media = nota1 + nota2 + nota3 / 3;
        
        System.out.println("A média das notas é: "+media);
    }
    
}

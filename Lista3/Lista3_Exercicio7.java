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
public class Lista3_Exercicio7 {
    
    public static void main(String[] args) {
        // Lista 3 de Exercícios de Algoritmos
        //Questão 7
        
        int aluno = 0;
        double mediaFinal = 0;
        double maior = 0;
        double menor = 0;
        
        Scanner in = new Scanner(System.in);

        for (int i = 1; i > 0; i++) {
            System.out.println("Informe a média do aluno: ");
            double media = in.nextDouble();
            //Contador de alunos
            aluno = aluno + 1 ;
            //Soma das médias
            mediaFinal = mediaFinal + media;
            //Condição para descobrir a maior nota
            if(media > maior){
                maior = media;
            } 
            //Condição para descobrir a menor nota
            if(media < menor){
                menor = media;
            }
            if(media < 0){
                i = -1;
            }
        }
        //Cálculo da média dos alunos
        mediaFinal = mediaFinal / aluno;
        
        System.out.println("Média final de todos os alunos: "+mediaFinal);
        System.out.println("Maior média: "+maior);
        System.out.println("Menor média: "+menor);
        
    }
}

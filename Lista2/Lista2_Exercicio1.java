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
public class Lista2_Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lista 2 de Exercícios de Algoritmos
       //Questão 1
        
        int num;
        String saida = "";
        //Método para ler o número informado
        Scanner numero = new Scanner (System.in);
        
        //Mostra na tela a mensagem para o usuário digitar o número
        System.out.println("Informe um número: ");
        //Imprime na tela número que foi informado pelo usuário
        num = numero.nextInt();
        
        //Se o número for par e positivo, o sistema apresenta a mensagem abaixo
        if(num % 2 == 0 && num >0){
            saida+="O número é par e positivo.";   
        }
        //Se o número for par e negativo, o sistema apresenta a mensagem abaixo
        if (num % 2 == 0 && num < 0){
            saida+= "O número é par e negativo."; 
        }
        //Se o número for ímpar e positivo, o sistema apresenta a mensagem abaixo
        if (num % 2 != 0 && num > 0){
            saida+="O número é ímpar e positivo."; 
        } 
        //Se o número for ímpar e negativo, o sistema apresenta a mensagem abaixo
        if (num % 2 != 0 && num < 0){
            saida+="O número é ímpar e negativo.";  
        } 
        //Se o número for igual a 0, o sistema apresenta a mensagem abaixo
        else if (num == 0){
            saida+="O número é zero!";
    }   
        // Mensagem apresentada ao usuário quando o número for igual a 0                   
        System.out.println(saida);    
    }
    
}

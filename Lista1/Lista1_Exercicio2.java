/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;


import java.util.Scanner;
import static javafx.print.Paper.C;

/**
 *
 * @author leomara
 */
public class Lista1_Exercicio2 {
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Lista 1 de Exercícios de Algoritmos
        //Questão 2
        double C;
        double F;

        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe a temperatura em graus Centígrados (ºC): ");

        C = entrada.nextInt();        

        double farent = (9 * C + 160) / 5;
        System.out.println("Resposta em Fahrenheit (ºF): "+farent);  

   }
}

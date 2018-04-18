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
public class Lista3_Exercicio3 {
    
    public static void main(String[] args) {
        
        int soma = 0, j = 1;
        
        // Soma dos números do 1/1 ao 99/50
        for (int i = 1; i <= 99; i+=2){
            //Soma é igual a i/j mais a soma
            soma = (i / j) + soma;
            //j recebe j mais 1
            j = j + 1;
           
            //Imprime o valor da soma de 1/1 a 99/50
            System.out.println(soma);
        }
    }
    
}

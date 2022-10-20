/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_01;

import java.util.Scanner;

/**
 *
 * @author Fatec
 */
public class EstruturaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("*** Estrutura Conddicional ***");
        
        int valor1, valor2;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe o 1º valor: ");
        valor1 = leitor.nextInt();
        
         System.out.print("Informe o 2º valor: ");
        valor2 = leitor.nextInt();
        
        System.out.println("\n");
        
        if(valor1 == valor2){ 
            System.out.println("valor1 == valor2");
        }
        if(valor1 != valor2){ 
            System.out.println("valor1 != valor2");
        }
        if(valor1 > valor2){ 
            System.out.println("valor1 > valor2");
        }
        if(valor1 < valor2) {
            System.out.println("valor1 < valor2");
        }
        if(valor1 <= valor2) {
            System.out.println("valor1 <= valor2");
        }
    }
}
        




















        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        // exemplo de uso de "operador ternário"
//        int x = 1, y = 2;
//        // se 'x' e 'y' forem iguais (teste feito com o '?', do operador ternário), 
//        // atribui 4 à variável 'z'; do contrário (simbolizado pelos ":"), atribui 8.
//        int z = (x == y) ? 4 : 8;
//        System.out.println("O valor de 'z' é: " + z);
//        
//        // outro exemplo de operador ternário, atribuindo String
//        float media = 6;
//        String situacaoAluno = (media >= 6) ? "Aluno aprovado." : "Aluno reprovado.";
//        // exibe a situação do aluno
//        System.out.println(situacaoAluno);
//        
//        // comparação de igual entre valores do tipo String
//        String nomeFaculdade = "Fatec";
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("Informe o nome de sua faculdade: ");
//        String faculdadeInformadaPeloUsuario = entrada.next();
//        
//        // para comparação de valores do tipo String, deve-se utilizar sempre o "equals"
//        if (nomeFaculdade.equalsIgnoreCase(faculdadeInformadaPeloUsuario))
//            System.out.println("Parabéns! Ótima opção!");
//        else
//            System.out.println("Ok.");
//    }
//}
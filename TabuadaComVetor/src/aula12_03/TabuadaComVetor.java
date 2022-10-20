/*
2 - Desenvolva um programa ("Aula12_03") que solicite um número ao usuário para 
calcular sua tabuada. Armazene a tabuada desse número num vetor chamado 
"tabuada" e, somente após armazenar todos os resultados, percorra o vetor e 
imprima os valores na tela. Para isso, utilize um "for" e exiba os valores 
com o formato abaixo:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 
etc.
 */
package aula12_03;

import java.util.Scanner;

/**
 *
 * @author Adriel
 */
public class TabuadaComVetor {

    public static void main(String[] args) {
        // programa para geração de tabuada com vetor
        System.out.println("*** Tabuada com vetor ***");
        Scanner sc = new Scanner(System.in);
        // solicita valor informado pelo usuário
        System.out.print("Informe um número para cálculo de sua tabuada: ");
        int nro = sc.nextInt();
        
        // declara e inicializa vetor de 10 posições para armazenamento da tabuada
        int tabuada[] = new int[10];
        int indice = 0;
        // calcula a tabuada e já a armazena em cada posição do vetor
        while(indice < tabuada.length){
            // utiliza a mesma variável do índice para realizar o cálculo da tabuada
            tabuada[indice] = nro * (indice + 1);
            indice++;
        }
        
        // percorre o vetor inteiro (utilizando "for") para imprimir seus valores
        for (int i = 0; i < tabuada.length; i++){
            System.out.println(String.format("%d x %d = %d", nro, (i + 1), tabuada[i]));
        }
    }
}

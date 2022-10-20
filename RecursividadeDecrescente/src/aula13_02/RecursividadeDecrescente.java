/*
1 - Inicie um novo projeto ("Aula13_02") e, com uma função recursiva, repita o 
exercício do primeiro exemplo de recursão, porém, faça a impressão decrescente de 10 a 1.
 */
package aula13_02;

/**
 *
 * @author Adriel
 */
public class RecursividadeDecrescente {

    public static void main(String[] args) {
        
        System.out.println("*** Recursividade Decrescente ***");
        
        int x = 1;
        System.out.println("[main - recursão de cabeça/head] Valor de 'x' antes da função: " + x);
        imprimirRecursividadeDecrescente(x);
        System.out.println("[main - recursão de cabeça/head] Valor de 'x' após a função: " + x);
        
        x = 10;
        System.out.println("[main - recursão de cauda/tail] Valor de 'x' antes da função: " + x);
        imprimirRecursividadeDecrescenteOutra(x);
        System.out.println("[main - recursão de cauda/tail] Valor de 'x' após a função: " + x);
    }
    
    private static void imprimirRecursividadeDecrescente(int i) {
        if (i < 10) {
            imprimirRecursividadeDecrescente(i + 1);
        }
        System.out.println("[recursão decrescente] Saindo da função recursiva: " + i);
    }    

    private static void imprimirRecursividadeDecrescenteOutra(int i) {
        System.out.println("[recursão decrescente] Entrando na função recursiva: " + i);
        if (i > 1) {
            imprimirRecursividadeDecrescenteOutra(i - 1);
        }
    }    
}

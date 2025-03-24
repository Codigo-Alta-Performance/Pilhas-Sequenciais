package Ex04;

import pilhas.PilhaInt;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt();
        int[] vetor = new int[pilha.N];
        pilha.init();
        int digito;
        int i = 0;
        //Inserção de valores
        do {
            System.out.println("Insira um valor: ");
            digito = sc.nextInt();
            if(digito > 0){
                vetor[i] = digito;
                pilha.push(digito);
                i++;
            }

        } while (digito > 0 );

        /*
        while(digito > 0) {
            System.out.println("Insira um valor: ");
            digito = sc.nextInt();

            vetor[i] = digito;
            pilha.push(digito);
            i++;
        }
        */

        //Verificação se é um palíndromo
        i = 0;
        int v;
        boolean check = true;
        while(!pilha.isEmpty() && check) {
            v = pilha.pop();
            if (v != vetor[i]) {
                System.out.println("O valor não é um palíndromo!");
                check = false;
            }
            i++;
        }

        if (check) {
            System.out.println("O valor digitado é um palíndromo");
        }
    }
}

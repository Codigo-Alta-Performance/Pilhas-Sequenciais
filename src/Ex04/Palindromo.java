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
        do {
            System.out.println("Insira um valor: ");
            digito = sc.nextInt();
            if(digito > 0){
                vetor[i] = digito;
                pilha.push(digito);
                i++;
            }

        } while (digito > 0 );
        //pilha.pop();

        /*
        while(digito > 0) {
            System.out.println("Insira um valor: ");
            digito = sc.nextInt();

            vetor[i] = digito;
            pilha.push(digito);
            i++;
        }
        */
        i = 0;
        int v;
        boolean check = false;
        while(!pilha.isEmpty()) {
            v = pilha.pop();
            if (v != vetor[i]) {
                System.out.println("O valor não é um palíndromo!");
                break;
            } else {
                check = true;
            }
            i++;
        }

        if (check) {
            System.out.println("O valor digitado é um palíndromo");
        }
    }
}

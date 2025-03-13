package Teste;

import pilhas.PilhaInt;

public class MainTeste {
    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        pilha.isEmpty();
        pilha.push(10);
        pilha.push(12);
        pilha.push(22);
        pilha.push(33);
        pilha.push(44);
        pilha.push(55);
        pilha.push(66);

        if(pilha.isEmpty()) {
            System.out.println("A pilha está vazia");
        } else {
            int valor = pilha.pop();
            System.out.println("Valor retirado da pilha: " + valor);
        }


    }
}

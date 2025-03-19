package Teste;

import pilhas.PilhaInt;

public class MainTeste {
    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        pilha.isEmpty();
        pilha.init();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        System.out.print("Valor no topo da pilha: ");
        pilha.top();
        if(pilha.isEmpty()) {
            System.out.println("A pilha está vazia");
        } else {
            int valor = pilha.pop();
            System.out.println("Valor retirado da pilha: " + valor);
        }
        System.out.print("Valor no topo da pilha: ");
        pilha.top();

        pilha.esvaziar();

        pilha.push(7);
        pilha.top();

    }
}

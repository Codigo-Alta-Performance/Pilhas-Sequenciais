package Teste;

import pilhas.PilhaInt;

public class MainTeste {
    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        int v;
        pilha.init();
        pilha.isEmpty();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        if(pilha.isEmpty()) {
            System.out.println("A pilha está vazia");
        } else {
            System.out.print("Valor no topo da pilha: ");
            v = pilha.top();
            System.out.println(v);
        }


        pilha.esvaziar();


        pilha.push(15);
        v = pilha.top();
        System.out.println("Valor inserido: " + v);
    }
}

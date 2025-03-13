package pilhas;

public class PilhaInt {
    final int N = 6;
    int[] dados = new int[N];
    int topo;

    public void init() {
        topo = 0;
    }

    public boolean isFull() {
        /*
        if(topo == N) {
            return true;
        } else {
            return false;
        }
        */
        return (topo == N);
    }

    public boolean isEmpty() {
        return (topo == 0);
    }

    public void push(int valor){
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            dados[topo] = valor;
            topo++;
        }

    }

    //O pop retira o elemento do topo da pilha e armazena em uma variável
    //Portanto, esse método precisa retornar o valor que está no topo
    public int pop() {
        topo--;
        return dados[topo];
    }



}

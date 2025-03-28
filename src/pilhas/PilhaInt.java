package pilhas;

public class PilhaInt {
    public final int N = 8;
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

    //O top é a mesma coisa do pop, o valor precisa ser armazenado em uma variável
    public int top() {
        return dados[topo - 1];
    }

    public void esvaziar() {
        /*
        for(int i = topo - 1; i >= 0; i--){
            System.out.println("Valor retirado: " + dados[i]);
        }
        topo = 0;
        */
        while(!isEmpty()) {
            //System.out.println("Valor retirado: " + pop());
            System.out.print(pop() + "\t");
        }

    }

}

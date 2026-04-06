public class pilhaArray {
    //armazena dados, literalmente a pilha
    private int[] pilha;
    //guarda informacao do ultimo negocioadicionado
    private int topo;
    //tamanho maximo
    private int capacidade;

    //funcao principal q o main executa
    public pilhaArray(int tamanho) {
        //usa valor capacidade pra da o tamanho da pilha
        capacidade = tamanho;
        //cria o array com o tamanho da capacidade
        pilha = new int[capacidade];
        //topo e = -1 pra comecar vazia a pilha
        topo = -1;
    }
    //verifica se ta vazia, se topo for -1.
    public boolean isEmpty() {
        return topo == -1;
    }
    //verifica se esta cheia se topo for msm valor que capacidade
    public boolean isFull(){
        return topo == capacidade-1;
    }
    //comando pra inserir, verifica se pilha ta cheia
    public void push(int valor) {
        if (isFull()) {
            System.out.println("pilha cheia");
            return;
        }
        topo++;
        pilha[topo] = valor;
        System.out.println("valor adicionado:" + valor);
    }
    //comando pra retirar item da pilha, usa isempty pra ver se ta vazia antes
    public void pop() {
        if (isEmpty()) {
            System.out.println("pilha vazia");
            return;
        }

        System.out.println("valor removido: " + pilha[topo]);
        topo--;
    }
    //comando pra ver qual valor ta no topo, n altera nada
    public void peek(){
        if (isEmpty()) {
            System.out.println("pilha vazia");
            return;
        }
        System.out.println("valor topo: " + pilha[topo]);
    }
    //display msotra td q ta na lista
    public void display(){
        if (isEmpty()) {
            System.out.println("pilha vazia");
            return;
        }
        //for comeca do topo e vai indo pra baixo mostrando valor
        for (int i = topo; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }

}

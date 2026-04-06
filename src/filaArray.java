public class filaArray {
    //mesma estrutura de pilha, mas com inicio e fim, aq so armazena os valor
    private int fila[];
    private int inicio;
    private int fim;
    private int capacidade;
    //funcao principal, aq gera a fila baseado ao valor de capacidade
    //fim -1 pq n tem nada
    public filaArray(int tamanho){
        capacidade = tamanho;
        fila = new int[capacidade];
        inicio = 0;
        fim = -1;
    }
    //verifica se ta vaziu se inicio tiver algum valor maior que nada
    public boolean isEmpty() {
        return fim < inicio;
    }
    //verifica se ta cheio quando fim tem mesmo valor q capacidade
    public boolean isFull() {
        return fim == capacidade - 1;
    }
    //adiciona um item ao fim da linha
    public void enqueue(int valor) {
        if (isFull()) {
            System.out.println("fila cheia");
            return;
        }

        fim++;
        fila[fim] = valor;
        System.out.println("valor inserido: " + valor);
    }
    //remove valor do inicio da linha, pq linha e FIFO, first in first out
    //sendo primeiro valor adicionado, e o primeiro a sair
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("fila vazia");
            return;
        }

        System.out.println("valor removido: " + fila[inicio]);
        inicio++;
    }
    //front nao troca a fila, so mostra o PRIMEIRO valor adicionado. variavel inicio.
    public void front() {
        if (isEmpty()) {
            System.out.println("fila vazia");
            return;
        }

        System.out.println("valor do inicio: " + fila[inicio]);
    }
    //mesmo que front, mas usa um for que vai mostrando do primeiro valor ao ultimo
    public void display() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return;
        }

        for (int i = inicio; i <= fim; i++) {
            System.out.println(fila[i]);
        }
    }
}
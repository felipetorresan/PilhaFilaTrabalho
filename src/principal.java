//imports de dependencia scanner que le dadod digitados
import java.util.Scanner;

//classe main que vai ser executada
public class principal {
    public static void main(String[] args) {
        //cria cria scanner pricipal, define nomo de sc
        // usado por sc.nextInt e outros comando
        Scanner sc = new Scanner(System.in);

        //comeco da estrutura, adiciona uma pilha e fila, dado tamanho 5 para exemplo
        pilhaArray pilha = new pilhaArray(5);
        filaArray fila = new filaArray(5);

        //menu principal, variavel de opcao selecionada
        int opcao;
        // prints pro menu principal
        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("\nEXEMPLOS FILA E PILHA");
            System.out.println("1 - pilha");
            System.out.println("2 - fila");
            System.out.println("0 - sair");
            //muda opcao dependendo do que for pressionado no teclado, aq usa o scanner
            opcao = sc.nextInt();
            //switch basico pra definir as teclas (1,2 e 0, todas outras dao opcao invalida)
            switch (opcao) {
                case 1:
                    menuPilha(sc, pilha);
                    break;

                case 2:
                    menuFila(sc, fila);
                    break;

                case 0:
                    System.out.println("sistema terminado");
                    break;

                default:
                    System.out.println("opcao invalida");
            }
        //repeticao do menu, se OPCAO nao(!) for 0, menu vai continuar aparecendo
        //se menu for zero, termina o loop e fecha o menu
        } while (opcao != 0);
    }
//menu da pilha, usa o array da pilha
    public static void menuPilha(Scanner sc, pilhaArray pilha) {
        //outra variavel pra opcao
        int op;
        //prints pro menu
        do {
            System.out.println("\nMENU PILHA");
            System.out.println("1 - empilhar");
            System.out.println("2 - desempilhar");
            System.out.println("3 - topo");
            System.out.println("4 - verificar vazia");
            System.out.println("5 - verificar cheia");
            System.out.println("6 - exibir");
            System.out.println("0 - voltar");
            //scanner de opcao, detecta teclado
            op = sc.nextInt();
            //switch definindo as opcao pra selecional
            switch (op) {
                case 1:
                    System.out.print("Digite o valor: ");
                    pilha.push(sc.nextInt());
                    break;
                case 2:
                    pilha.pop();
                    break;
                case 3:
                    pilha.peek();
                    break;
                case 4:
                    System.out.println(pilha.isEmpty() ? "Vazia" : "Não vazia");
                    break;
                case 5:
                    System.out.println(pilha.isFull() ? "Cheia" : "Não cheia");
                    break;
                case 6:
                    pilha.display();
                    break;
                default:
                    System.out.println("opcao invalida");
            }
            //while pra loop do menu, msm que antes
        } while (op != 0);
    }
        //menu de fila
        // mesmos passos que menus anteriores mas com opcoes diferentes
    public static void menuFila(Scanner sc, filaArray fila) {
        //variavel de opcao diferente
        int opc;
        do {
            System.out.println("\n=== MENU FILA ===");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Primeiro elemento");
            System.out.println("4 - Verificar vazia");
            System.out.println("5 - Verificar cheia");
            System.out.println("6 - Exibir");
            System.out.println("0 - Voltar");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Digite o valor: ");
                    fila.enqueue(sc.nextInt());
                    break;
                case 2:
                    fila.dequeue();
                    break;
                case 3:
                    fila.front();
                    break;
                case 4:
                    System.out.println(fila.isEmpty() ? "Vazia" : "Não vazia");
                    break;
                case 5:
                    System.out.println(fila.isFull() ? "Cheia" : "Não cheia");
                    break;
                case 6:
                    fila.display();
                    break;
                default:
                    System.out.println("opcao invalida");
            }
        } while (opc != 0);
    }
}
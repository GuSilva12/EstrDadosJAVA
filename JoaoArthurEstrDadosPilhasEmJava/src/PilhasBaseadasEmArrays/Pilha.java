package PilhasBaseadasEmArrays;

//PILHA (LIFO): toda adição (push()) é feita no topo da pilha e toda remoção é feita também no topo (pop())
//LIFO -> Last In, First Out

import java.util.NoSuchElementException;

public class Pilha {

    //ATRIBUTOS DA CLASSE "Pilha"
    private int topo;   //Delimita quem está no topo da pilha (ela estará entre 0 e o topo)
    private String[] pilha;     //A pilha será construída sob a abstração (ideia) de um array


    //CONSTRUCTOR
    public Pilha(int capacidade){
        //inicializando o topo da pilha em -1 (vazio/NULL)
        this.topo = -1; //Uma vez que os índices de um array começam em 0, usar -1 como representação de lista vazia (NULL) se torna mais claro

        //inicializa o array "pilha" com o tamanho especificado pelo constructor, usando como parâmetro o atributo "capacidade"
        this.pilha = new String[capacidade];
    }

    //MÉTODOS
    public boolean isEmpty(){   //Verifica se a pilha está vazia (-1)
        return this.topo == -1;
    }


    public void push (String element){    //O método recebe uma String como parâmetro, que será o elemento a ser adicionado na pilha
        if(isFull()) throw new RuntimeException("Pilha cheia!!!");   //Verifica se a pilha está previamente cheia. Se sim, imprime uma mensagem
        this.pilha[++this.topo] = element;
        /*
        Incrementa o valor de topo em 1, usa de índice para o array e,
        em seguida, insere o elemento na pròxima posição disponível na pilha.
        "elemento" é o valor a ser atribuído na posição indicada pelo array
        */
    }

    public boolean isFull(){    //Verifica se a pilha está cheia (topo)
        return this.topo + 1 == this.pilha.length;
        /*
        compara se a posição do próximo elemento a ser inserido (topo+1)
        é igual ao tamanho total da pilha. Se for, não há mais espaço, logo, a pilha está cheia
        */
    }

    public String pop(){    //remove e retorna o elemento do topo
        if(isEmpty()) throw new NoSuchElementException();   //Verifica se a pilha está vazia. Caso esteja, lança uma exceção, indicando que não há elemento a ser removido
        return this.pilha[this.topo--]; //Retorna o elemento no topo da pilha, decrementa o valor de "topo" e remove o elemento do topo da pilha
    }

    public String peek(){    //retorna o elemento da pilha sem removê-lo
        if (isEmpty()) throw new NoSuchElementException();   //Verifica se a pilha está vazia. Caso esteja, lança uma exceção, indicando que não há elemento a ser vizualizado
        return this.pilha[this.topo];   //retorna o elemento no topo da pilha, sem modificá-la
    }
}

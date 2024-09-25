package PilhasBaseadasEmArrays;

public class PilhaTest {
    public static void main(String[]args){

        //Instanciando uma pilha com capacidade para 5 elementos
        Pilha pilha01 = new Pilha(5);

        //Testando push
        pilha01.push("A");
        pilha01.push("B");
        pilha01.push("C");

        //Testando peek
        System.out.println("Elemento no topo: " + pilha01.peek());  //O elemento no topo é "C"

        //Testando pop
        System.out.println("Foi removido o elemento: " + pilha01.pop());  //Deve imprimir "C"
        System.out.println("Foi removido o elemento: " + pilha01.pop());  //Deve imprimir "B"

        //Testando isEmpty
        System.out.println("A pilha está vazia? " + pilha01.isEmpty());

        //Testando isFull
        while (!pilha01.isFull()){
            pilha01.push("X"); // Preenche a pilha até ficar cheia
        }
        System.out.println("A pilha está cheia? " + pilha01.isFull());
    }
}

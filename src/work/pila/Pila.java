package src.work.pila;

public class Pila <T> {

    int top;
    T[] pila;

    Pila () {
        top = -1;
        pila = (T[]) new Object[10];
    }

    void push(T data){
        if (!isFull()) {
            top++;
            pila[top] = data;
        }
    }

    T pop() {
        T data = null;
        
        if (!isEmpty()){
            data = pila[top];
            top--;
        }

        return data;
    }

    T peek(){
        return pila[top];
    }

    boolean isFull(){
        return top == 9;
    }

    boolean isEmpty(){
        return top == -1;
    }

    public static void main(String[] args) {
        Pila pila = new Pila();
        
        for(int i = 0; i < 10; i++)
            pila.push(i);

        System.out.println("Esta vacia?: " + pila.isEmpty());
        System.out.println("Esta lleno?: " +  pila.isFull());
        System.out.println("peek: " + pila.peek());

        for(int i = 0; i < 9; i++)
            pila.pop();

        System.out.println("peek: " + pila.peek());
        pila.pop();
        System.out.println("Esta vacia?: " + pila.isEmpty());
        System.out.println("Esta lleno?: " +  pila.isFull());
    }

}
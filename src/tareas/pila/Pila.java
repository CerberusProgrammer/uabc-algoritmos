package src.tareas.pila;

public class Pila <T> {

    int top;
    int max;
    int min;
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
        return top == 10;
    }

    boolean isEmpty(){
        return top == -1;
    }

    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        System.out.println(pila.peek());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.peek());
    }

}
package src.tareas.pila;

public class Pila <T> {

    int top;
    int max;
    int min;
    T[] pila;

    Pila () {
        top = -1;
        Pila = (T[]) new Object[10];
    }

    push(T data){
        if (!isFull()) {
            top++;
            pila[top] = data;
        }
    }

    T pop() {
        T data;
        
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
        
    }

}
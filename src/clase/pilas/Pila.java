package src.clase.pilas;

public class Pila<T> {

    int top;
    T[] pila;

    Pila(){
        tope = -1;
        Pila = (T[]) new Object[10];
    }

    void push(T object){

    }

    T pop(){
        T data;
        if (isEmpty())
            return null;
        else {
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
        //Pila pila = (T[]) new Object[10];
        Pila pila = new Pila();
        
    }
}

package src.clase.estructura_datos.pilas;

public class Pila<T> {

    int top;
    T[] pila;

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

    boolean isFull(){
        return top == 10;
    }

    boolean isEmpty(){
        return top == -1;
    }


    T peek(){
        return pila[top];
    }


    public static void main(String[] args) {
        //Pila pila = (T[]) new Object[10];
    }
}

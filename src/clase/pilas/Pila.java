<<<<<<< HEAD
package src.clase.pilas;
=======
package pilas;
>>>>>>> 602613d3544b48ebb937870641bf44d3904df914

public class Pila<T> {

    int top;
    T[] pila;

    Pila(){
<<<<<<< HEAD
        tope = -1;
        Pila = (T[]) new Object[10];
    }

    void push(T object){
=======
        
    }
>>>>>>> 602613d3544b48ebb937870641bf44d3904df914

    void push(T data){
        if (!isFull()){
            top++;
            pila[top] = data;
        }
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

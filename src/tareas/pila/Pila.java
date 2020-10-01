package src.tareas.pila;

public class Pila <T> {

    int top;
    int max;
    int min;

    Pila () {
        
    }

    push(T data){
        if (!isFull()) {
            tope++;
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

    boolean isFull() {
        if(top == max)
            return true;

        return false;
    }

    boolean isEmpty() {
        if(top == min){
            return true;
        }

        return False;
    }

    T peek(){
        T data;

        return data;
    }

    public static void main(String[] args) {
        
    }

}
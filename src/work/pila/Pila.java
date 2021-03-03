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

    public static boolean checkCharacters(String string) {
        Pila<String> original = new Pila<>();
        Pila<String> reverso = new Pila<>();

        for (int i = 0; i < string.length(); i++)
            original.push(string.substring(i, i + 1));

        for (int i = string.length(); i > 0; i--)
            reverso.push(string.substring(i - 1, i));
        
        for (int i = 0; i < string.length()/2; i++) {
            int x = (int)reverso.pop().charAt(0) + 2;
            int y = (int)original.pop().charAt(0);

            if (!(x == y || x - 1 == y))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("{[(]}]: " + checkCharacters("{[(]}]")); //false     
        System.out.println("{[()]}: " + checkCharacters("{[()]}")); //true
        System.out.println("({[]}): " + checkCharacters("({[]})")); //true    
        System.out.println("[{()}]: " + checkCharacters("[{()}]")); //true
        System.out.println("[)[](]: " + checkCharacters("[)[](]")); //false     
        System.out.println("{[)(]}: " + checkCharacters("{[)(]}")); //false
    }
}
package src.work.recursividad;

public class Recursividad {
    
    public static String serieN0(int n) {
        if (n == 0)
            return "0";
        else
            return "" + n + serieN0(n - 1);
    }

    public static String serie0N (int n) {
        if (n == 0)
            return "0";
        else
            return serie0N(n - 1) + n;
    }

    public static int multiplicacion(int n1, int n2) {
        if(n2 == 0)
            return 0;
        else
            return (n1 + multiplicacion(n1, n2 - 1));
    }

    public static int fibonacci(int n){
        if(n == 0 || n == 1)
             return n;
        else
             return fibonacci(n - 1) + fibonacci(n - 2);
   }

    public static boolean esPrimo(int n, int divisor) {
        if(n/2 < divisor)
            return true;
        else
            if(n % divisor == 0)
                return false;
            else
                return esPrimo(n, divisor + 1);
    }

    public static void main(String[] args) {
        System.out.println(esPrimo(11, 2));
        System.out.println(fibonacci(8));
        System.out.println(serieN0(5));
        System.out.println(serie0N(5));
        System.out.println(multiplicacion(2, 4));
    }
}

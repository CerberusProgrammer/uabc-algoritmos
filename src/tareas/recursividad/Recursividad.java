package src.tareas.recursividad;

class Recursividad {

    static String stringToNumber(int number, String string){
        string = "" + number;
        if (number == 0)
            return string;
        else
            return stringToNumber(number - 1, string);
    }

    static int sumasSucesivas(int x, int y){
        if(y == 0)
            return 0;
        else
            return (x + sumasSucesivas(x, y - 1));
    }

    static int potencia(int n, int exp){
        if(exp == 0)
            return 1;
        else if (exp < 0)
            return potencia(n, exp + 1) / n;
        else
            return n * potencia(n, exp - 1);
    }

    static int sumArray(int array[], int positionArray){
        int size = positionArray;

        if (size == 0)
            return array[size];
        else
            return (array[size]) + sumArray(array, size - 1);
    }

    static double calculateSerie(int n){
        double total = 0;

        if (n == 0)
            return total;
        else
            return total = 1 / Math.pow(n, 2) + calculateSerie(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(stringToNumber(10));
    }
}
package src.tareas.recursividad;

class Recursividad {

    String stringToNumber(String number){
        
    }

    int sumasSucesivas(int x, int y){
        if(y == 0)
            return 0;
        else
            return (x + sumasSucesivas(x, y - 1));
    }

    int potencias(int n, int exp){
        if(exp == 0)
            return 1;
        else if (exp < 0)
            return potencia(n, exp + 1) / n;
        else
            return n * potencia(n, exp - 1);
    }

    int sumArray(int array[], int positionArray){
        int size = positionArray;
        int rta;

        if (size == 0)
            return array[size];
        else
            rta = (array[size]) + sumarValores(array, size - 1);
        return rta;
    }

    double calculateSerie(int n){
        double total = 0;

        if (n == 0)
            return total;
        else
            return total = 1 / Math.pow(n, 2) + calculateSerie(n - 1);
    }

    public static void main(String[] args) {
        
    }
}
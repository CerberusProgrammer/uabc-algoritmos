package src.clase.tareas.ABC;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<Producto> arrayList = new ArrayList<>();
        int inventario = 0;

        System.out.println("Bienvenido a tienda ABC \n" +
                "1.- Alta \n" +
                "2.- Baja \n" +
                "3.- Consulta \n");
        int menu = scanner.nextInt();

        switch (menu){
            // Alta
            case 1:
                System.out.println("-- Altas --");
                System.out.println(" Registra los datos del producto \n" +
                        "Nombre del producto: ");
                String name = scanner.next();
                System.out.println("\nPrecio del producto: ");
                int precio = scanner.nextInt();

                arrayList.add(new Producto(inventario, name, precio));

                break;
            // Baja
            case 2:
                System.out.println("Baja");
                break;
            // Consulta
            case 3:
                System.out.println("Consulta");
                break;
            default:
                break;
        }
    }
}

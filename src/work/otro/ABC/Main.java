package src.work.otro.ABC;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> arrayList = new ArrayList<>();
        int inventario = 0;
        int menu = 0;

        do {
            System.out.println("\nBienvenido a tienda ABC \n" +
                    "1.- Alta \n" +
                    "2.- Baja \n" +
                    "3.- Consulta \n" +
                    "4.- Salida");
            menu = scanner.nextInt();

            switch (menu) {
                // Alta
                case 1:
                    System.out.println("-- Altas --");
                    System.out.println(" Registra los datos del producto \n" +
                            "Nombre del producto: ");
                    String name = scanner.next();
                    System.out.println("\nPrecio del producto: ");
                    int precio = scanner.nextInt();

                    arrayList.add(new Producto(inventario, name, precio));
                    System.out.println("Se ha creado con exito: " +
                            arrayList.get(inventario));
                    inventario++;
                    break;
                // Baja
                case 2:
                    System.out.println("-- Baja --");
                    System.out.println("\nIngrese el codigo del producto para eliminarlo: ");
                    int code = scanner.nextInt();

                    for (Producto p : arrayList) {
                        if (p.getCode() == code) {
                            arrayList.remove(p);
                            break;
                        }
                    }

                    System.out.println("\nSe ha hecho la eliminacion con exito.");
                    inventario--;
                    break;
                // Consulta
                case 3:
                    System.out.println("-- Consulta --\n");
                    for (Producto p : arrayList) {
                        System.out.println(p.toString());
                    }
                    break;
                case 4:
                    System.out.println("\nHasta la proxima.");
                    break;
                default:
                    System.out.println("\nEntrada invalida. Intente de nuevo.\n");
                    break;
            }
        } while (menu != 4);

    }
}

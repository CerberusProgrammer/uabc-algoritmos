package src.work.blackbuster;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> arrayList = new ArrayList<>();

        int inventario = 0;
        int menu = 0;

        do {
            System.out.println("\nBienvenido a tienda BlackBuster \n" +
                    "1.- Alta \n" +
                    "2.- Baja \n" +
                    "3.- Consulta \n" +
                    "4.- Renta \n" +
                    "5.- Devolucion \n" + 
                    "6.- Salida");
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
                    System.out.println("\n");

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
                    for (Producto p : arrayList)
                        System.out.println(p.toString());
                    break;
                // Renta
                case 4:
                    System.out.println("-- Renta --\n");
                    System.out.println("¿Que producto desea rentar por su ID?\n");
                    int id = scanner.nextInt();

                    for (Producto p : arrayList) {
                        if (p.getRenta() == false && p.getCode() == id) {
                            System.out.println("Se ha realizado la renta con exito.");
                            p.setRenta(true);
                        }
                    }

                    break;
                case 6:
                    System.out.println("\nHasta la proxima.");
                    break;
                default:
                    System.out.println("\nEntrada invalida. Intente de nuevo.\n");
                    break;
            }
        } while (menu != 4);
    }
}
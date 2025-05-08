
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author feli_
 */
public class Main {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear nueva credencial");
            System.out.println("2. Ver credenciales emitidas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    crearCredencial(scanner);
                    break;
                case 2:
                    verCredenciales();
                    break;
            }
        } while (opcion != 0);
    }
    private static void crearCredencial(Scanner scanner) {
    Singleton singleton = Singleton.getInstancia();
    Credencial nuevaCredencial = singleton.clonarPlantillaPrincipal();

    System.out.print("Ingrese nombre: ");
    nuevaCredencial.setNombre(scanner.nextLine());

    System.out.print("Ingrese cargo: ");
    nuevaCredencial.setCargo(scanner.nextLine());

    System.out.print("Ingrese RUT: ");
    nuevaCredencial.setRut(scanner.nextLine());

    singleton.agregarCredencial(nuevaCredencial);
    System.out.println("Credencial creada con éxito.");
    }

    private static void verCredenciales() {
        Singleton singleton = Singleton.getInstancia();
        if (singleton.estaVacia()) {
            System.out.println("No hay credenciales emitidas.");
        } else {
            for (Credencial c : singleton.getCredenciales()) {
                System.out.println(c.toString());
            }
        }
    }

}


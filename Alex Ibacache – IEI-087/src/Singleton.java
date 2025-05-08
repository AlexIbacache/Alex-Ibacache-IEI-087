
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author feli_
 */
import java.util.ArrayList;

public class Singleton {
    private static Singleton instancia;
    private Credencial plantillaPrincipal;
    private ArrayList<Credencial> credenciales;

    // Constructor privado
    private Singleton() {
        plantillaPrincipal = new Credencial("Nombre", "Cargo", "RUT"); // base
        credenciales = new ArrayList<>();
    }

    // Método de acceso global
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    // Clonar plantilla
    public Credencial clonarPlantillaPrincipal() {
        return plantillaPrincipal.clone(); // Prototype
    }

    // Gestionar lista
    public void agregarCredencial(Credencial c) {
        credenciales.add(c);
    }

    public ArrayList<Credencial> getCredenciales() {
        return credenciales;
    }

    public boolean estaVacia() {
        return credenciales.isEmpty();
    }
}

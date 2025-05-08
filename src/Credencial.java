/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author feli_
 */
public class Credencial implements Cloneable{
    private String nombre;
    private String cargo;
    private String rut;

    public Credencial() {
    }
    public Credencial(String nombre, String cargo, String rut) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    // Prototype
    @Override
    public Credencial clone() {
        try {
            return (Credencial) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cargo: " + cargo + ", RUT: " + rut;
    }
}

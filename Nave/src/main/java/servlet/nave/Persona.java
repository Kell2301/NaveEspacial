/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet.nave;

/**
 *
 * @author Kell
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private boolean estado;
    private int tickMuerte;
    private String causaMuerte;

    public Persona() {
    }

    public Persona(String nombre, int edad, boolean estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTickMuerte() {
        return tickMuerte;
    }

    public void setTickMuerte(int tickMuerte) {
        this.tickMuerte = tickMuerte;
    }

    public String getCausaMuerte() {
        return causaMuerte;
    }

    public void setCausaMuerte(String causaMuerte) {
        this.causaMuerte = causaMuerte;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", tickMuerte=" + tickMuerte + ", causaMuerte=" + causaMuerte + '}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet.nave;
import java.util.ArrayList;

/**
 *
 * @author Kell
 */
import java.util.ArrayList;

public class Familia {

   private ArrayList<Persona> familia;
    private boolean estado;

    public Familia() {
    }
    
    public Familia(ArrayList<Persona> familia, boolean estado) {
        this.familia = familia;
        this.estado = estado;
    }

    public ArrayList<Persona> getFamilia() {
        return familia;
    }

    public void setFamilia(ArrayList<Persona> familia) {
        this.familia = familia;
    }


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Familia{" + "familia=" + familia + ", estado=" + estado + '}';
    }
    
}

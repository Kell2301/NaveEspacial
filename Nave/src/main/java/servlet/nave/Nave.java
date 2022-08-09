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
public class Nave {

    private Familia[][] nave;
    private Desastre desastres;

    public Nave() {
        this.nave = new Familia[5][5];
    }

    public Nave(Familia[][] nave) {
        this.nave = nave;
    }

    public Familia[][] getNave() {
        return nave;
    }

    public void setNave(Familia[][] nave) {
        this.nave = nave;
    }

    public void agregarFamiliaEnNave(Familia familia, int fila, int columna) {
        this.nave[fila][columna] = familia;
    }

    public void aplicarLocura(int tickMuerte) {
        Desastre desastres1 = new Desastre();
        this.nave = desastres1.aplicarDesastreLocura(nave, tickMuerte);

    }

    public void aplicarColision(int tickMuerte) {

        Desastre desastres1 = new Desastre();
        this.nave = desastres1.ColisionConAsteroide(nave, tickMuerte);
    }

    public void aplicarFuga(int tickMuerte) {
        //se expulsa de la nave a las tres personas mas viejas

        Desastre desastres1 = new Desastre();
        this.nave = desastres1.fugaDeAire(this.nave, tickMuerte);

    }

    public void consultarMatriz() {
        for (int i = 0; i < this.nave.length; i++) {
            for (int j = 0; j < this.nave[i].length; j++) {
                System.out.println(this.nave[i][j]);
            }
        }

    }

    public void registroMuertos() {

       // ArrayList<Persona> muertos = new ArrayList<Persona>();
        System.out.println("REGISTRO DE PERSONAS MUERTAS: "+ "\n ");
        for (int i = 0; i < this.nave.length; i++) {
            for (int j = 0; j < this.nave[i].length; j++) {
                ArrayList<Persona> personas = nave[i][j].getFamilia();
                for (Persona persona : personas) {
                    if ((persona.getEstado() == false) && (persona.getCausaMuerte() != null)) {

                        //muertos.add(persona);
                        System.out.println("-Nombre: "+persona.getNombre()+ " -Causa de Muerte: " +persona.getCausaMuerte()+ " -Tick: "+ persona.getTickMuerte());

                       
                    }
                }
            }
        }

        //System.out.println("Personas muertas" + muertos);
    }

    public void registroSobrevivientes() {
        //ArrayList<Persona> sobrevivientes = new ArrayList<Persona>();
        System.out.println("REGISTRO DE SOBREVIVIENTES: "+ "\n ");
        for (int i = 0; i < this.nave.length; i++) {
            for (int j = 0; j < this.nave[i].length; j++) {
                ArrayList<Persona> personas = nave[i][j].getFamilia();
                
                for (Persona persona : personas) {
                    
                    if (persona.getEstado() == true) {
                        //sobrevivientes.add(persona);

                        System.out.println("-Nombre: "+ persona.getNombre());

                    }
                }
            }
        }
         // System.out.println("Personas vivas" + sobrevivientes);
    }

    public double probabilidadCatastrofe() {
        double probabilidad = Math.random();
        return probabilidad;
    }

}

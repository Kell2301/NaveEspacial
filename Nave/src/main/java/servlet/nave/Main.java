/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servlet.nave;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.ItemList;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Kell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nave nave = new Nave();
        LeerArchivo.crearNave(nave);

        double probabilidad;

        for (int i = 1; i <=10; i++) {
            if (i !=10) {
                probabilidad = nave.probabilidadCatastrofe();
                if (probabilidad <= 0.4) {
                   probabilidad = nave.probabilidadCatastrofe();
                    if (probabilidad <= 0.1) {
                       //System.out.println("colision");
                       nave.aplicarColision(i);
                    } else if (probabilidad > 0.1 && probabilidad <= 0.5) {
                         // System.out.println("locura");
                        nave.aplicarLocura(i);                       
                    } else if (probabilidad > 0.5) {
                         
                          nave.aplicarFuga(i);
                    }
                }
            }
            if (i ==10) {
                System.out.println("Llegaron a Marte"+ "\n ");
            }         
        }        
        //nave.consultarMatriz();
       nave.registroMuertos();
        System.out.println(" ");
       nave.registroSobrevivientes();
    }
}

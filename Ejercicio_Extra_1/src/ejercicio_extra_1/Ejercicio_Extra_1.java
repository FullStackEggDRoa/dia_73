/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_extra_1;

import Entidades.Dni;
import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;

/**
 *
 * @author droa
 */
public class Ejercicio_Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> personas= new ArrayList();
        ArrayList<Perro> perros= new ArrayList();
        
        //Ingreso en Bloque de Personas
        personas.add(new Persona("Andrea", "Martinez", 29, new Dni('D', "1102988365"), new Perro()));
        personas.add(new Persona("Julio", "Sanchez", 32, new Dni('F', "1103317045"), new Perro()));
        personas.add(new Persona("Ximena", "Carpio", 42, new Dni('C', "1734567822"), new Perro()));
        personas.add(new Persona("Andrea", "Martinez", 29, new Dni('H', "1102988365"), new Perro()));
        
        //Ingreos en Bloque de Perros
        perros.add(new Perro("Bruno","Mestizo",5,"Mediano"));
        
        
    }
    
}

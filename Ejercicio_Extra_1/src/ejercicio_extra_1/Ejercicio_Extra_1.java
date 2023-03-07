/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_extra_1;

import Entidades.Dni;
import Entidades.Perro;
import Entidades.Persona;
import Servicios.serviciosPersona;
import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<Persona> personas= new ArrayList();
        ArrayList<Perro> perros= new ArrayList();
        
        serviciosPersona sP = new serviciosPersona();
        
        int opcionMenu=0;
        
        //Ingreso en Bloque de Personas
        personas.add(new Persona("Andrea", "Martinez", 29, new Dni('D', "1102988365"), new Perro()));
        personas.add(new Persona("Julio", "Sanchez", 32, new Dni('F', "1103317045"), new Perro()));
        personas.add(new Persona("Ximena", "Carpio", 42, new Dni('C', "1734567822"), new Perro()));
        personas.add(new Persona("Gustavo", "Alvarez", 39, new Dni('G', "1102988357"), new Perro()));
        
        //Ingreos en Bloque de Perros
        perros.add(new Perro("Bruno","Mestizo",5,"Mediano"));
        perros.add(new Perro("Carol","Mestizo",3,"Mediano"));
        perros.add(new Perro("Coffee","Mestizo",1,"Grande"));
        perros.add(new Perro("Pimienta","Mestizo",1,"Pequeña"));
        perros.add(new Perro("Amor","Mestizo",6,"Mediano"));
        
        do{
            System.out.println("..:: MENU ::..\n"
                    + "1. Asignar Perro\n"
                    + "2. Mostrar Perros\n"
                    + "3. Mostrar Personas\n"
                    + "4. Salir");
            System.out.print("Elija una Opción: ");
            
            opcionMenu=leer.nextInt();
            switch (opcionMenu) {
                case 1 -> sP.asignarPerro(personas, perros);
                case 2 -> System.out.println(String.format("%10.15s","NOMBRE")+"\t"+String.format("%10.15s","RAZA")+"\t"+"EDAD\t"+"TAMAÑO\n"
                        + perros.toString().replace(",", ""));
                case 3 -> System.out.println(String.format("%10.15s","NOMBRE")+"\t"+String.format("%10.15s","APELLIDO")+"\t"+String.format("%2.4s","EDAD")+"\t"+"ID\t\t"+"PERRO ASIGNADO\n"
                        + personas.toString().replace(",", ""));
                default -> opcionMenu=-1;
            }
        }while(opcionMenu>0 && opcionMenu<4);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author igarcia
 */
public class TallerMain {
    public static void main(String[] args) {
        System.out.println("Taller Main");
        
        Automovil chevy = new Automovil();
        chevy.color = 'N';
        chevy.marca = "Chevrolet";
        chevy.modelo = "Chevy";
        chevy.year = 2011;
        
        chevy.verDetalle();
        
        Automovil neon = new Automovil("Dodge", "Neon", 'A', 2002);
        neon.verDetalle();
        
        //Paso por ref
        String color = "Rojo";
        
        Taller.pintarAuto(chevy, color);
        chevy.verDetalle();
        chevy.color = 'C';
        chevy.verDetalle();
        
        
        int year = 2015;
        Taller.actualizarYear(chevy, year);
        
        System.out.println("Año: " + year);
        chevy.verDetalle();
        
        
        System.out.println("\n\n:::::::::::::::::::::");
        neon.verDetalle();
        Taller.pintarAuto(neon);
        System.out.println("------------>");
        neon.verDetalle();
        
        //Metodos sobrecargados
        Taller.pintarAuto(neon);
        Taller.pintarAuto(neon, "Azul");
           
        
        
        
        
    }
    
}

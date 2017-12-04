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
public class Taller {
    
    /**
     * Validar que el color no sea nulo, vacio
     * Obtener la primer letra del color y guardarla como char en automovil
     * Asignar el nuevo color al automovil
     * 
     * @param automovil
     * @param color 
     * Metodo sobrecargado
     */
    public static void pintarAuto(Automovil automovil, String color){
        System.out.println("Color original: " + automovil.color);
        
        if(color !=null && color.isEmpty() == false){
            char nuevoColor = color.charAt(0);
            automovil.color = nuevoColor;
            
            System.out.println("Color nuevo: " + automovil.color);
        }
        
        System.out.println("Refencia auto: " + automovil);
    }
    
    //Metodo sobrecargado
    //Pinta auto por default en BLANCO
    public static void pintarAuto(Automovil automovil){
        String COLOR_DEFAULT = "Blanco";
        
        pintarAuto(automovil, COLOR_DEFAULT);
    }
    
    
     public static void actualizarYear(Automovil automovil, int year){
         automovil.year = year;
         
         year = 100;
         
         System.out.println("Automovil --> " + automovil);
         System.out.println("Year --> " + year);
     }
}

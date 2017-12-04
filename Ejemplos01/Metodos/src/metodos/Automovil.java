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
public class Automovil {
    public String marca;
    public String modelo;
    public char color;
    public int year;
    
    //Constructor por default
    public Automovil(){
        
    }
    
    //Constructor con parametros. Se usa this para referirse a la propiedad
    public Automovil(String marca, String modelo, char color, int year){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.year = year;
    }
    
    
    
    public void verDetalle(){
        System.out.println(":: RESUMEN DE AUTOMOVIL ::::");
        System.out.println("Marca: "  + marca);
        System.out.println("Modelo: "  + modelo);
        System.out.println("Color: "  + color);
        System.out.println("Año: "  + year);
        System.out.println("Referencia " + this);
    }
    
    
}

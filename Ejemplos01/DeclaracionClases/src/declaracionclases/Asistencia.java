/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declaracionclases;

/**
 *
 * @author igarcia
 */
public class Asistencia {
    public String materia;
    public String fecha;
    public boolean asistio;

    public Asistencia() {
        materia = "SIN MATERIA";
        fecha = "NO INDICADA";
    }
    
    public Asistencia(String materia, String fecha, boolean asistio){
        this.materia = materia;
        this.fecha = fecha;
        this.asistio = asistio;
    }
    
    public Asistencia(String fecha, String materia){
        this.materia = materia;
        this.fecha = fecha;        
    }
    
    
    public void mostrarAsistencia(){
        System.out.println("Materia: " + materia + " Fecha: " + fecha + " Asistió: " + asistio);
    }
    
    public void mensaje(){
        System.out.println("***********************");
        System.out.println("----------------------");
    }
    
}

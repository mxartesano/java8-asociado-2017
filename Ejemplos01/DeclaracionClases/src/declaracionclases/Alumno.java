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
public class Alumno {
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public Asistencia asistencia;

    public void mostrarDatosAlumno(){
        System.out.println("Alumno: " + nombre + " "  + apellidoPaterno + " " + apellidoMaterno);
    }
    
    public void mostrarInformacionCompleta(){
        //Manda a llamar metodo de la misma clase
        this.mostrarDatosAlumno();
        //Manda a llamar metodo en propiedad asistencia
        asistencia.mostrarAsistencia();
        asistencia.mensaje();
    }
    
}

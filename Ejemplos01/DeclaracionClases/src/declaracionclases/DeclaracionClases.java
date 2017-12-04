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
public class DeclaracionClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Declaracion de clases");
        
        Alumno alumno01 = new Alumno();
        alumno01.nombre = "Ivan";
        alumno01.apellidoPaterno = "Garcia";
        alumno01.apellidoMaterno = "Cifuentes";
         
       
        alumno01.asistencia = new Asistencia();
        alumno01.asistencia.materia = "JAVA 8 Asociado";
        alumno01.asistencia.fecha = "18/11/2017";
        alumno01.asistencia.asistio = false;
        
        //
      //  alumno01.asistencia.mostrarAsistencia();
        alumno01.mostrarInformacionCompleta();
        
        System.out.println("\n\n-------------------------");
        
        //Referencias de memoria
        Asistencia asistencia01 = new Asistencia();
        asistencia01.materia = "Java 8 Asociado";
        asistencia01.fecha = "18/11/2017";
        asistencia01.asistio = true;
        
        Asistencia asistencia02 = new Asistencia();
        asistencia02.materia = "Java 8 ---";
        asistencia02.fecha = "11/11/2017";
        asistencia02.asistio = false;
        
        asistencia01.mostrarAsistencia();
        asistencia02.mostrarAsistencia();
        
        asistencia01 = asistencia02;
        asistencia01.materia = "------";
        
        asistencia01.mostrarAsistencia();
        asistencia02.mostrarAsistencia();
              
        Asistencia asistencia03  = new Asistencia();
        asistencia03.mostrarAsistencia();
        
        Asistencia asistencia04 = new Asistencia("JAVA 8", "18/11/2017", true);
        asistencia04.mostrarAsistencia();
        
    }
    
}

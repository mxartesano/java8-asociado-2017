/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo5.cdmx;

/**
 *
 * @author igarcia
 */
public class Modulo5CDMX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Arreglos");
        
        String nombre = "Nombre";
        
        String[] names = {"Mary", "Bob","Carlos"};
        
        String[] horarios = new String[5];
        horarios[0] = "Domingo 9AM";
        
        System.out.println("Arreglo: " + horarios);
        System.out.println("Pos[0]: " + horarios[0]);
        
        for(String horario : horarios){
            System.out.println("Horario: " + horario);

        }
        

        horarios = new String[100];
        System.out.println("Arreglo: " + horarios);
        System.out.println("Pos[0]: " + horarios[0]);
        
        
        double[] tiemposRespuesta = {34.2,38.9,12.4,40.12};
        
        //Imprimir todos los elementos
        for(double t : tiemposRespuesta){
            System.out.println(t);
        }
        
        
        //Calcular promedio
        double total = 0;
        for(double t : tiemposRespuesta){
            total+= t;
        }
        
        System.out.println("Promedio: " + (total / tiemposRespuesta.length));

        //Mostrar el 3er elemento del arreglo
        
        System.out.println("Tercer elemento: " + tiemposRespuesta[3]);
        
        
        
        
        
        String[] arregloVacio = {};
        
        String[] cursos = names;
        
        
        
        
        
        
     //   arregloVacio[0] = "Algo";
        
        
    }
    
}

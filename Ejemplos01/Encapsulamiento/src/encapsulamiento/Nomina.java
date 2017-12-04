/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author igarcia
 */
public class Nomina {
    String[] empleados;
    private int totalEmpleados;
    
    public String[] verEmpleados(){
        empleados = new String[2]; // Crear un arreglo de String
        empleados[0] = "Pepe";
        empleados[1] = "Juan";
        
        totalEmpleados = empleados.length;
        
        return empleados;
    }
    
    private double calcularDescuentos(String empleado){
        
        return 0;
    }
    
    void verNomina(){
        System.out.println(":::: Empleados ::::");
        for(String i : empleados){
            System.out.println(i);
        }
        
      //  return; // innecesario usar return, pero es valido
    }
    
    protected int getTotalEmpleados(){
       return totalEmpleados;
    }

    public void imprimirHistorialNomina(String empleado,String... mes){
        
        System.out.println("Total de meses: " + mes.length);
        
        for(String i : mes){
            System.out.println("Mes: " + i);
        }
    }
    
    // MARCA ERROR POR SER METODO DUPLICADO DE imprimirHistorialNomina(String empleado,String... mes)
    // POR USO DE VARARGS
//    public void imprimirHistorialNomina(String empleado,String[] mes){
//        
//        System.out.println("Total de meses: " + mes.length);
//        
//        for(String i : mes){
//            System.out.println("Mes: " + i);
//        }
//    }
    
}

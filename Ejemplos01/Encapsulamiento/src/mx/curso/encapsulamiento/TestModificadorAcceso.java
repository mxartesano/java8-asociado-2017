/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.curso.encapsulamiento;

import encapsulamiento.Nomina;

/**
 *
 * @author igarcia
 */
public class TestModificadorAcceso {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        System.out.println("Empleados: " + nomina.empleados);
//        System.out.println("Total empleados: " + nomina.totalEmpleados); // NO SE PUEDE ACCEDER A VARIABLES PRIVADAS

        String[] empleados = nomina.verEmpleados(); //correcto
        System.out.println("Empleados: " + empleados);
        
        //nomina.calcularDescuentos("Juan"); // METODO PRIVADO
        nomina.verNomina();
        System.out.println("Total empleados: " + nomina.getTotalEmpleados());
        
        walk2(2,3,4,5,6,7,8,9);
        
    }
    
    
}

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
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        System.out.println("Empleados: " + nomina.empleados);
//        System.out.println("Total empleados: " + nomina.totalEmpleados); // NO SE PUEDE ACCEDER A VARIABLES PRIVADAS

        String[] empleados = nomina.verEmpleados(); //correcto
        System.out.println("Empleados: " + empleados);
        
        //nomina.calcularDescuentos("Juan"); // METODO PRIVADO
        nomina.verNomina();
        System.out.println("Total empleados: " + nomina.getTotalEmpleados());
        
        nomina.imprimirHistorialNomina("Juan", "Enero", "Febrero");
        nomina.imprimirHistorialNomina("Juan", "Enero", "Febrero", "Marzo");
        nomina.imprimirHistorialNomina("Juan");
        nomina.imprimirHistorialNomina("Juan", new String[]{"", "", ""});
        
        System.out.println(":_::::: EMPRESA ::::::::: ");
        Empresa empresa = new Empresa();
        //empresa.clave = "ABC";  // INCORRECTA POR SER PRIVATE
        empresa.setClave("ABC");
        empresa.setNombre("Empresa 1");
        
        empresa.setNombre("   ");
        
        empresa.setFechaRegistro(new java.util.Date());
        empresa.setActivo(true);
        
        System.out.println("Clave de empresa: " + empresa.getClave());

    }

}

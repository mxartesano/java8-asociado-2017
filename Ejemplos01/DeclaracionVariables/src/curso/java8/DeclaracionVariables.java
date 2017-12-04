/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java8;

/**
 *
 * @author igarcia
 */
public class DeclaracionVariables {
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo declaracion de variables
        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;
        int edad;
        
        //Ejemplo de asignacion de valores a variables
        nombre = "Ivan Emilio";
        apellidoPaterno = "Garcia";
        apellidoMaterno = "Cifuentes";
        edad = 31;
        
        //Impresion de valores en consola
        System.out.println("Nombre: " +  nombre);
        
        // Variables dropbox
        String correoElectronico = "mxartesano@gmail.com";
        String contrasena = "1231232132";
        
        System.out.println("Correo Electronico: " + correoElectronico);
        System.out.println("Contraseña: " + contrasena);
        
        
        String nombreCompleto = nombre + " "  + apellidoPaterno + " " + apellidoMaterno;
        System.out.println("Nombre completo: " + nombreCompleto);
        
        
//        String tema;
//        System.out.println("Tema: "+ tema);
        
        
        //    boolean complete = true;
            boolean complete = true;
            
            int cantidad = 1000;
            cantidad = 1_000;
        
        int suma = 1 + 6;
        
//        int total = 100/0;
        
        int c = 25 - 5 * 4 / 2 - 10 + 4;
        
        System.out.println("Total: " + c);
     
        
        int anioActual = 0;
        int anioNacimiento = 0;
        
        //Sumar un año
        double tiempoRespuesta1 = 2.3;
        double tiempoRespuesta2 = 2.1;
        double tiempoRespuesta3 = 1.5;
        double tiempoRespuesta4 = 3.5;
        double tiempoRespuesta5 = 4.5;
        
        //Crear arreglo
        double[] tiemposRespuesta = {tiempoRespuesta1,tiempoRespuesta2, tiempoRespuesta3, tiempoRespuesta4, tiempoRespuesta5 };
     //   tiemposRespuesta = new double[5];
     
     // impriman todos los elementos DESC
        System.out.println("Elemento 1: " + tiemposRespuesta[0]);
        System.out.println("Elemento 3: " + tiemposRespuesta[2]);
        
        
//        double promedioTiempoRespuestaTotal;


        /**
        //Mayor de edad
        if(edad >= 18){
            System.out.println(nombreCompleto + " es mayor de edad");
        }else{
            System.out.println(nombreCompleto + " es menor de edad");
        }
        
        * **/
        boolean status = true;
        
//        if(status == true){
//            System.out.println("El estatus es OK");
//        }
//        
//        if(status){
//            System.out.println("El estatus es OK");
//        }
        
        
        int total = 50;
        
    //imprimir IGUAL A 50 si vale 50
        
        if(total == 50){
//            System.out.println("Es igual a 50");
        }else{
            System.out.println("No es igual a 50");
        }
        
        //imprimir si es diferente a 50
        // imprimir si es menor a 50
        // imprimir si es mayor a 50
        // imprimir si es menor igual a 50
        // imprimir si es mayor igual  a 50
        
        
        
        //Arreglos
        //
        String[] lenguajesProgramacion = new String[5];
        lenguajesProgramacion[0] = "Java";
        lenguajesProgramacion[1] = "C";
        lenguajesProgramacion[2] = "PHP";
        lenguajesProgramacion[3] = "RUBY";
        lenguajesProgramacion[4] = "JAVASCRIPT";
        
        System.out.println("Lenguaje 1: "+ lenguajesProgramacion[0]);
        System.out.println("Elementos en el arreglo: " + lenguajesProgramacion.length);
        
        
        for(String lenguaje : lenguajesProgramacion){
            System.out.println("Lenguaje: " + lenguaje);
        }
        
        double promedioTiempoRespuestaTotal = 0;
        double tiempoRespuesta = 0;
        
        for(double t : tiemposRespuesta){
            tiempoRespuesta+= t;
        }
        
        promedioTiempoRespuestaTotal = tiempoRespuesta / tiemposRespuesta.length;
        System.out.println("Tiempo de respuesta total: " + promedioTiempoRespuestaTotal);
        
        int passmark = 12;
        boolean passed = false;
        int[] scores = {4,6,2,8,12,35,9};
        
        for(int unitscore : scores){
            if(unitscore >= 12){
                passed = true;
                break;
            }
        }
        
        System.out.println("At least one passed? " + passed);
        
        int[] cveProductos = {123,12434,56565,789789,98089};
        
        for(int i : cveProductos){
             System.out.println("Valor: " + i );
            if(i == 12434){
                break;
            }
        }
        
        
        System.out.println("\n:::::::::::::::::::::::::\n");
        System.out.println("Ejemplo de creacion de objeto");
        
        Customer customer = new Customer();
        
//        new Customer();
        
//customer
        customer.displayCustomer();
        customer.displayName();
        
        customer.validaEdadCustomer();
        customer.age = 20;
        customer.validaEdadCustomer();
        
        customer.direccion.displayDireccion();
        
        
        Customer customer2 = new Customer();
        customer2.name = "OK";
        customer2.custID = 234;
        customer2.displayCustomer();
        customer2.displayName();
        
        customer2.age = 20;
        customer2.validaEdadCustomer();
        
        
    }
    
}

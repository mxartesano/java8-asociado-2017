/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author igarcia
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(":::: HERENCIA ::::");
        
        Clothing clothing = new Clothing();
        clothing.setId("MX001");
                
        System.out.println("ID:  " + clothing.getId());
        
        Shirt shirt = new Shirt();
        shirt.setId("MX002");
        shirt.setPrice(345.23);
        shirt.setColor("ROJO");
        shirt.setFit("SLIM FIT");
        
        System.out.println("Shirt: " + shirt.getId());
        // se llama metodo protected
        shirt.imprimirDetalle();
        
        Trousers trousers = new Trousers();
        trousers.setGender("MALE");
        trousers.setColor("ROJO");
        trousers.setPrice(123);
        trousers.setId("MX004");
        
        trousers.imprimirDetalle();
                
        System.out.println(":::: ::: ::: :::");
        Clothing c1 = new Shirt(); // SE CREA CON HIJO, POLIMORFISMO. TOMA EL COMPORTAMIENTO DE LOS METODOS DEL HIJO
        c1.setColor("VERDE");
        c1.setId("MX005");
        c1.setPrice(2343);
        c1.setSize("SMALL");
        
        
        c1.imprimirDetalle(); // SE TOMA LA VERSION DE LA CLASE HIJO
//        c1.imprimirDetalle(""); // METODO SOBRE CARGADO QUE NO EXISTE EN LA CLASE PADRE
        
        System.out.println("CAST");
        // CONVIERTE DE HIJO A PADRE
        System.out.println("C2 Cast de hijo a padre: ");
        Clothing c2 = shirt;
        c2.imprimirDetalle();
        
        System.out.println("----------------------");
        
        System.out.println(" S0 Cast de padre a hijo con CAST explicito: ");
        //CONVIERTE CLASE PADRE A HIJO, CREADO CON CONSTRUCTOR DE HIJO
        
        Shirt s0 = (Shirt) c1;
        s0.imprimirDetalle();
        s0.imprimirDetalle("metodo sobre cargado");
        
        //Interfaz
        Returnable c = new Shirt();
        
        System.out.println("Do return: " + c.doReturn());
        
     /**   
        Shirt s4 = (Shirt) trousers;  //NO SE PUEDE CONVERTIR DE 'HERMANO A HERMANO'
        
        Shirt s4 = (Clothing) trousers; // NO SE PUEDE CONVERTIR
       
       Clothing c2 = (Shirt) trousers; // NO SE PUEDE CONVERTIR
        
        System.out.println(" S3 Cast de padre a hijo con CAST explicito: ");
        //CONVIERTE CLASE PADRE A HIJO, CREADO CON CONSTRUCTOR DE 'HERMANO'
        Clothing c3 = new Trousers();
        c3.setColor("AZUL");
        
        Shirt s3 = (Shirt) c3;
        s3.imprimirDetalle();
        
        
      
        System.out.println("----------------------");
        System.out.println("S1 Cast de padre a hijo con CAST explicito: ");
        //CONVIERTE CLASE PADRE A HIJO, CREADO CON CONSTRUCTOR DE PADRE
       
        Shirt s1 = (Shirt) clothing;
        s1.imprimirDetalle();
        s1.imprimirDetalle("metodo sobre cargado");
        
        **/
    }
    
}

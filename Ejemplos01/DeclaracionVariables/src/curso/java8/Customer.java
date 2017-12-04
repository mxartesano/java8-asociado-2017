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
public class Customer {
    public String name = "Junior Duke";
    public int custID = 1205;
    public  String address;
    public int orderNum;
    public int age;
    public Direccion direccion = new Direccion();
    
    public void displayCustomer(){
        System.out.println("Customer: " + custID);
    }
    
    public void displayName(){
        System.out.println("Name: " + name);
    }
    
    /**
     * Valida que el customer no sea menor de edad.
     * Si lo es envia msg de error.
     */
    public void validaEdadCustomer(){
        if(age < 18){
            System.out.println("El cliente no se puede registrar: Edad: " + age);
        }
    }
    
    
}

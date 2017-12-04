/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author igarcia
 */
public class ValidarPersona {
    public boolean validarMayorEdad(int edad){
        return (edad >= 18);
    }
    
    /**
     * No es null
     * NO es vacio
     * tiene al menos 4 caracteres
     * @param nombre
     * @return 
     */
    public boolean validarNombre(String nombre){
        if(nombre != null && (nombre.isEmpty() == false) && nombre.length() >= 4){
            return true;
        }        
        
        return false;
    }      
}

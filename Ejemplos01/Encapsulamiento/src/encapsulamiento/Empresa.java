/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

import java.util.Date;
/**
 *
 * @author igarcia
 */
public class Empresa {
    private String clave;
    private String nombre;
    private boolean activo;
    private Date fechaRegistro;
    
    // Metodo set para clave
    public void setClave(String clave){
        this.clave = clave;
    }
    
    // Metodo GET
    public String getClave(){
        return clave;
    }
    
    public void setNombre(String nombre){
        if(nombre != null && !nombre.trim().isEmpty() && nombre.length() > 3){
            this.nombre = nombre;
        }else{
            System.out.println("Nombre incorrecto: " + nombre);
        }
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setActivo(boolean activo){
        this.activo = activo;
    }
    
    public boolean isActivo(){
        return activo;
    }
    
    public void setFechaRegistro(Date fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }
    
    public Date getFechaRegistro(){
        return fechaRegistro;
    }
}

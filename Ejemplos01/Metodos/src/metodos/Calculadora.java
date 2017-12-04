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
public class Calculadora {
    public static final double TASA_INTERES = 10.2;
    
    public static int sumar(int a, int b){
        int resultado = a + b;

        return resultado;        
    }
    
    public static int restar(int a, int b){
        int resultado = a - b;
        
        return resultado;      
    }
    
    public static int multiplicar(int a, int b){
        int resultado = a*b;
        
        return resultado;
    }
}

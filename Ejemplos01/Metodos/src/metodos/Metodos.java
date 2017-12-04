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
public class Metodos {
    public static String curso;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("::::. METODOS ::::::");
        
//        Calculadora calculadora = new Calculadora();
        
        System.out.println("------> SUMA");
        
        int resultado = Calculadora.sumar(10, 20);
        System.out.println("Valor resultado: " + resultado);
        
        System.out.println("------> RESTA");
        resultado  = Calculadora.restar(10,20);
        System.out.println("Valor resultado: " + resultado);
        
        System.out.println("------> MULTIPLICACION");
        resultado = Calculadora.multiplicar(10,20);
        System.out.println("Valor resultado: " + resultado);
        
        System.out.println("CALCULADORA TASA_INTERES: " + Calculadora.TASA_INTERES);
        
        Calculadora c01 = new Calculadora();
        Calculadora c02 = new Calculadora();
        Calculadora c03 = new Calculadora();
        
        System.out.println("C01 TASA_INTERES: " + c01.TASA_INTERES);
        System.out.println("C02 TASA_INTERES: " + c02.TASA_INTERES);
        System.out.println("C03 TASA_INTERES: " + c03.TASA_INTERES);
        
//        c01.TASA_INTERES = 10;
        System.out.println("C01 TASA_INTERES: " + c01.TASA_INTERES);
        System.out.println("C02 TASA_INTERES: " + c02.TASA_INTERES);
        System.out.println("C03 TASA_INTERES: " + c03.TASA_INTERES);
        
        
//        System.out.println
        curso = "JAVA 8";
        
        System.out.println("Curso: " + curso);
          
          System.out.println(":: VALIDAR PERSONA ::");
          
          ValidarPersona validarPersona = new ValidarPersona();
          boolean correcto = validarPersona.validarMayorEdad(20);
          System.out.println("Valor correcto: " + correcto);
          
          correcto = validarPersona.validarNombre("Pepe");
          System.out.println("Valor correcto: " + correcto);
    }
    
}

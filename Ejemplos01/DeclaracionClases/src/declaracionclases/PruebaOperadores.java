/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declaracionclases;

/**
 *
 * @author igarcia
 */
public class PruebaOperadores {
    public static void main(String[] args) {
        
        System.out.println("Prueba tipos de datos");
        byte b = 100;
        short s = 20000;
        int i = 1000000000;
        long l = 1000000000;
        float f = 0.13F;
        double d = 0.13;
        
        char c = 'A';
        boolean bl = true;
        
        System.out.println("b: " + b + " s: " + s + " i: " + i + " l: " + l + " C: " + c);
        
        if(c == 65){
            System.out.println("Es 65 o A");
        }
        
        System.out.println("\n\n---------------\n");
        
        System.out.println("Prueba operadores");
        
        System.out.println("Mod");
        int num1 = 31;
        int num2 = 6;
        
        int mod = num1 % num2;
        System.out.println("Mod is " + mod);
        
        num1 += num2; // Es igual a num1 = num1 + num2;
        System.out.println("Num 1: " + num1);

        num1 -= num2; // Es igual a num1 = num1 - num2;
        System.out.println("Num 1: " + num1);
        
        num1 *= num2; // Es igual a num1 = num1 * num2;
        System.out.println("Num 1: " + num1);
        
        num1 /= num2; // Es igual a num1 = num1 / num2;
        System.out.println("Num 1: " + num1);
        
        num1 %= num2; // Es igual a num1 = num1 % num2;
        System.out.println("Num 1: " + num1);
        
        System.out.println("\n\n---------------\n");
          
        int id  = 6;
        int newId = ++id; // Primero incrementa y luego asigna
        System.out.println("New id: " + newId + " id: " + id);
         
        newId = id++; // Primero asigna y luego incrementa
        System.out.println("New id: " + newId + " id: " + id);
    
        newId = --id; // Primero resta y luego asigna
        System.out.println("New id: " + newId + " id: " + id);
         
        newId = id--; // Primero asigna y luego resta
        System.out.println("New id: " + newId + " id: " + id);
    
        System.out.println("\n------- promotions ----");
        
        num1 = 55555;
        num2 = 66666;
        long num3 = num1 * num2;
        
        System.out.println("Total num3: " + num3);
        
        num1 = 55555;
        long num5 = 66666;
        num3 = num1 * num5;
        
        System.out.println("Total num3: " + num3);
        
        
        long l5 = 100;
        int entero5 = (int) l5;
        short short5 = (short) entero5;
        
        double promedio  = 5.8;
        int nuevoPromedio = (int) promedio;
        
        System.out.println("Nuevo promedio: " + nuevoPromedio);
    }
    
}

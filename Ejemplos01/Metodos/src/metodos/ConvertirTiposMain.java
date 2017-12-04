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
public class ConvertirTiposMain {
    public static void main(String[] args) {
        System.out.println("Convertir tipos main");
        
        String total = "123.32"; //float
        String aceptado = "true"; //boolean
        String clientes = "122"; // int
        
        byte b01 = Byte.parseByte("1");
        short s01 = Short.parseShort("124");
        int clientes01 = Integer.parseInt(clientes); // Integer to int
        float total01 = Float.parseFloat(total); // Float to float
        double d01 = Double.parseDouble("2342232.33");
        long l01 = Long.parseLong("23423432");
        boolean aceptado01 = Boolean.parseBoolean(aceptado); //Boolean to boolean
        
        System.out.println("Int en Hex: " + Integer.toHexString(100));
        
        System.out.println(b01);
        System.out.println(s01);
        System.out.println(clientes01);
        System.out.println(total01);
        System.out.println(d01);
        System.out.println(l01);
        System.out.println(aceptado01);
        
        
        
        
        
        
        
        
        
        
        
    }
}

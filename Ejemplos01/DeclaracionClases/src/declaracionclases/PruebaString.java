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
public class PruebaString {
    public static void main(String[] args) {
        System.out.println("Prueba Strings");
        
        String cadena = "Cadena";
        String cadena2 = new String("Cadena 2");
        
        System.out.println("Cadena: " + cadena);
        System.out.println("Cadena2: " + cadena2);
        
        String cadena3  = cadena;
        cadena3 = "Cadena3";
        
        System.out.println("Cadena3: " + cadena3);
        System.out.println("Cadena: " + cadena);
        
        //Concatener cadenas primera forma
        String cadena4 = cadena  + cadena2 + cadena3;
        System.out.println("Cadena 4: " + cadena4);
        
        //Concatenar cadenas segunda forma
        String cadena5 = cadena.concat(cadena2).concat(cadena3);
        System.out.println("Cadena5: " + cadena5);
        
        //Longuitud de cadena
        int longuitudCadena = cadena5.length();
        
        System.out.println("Longuitud Cadena: " + longuitudCadena);
        
        int longuitudMinima = 10;
        String contrasena = "jlfsljkfljfajlkafjlfajl";
        
        System.out.println("Contraseña: " + contrasena);
        System.out.println("Longuitud Contraseña: " + contrasena.length());
           
        if(contrasena.length() < longuitudMinima ){
            System.out.println("Contraseña No aceptada");
        }else{
            System.out.println("Contraseña Aceptada");
        }
        
        // Metodos de la clase String
        String nombre = " Juan Valdez asd ";
        
        //convierte a mayuscula
        String nombreCambiado = nombre.toUpperCase();
        
        System.out.println("Nombre Original: " + nombre);
        System.out.println("Nombre Cambiado: " + nombreCambiado);
        
        //Convierte a minuscula
        nombreCambiado = nombre.toLowerCase();
        System.out.println("Nombre Cambiado: " + nombreCambiado);
        
        //Quita espacio en una cadena al inicio y al final
        nombreCambiado = nombre.trim();
        System.out.println("Nombre Cambiado: " + nombreCambiado);
        
        // Inicia con asd?
        boolean b = nombre.startsWith("asd");
        System.out.println("Inicia con asd?: " + b);
        
        // termina con asd?
        b = nombre.endsWith("asd");
        System.out.println("Termina con asd?: " + b);
        
        // Es cadena vacia?
        b = nombre.isEmpty();
        System.out.println("Es cadena vacía?: " + b);
        
        //Index of --> buscar la posicion de una palabra
        String saludo = "Hola como estas?";
        int posicion  = saludo.indexOf("como");
        
        System.out.println("Posicion donde se encuentra 'como': "  + posicion);
        
        // substring --> obtener una subcadena
        String nuevaCadena = saludo.substring(5, 9);
        System.out.println("Nueva cadena: "  + nuevaCadena);
        
        String folio = "MEX00012218112017";
        //3 posiciones pais
        //sig 6 producto
        // las ultimas 6 es la fecha
        String pais = folio.substring(0,3);
        String producto = folio.substring(3,9);
        String fecha = folio.substring(9,17);
        
        System.out.println("Pais: " + pais);
        System.out.println("Producto: " + producto);
        System.out.println("Fecha: " + fecha);
        
        
        
        //Concatenar correctamente
        StringBuilder sb = new StringBuilder();
        sb.append("Hola");
        sb.append(" ");
        sb.append("Mundo");
        sb.append(123);
        
        String resultado = sb.toString();
        
        System.out.println("Cadena concatenada correctamaente: " + resultado);
        
        
        
    }
    
}

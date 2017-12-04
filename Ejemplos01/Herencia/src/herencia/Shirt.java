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
public class Shirt extends Clothing implements Returnable{
    private String fit;

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    @Override
    protected void imprimirDetalle() {
        System.out.println("IMPRIMIR DETALLE desde clase shirt");
//        super.imprimirDetalle();
    }
    
    protected void imprimirDetalle(String detalle) {
        System.out.println("IMPRIMIR DETALLE");
        // SOLO POR QUE SI, MANDO A LLAMAR EL METODO IMPIRMIRDETALLE DEL PADRE
        super.imprimirDetalle();
    }

    @Override
    public String doReturn() {
        return "Es válido regresar prenda";
        
    }
    
    
}

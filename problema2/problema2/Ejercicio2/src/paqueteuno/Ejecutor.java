/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;
import paquetedos.EquivalenteHora;
/**
 *
 * @author USUARIO 2020
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EquivalenteHora horas = new EquivalenteHora();
        
        horas.establecerHoras(20.54);
        horas.establecerMinutos();
        horas.establecerSegundos();
        horas.establecerDias();
        
        System.out.printf("Usted ha ingresado %.2f horas \nsu equivalente en "
                + "minutos: es %.2f \nen segundos: %.2f \ny en dias: %.2f \n", 
                horas.obtenerHoras(), horas.obtenerMinutos(), horas.obtenerSegundos(),
                horas.obtenerDias());
    }
    
}

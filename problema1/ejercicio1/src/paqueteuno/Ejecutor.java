/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;
import paquetedos.Terreno;
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
        Terreno terreno1 = new Terreno();
        Terreno terreno2 = new Terreno();
        Terreno terreno3 = new Terreno();
        
        terreno1.establecerAncho(250.5);
        terreno1.establecerLargo(500.9);
        terreno1.establecerValorMetroCuadrado(12.28);
        terreno1.establecerArea();
        terreno1.establecerCosto();
        
        terreno2.establecerAncho(501.5);
        terreno2.establecerLargo(1001.9);
        terreno2.establecerValorMetroCuadrado(10.33);
        terreno2.establecerArea();
        terreno2.establecerCosto();
        
        terreno3.establecerAncho(1001.5);
        terreno3.establecerLargo(2002.9);
        terreno3.establecerValorMetroCuadrado(7.22);
        terreno3.establecerArea();
        terreno3.establecerCosto();
        
        System.out.printf("El terreno numero 1 con un frente de "
         + "%.2fm. y un fondo de %.2fm.\n tiene un area total de $%.2f \n"
                + "dado el precio por metro cuadrado de $%.2f\n "
                + "nos da un valor de $%.2f \n\n", 
         terreno1.obtenerLargo(), terreno1.obtenerAncho(), terreno1.obtenerArea()
        , terreno1.obtenerValorMetroCuadrado(), terreno1.obtenerCosto());
        
        System.out.printf("El terreno numero 2 con un frente de "
         + "%.2fm. y un fondo de %.2fm.\n tiene un area total de $%.2f \n"
                + "dado el precio por metro cuadrado de $%.2f\n "
                + "nos da un valor de $%.2f \n\n", 
         terreno2.obtenerLargo(), terreno2.obtenerAncho(), terreno2.obtenerArea()
        , terreno2.obtenerValorMetroCuadrado(), terreno2.obtenerCosto());
        
        
        System.out.printf("El terreno numero 3 con un frente de "
         + "%.2fm. y un fondo de %.2fm.\n tiene un area total de $%.2f \n"
                + "dado el precio por metro cuadrado de $%.2f\n "
                + "nos da un valor de $%.2f\n", 
         terreno3.obtenerLargo(), terreno3.obtenerAncho(), terreno3.obtenerArea()
        , terreno3.obtenerValorMetroCuadrado(), terreno3.obtenerCosto());
        
    }
    
}

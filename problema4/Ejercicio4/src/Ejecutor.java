/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO 2020
 */
import paqueteuno.EquipoCelular;
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EquipoCelular celular1 = new EquipoCelular();
        EquipoCelular celular2 = new EquipoCelular();
        EquipoCelular celular3 = new EquipoCelular();
        
        celular1.establecerSistemaOperativo("iOS");
        celular1.establecertamanoPantalla(5.8);
        celular1.establecerCosto(999.99);
        celular1.establecerDireccionMac("00:1e:c2:9e:28:6b");
        celular1.establecerImei("531648759426581");
        
        celular2.establecerSistemaOperativo("Android");
        celular2.establecertamanoPantalla(5.6);
        celular2.establecerCosto(799.99);
        celular2.establecerDireccionMac("00:2d:b1:8g:64:9a");
        celular2.establecerImei("642897135486248");
        
        celular3.establecerSistemaOperativo("BlackBerry OS");
        celular3.establecertamanoPantalla(4.2);
        celular3.establecerCosto(599.99);
        celular3.establecerDireccionMac("00:1f:b5:6d:99:4g");
        celular3.establecerImei("138641379452167");
        
        System.out.printf("el dispositivo numero uno tiene un sistema operativo"
                + ": %S \nSu pantalla es de %.2f \nTiene un costo de %.2f "
                + "\nLa direccion mac es: %S \nY su IMEI es: %S \n\n", celular1.obtenerSistemaOperativo(), 
                celular1.obtenerTamanoPantalla(), celular1.obtenerCosto(), 
                celular1.obtenerDireccionMac(), celular1.obtenerImei());
        
        System.out.printf("el dispositivo numero uno tiene un sistema operativo"
                + ": %S \nSu pantalla es de %.2f \nTiene un costo de %.2f "
                + "\nLa direccion mac es: %S \nY su IMEI es: %S \n\n", celular2.obtenerSistemaOperativo(), 
                celular2.obtenerTamanoPantalla(), celular2.obtenerCosto(), 
                celular2.obtenerDireccionMac(), celular2.obtenerImei());
        
        System.out.printf("el dispositivo numero uno tiene un sistema operativo"
                + ": %S \nSu pantalla es de %.2f \nTiene un costo de %.2f "
                + "\nLa direccion mac es: %S \nY su IMEI es: %S \n\n", celular3.obtenerSistemaOperativo(), 
                celular3.obtenerTamanoPantalla(), celular3.obtenerCosto(), 
                celular3.obtenerDireccionMac(), celular3.obtenerImei());
    }
    
}

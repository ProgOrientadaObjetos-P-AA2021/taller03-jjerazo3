/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

/**
 *
 * @author USUARIO 2020
 */
public class EquivalenteHora {
    
    private double horas;
    
    private double minutos;
     
    private double segundos;
    
    private double dias;
    
    public void establecerHoras(double h){
        horas = h;
    }
    
    public void establecerMinutos(){
        minutos = horas * 60;
    }
    
    public void establecerSegundos(){
        segundos = minutos * 90;
    }
    
    public void establecerDias(){
        dias = horas / 24;
    }
    
    public double obtenerHoras(){
        return horas;
    }
    
    public double obtenerMinutos(){
        return minutos;
    }
    
    public double obtenerSegundos(){
        return segundos;
    }
    
    public double obtenerDias(){
        return dias;
    }
}

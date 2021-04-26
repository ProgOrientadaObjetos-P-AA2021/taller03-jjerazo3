/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author USUARIO 2020
 */
public class InstitucionEducativa {
    
    private String nombre;
    
    private String tipo;
    
    private int numeroAlumnos;
    
    private int numeroDocentes;
   
    private int numeroSedes;
   
    public void establecerNombre(String n){
        nombre = n;
    }
   
    public void establecerTipo(String t){
       tipo = t;
    }
    
    public void establecerNumeroAlumnos(int a){
        numeroAlumnos = a;
    }
    
    public void establecerNumeroDocentes(int d){
        numeroDocentes = d;
    }
    
    public void establecerNumeroSedes(int s){
        numeroSedes = s;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;
import paqueteuno.InstitucionEducativa;
/**
 *
 * @author USUARIO 2020
 */
public class Ejecutor {
    
        public static void main(String[] args) {
            
            InstitucionEducativa jardin = new InstitucionEducativa();
            InstitucionEducativa escuela = new InstitucionEducativa();
            InstitucionEducativa colegio = new InstitucionEducativa();
            InstitucionEducativa universidad = new InstitucionEducativa();
            
            jardin.establecerNombre("Aprender Jugando");
            jardin.establecerTipo("Primaria");
            jardin.establecerNumeroAlumnos(78);
            jardin.establecerNumeroDocentes(8);
            jardin.establecerNumeroSedes(1);
            
            escuela.establecerNombre("Miguel Riofrio");
            escuela.establecerTipo("Primaria");
            escuela.establecerNumeroAlumnos(300);
            escuela.establecerNumeroDocentes(25);
            escuela.establecerNumeroSedes(1);
            
            colegio.establecerNombre("Eugenio Espejo");
            colegio.establecerTipo("Secundaria");
            colegio.establecerNumeroAlumnos(500);
            colegio.establecerNumeroDocentes(40);
            colegio.establecerNumeroSedes(2);
            
            universidad.establecerNombre("Universidad Tecnica Particular de Loja");
            universidad.establecerTipo("Superior");
            universidad.establecerNumeroAlumnos(30000);
            universidad.establecerNumeroDocentes(200);
            universidad.establecerNumeroSedes(50);
            
            System.out.printf("La Institucion Educativa de nombre: %S \nes de "
                    + "educacion %S \ncuenta con %d sede \nconsta de %d alumnos,"
                    + "y %d docentes.\n\n", jardin.obtenerNombre(), jardin.obtenerTipo(),
                    jardin.obtenerNumeroSedes(), jardin.obtenerNumeroAlumnos(), 
                    jardin.obtenerNumeroDocentes());
            
            System.out.printf("La Institucion Educativa de nombre: %S \nes de "
                    + "educacion %S \ncuenta con %d sede \nconsta de %d alumnos,"
                    + "y %d docentes.\n\n", escuela.obtenerNombre(), escuela.obtenerTipo(),
                    escuela.obtenerNumeroSedes(), escuela.obtenerNumeroAlumnos(), 
                    escuela.obtenerNumeroDocentes());
            
            System.out.printf("La Institucion Educativa de nombre: %S \nes de "
                    + "educacion %S \ncuenta con %d sede \nconsta de %d alumnos,"
                    + "y %d docentes.\n\n", colegio.obtenerNombre(), colegio.obtenerTipo(),
                    colegio.obtenerNumeroSedes(), colegio.obtenerNumeroAlumnos(), 
                    colegio.obtenerNumeroDocentes());
            
            System.out.printf("La Institucion Educativa de nombre: %S \nes de "
                    + "educacion %S \ncuenta con %d sede \nconsta de %d alumnos,"
                    + "y %d docentes.\n\n", universidad.obtenerNombre(), universidad.obtenerTipo(),
                    universidad.obtenerNumeroSedes(), universidad.obtenerNumeroAlumnos(), 
                    universidad.obtenerNumeroDocentes());
            
    }
}

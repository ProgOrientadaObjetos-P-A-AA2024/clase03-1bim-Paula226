/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa ft = new InstitucionEducativa();
        String nombre="Mater Dei";
        String tipoInstitucion= "Privada";
        int numeroAlumnos = 506;
        int numeroDocentes = 30;
        int numeroSedes = 4;
        
        ft.establecerNombre(nombre);
        ft.establecerTipoInstitucion(tipoInstitucion);
        ft.establecerNumeroAlumnos(numeroAlumnos);
        ft.establecerNumeroDocentes(numeroDocentes);
        ft.establecerNumeroSedes(numeroSedes);
        
        
        
        System.out.printf("Institucion Educativa \n\nNombres Completos: %s\n" + "Tipo de Institución: %s\n"
                + "Numero de Alumnos: %.2f\nNumero de Docentes : %.2f\n"
                + "Numero de Sedes: %.2f\n",ft.obtenerNombre(),ft.obtenerTipoInstitucion(),
                ft.obtenerNumeroAlumnos(), ft.obtenerNumeroDocentes(),
                ft.obtenerNumeroSedes());
                
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

import com.google.gson.Gson;

/**
 *
 * @author tesoem
 */
public class Convertir {
    public Datos aclass(String cadena){
    Gson gson = new Gson();
    return gson.fromJson(cadena, Datos.class);
    }
    
    public String ajson(Datos datos){
    Gson gson = new Gson();
    return gson.toJson(datos);
    }

    public char[] ajson(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
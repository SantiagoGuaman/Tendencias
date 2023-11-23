/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controlador.ControladorLogin;
import vista.VistaLogin;

/**
 *
 * @author Usuario
 */
public class Main {
    
    public static void main(String[] args) {
        VistaLogin vl = new VistaLogin();
        ControladorLogin cl = new ControladorLogin(vl);
        
        
    }
    
}

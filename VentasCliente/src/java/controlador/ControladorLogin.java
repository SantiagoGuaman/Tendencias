/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.VistaLogin;

/**
 *
 * @author Usuario
 */
public class ControladorLogin {
    
    private final VistaLogin login_view;

    public ControladorLogin(VistaLogin login_view) {
        this.login_view = login_view;
        login_view.setVisible(true);
    }
    
    
}

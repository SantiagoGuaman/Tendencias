/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.VistaRegistroUsuarios;

/**
 *
 * @author Usuario
 */
public class ControladorRegistro {
    
    private final VistaRegistroUsuarios user_view;

    public ControladorRegistro(VistaRegistroUsuarios user_view) {
        this.user_view = user_view;
        user_view.setVisible(true);
        user_view.setLocationRelativeTo(null);
    }
    
    public void takeControlRegistro() {
       user_view.getBtn_registro().addActionListener(l -> registro());
    }
    
    public void registro() {
        
    }
}

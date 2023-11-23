/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import encript.AES_ENCRYPTOR;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Rol;
import model.Usuario;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "VentasOperaciones")
public class VentasOperaciones {

    List<Usuario> usuarioList = new ArrayList<>();
    List<Rol> rolList = new ArrayList<>();

    
    
    private AES_ENCRYPTOR aes_encryption;
    //private String KEY = "ISTA2023";

    @WebMethod(operationName = "encrypt")
    public String encrypt(@WebParam(name = "txt") String txt) throws Exception {
        return aes_encryption.encrypt(txt);
    }

    @WebMethod(operationName = "decrypt")
    public String decrypt(@WebParam(name = "txt") String txt) throws Exception {

        return aes_encryption.decrypt(txt);
    }

    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "user") String user, 
            @WebParam(name = "password") String password) throws Exception {

        Boolean found = usuarioList.stream().anyMatch(cliente
                -> cliente.getNombre().equals(user)
                && cliente.getPassword().equals(password)
        );
        return found;
    }

    @WebMethod(operationName = "registroUsuario")
    public Boolean registroUsuario(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido,
            @WebParam(name = "cedula") String cedula, @WebParam(name = "direccion") String direccion,
            @WebParam(name = "telefono") String telefono,
            @WebParam(name = "mail") String mail, @WebParam(name = "password") String password,
            @WebParam(name = "rol") Rol rol) {

        Usuario user = new Usuario(nombre, apellido, cedula, direccion, telefono, mail, password);

        boolean flag = false;

        try {
            if (registroRol(rol.getId_rol(), rol.getNombre_rol())) {
                usuarioList.add(user);
                flag = true;
            }
        } catch (NullPointerException e) {
            return flag;
        }
        return flag;
    }

    @WebMethod(operationName = "registroRol")
    public Boolean registroRol(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre) {

        try {
            Rol rol = new Rol(id, nombre);
            rolList.add(rol);
            return true;

        } catch (NullPointerException e) {
            return false;
        }
    }
}

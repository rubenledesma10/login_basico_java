package com.mycompany.loginjava.logica;

import com.mycompany.loginjava.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {

    ControladoraPersistencia controlPersis;

    public ControladoraLogica() {
        //esto va asi asi la persitencia actua cuando llamo a la logica
        controlPersis = new ControladoraPersistencia();
    }

    //recibimos el usuario y la contraseña y hace este proceso
    public String validarUsuario(String usuario, String contrasenia) {
        String mensaje = "";
        //la lista que recibimos de la controladora de la persistencia la guardamos en esta lista
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        //recorremos la lista
        for (Usuario usu : listaUsuarios) {
            if (usu.getUsuario().equals(usuario)) {
                if (usu.getContrasenia().equals(contrasenia)) {
                    mensaje = "Usuario y contraseña correcta. Bienvenido";
                    //va a retornar un mensaje que va a ser recibido en el igu
                    //con este return tambien se corta automaticamente la ejecucion de lo que estoy haciendo dentro de la funcion
                    return mensaje;
                } else {
                    mensaje = "Contraseña incorrecta";
                    //va a retornar un mensaje que va a ser recibido en el igu
                    //con este return tambien se corta automaticamente la ejecucion de lo que estoy haciendo dentro de la funcion
                    return mensaje;
                }
            } else {
                mensaje = "Usuario incorrecto";
                //cuando no encuentra ni el usuario ni la contraseña retomamos solamente este mensaje, por eso dejamos el return ese al final y no va aca
            }
            
        }
        
        return mensaje;

    }

}

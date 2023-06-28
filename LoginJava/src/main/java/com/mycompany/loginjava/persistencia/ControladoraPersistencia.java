
package com.mycompany.loginjava.persistencia;

import com.mycompany.loginjava.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        //le pedimos que nos seleccione los usuarios y lo guarde en una lista (List<Usuario> seria en este caso) y este le va a responder a la logica
        return usuJpa.findUsuarioEntities(); //esto es igual a SELECT * FROM USUARIOS
    }
}

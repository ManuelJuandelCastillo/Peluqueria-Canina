
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Perro;
import logica.Propietario;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    PerroJpaController jpaPerro = new PerroJpaController();
    PropietarioJpaController jpaPropietario = new PropietarioJpaController();

    public void guardar(Propietario propietario, Perro perro) {
        jpaPropietario.create(propietario);
        jpaPerro.create(perro);
    }

    public List<Perro> traerDatos() {
        return jpaPerro.findPerroEntities();
    }

    public void borrarPerro(int numero_cliente) {
        try {
            jpaPerro.destroy(numero_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Perro traerPerro(int id_cliente) {
        return jpaPerro.findPerro(id_cliente);
    }

    public void modificarPerro(Perro perro) {
        try {
            jpaPerro.edit(perro);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Propietario buscarPropietario(int id) {
        return jpaPropietario.findPropietario(id);
    }

    public void modificarPropietario(Propietario propietario) {
        try {
            jpaPropietario.edit(propietario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}


package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void guardar(String nombrePerro, String raza, String color, String alergico, String especiales, String observaciones, String nombreDuenio, String telefono) {
        Propietario propietario = new Propietario();
        propietario.setNombre(nombreDuenio);
        propietario.setTelefono(telefono);
        
        Perro perro = new Perro();
        perro.setNombre(nombrePerro);
        perro.setRaza(raza);
        perro.setSolor(color);
        perro.setAlergico(alergico);
        perro.setCuidados_especiales(especiales);
        perro.setObservaciones(observaciones);
        
        perro.setPropietario(propietario);
        
        
        controladoraPersistencia.guardar(propietario, perro);
    }    

    public List<Perro> traerDatos() {
        return controladoraPersistencia.traerDatos();
    }

    public void borrarPerro(int numero_cliente) {
        controladoraPersistencia.borrarPerro(numero_cliente);
    }

    public Perro traerPerro(int id_cliente) {
        return controladoraPersistencia.traerPerro(id_cliente);
    }

    public void actualizar(Perro perro, String nombrePerro, String raza, String color, String alergico, String especiales, String observaciones, String nombreDuenio, String telefono) {
        perro.setNombre(nombrePerro);
        perro.setRaza(raza);
        perro.setSolor(color);
        perro.setAlergico(alergico);
        perro.setCuidados_especiales(especiales);
        perro.setObservaciones(observaciones);
        
        controladoraPersistencia.modificarPerro(perro);
        
        Propietario propietario = this.buscarPropietario(perro.getPropietario().getId());
        
        propietario.setNombre(nombreDuenio);
        propietario.setTelefono(telefono);
        
        this.modificarPropietario(propietario);
    }

    private Propietario buscarPropietario(int id) {
        return controladoraPersistencia.buscarPropietario(id);
    }

    private void modificarPropietario(Propietario propietario) {
        controladoraPersistencia.modificarPropietario(propietario);
    }

    
    
}

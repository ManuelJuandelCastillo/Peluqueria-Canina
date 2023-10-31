
package logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Perro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String raza;
    private String solor;
    private String alergico;
    private String cuidados_especiales;
    private String observaciones;
    @OneToOne
    private Propietario propietario;

    public Perro() {
    }

    public Perro(int id, String nombre, String raza, String solor, String alergico, String cuidados_especiales, String observaciones, Propietario propietario) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.solor = solor;
        this.alergico = alergico;
        this.cuidados_especiales = cuidados_especiales;
        this.observaciones = observaciones;
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSolor() {
        return solor;
    }

    public void setSolor(String solor) {
        this.solor = solor;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getCuidados_especiales() {
        return cuidados_especiales;
    }

    public void setCuidados_especiales(String cuidados_especiales) {
        this.cuidados_especiales = cuidados_especiales;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    
}

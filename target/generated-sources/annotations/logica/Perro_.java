package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Propietario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-31T17:38:11", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Perro.class)
public class Perro_ { 

    public static volatile SingularAttribute<Perro, String> cuidados_especiales;
    public static volatile SingularAttribute<Perro, String> raza;
    public static volatile SingularAttribute<Perro, String> alergico;
    public static volatile SingularAttribute<Perro, Propietario> propietario;
    public static volatile SingularAttribute<Perro, String> observaciones;
    public static volatile SingularAttribute<Perro, Integer> id;
    public static volatile SingularAttribute<Perro, String> solor;
    public static volatile SingularAttribute<Perro, String> nombre;

}
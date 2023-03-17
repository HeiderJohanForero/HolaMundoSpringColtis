
package com.coltis.HolaMundoSpring.domain;
//importar libreria

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
//anotacion

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    //atributo instancia a la persona
    private static final long serialVersionUID = 1L;
    //atributos privados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

}

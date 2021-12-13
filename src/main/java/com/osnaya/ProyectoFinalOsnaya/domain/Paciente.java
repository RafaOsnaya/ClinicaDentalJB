
package com.osnaya.ProyectoFinalOsnaya.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;


/**
 *
 * @author rafa
 */

@Data
@Entity
@Table(name = "paciente")
public class Paciente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;
    
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellidoPat;
    @NotEmpty
    private String apellidoMat;
    @NotEmpty
    private int edad;
    @NotEmpty
    private String telefono;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String direccion;
    
}

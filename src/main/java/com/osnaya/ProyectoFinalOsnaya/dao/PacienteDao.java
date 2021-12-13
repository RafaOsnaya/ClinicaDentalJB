
package com.osnaya.ProyectoFinalOsnaya.dao;

import com.osnaya.ProyectoFinalOsnaya.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rafa
 */

//CrudRepository ya cuneta con los principales metodos de un crud para poder trabajar con el objeto paciente
public interface PacienteDao extends JpaRepository<Paciente, Long>{
    
}

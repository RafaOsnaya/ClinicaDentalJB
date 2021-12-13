/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.osnaya.ProyectoFinalOsnaya.servicio;

import com.osnaya.ProyectoFinalOsnaya.dao.PacienteDao;
import com.osnaya.ProyectoFinalOsnaya.domain.Paciente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rafa
 */
@Service
public class PacienteServiceImpl implements PacienteService{
    
    @Autowired
    private PacienteDao pacienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Paciente> listarPacientes() {
        return (List<Paciente>) pacienteDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Paciente paciente) {
        pacienteDao.save(paciente);
    }

    @Override
    @Transactional
    public void eliminar(Paciente paciente) {
        pacienteDao.delete(paciente);
    }

    @Override
    @Transactional(readOnly = true)
    public Paciente encontrarPaciente(Paciente paciente) {
        return pacienteDao.findById(paciente.getIdPaciente()).orElse(null);
    }
    
}

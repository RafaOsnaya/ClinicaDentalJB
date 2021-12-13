/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.osnaya.ProyectoFinalOsnaya.servicio;

import com.osnaya.ProyectoFinalOsnaya.domain.Paciente;
import java.util.List;

/**
 *
 * @author rafa
 */
public interface PacienteService {
    
    public List<Paciente> listarPacientes();
    
    public void guardar(Paciente paciente);
    
    public void eliminar(Paciente paciente);
    
    public Paciente encontrarPaciente(Paciente paciente);
    
}

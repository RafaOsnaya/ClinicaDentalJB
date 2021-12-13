
package com.osnaya.ProyectoFinalOsnaya.web;

import com.osnaya.ProyectoFinalOsnaya.domain.Paciente;
import com.osnaya.ProyectoFinalOsnaya.servicio.PacienteService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class ConntroladorInicio {
      
    @Autowired //Inyecta la interface PacienteDao
    private PacienteService pacienteService;
    
    @GetMapping("/")  
    public String inicio(Model model, @AuthenticationPrincipal User user){
        
        var pacientes = pacienteService.listarPacientes();
        log.info("Usuario que realizo el login: "+user);
        log.info("Ejecutando el controlador Spring MVC");
        
        model.addAttribute("pacientes", pacientes);
        model.addAttribute("totalPacientes", pacientes.size());
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Paciente paciente){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Paciente paciente, Errors errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        pacienteService.guardar(paciente);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPaciente}")
    public String editar(Paciente paciente, Model model){
        paciente = pacienteService.encontrarPaciente(paciente);
        model.addAttribute("paciente", paciente);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Paciente paciente){
        pacienteService.eliminar(paciente);
        return "redirect:/";
    }

    
    
}

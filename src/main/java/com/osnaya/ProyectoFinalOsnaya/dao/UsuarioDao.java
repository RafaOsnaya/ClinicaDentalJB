/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.osnaya.ProyectoFinalOsnaya.dao;

import com.osnaya.ProyectoFinalOsnaya.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rafa
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}


package com.osnaya.ProyectoFinalOsnaya.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author rafa
 */
public class util {
    public static void main(String[] args) {
        
        var password = "3312";
        System.out.println("password: " + password);
        System.out.println("password encriptado: " + encriptarPassword(password));
    }
    
    //Encriptar password
    public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
        
    }
}

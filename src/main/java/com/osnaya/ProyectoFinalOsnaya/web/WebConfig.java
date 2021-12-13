
package com.osnaya.ProyectoFinalOsnaya.web;


import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 *
 * @author rafa
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
  /*  No Lo termine la traduccion del sitio
    //Nos permite configurar el idioma default del sitio
    @Bean
    public LocaleResolver localeResolver(){
        var slr = new SessionLocaleResolver();
        slr.setDefaultLocale(new Locale("es"));
        return slr;
    }
    
    //Interceptor que nos permitira autoconfigurar el idioma de acuerdo al lugar donde se esta visitando el sitio
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
        var lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
    
    //Registra o captura el idioma
    public void addInterceptor(InterceptorRegistry registro){
        registro.addInterceptor(localeChangeInterceptor());
    }
    */
    
    
    //URL del path por default(addViewController mapea paths que no necesariamente pasan por el controlador)
    @Override
    public void addViewControllers(ViewControllerRegistry registro){
        registro.addViewController("/").setViewName("index");
        registro.addViewController("/login");
        registro.addViewController("/errores/403").setViewName("/errores/403");
    }
            
    
}

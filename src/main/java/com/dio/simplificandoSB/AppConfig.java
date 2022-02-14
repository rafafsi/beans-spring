package com.dio.simplificandoSB;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro() {
        return new Livro();
    }

    // <bean id="livro" class="com.springbeans.Livro"/>     versão XML dessa classe ↑

    @Bean
    public Autor getAutorLivro() {
        return new Autor();
    }

}

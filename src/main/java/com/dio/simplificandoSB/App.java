package com.dio.simplificandoSB;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("livro 1");
        livro.setCodigo("4B3B2");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("rafaela");

        livro.exibir();

        factory.close();
    }
}

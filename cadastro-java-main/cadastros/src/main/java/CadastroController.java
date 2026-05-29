package com.example.cadastros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.requestMapping;

@RestController
public class CadastroController {
    @GetMapping("/")
    public String cadastro(
        @requestParam String nome,
        @RequestParam String curso
    ) {
        return ""
            + "<h1>Cadastro Realizado!</h1>"
            + "<p>Nome: " + nome + "</p>"
            + "<p>Curso: " + curso + "</p>";    
    }
}


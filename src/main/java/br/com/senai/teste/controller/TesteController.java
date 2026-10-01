package br.com.senai.teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/teste")
    public String teste() {
        return "Backend rodando na porta 8080";
    }

}
git init;
git add .;
git commit -m "Initial commit";
git branch -M main;
git remote add origin https://github.com/Alexandre10920/Crud_Basico.git;
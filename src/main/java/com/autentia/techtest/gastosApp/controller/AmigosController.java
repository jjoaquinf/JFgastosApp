package com.autentia.techtest.gastosApp.controller;

import com.autentia.techtest.gastosApp.entidades.Amigo;
import com.autentia.techtest.gastosApp.service.AmigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AmigosController {

    @Autowired
    AmigoService amigoService;
    @PostMapping("/addAmigo")
    public void addAmigo(@RequestBody Amigo amigo) {
        amigoService.addAmigo(amigo);
        ResponseEntity.ok();
    }

    @PostMapping("/addAmigos")
    public void addAmigos(
            @RequestBody List<Amigo> amigos) {
        amigos.stream().forEach(a -> amigoService.addAmigo(a));
    }

    @PostMapping("/getAmigos")
    public List<Amigo> getAmigos() {
        return amigoService.getAmigos();
    }
}

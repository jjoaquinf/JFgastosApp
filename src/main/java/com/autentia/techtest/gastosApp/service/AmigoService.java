package com.autentia.techtest.gastosApp.service;

import com.autentia.techtest.gastosApp.entidades.Amigo;

import java.util.List;

public interface AmigoService {

    public void addAmigo(Amigo amigo);

    public List<Amigo> getAmigos();
}

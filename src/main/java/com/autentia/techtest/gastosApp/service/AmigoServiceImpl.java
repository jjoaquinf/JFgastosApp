package com.autentia.techtest.gastosApp.service;

import com.autentia.techtest.gastosApp.entidades.Amigo;
import com.autentia.techtest.gastosApp.repository.AmigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmigoServiceImpl implements AmigoService {

    @Autowired
    AmigoRepository amigoRepository;


    @Override
    public void addAmigo(Amigo amigo) {
        amigoRepository.save(amigo);
    }

    @Override
    public List<Amigo> getAmigos() {
        return amigoRepository.findAll();
    }
}

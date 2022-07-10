package com.example.atomikosDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtomikosService {
    
    @Autowired
    private AtomikosFirstRespository atomikosFirstRespository;

    public ModelUserFirst save(){
        ModelUserFirst modelUserFirst = new ModelUserFirst();
        return modelUserFirst;
    }
}

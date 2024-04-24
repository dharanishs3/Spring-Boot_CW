package com.example.dharanish_day9_q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day9_q2.model.DharanishModel;
import com.example.dharanish_day9_q2.repository.DharanishRepoRepo;


@Service
public class RecipeService {
    @Autowired
    private DharanishRepoRepo rep;

  
    @SuppressWarnings("null")
    public boolean post(DharanishModel recipe)
    {
        try
        {
            rep.save(recipe);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public DharanishModel getByid(int id)
    {
        return rep.findById(id).orElse(null);
    }

    public List<DharanishModel> filter(String name)
    {
        return rep.findByProduct(name);
    }
    
    
}

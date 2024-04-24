package com.example.dharanish_day6_q3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.dharanish_day6_q3.model.DharanishModel;
import com.example.dharanish_day6_q3.repository.DharanishRepo;

@Service
public class DharanishService {
    public DharanishRepo productRepo;
    public DharanishService(DharanishRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(DharanishModel product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DharanishModel> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<DharanishModel> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public DharanishModel getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}

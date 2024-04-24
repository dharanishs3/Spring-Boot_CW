package com.example.dharanishq1.Service;

import com.example.dharanishq1.Model.DharanishModel;
import com.example.dharanishq1.Repository.DharanishRepo;

public class DharanishService {
    public DharanishRepo productRepo;

    public DharanishModel postProductData(DharanishModel data){
        return productRepo.save(data);
    }
    public void deleteProductData(int id){
        productRepo.deleteById(id);
    }
    public DharanishModel putProductData(int id,DharanishModel data){
        DharanishModel a=productRepo.findById(id).orElseThrow(()->new Error("Not Found"));
        a.setProductName(data.getProductName());
        a.setProductDescription(data.getProductDescription());
        return productRepo.save(a);
    }

}

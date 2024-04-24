package com.example.dharanishq3.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dharanishq3.Model.DharanishModel;
import com.example.dharanishq3.Repository.DharanishRepo;

@Service
public class DharanishService {
    private  DharanishRepo dharanishRepo;
    public boolean saveLanguage(DharanishModel dharanishModel)
    {
        try
        {
            dharanishRepo.save(dharanishModel);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DharanishModel> getLanguages()
    {
        return dharanishRepo.findAll();
    }
    public boolean updateLanguage(int id,DharanishModel dharanishModel)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            dharanishRepo.save(dharanishModel);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        dharanishRepo.deleteById(id);
        return true;
        
    }
    public DharanishModel getLanguageById(int id)
    {
        return dharanishRepo.findById(id).orElse(null);
    }
}

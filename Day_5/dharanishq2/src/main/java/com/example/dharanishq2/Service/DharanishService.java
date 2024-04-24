package com.example.dharanishq2.Service;

import org.springframework.stereotype.Service;

import com.example.dharanishq2.Model.DharanishModel;
import com.example.dharanishq2.Repository.DharanishRepo;

@Service
public class DharanishService {
public DharanishRepo dharanishRepo;
 public DharanishService(DharanishRepo dharanishRepo)
{
    this.dharanishRepo = dharanishRepo;
}
public boolean saveEmployee(DharanishModel employee)
{
    try
    {
        dharanishRepo.save(employee);
    }
    catch(Exception e){
    
        return false;
    }
    return true;
}
public boolean updateDetails(int id,DharanishModel employee)
{
    if(this.getEmployeeById(id)==null)
    {
        return false;
    }
    try{
        dharanishRepo.save(employee);
    }
    catch(Exception e)
    {
        return false;
    }
    return true;
}
public boolean deleteEmployee(int id)
{
    if(this.getEmployeeById(id) == null)
    {
        return false;
    }
    dharanishRepo.deleteById(id);
    return true;
}
public DharanishModel getEmployeeById(int id)
{
    return dharanishRepo.findById(id).orElse(null);
}
}
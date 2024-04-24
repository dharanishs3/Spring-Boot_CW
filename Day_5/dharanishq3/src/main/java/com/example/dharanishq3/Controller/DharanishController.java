package com.example.dharanishq3.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dharanishq3.Model.DharanishModel;
import com.example.dharanishq3.Service.DharanishService;

@RestController
public class DharanishController {
    public DharanishService dharanishService;
    @SuppressWarnings("null")
    @PostMapping("/language")
    public ResponseEntity<DharanishModel> postMethodName(@RequestBody DharanishModel dharanishModel) {
        
        if(dharanishService.saveLanguage(dharanishModel)==true)
        {
            return new ResponseEntity<>(dharanishModel,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @SuppressWarnings("null")
    @GetMapping("/language")
    public ResponseEntity<List<DharanishModel>> getMethodName() {
        List<DharanishModel> list =  dharanishService.getLanguages();
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @SuppressWarnings("null")
    @GetMapping("/language/{languageId}")
    public ResponseEntity<DharanishModel> getlangauge(@PathVariable("languageId") int id) {
        DharanishModel l =  dharanishService.getLanguageById(id);
        if(l == null)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(l,HttpStatus.OK);
    }
    
    @SuppressWarnings("null")
    @PutMapping("/language/{languageId}")
    public ResponseEntity<DharanishModel> putMethodName(@PathVariable int id, @RequestBody DharanishModel language) {
        if(dharanishService.updateLanguage(id,language) == true)
        {
            return new ResponseEntity<>(language,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        
    }

    @DeleteMapping("/language/{languageId}")
    public ResponseEntity<DharanishModel> delete(@PathVariable("languageId") int id)
    {
        if(dharanishService.deleteLanguage(id)==true)
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

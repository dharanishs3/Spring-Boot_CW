package com.example.dharanish_day6_q1.Service;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.example.dharanish_day6_q1.Model.DharanishModel;
import com.example.dharanish_day6_q1.Repository.DharanishRepo;

@Service
public class DharanishService {
    @Autowired
    public DharanishRepo dharanishRepo;

    public List<DharanishModel> sort(String field) {
         return dharanishRepo.findAll(Sort.by(Sort.Direction.DESC, field));
    }

    public DharanishModel save(DharanishModel children) {
         return dharanishRepo.save(children);

    }

    /**
     * @param offset
     * @param pagesize
     * @param field
     * @return
     */
    public List<DharanishModel> sortedPage(int offset, int pagesize, String field) {
         Page<DharanishModel> sortedPage = dharanishRepo
                   .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
         return sortedPage.getContent();
    }

    public List<DharanishModel> pagination(int offset, int pagesize) {
         Page<DharanishModel> pages = dharanishRepo.findAll(PageRequest.of(offset, pagesize));
         return pages.getContent();

    }
}

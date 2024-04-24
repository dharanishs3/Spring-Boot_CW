package com.example.dharanishq3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DharanishModel {
    @Id
    private int languageId;
    private String languageName;
    private String languageComplexity;
    public int getLanguageId() {
        return languageId;
    }
    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
    public String getLanguageName() {
        return languageName;
    }
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
    public String getLanguageComplexity() {
        return languageComplexity;
    }
    public void setLanguageComplexity(String languageComplexity) {
        this.languageComplexity = languageComplexity;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netron90.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author USER
 */
public class Emploi {
    
    private Integer id;
    private String qualite;
    private String date;
    
    public Emploi(){}
    
    @JsonCreator
    public Emploi(@JsonProperty("id") Integer id, @JsonProperty("qualite") String qualite, @JsonProperty("date") String date){
        this.id = id;
        this.qualite = qualite;
        this.date = date;
    }
    
    public Integer getEmploiId(){
        return this.id;
    }
    
    public String getQualite()
    {
        return this.qualite;
    }
    
    public String getDate()
    {
        return this.date;
    }
    
    public void setEmploiId(Integer id)
    {
        this.id = id;
    }
    
    public void setQualite(String qualite)
    {
        this.qualite = qualite;
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
}

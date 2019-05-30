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
public class Habitation {
    
    private Integer id;
    private String adress;
    private String ville;
    
    public Habitation()
    {
        
    }
    
    @JsonCreator
    public Habitation(@JsonProperty("id") Integer id, @JsonProperty("adresse") String adress, @JsonProperty("ville") String ville){
        
        this.id = id;
        this.ville = ville;
        this.adress = adress;
    }
    
    public Integer getHabitationId()
    {
        return this.id;
    }
    
    public String getHabitationVille(){
        
        return this.ville;
    }
    
    public String getHabitationAdress(){
        
        return this.adress;
    }
    
    public void setHabitationId(Integer id)
    {
        this.id = id;
    }
    
    public void setHabitationVille(String ville)
    {
        this.ville = ville;
    }
    
    public void setHabitationAdress(String adress)
    {
        this.adress = adress;
    }
    
    
}

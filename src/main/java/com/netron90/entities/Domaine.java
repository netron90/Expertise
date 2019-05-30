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
public class Domaine {
    
    private Integer id;
    private String libelle;
    
    public Domaine(){}
    
    @JsonCreator
    public Domaine(@JsonProperty("id") Integer id, @JsonProperty("libelle") String libelle){
        this.id = id;
        this.libelle = libelle;
    }
    
    
    public Integer getDomaineId(){
        return this.id;
    }
    
    public String getDomaineLibelle(){
        return this.libelle;
    }
    
    public void setDomaineId(Integer id){
        this.id = id;
    }
    
    public void setDomaineLibelle(String libelle)
    {
        this.libelle = libelle;
    }
    
}

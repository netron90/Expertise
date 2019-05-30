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
public class Personne {
    
    private Integer id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    
    public Personne(){
    
    }
    
//    public Personne(Integer id, String nom, String prenom, String dateNaissance){
//        
//        this.id = id;
//        this.nom = nom;
//        this.prenom = prenom;
//        this.dateNaissance = dateNaissance;
//    }
    
    @JsonCreator
    public Personne(@JsonProperty("id") Integer id, @JsonProperty("nom") String nom, @JsonProperty("prenom") String prenom, @JsonProperty("naissance") String dateNaissance){
        
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }
    
    
    public Integer getPersonId(){
        return this.id;
    }
    
    public String getPersonneFirstName(){
        return this.nom;
    }
    
    public String getPersonneLastName(){
        return this.prenom;
    }
    
    public String getPersonneBirth(){
        return this.dateNaissance;
    }
    
    public void setPersonneId(int id){
        this.id = id;
    }
    
    public void setPersonneLastName(String lastName){
        this.nom = lastName;
    }
    
    public void setPersonneFirstName(String firstName){
        this.prenom = firstName;
    }
    
    public void setPersonneBirth(String birth){
        this.dateNaissance = birth;
    }
}

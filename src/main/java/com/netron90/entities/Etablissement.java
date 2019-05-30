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
public class Etablissement {
    
    private Integer id;
    private String maisonSocial;
    private String adress;
    private String ville;
    
    public Etablissement(){
        
    }
    
    @JsonCreator
    public Etablissement(@JsonProperty("id") Integer id, @JsonProperty("maison") String maisonSocial, @JsonProperty("ville") String adress, String ville)
    {
        this.id = id;
        this.maisonSocial = maisonSocial;
        this.adress = adress;
        this.ville = ville;
    }
    
    public Integer getEtablissementId()
    {
        return this.id;
    }
    
    public String getEtablissementMaisonSocial()
    {
        return this.maisonSocial;
    }
    
    public String getEtablissementAdress()
    {
        return this.adress;
    }
    
    public String getEtablissementVills()
    {
        return this.ville;
    }
    
    public void setEtablissementId(Integer id)
    {
        this.id = id;
    }
    
    public void setEtablissementMaisonSocial(String maison)
    {
        this.maisonSocial = maison;
    }
    
    public void setEtablissementAdress(String adress)
    {
        this.adress = adress;
    }
    
    public void setEtablissementVille(String ville)
    {
        this.ville = ville;
    }
    
    
    
}

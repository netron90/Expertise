/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netron90.services;

import com.netron90.entities.Domaine;
import com.netron90.entities.Personne;
import com.netron90.repositories.DomaineRepository;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author USER
 */

@Path("/domaine")
public class DomaineService {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Domaine> findAllDomaine(){
        return DomaineRepository.allDomain();
    }
    
//    @GET
//    @Path("/id")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<Domaine> findOnePersonneDomaine(@PathParam("id") Integer id, Personne personne){
//        personne.setPersonneId(id);
//        return DomaineRepository.findOnePersonneDomaine(personne);
//        
//    }
    
//    @GET
//    @Path("/{id}/all-domaine")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<Domaine> getAllPersonneDomaine(@PathParam("id") Integer id, Personne personne){
//        
//        personne.setPersonneId(id);
//        return DomaineRepository.allDomain();
//    
//    }
//    
//    @POST
//    @Path("/{id}/add-domaine/{domaineName}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Domaine addPersonneDomaine(@PathParam("id") Integer id, Personne personne, @PathParam("domaineName") String domaineName)
//    {
//        personne.setPersonneId(id);
//        return DomaineRepository.addDomaine(personne, domaineName);
//    }
//    
//    @PUT
//    @Path("/{id}/update-domaine/{domaineName}/position/{pos}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Domaine updatePersonneDomaine(Integer id, Personne personne, @PathParam("domaineName") String domaineName, @PathParam("pos") int position){
//        
//        personne.setPersonneId(id);
//        return DomaineRepository.updateDomaine(personne, domaineName, position);
//    }
//    
//    @DELETE
//    @Path("/{id}/delete-domaine/position/{pos}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public void deletePersonneDomaine(Integer id, Personne personne, @PathParam("pos") int position){
//        
//        personne.setPersonneId(id);
//        DomaineRepository.deleteDomaine(personne, position);
//    }
    
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Domaine addOneDomaine(Domaine domaine){
//        return DomaineRepository.addDomaine(domaine);
//    }
//    
//    @PUT
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Domaine updateDomaine(@PathParam("id") Integer id, Domaine domaine)
//    {
//        domaine.setDomaineId(id);
//        return DomaineRepository.updateDomaine(domaine);
//    }
//    
//    @DELETE
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public void deletePersonne(Integer id, Domaine domaine){
//        domaine.setDomaineId(id);
//        DomaineRepository.deleteDomaine(domaine);
//    }
//    
//    @GET
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Domaine getOneDomaine(@PathParam("id") Integer id, Domaine domaine){
//        domaine.setDomaineId(id);
//        return DomaineRepository.findOneDomaine(domaine);
//    }
//    
}

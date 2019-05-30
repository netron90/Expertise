/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netron90.services;

import com.netron90.entities.Domaine;
import com.netron90.entities.Emploi;
import com.netron90.entities.Etablissement;
import com.netron90.entities.Habitation;
import com.netron90.entities.Personne;
import com.netron90.repositories.DomaineRepository;
import com.netron90.repositories.EmploiRepository;
import com.netron90.repositories.HabitationRepository;
import com.netron90.repositories.PersonneRepository;
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

@Path("/personne")
public class PersonneService  {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Personne> findAll()
    {
        return PersonneRepository.findAllPersons();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Personne addPerson(Personne personne)
    {
        return PersonneRepository.addPersonn(personne);
    }
    
    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Personne updatePerson(@PathParam("id") Integer id, Personne personne)
    {
        personne.setPersonneId(id);
        return PersonneRepository.updatePerson(personne);
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deletePersonne(Integer id, Personne personne){
        personne.setPersonneId(id);
        PersonneRepository.deletePersonne(personne);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Personne getOnePersonne(@PathParam("id") Integer id, Personne personne){
        personne.setPersonneId(id);
        return PersonneRepository.findOnePersonne(personne);
    }
    
    //-----------------RESTFUL API FOR PERSONNE DOMAINE START --------------------------------
    
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
    
    @GET
    @Path("/{id}/specifi-domaine")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Domaine> getSpecificPersonneDomaine(@PathParam("id") Integer id, Personne personne){
        
        personne.setPersonneId(id);
        return PersonneRepository.findOnePersonneDomaine(personne);
    
    }
    
    @POST
    @Path("/{id}/add-domaine/{domaineName}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Domaine addPersonneDomaine(@PathParam("id") Integer id, Personne personne, @PathParam("domaineName") String domaineName)
    {
        personne.setPersonneId(id);
        return PersonneRepository.addDomaine(personne, domaineName);
    }
    
    @PUT
    @Path("/{id}/update-domaine/{domaineName}/position/{pos}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Domaine updatePersonneDomaine(Integer id, Personne personne, @PathParam("domaineName") String domaineName, @PathParam("pos") int position){
        
        personne.setPersonneId(id);
        return PersonneRepository.updateDomaine(personne, domaineName, position);
    }
    
    @DELETE
    @Path("/{id}/delete-domaine/position/{pos}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deletePersonneDomaine(Integer id, Personne personne, @PathParam("pos") int position){
        
        personne.setPersonneId(id);
        PersonneRepository.deleteDomaine(personne, position);
    }
    //-----------------RESTFUL API FOR PERSONNE DOMAINE END --------------------------------
    
    //-----------------RESTFUL API FOR PERSONNE HABITATION START --------------------------------
    
//    @GET
//    @Path("/personnes-habitations")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<Habitation> getAllHabitation()
//    {
//        return HabitationRepository.findAllHabitation();
//    }
    
    @GET
    @Path("/{id}/personnes-habitations")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Habitation> getSpecificPersonneHabitation(@PathParam("id") Integer id, Personne personne)
    {
        personne.setPersonneId(id);
        return PersonneRepository.getSpecificPersonneHabitation(personne);
    }
    
    @POST
    @Path("/{id}/personnes-habitations")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Habitation addHabitation(@PathParam("id") Integer id, Personne personne, Habitation habitant)
    {
        personne.setPersonneId(id);
        return PersonneRepository.addHabitation(personne, habitant);
    }
    
    @PUT
    @Path("/{id}/personnes-habitations/{pos}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Habitation updateHabitation(@PathParam("id") Integer id, Personne personne, @PathParam("pos") int position, Habitation habitant){
        personne.setPersonneId(id);
        return PersonneRepository.updateHabitation(personne, position, habitant);
    }
    
    @DELETE
    @Path("/{id}/personnes-habitations/{pos}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteHabitation(@PathParam("id") Integer id, Personne personne, @PathParam("pos") int position){
        personne.setPersonneId(id);
        PersonneRepository.deleteHabitation(personne, position);
    }
    
    @GET
    @Path("/{id}/specifi-etablissement")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Etablissement> getSpecificEtablissement(@PathParam("id") Integer id, Emploi emploi){
        
        emploi.setEmploiId(id);
        return EmploiRepository.getSpecificJobZone(emploi);
    
    }
    
    //-----------------RESTFUL API FOR PERSONNE HABITATION END --------------------------------
    
    
    //-----------------RESTFUL API FOR PERSONNE JOBS START --------------------------------
    @POST
    @Path("/{id}/personnes-job")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Emploi addJob(@PathParam("id") Integer id, Personne personne, Emploi emploi)
    {
        personne.setPersonneId(id);
        return PersonneRepository.addEmploi(personne, emploi);
    }
    
    @PUT
    @Path("/{id}/personnes-job/{pos}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Emploi updateJob(@PathParam("id") Integer id, Personne personne, @PathParam("pos") int position, Emploi emploi){
        personne.setPersonneId(id);
        return PersonneRepository.updateEmploi(personne, emploi, position);
    }
    
    @DELETE
    @Path("/{id}/personnes-job/{pos}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteJob(@PathParam("id") Integer id, Personne personne, @PathParam("pos") int position){
        personne.setPersonneId(id);
        PersonneRepository.deleteEmploi(personne, position);
    }
    
    @GET
    @Path("/{id}/specifi-job")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Emploi> getSpecificJob(@PathParam("id") Integer id, Personne personne){
        
        personne.setPersonneId(id);
        return PersonneRepository.getSpecificJob(personne);
    
    }
    
    //-----------------RESTFUL API FOR PERSONNE JOBS END --------------------------------
    
    
}

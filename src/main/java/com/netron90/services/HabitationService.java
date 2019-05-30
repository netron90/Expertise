/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netron90.services;

import com.netron90.entities.Habitation;
import com.netron90.entities.Personne;
import com.netron90.repositories.HabitationRepository;
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

@Path("/habitation")
public class HabitationService {
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Habitation> getAllHabitation()
    {
        return HabitationRepository.findAllHabitation();
    }
    
//    @GET
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<Habitation> getSpecificPersonneHabitation(@PathParam("id") Integer id, Personne personne)
//    {
//        personne.setPersonneId(id);
//        return HabitationRepository.getSpecificPersonneHabitation(personne);
//    }
    
//    @POST
//    @Path("/{id}/habitant")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Habitation addHabitation(@PathParam("id") Integer id, Personne personne, Habitation habitant)
//    {
//        personne.setPersonneId(id);
//        return HabitationRepository.addHabitation(personne, habitant);
//    }
    
//    @PUT
//    @Path("/{id}/position/{pos}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Habitation updateHabitation(@PathParam("id") Integer id, Personne personne, @PathParam("pos") int position, Habitation habitant){
//        personne.setPersonneId(id);
//        return HabitationRepository.updateHabitation(personne, position, habitant);
//    }
//    
//    @DELETE
//    @Path("/{id}/position/{pos}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public void deleteHabitation(@PathParam("id") Integer id, Personne personne, @PathParam("pos") int position){
//        personne.setPersonneId(id);
//        HabitationRepository.deleteHabitation(personne, position);
//    }
    
}

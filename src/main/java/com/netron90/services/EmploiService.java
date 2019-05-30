/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netron90.services;

import com.netron90.entities.Emploi;
import com.netron90.entities.Etablissement;
import com.netron90.repositories.EmploiRepository;
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

@Path("/emploi")
public class EmploiService {
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Emploi> getAllEmploie(){
        return EmploiRepository.findAllEmploi();
    }
    
    @POST
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Etablissement addEtablissement(@PathParam("id") Integer id, Emploi emploi, Etablissement etabli)
    {
        emploi.setEmploiId(id);
        return EmploiRepository.addEtablissement(emploi, etabli);
    }
    
    @PUT
    @Path("/{id}/emploi/{pos}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Etablissement udpadateEtablissement(@PathParam("id") Integer id, Emploi emploi, Etablissement etabli, @PathParam("pos") int position)
    {
        emploi.setEmploiId(id);
        return EmploiRepository.updateEtablissement(emploi, position, etabli);
    }
    
    @DELETE
    @Path("/{id}/emploi/{pos}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteEtablissement(@PathParam("id") Integer id, Emploi emploi, Etablissement etabli, @PathParam("pos") int position)
    {
        emploi.setEmploiId(id);
        EmploiRepository.deleteEtablissement(emploi, position, etabli);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netron90.repositories;

import com.netron90.entities.Domaine;
import com.netron90.entities.Emploi;
import com.netron90.entities.Etablissement;
import com.netron90.entities.Habitation;
import com.netron90.entities.Personne;
import static com.netron90.repositories.DomaineRepository.DOMAINE_LIST;
import static com.netron90.repositories.HabitationRepository.HABITATION_LIST;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class PersonneRepository {

    
    
    public static final List<Personne> PERSON_LIST = new ArrayList();
    
    static{
        init();
    }
    
    private static void init() {
        PERSON_LIST.add(new Personne(1, "AGOSSOU", "Yannick", "02/04/95"));
        PERSON_LIST.add(new Personne(2, "DOE", "Jane", "02/09/99"));
    }
    
    public static List<Personne> findAllPersons(){
        return new ArrayList(PERSON_LIST);
    }
    
    public static Personne addPersonn(Personne personne){
        personne.setPersonneId(PERSON_LIST.size()+1);
        PERSON_LIST.add(personne);
        return personne;
    }
    
    public static Personne updatePerson(Personne personne)
    {
        PERSON_LIST.set(personne.getPersonId(), personne);
        return personne;
    }
    
    public static void deletePersonne(Personne personne){
        PERSON_LIST.remove(personne.getPersonId());
    }
    
    public static Personne findOnePersonne(Personne personne){
        return PERSON_LIST.get(personne.getPersonId());
        
    }
    
    //Method for add Person's Domaine
    public static Domaine addDomaine(Personne personne, String domaineName){
        
        Domaine domaine = new Domaine(personne.getPersonId(), domaineName); 
        DomaineRepository.DOMAINE_LIST.add(domaine);
        return domaine;
        
    }
    
    public static List<Domaine> findOnePersonneDomaine(Personne personne)
    {
        List<Domaine> listPersonneDomaine = new ArrayList();
            
        for(int i = 0; i < DomaineRepository.DOMAINE_LIST.size(); i++)
        {
            if(DomaineRepository.DOMAINE_LIST.get(i).getDomaineId() == personne.getPersonId())
            {
                listPersonneDomaine.add(DomaineRepository.DOMAINE_LIST.get(i));
            }
        }
        return listPersonneDomaine;
         
    }
    
    //Method for updatePersonne's Domaine
    public static Domaine updateDomaine(Personne personne, String domaineName, int position){
        
        Domaine domaine = null;
        
        if(position <= DOMAINE_LIST.size())
        {
            for(int i = 0; i < DOMAINE_LIST.size(); i++)
            {
                if(DomaineRepository.DOMAINE_LIST.get(i).getDomaineId() == 
                        personne.getPersonId() && position == DomaineRepository.DOMAINE_LIST.indexOf(DomaineRepository.DOMAINE_LIST.get(i)))
                {
                    DomaineRepository.DOMAINE_LIST.get(i).setDomaineLibelle(domaineName);
                    domaine = DomaineRepository.DOMAINE_LIST.get(i);
                    break;
                }

            }
         return domaine;
        }
        else
        {
            return null;
        }
       
    }
    
    
    //Method for delete Personne's Domaine
    public static void deleteDomaine(Personne personne, int position){
       
        if(position <= DomaineRepository.DOMAINE_LIST.size())
        {
            for(int i = 0; i < DomaineRepository.DOMAINE_LIST.size(); i++)
            {
                if(DomaineRepository.DOMAINE_LIST.get(i).getDomaineId() == 
                        personne.getPersonId() && position == DomaineRepository.DOMAINE_LIST.indexOf(DomaineRepository.DOMAINE_LIST.get(i)))
                {
                    DomaineRepository.DOMAINE_LIST.remove(position);
                    break;
                }

            }
        
        }

       
    }
    
    public static List<Habitation> getSpecificPersonneHabitation(Personne personne){
        
        List<Habitation> listPersonneHabitation = new ArrayList();
        
        for(int i = 0; i < HabitationRepository.HABITATION_LIST.size(); i++)
        {
            if(HabitationRepository.HABITATION_LIST.get(i).getHabitationId() == personne.getPersonId())
            {
                listPersonneHabitation.add(HabitationRepository.HABITATION_LIST.get(i));
            }
        }
        return listPersonneHabitation;
    }
    
    public static Habitation addHabitation(Personne personne, Habitation habitant){
        
        habitant.setHabitationId(personne.getPersonId());
        HabitationRepository.HABITATION_LIST.add(habitant);
        return habitant;
    }
    
    public static Habitation updateHabitation(Personne personne, int position, Habitation habitant)
    {
        Habitation habitation = null;
        
        if(position <= HABITATION_LIST.size())
        {
            for(int i = 0; i < HabitationRepository.HABITATION_LIST.size(); i++)
            {
                if(HabitationRepository.HABITATION_LIST.get(i).getHabitationId() == personne.getPersonId() && position == HabitationRepository.HABITATION_LIST.indexOf(HabitationRepository.HABITATION_LIST.get(position)))
                {
                    HabitationRepository.HABITATION_LIST.set(position, habitant);
                    habitation = HabitationRepository.HABITATION_LIST.get(i);
                    break;
                }
            }
            return habitation;
        }else{
            return null;
        }
    }
    
    public static void deleteHabitation(Personne personne, int position)
    {
        if(position <= HabitationRepository.HABITATION_LIST.size())
        {
            for(int i = 0; i < HabitationRepository.HABITATION_LIST.size(); i++)
            {
                if(HabitationRepository.HABITATION_LIST.get(i).getHabitationId() == personne.getPersonId() && position == HabitationRepository.HABITATION_LIST.indexOf(HabitationRepository.HABITATION_LIST.get(position)))
                {
                    HabitationRepository.HABITATION_LIST.remove(position);
                    break;
                }
            }
        }
    }
    
    
    //for EMPLOI
    public static Emploi addEmploi(Personne personne, Emploi emploi)
    {
        
            emploi.setEmploiId(personne.getPersonId());
            EmploiRepository.EMPLOI_LIST.add(emploi);
            return emploi;
        
        
    }
    
    public static Emploi updateEmploi(Personne personne, Emploi emploi, int position)
    {
        Emploi emploie = null;
        
        if(position <= EmploiRepository.EMPLOI_LIST.size())
        {
            for(int i = 0; i < EmploiRepository.EMPLOI_LIST.size(); i++)
            {
                if(EmploiRepository.EMPLOI_LIST.get(i).getEmploiId() == personne.getPersonId() && position == EmploiRepository.EMPLOI_LIST.indexOf(EmploiRepository.EMPLOI_LIST.get(position)))
                {
                    EmploiRepository.EMPLOI_LIST.set(position, emploi);
                    emploie = EmploiRepository.EMPLOI_LIST.get(i);
                    break;
                }
            }
            return emploie;
        }else{
            return null;
        }
    }
    
    public static void deleteEmploi(Personne personne, int position)
    {
        Emploi emploie = null;
        
        if(position <= EmploiRepository.EMPLOI_LIST.size())
        {
            for(int i = 0; i < EmploiRepository.EMPLOI_LIST.size(); i++)
            {
                if(EmploiRepository.EMPLOI_LIST.get(i).getEmploiId() == personne.getPersonId() && position == EmploiRepository.EMPLOI_LIST.indexOf(EmploiRepository.EMPLOI_LIST.get(position)))
                {
                    EmploiRepository.EMPLOI_LIST.remove(i);
                    
                    break;
                }
            }
            
        }
    }
    
    public static List<Emploi> getSpecificJob(Personne personne){
        
        List<Emploi> listJob = new ArrayList();
        
        for(int i = 0; i < EmploiRepository.EMPLOI_LIST.size(); i++)
        {
            if(EmploiRepository.EMPLOI_LIST.get(i).getEmploiId() == personne.getPersonId())
            {
                listJob.add(EmploiRepository.EMPLOI_LIST.get(i));
            }
        }
        return listJob;
    }
    
    
//    //Method for get All Personne domaine
//    public static List<Domaine> getPersonDomaine(Personne personne){
//        List<Domaine> personneDomaineList = new ArrayList();
//        for(int i = 0; i < DomaineRepository.allDomain().size(); i++)
//        {
//            if(DomaineRepository.allDomain().get(i).getDomaineId() == personne.getPersonId())
//            {
//                personneDomaineList.add(DomaineRepository.allDomain().get(i));
//            }
//        }
//        return personneDomaineList;
//    }
   
    
//    //Method for add Person's Domaine
//    public static Domaine addDomaine(Personne personne, String domaineName){
//        
//        Domaine domaine = new Domaine(personne.getPersonId(), domaineName); 
//        DomaineRepository.DOMAINE_LIST.add(domaine);
//        return domaine;
//        
//    }
//    
//    //Method for updatePersonne's Domaine
//    public static Domaine updateDomaine(Personne personne, String domaineName, int position){
//        
//        Domaine domaine = null;
//        
//        if(position <= DomaineRepository.DOMAINE_LIST.size())
//        {
//            for(int i = 0; i < DomaineRepository.DOMAINE_LIST.size(); i++)
//            {
//                if(DomaineRepository.DOMAINE_LIST.get(i).getDomaineId() == 
//                        personne.getPersonId() && position == DomaineRepository.DOMAINE_LIST.indexOf(DomaineRepository.DOMAINE_LIST.get(i)))
//                {
//                    DomaineRepository.DOMAINE_LIST.get(i).setDomaineLibelle(domaineName);
//                    domaine = DomaineRepository.DOMAINE_LIST.get(i);
//                    break;
//                }
//
//            }
//         return domaine;
//        }
//        else
//        {
//            return null;
//        }
//       
//    }
//    
//    
//    //Method for delete Personne's Domaine
//    public static void deleteDomaine(Personne personne, String domaineName, int position){
//       
//        if(position <= DomaineRepository.DOMAINE_LIST.size())
//        {
//            for(int i = 0; i < DomaineRepository.DOMAINE_LIST.size(); i++)
//            {
//                if(DomaineRepository.DOMAINE_LIST.get(i).getDomaineId() == 
//                        personne.getPersonId() && position == DomaineRepository.DOMAINE_LIST.indexOf(DomaineRepository.DOMAINE_LIST.get(i)))
//                {
//                    DomaineRepository.DOMAINE_LIST.remove(position);
//                    break;
//                }
//
//            }
//        
//        }
//
//       
//    }

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netron90.repositories;

import com.netron90.entities.Domaine;
import com.netron90.entities.Personne;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class DomaineRepository {
    
    public static final List<Domaine> DOMAINE_LIST = new ArrayList();
    
    static{
        init();
    }

    private static void init() {
        DOMAINE_LIST.add(new Domaine(1, "Design"));
    }
    
    public static List<Domaine> allDomain()
    {
        return new ArrayList(DOMAINE_LIST);
    }
        
//    public static List<Domaine> findOnePersonneDomaine(Personne personne)
//    {
//        List<Domaine> listPersonneDomaine = new ArrayList();
//            
//        for(int i = 0; i < DOMAINE_LIST.size(); i++)
//        {
//            if(DOMAINE_LIST.get(i).getDomaineId() == personne.getPersonId())
//            {
//                listPersonneDomaine.add(DOMAINE_LIST.get(i));
//            }
//        }
//        return listPersonneDomaine;
//         
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
//        if(position <= DOMAINE_LIST.size())
//        {
//            for(int i = 0; i < DOMAINE_LIST.size(); i++)
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
//    public static void deleteDomaine(Personne personne, int position){
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
        
        
        
//    public static Domaine addDomaine(Personne personne, String domaineName){
//        
//        Domaine domaine = new Domaine(DOMAINE_LIST.size() + 1, domaineName); 
//        DOMAINE_LIST.add(domaine);
//        return domaine;
//        
//    }
//    
//    public static Domaine updateDomaine(Domaine domaine){
//        if(PersonneRepository.PERSON_LIST.size() < domaine.getDomaineId())
//        {
//            DOMAINE_LIST.set(domaine.getDomaineId(), domaine);
//            return domaine;
//        }else{return null;}
//    }
//    
//    public static void deleteDomaine(Domaine domaine)
//    {
//        if(PersonneRepository.PERSON_LIST.size() < domaine.getDomaineId())
//        {
//            DOMAINE_LIST.remove(domaine.getDomaineId());
//        }
//    }
//    
//    public static Domaine findOneDomaine(Domaine domaine){
//        if(PersonneRepository.PERSON_LIST.size() < domaine.getDomaineId())
//        {
//            return DOMAINE_LIST.get(domaine.getDomaineId());
//        }else{return null;}
//    }
    
}

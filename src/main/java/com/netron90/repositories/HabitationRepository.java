/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netron90.repositories;

import com.netron90.entities.Habitation;
import com.netron90.entities.Personne;
import static com.netron90.repositories.DomaineRepository.DOMAINE_LIST;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class HabitationRepository {
    
    public static final List<Habitation> HABITATION_LIST = new ArrayList();
    
    static{
        init();
    }

    private static void init() {
        HABITATION_LIST.add(new Habitation(1, "BELLE-VUE 61", "Cornride"));
        HABITATION_LIST.add(new Habitation(1, "AKPAKPA 610", "Cotonou"));
        HABITATION_LIST.add(new Habitation(2, "CADJEHOUN 41", "Cotonou"));
    }
    
    public static List<Habitation> findAllHabitation()
    {
        return new ArrayList(HABITATION_LIST);
    }
    
//    public static List<Habitation> getSpecificPersonneHabitation(Personne personne){
//        
//        List<Habitation> listPersonneHabitation = new ArrayList();
//        
//        for(int i = 0; i < HABITATION_LIST.size(); i++)
//        {
//            if(HABITATION_LIST.get(i).getHabitationId() == personne.getPersonId())
//            {
//                listPersonneHabitation.add(HABITATION_LIST.get(i));
//            }
//        }
//        return listPersonneHabitation;
//    }
    
//    public static Habitation addHabitation(Personne personne, Habitation habitant){
//        
//        HABITATION_LIST.add(habitant);
//        return habitant;
//    }
    
//    public static Habitation updateHabitation(Personne personne, int position, Habitation habitant)
//    {
//        Habitation habitation = null;
//        
//        if(position <= DOMAINE_LIST.size())
//        {
//            for(int i = 0; i < HABITATION_LIST.size(); i++)
//            {
//                if(HABITATION_LIST.get(i).getHabitationId() == personne.getPersonId() && position == HABITATION_LIST.indexOf(HABITATION_LIST.get(position)))
//                {
//                    HABITATION_LIST.set(position, habitant);
//                    habitation = HABITATION_LIST.get(i);
//                    break;
//                }
//            }
//            return habitation;
//        }else{
//            return null;
//        }
//    }
    
//    public static void deleteHabitation(Personne personne, int position)
//    {
//        if(position <= DOMAINE_LIST.size())
//        {
//            for(int i = 0; i < HABITATION_LIST.size(); i++)
//            {
//                if(HABITATION_LIST.get(i).getHabitationId() == personne.getPersonId() && position == HABITATION_LIST.indexOf(HABITATION_LIST.get(position)))
//                {
//                    HABITATION_LIST.remove(position);
//                    break;
//                }
//            }
//        }
//    }
    
}

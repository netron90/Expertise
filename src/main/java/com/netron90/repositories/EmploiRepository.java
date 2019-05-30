/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netron90.repositories;

import com.netron90.entities.Emploi;
import com.netron90.entities.Etablissement;
import com.netron90.entities.Habitation;
import com.netron90.entities.Personne;
import static com.netron90.repositories.DomaineRepository.DOMAINE_LIST;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class EmploiRepository {
    
    public static final List<Emploi> EMPLOI_LIST = new ArrayList();
    
    
    static{
        init();
        
    }

    private static void init() {
        EMPLOI_LIST.add(new Emploi(1, "DESIGNER", "12/12/12"));
    }
    
    public static List<Emploi> findAllEmploi(){
        return new ArrayList(EMPLOI_LIST);
    }
    
    public static Etablissement addEtablissement(Emploi emploi, Etablissement etablissement)
    {
        
            etablissement.setEtablissementId(emploi.getEmploiId());
            EtablissementRepository.ETABLISSEMENT_LIST.add(etablissement);
            return etablissement;
        
        
    }
    
    public static Etablissement updateEtablissement(Emploi emploi, int position, Etablissement etablissement)
    {
        Etablissement entreprise = null;
        
        if(position <= EtablissementRepository.ETABLISSEMENT_LIST.size())
        {
            for(int i = 0; i < EtablissementRepository.ETABLISSEMENT_LIST.size(); i++)
            {
                if(EtablissementRepository.ETABLISSEMENT_LIST.get(i).getEtablissementId() == emploi.getEmploiId() && position == EtablissementRepository.ETABLISSEMENT_LIST.indexOf(EtablissementRepository.ETABLISSEMENT_LIST.get(position)))
                {
                    EtablissementRepository.ETABLISSEMENT_LIST.set(position, etablissement);
                    entreprise = EtablissementRepository.ETABLISSEMENT_LIST.get(i);
                    break;
                }
            }
            return entreprise;
        }else{
            return null;
        }
    }
    
    public static void deleteEtablissement(Emploi emploi, int position, Etablissement etablissement)
    {
        Etablissement entreprise = null;
        
        if(position <= EtablissementRepository.ETABLISSEMENT_LIST.size())
        {
            for(int i = 0; i < EtablissementRepository.ETABLISSEMENT_LIST.size(); i++)
            {
                if(EtablissementRepository.ETABLISSEMENT_LIST.get(i).getEtablissementId() == emploi.getEmploiId() && position == EtablissementRepository.ETABLISSEMENT_LIST.indexOf(EtablissementRepository.ETABLISSEMENT_LIST.get(position)))
                {
                    EtablissementRepository.ETABLISSEMENT_LIST.remove(i);
                    
                    break;
                }
            }
            
        }
    }
    
    public static List<Etablissement> getSpecificJobZone(Emploi emploi){
        
        List<Etablissement> listJobZone = new ArrayList();
        
        for(int i = 0; i < EtablissementRepository.ETABLISSEMENT_LIST.size(); i++)
        {
            if(EtablissementRepository.ETABLISSEMENT_LIST.get(i).getEtablissementId() == emploi.getEmploiId())
            {
                listJobZone.add(EtablissementRepository.ETABLISSEMENT_LIST.get(i));
            }
        }
        return listJobZone;
    }
        
}

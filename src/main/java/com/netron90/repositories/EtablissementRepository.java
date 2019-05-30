/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netron90.repositories;

import com.netron90.entities.Etablissement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class EtablissementRepository {
    
    public static final List<Etablissement> ETABLISSEMENT_LIST = new ArrayList();
    
    static{
        init();
    }

    private static void init() {
        ETABLISSEMENT_LIST.add(new Etablissement(2, "HE System", "SODJATIMIN", "COTONOU"));
        ETABLISSEMENT_LIST.add(new Etablissement(2, "GROUPE SE", "FIDROSSE", "COTONOU"));
    }
    
    public static List<Etablissement> findAllEtablissement(){
        return new ArrayList(ETABLISSEMENT_LIST);
    }
    
    
    
    
    
}

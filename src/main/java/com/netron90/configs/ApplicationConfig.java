/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netron90.configs;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author USER
 */

@ApplicationPath("api")
public class ApplicationConfig extends Application {   

    
//    @Override
//    public Map<String, Object> getProperties() {
//        Map<String, Object> properties = new HashMap<String, Object>();
//        
//        //package parent de tous les packages 
//        properties.put("jersey.config.server.provider.packages", "com.netron90");
//        return properties;
//    }
}

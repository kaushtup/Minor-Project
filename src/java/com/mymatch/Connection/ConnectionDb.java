/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mymatch.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author roshi
 */
public class ConnectionDb {
    
    public static Session sessionObject(){
      Configuration configuration = new Configuration().configure("com/mymatch/Connection/hibernate.cfg.xml"); //used to find hibernate
      StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()); //load mapping and other files 
      SessionFactory sf = configuration.buildSessionFactory(builder.build()); 
      Session s = sf.openSession();
      return s;
  } 
    
}

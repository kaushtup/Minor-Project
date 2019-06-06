/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mymatch.services;

import com.mymatch.dao.IMessagestoreDao;
import com.mymatch.model.Messagestore;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DELL
 */
@Service
@Transactional
public class MessagestoreService implements IMessagestoreService {
       @Autowired
    private IMessagestoreDao messagestoreDao;
 
   @Override
  public void insertmessage(Messagestore md) {
      messagestoreDao.insertmessage(md);
              
    }
    
    @Override
    public List<Messagestore> selectmessage() {
      List<Messagestore> al=messagestoreDao.selectmessage();
      return al;
    }
   
    @Override
    public List<Messagestore> updatemessage(Messagestore md) {
       messagestoreDao.updatemessage(md);//database update
        System.out.println(md.getMid());
        System.out.println(md.getFrom());
        System.out.println(md.getTo());
        System.out.println(md.getMessage());
        
        
       List<Messagestore> al=messagestoreDao.selectmessage(); //database select operation
       return al;
    }

    @Override
    public List<Messagestore> editmessage(int md) {
       List<Messagestore> al= messagestoreDao.editmessage(md);
       return al;
    }
      
    @Override
    public List<Messagestore> deletemessage(int md) {
       messagestoreDao.deletemessage(md);
     List<Messagestore> al=messagestoreDao.selectmessage();
      return null;
    }
}


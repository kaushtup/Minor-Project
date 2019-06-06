/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mymatch.services;

import com.mymatch.dao.IRegisterDao;
import com.mymatch.model.Register;
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
public class RegisterService implements IRegisterService {
    @Autowired
    private IRegisterDao registerDao;
 
   @Override
  public void insert(Register od) {
      registerDao.insert(od);
              
    }
    
    @Override
    public List<Register> select() {
      List<Register> al=registerDao.select();
      return al;
    }
   
    @Override
    public List<Register> update(Register od) {
       registerDao.update(od);//database uodate
        System.out.println(od.getPid());
        System.out.println(od.getUsername());
        System.out.println(od.getPassword());
        System.out.println(od.getAge());
        System.out.println(od.getAddress());
        System.out.println(od.getGender());
        System.out.println(od.getImage());
        
       List<Register> al=registerDao.select(); //database select operation
       return al;
    }

    @Override
    public List<Register> edit(int pid) {
       List<Register> al= registerDao.edit(pid);
       return al;
    }
      
    @Override
    public List<Register> delete(int pid) {
       registerDao.delete(pid);
     List<Register> al=registerDao.select();
      return null;
    }
}



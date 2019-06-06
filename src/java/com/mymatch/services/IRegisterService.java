/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mymatch.services;

import com.mymatch.model.Register;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface IRegisterService {
    public void insert(Register od);
    public List<Register> select();
    public List<Register> update(Register od);
    public List<Register> edit(int pid);
    public List<Register> delete(int pid);
}

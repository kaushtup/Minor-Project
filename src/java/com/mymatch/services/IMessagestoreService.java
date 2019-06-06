/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mymatch.services;

import com.mymatch.model.Messagestore;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface IMessagestoreService {
    public void insertmessage(Messagestore md);
    public List<Messagestore> selectmessage();
    public List<Messagestore> updatemessage(Messagestore md);
    public List<Messagestore> editmessage(int md);
    public List<Messagestore> deletemessage(int md);
}

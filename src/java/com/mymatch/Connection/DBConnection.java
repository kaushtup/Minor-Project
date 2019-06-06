/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mymatch.Connection;


import com.mymatch.dao.RegisterDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DBConnection {
   
    private static final Logger logger = Logger.getLogger(RegisterDao.class.getName()); 
   public static Statement statementObject(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
            }catch(Exception e){
                logger.warning("driver not loaded");
            }
            Connection con=null;
            try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mymatch", "root", "");
            }catch(Exception f){
                logger.warning("database not conected");
            }
            Statement st=null;
            try{
                st=con.createStatement();
            }catch(Exception g){
                logger.warning("statement object not created");
            }
            return st;
   }
}

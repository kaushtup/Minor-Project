/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mymatch.dao;

import com.mymatch.Connection.DBConnection;
import com.mymatch.model.Register;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class RegisterDao {
  private static final Logger logger = Logger.getLogger(RegisterDao.class.getName());
    public static void insert(Register od){
     String sql = "INSERT INTO register(username,password,age,address,gender,image) VALUES('"+od.getUsername()+"','"+od.getPassword()+"','"+od.getAge()+"','"+od.getAddress()+"','"+od.getGender()+"','"+od.getImage()+"')";
     Statement st = DBConnection.statementObject();
     try{
         st.execute(sql);
         logger.info("data inserted");//saves time and memory than system.out.println("..")
     }catch(Exception e){
         logger.warning("data not inserted");
     }
}
    public static ArrayList<Register> select(){
        ArrayList<Register> al = new ArrayList();
        String sql = "SELECT * FROM register";
        Statement st=DBConnection.statementObject();
        try{
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                      al.add(new Register(rs.getInt("pid"),rs.getString("username"),rs.getString("password"),rs.getInt("age"),rs.getString("address"),rs.getString("gender"),rs.getBytes("image")));
                ///course model ma value set garera ,arraylist ma add garira.
                logger.info("Data fetched successfully");
          
            }
        }
             catch(Exception e){
               logger.warning("Query not executed"+e); 
        }
        return al;
    }
    public static void deletebyId(int pid){
        String sql="DELETE FROM register WHERE pid="+pid;
        Statement st = DBConnection.statementObject();
        try{
            st.execute(sql);
            logger.info("Data deleted successfully");
        }
        catch(Exception e){
            logger.warning("Data not deleted"+e);
        }
    }
     public static ArrayList<Register> selectbyID(int pid){
        ArrayList<Register> al = new ArrayList();
        String sql = "SELECT * FROM register where pid="+pid;
        Statement st=DBConnection.statementObject();
        try{
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                al.add(new Register(rs.getInt("pid"),rs.getString("username"),rs.getString("password"),rs.getInt("age"),rs.getString("address"),rs.getString("gender"),rs.getBytes("image")));
                ///course model ma value set garera ,arraylist ma add garira.
                logger.info("Data fetched successfully");
            
        }
             catch(Exception e){
               logger.warning("Query not executed"+e); 
        }
        return al;
    }
     public static void update(Register od){
         Statement st=DBConnection.statementObject();
         String sql = "UPDATE register set username='"+od.getUsername()+"',password='"+od.getPassword()+"',age='"+od.getAge()+"',address='"+od.getAddress()+"',gender='"+od.getGender()+"' ,image='"+od.getImage()+"' WHERE pid="+od.getPid();
          try{
         st.executeUpdate(sql);
         logger.info("data updated");//saves time and memory than system.out.println("..")
     }catch(Exception e){
         logger.warning("data not updated");
     }
     }   
}

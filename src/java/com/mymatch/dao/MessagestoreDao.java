/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mymatch.dao;

import com.mymatch.Connection.DBConnection;
import com.mymatch.model.Messagestore;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class MessagestoreDao {
     private static final Logger logger = Logger.getLogger(MessagestoreDao.class.getName());
    public static void insertmessage(Messagestore md){
     String sql = "INSERT INTO messagestore(from,to,message) VALUES('"+md.getFrom()+"','"+md.getTo()+"','"+md.getMessage()+"')";
     Statement st = DBConnection.statementObject();
     try{
         st.execute(sql);
         logger.info("data inserted");//saves time and memory than system.out.println("..")
     }catch(Exception e){
         logger.warning("data not inserted");
     }
}
    public static ArrayList<Messagestore> selectmessage(){
        ArrayList<Messagestore> al = new ArrayList();
        String sql = "SELECT * FROM messagestore";
        Statement st=DBConnection.statementObject();
        try{
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                al.add(new Messagestore(rs.getInt("mid"),rs.getString("from"),rs.getString("to"),rs.getString("message")));
                ///course model ma value set garera ,arraylist ma add garira.
                logger.info("Data fetched successfully");
            }
        }
             catch(Exception e){
               logger.warning("Query not executed"+e); 
        }
        return al;
    }
    public static void deletebyId(int mid){
        String sql="DELETE FROM messagestore WHERE mid="+mid;
        Statement st = DBConnection.statementObject();
        try{
            st.execute(sql);
            logger.info("Data deleted successfully");
        }
        catch(Exception e){
            logger.warning("Data not deleted"+e);
        }
    }
     public static ArrayList<Messagestore> selectbyID(int mid){
        ArrayList<Messagestore> al = new ArrayList();
        String sql = "SELECT * FROM messagestore where mid="+mid;
        Statement st=DBConnection.statementObject();
        try{
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                al.add(new Messagestore(rs.getInt("mid"),rs.getString("from"),rs.getString("to"),rs.getString("message")));
                ///course model ma value set garera ,arraylist ma add garira.
                logger.info("Data fetched successfully");
            
        }
             catch(Exception e){
               logger.warning("Query not executed"+e); 
        }
        return al;
    }
     public static void updatemessage(Messagestore md){
         Statement st=DBConnection.statementObject();
         String sql = "UPDATE messagestore set from='"+md.getFrom()+"',to='"+md.getTo()+"',message='"+md.getMessage()+"' WHERE mid="+md.getMid();
          try{
         st.executeUpdate(sql);
         logger.info("data updated");//saves time and memory than system.out.println("..")
     }catch(Exception e){
         logger.warning("data not updated");
     }
     }
}

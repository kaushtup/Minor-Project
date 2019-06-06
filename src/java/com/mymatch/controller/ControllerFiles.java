/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mymatch.controller;

import com.mymatch.Connection.ConnectionDb;
import com.mymatch.model.Messagestore;
import com.mymatch.model.Register;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author roshi
 */
@Controller
public class ControllerFiles {
   @RequestMapping(value={"/index","/"},method=RequestMethod.GET)
    public ModelAndView index(){
    ModelAndView mv = new ModelAndView("index");
    return mv;//dispatcher ma return huncha ra slash(/) thapidincha
    }
    
     @RequestMapping(value={"/message","/"},method=RequestMethod.GET)
    public ModelAndView message(){
    ModelAndView mv = new ModelAndView("message");
    return mv;//dispatcher ma return huncha ra slash(/) thapidincha
    }
    
  @RequestMapping(value="/Addpartner",method=RequestMethod.GET)
    public ModelAndView displayall(){
  //  ArrayList<Course> al = CourseDao.select();
    Session s = ConnectionDb.sessionObject();
    s.beginTransaction();
    List<Register> al = s.createCriteria(Register.class).list();
    s.getTransaction().commit();
    s.close();
    ModelAndView mv = new ModelAndView("addpartner");
    mv.addObject("register",al);
    return mv;
    }
    
    @RequestMapping(value={"/recommendation","/"},method=RequestMethod.GET)
    public ModelAndView recommendation(){
    ModelAndView mv = new ModelAndView("recommendation");
    return mv;//dispatcher ma return huncha ra slash(/) thapidincha
    }
    
     @RequestMapping(value="/searchview",method=RequestMethod.GET)
    public ModelAndView displayview(){
  //  ArrayList<Course> al = CourseDao.select();
    Session s = ConnectionDb.sessionObject();
    s.beginTransaction();
    List<Register> al = s.createCriteria(Register.class).list();
    s.getTransaction().commit();
    s.close();
    ModelAndView mv = new ModelAndView("searchview");
    mv.addObject("register",al);
    return mv;
    }
    
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public ModelAndView save(/*@RequestParam("title") String title,
           @RequestParam("price") String price,
           @RequestParam("duration") String duration*/
     @ModelAttribute("register") Register register)
            {
                /*Course cm = new Course();
                cm.setTitle(title);
                cm.setPrice(price);
                cm.setDuration(duration);
                CourseDao.insert(cm);*/
                Session s = ConnectionDb.sessionObject();
                s.beginTransaction();
                s.save(register);
                s.getTransaction().commit();
                s.close();
                ModelAndView mv = new ModelAndView("index");
                return mv;
         }
    
     @RequestMapping(value="/savemessage",method=RequestMethod.POST)
    public ModelAndView savemessage(/*@RequestParam("title") String title,
           @RequestParam("price") String price,
           @RequestParam("duration") String duration*/
     @ModelAttribute("messagestore") Messagestore messagestore)
            {
                /*Course cm = new Course();
                cm.setTitle(title);
                cm.setPrice(price);
                cm.setDuration(duration);
                CourseDao.insert(cm);*/
                Session s = ConnectionDb.sessionObject();
                s.beginTransaction();
                s.save(messagestore);
                s.getTransaction().commit();
                s.close();
                ModelAndView mv = new ModelAndView("myprofile");
                return mv;
         }
    
    
    @RequestMapping(value={"/Aboutus"},method=RequestMethod.GET)
    public ModelAndView about_us(){
    ModelAndView mv = new ModelAndView("aboutus");
    return mv;//dispatcher ma return huncha ra slash(/) thapidincha
    }
    
    
    @RequestMapping(value={"/logincheck"},method=RequestMethod.GET)
    public ModelAndView logincheck(){
    ModelAndView mv = new ModelAndView("logincheck");
    return mv;//dispatcher ma return huncha ra slash(/) thapidincha
    }
    
     @RequestMapping(value={"/Search"},method=RequestMethod.GET)
    public ModelAndView search(){
    ModelAndView mv = new ModelAndView("search");
    return mv;//dispatcher ma return huncha ra slash(/) thapidincha
    }

    
    @RequestMapping(value={"/Contactus"},method=RequestMethod.GET)
    public ModelAndView contact_us(){
    ModelAndView mv = new ModelAndView("contactus");
    return mv;//dispatcher ma return huncha ra slash(/) thapidincha
    }

    
    @RequestMapping(value={"/Home","//"},method=RequestMethod.GET)
    public ModelAndView home(){
    ModelAndView mv = new ModelAndView("home");
    return mv;//dispatcher ma return huncha ra slash(/) thapidincha
    }

   
    @RequestMapping(value="/Myprofile",method=RequestMethod.GET)
    public ModelAndView display(){
  //  ArrayList<Course> al = CourseDao.select();
    Session s = ConnectionDb.sessionObject();
    s.beginTransaction();
    List<Register> al = s.createCriteria(Register.class).list();
    s.getTransaction().commit();
    s.close();
    ModelAndView mv = new ModelAndView("myprofile");//goes to myprofie.jsp
    mv.addObject("register",al);
    return mv;
    }
    
    @RequestMapping(value="/Signup",method=RequestMethod.GET) ///index ko sanga same hunu parchaw i.e addCourse
    public ModelAndView add(){
    ModelAndView mv = new ModelAndView("signup");
    return mv;
    }
    
   @RequestMapping(value="/EditProfile/{value}",method=RequestMethod.GET)
    public ModelAndView edit(@PathVariable("value") int pid){
    //ArrayList<Course> al = CourseDao.selectbyID(cid); 
    Session s = ConnectionDb.sessionObject();
    s.beginTransaction();
    List<Register> al = s.createCriteria(Register.class).add(Restrictions.eq("pid", pid)).list();
    s.getTransaction().commit();
    s.close();
    ModelAndView mv = new ModelAndView("editprofile");
    mv.addObject("register",al);
    return mv;
    }
    
     @RequestMapping(value="/editProfile",method=RequestMethod.GET)
    public ModelAndView editC(@ModelAttribute("register") Register register){ 
        /*model ma rakchaw.... yo talla ko code haru ko satta ho
        @RequestParam("title") String title,
           @RequestParam("price") String price,
           @RequestParam("duration") String duration)
                  */
    Session s = ConnectionDb.sessionObject();
    s.saveOrUpdate(register);
    s.beginTransaction();
    List<Register> al = s.createCriteria(Register.class).list();
    s.getTransaction().commit();
    s.close();
    //CourseDao.update(course); 
    //ArrayList<Course> al = CourseDao.select();
    ModelAndView mv = new ModelAndView("myprofile");
    mv.addObject("register",al);
    return mv;
    }
    
    @RequestMapping(value="/DeleteProfile/{value}",method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("value") int pid){
    //CourseDao.deletebyId(cid);    
    //ArrayList<Course> al = CourseDao.select();
    Session s = ConnectionDb.sessionObject();                                   
    s.beginTransaction();
    Register register = (Register) s.get(Register.class, pid);
    s.delete(register);
    List<Register> al = s.createCriteria(Register.class).list();
    s.getTransaction().commit();
    s.close();
    ModelAndView mv = new ModelAndView("myprofile");
    mv.addObject("register",al);
    return mv;
    }
    
    
    
    
    
     

  
  }


    

package com.example.MyWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home") //whenever home is called , use this
    @ResponseBody // it will print home.jsp on web page
    //@RequestParam("name") String myName (for one para thr URL)
    public ModelAndView home(Alien alien) // httpservicerequest is used to get something from URL
    {
        //return ModelAndView -> it takes data and view
//        HttpSession session = req.getSession();
//        String name = req.getParameter("name");
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj",alien);
        mv.setViewName("home");
//        System.out.println("Hi"+ myName);
//        session.setAttribute("name",myName);
        return mv; //by adding dependencies in pom.xml, it will print this page on web
        //.jsp is removed after adding it in properties
    }
}

package com.sort.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sort.entity.Cat;

@Controller
public class CatController {
 
    @ResponseBody
    @RequestMapping("/getCatList")
    public List<Cat> hello(){
    	List<Cat> catList = getCatList();
    	catList.sort(Comparator.comparing(Cat::getGender).thenComparing(Cat::getName));
        return catList;
    }
    
    
    private static List<Cat> getCatList() {
    	List<Cat> catList = new ArrayList<Cat>();
    	Cat cat = new Cat();
    	cat.setGender("Male");
    	cat.setName("Angel");
    	catList.add(cat);
    	
    	
    	cat = new Cat();
     	cat.setGender("Male");
     	cat.setName("Molly");
     	catList.add(cat);
     	
    	cat = new Cat();
     	cat.setGender("Male");
     	cat.setName("Tigger");
     	catList.add(cat);
     	
    	cat = new Cat();
     	cat.setGender("Female");
     	cat.setName("Gizmo");
     	catList.add(cat);
     	
    	cat = new Cat();
     	cat.setGender("Female");
     	cat.setName("Jasper");
     	catList.add(cat);
     	
    	return catList;
    }

    public static void main(String args[]) {
    	List<Cat> catList = getCatList();
    	catList.sort(Comparator.comparing(Cat::getGender).thenComparing(Cat::getName));
    	catList.forEach((cat)->System.out.println(cat));

    }
}
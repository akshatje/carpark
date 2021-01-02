package com.carpark.iplt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class insertcar {
    int count=0;
    @Autowired
    private bp bp1;

    @RequestMapping("/parkCars{quantity}")
    public int sayhi(@PathVariable int quantity){
        for(int i=0;i<quantity;i++){
        if(count>=50)
        System.out.println("full park");
        else
        System.out.println("your car ticket number is"+count++);
        System.out.println(bp1.park(count));
        }
    return count;

    }
    @RequestMapping("/unparkCars{id}")
    public int saybye(@PathVariable int id){
        System.out.println("bye");
        System.out.println(bp1.unpark(id));
        return id;
    }
    @RequestMapping("/status")
    public void status(){
        bp1.displaystatus();
    }

  
    
}

package com.carpark.iplt;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@ComponentScan
@RestController
public class insertcar {
    int count=0;
    @Autowired
    private bp bp1;

    @RequestMapping("/parkCars{quantity}")
    public String sayhi(@PathVariable int quantity){
        for(int i=0;i<quantity;i++){
        if(count>=50)
       { 
        return new String("park is full");}
        else
     {   Thread p1=new Thread(new park());
        p1.start();

    }
        }
    return new String("parked successfully , current capacity is "+ count) ;

    }
    @RequestMapping("/getcar{n}")
    public String fetchcar(@PathVariable int n)
    {
        int qnp=bp1.qnumber(n);
        if(bp1.contains(n)==null)
     return new String("car not found");  
     else return new String("your car is at queue number"+ qnp);
    }
    @RequestMapping("/unparkCars{id}")
    public String saybye(@PathVariable int id){
        System.out.println();
        count--;
        return new String(bp1.unpark(id)+ " "+id+" current capacity is"+count);
    }
    @RequestMapping("/status")
    public List status(){
        return Arrays.asList(bp1.displaystatus());
    }

  
    
}

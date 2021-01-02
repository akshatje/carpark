package com.carpark.iplt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
@ComponentScan
@Service
public class park implements Runnable{
    @Autowired
    private bp bp1;
    private volatile int p;
    public void run(){
        parker(5);
    }
    public String parker(int n)
    {   try{
        Thread.sleep(500);
    }
    catch (InterruptedException e) {
        System.out.println("The thread is interrupted.");
     }
        if(bp1.qnumber(n)==0 && bp1.q0.size()<10)
        { bp1.q0.add(n);
       return new String("ok");}
        else if(bp1.qnumber(n)==1 && bp1.q1.size()<10)
        {bp1.q1.add(n);
       return new String("ok");}
        else if(bp1.qnumber(n)==2 && bp1.q2.size()<10)
        {bp1.q2.add(n);
       return new String("ok");}
        else if(bp1.qnumber(n)==3 && bp1.q3.size()<10)
       { bp1.q3.add(n);
       return new String("ok");}
        else if(bp1.qnumber(n) ==4 && bp1.q4.size()<10)
        {bp1.q4.add(n);
       return new String("ok");}
        else 
        return new String("full hai");
        


    }
   
}

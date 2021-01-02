package com.carpark.iplt;

import java.util.*;

import org.springframework.stereotype.Service;

@Service()
public class bp {
    
    Queue<Integer> q0= new LinkedList<>();
    Queue<Integer> q1= new LinkedList<>();
    Queue<Integer> q2= new LinkedList<>();
    Queue<Integer> q3= new LinkedList<>();
    Queue<Integer> q4= new LinkedList<>();
    
    
    public String park(int n)
    {   
        
        if(qnumber(n)==0 && q0.size()<10)
        { q0.add(n);
       return new String("ok");}
        else if(qnumber(n)==1 && q1.size()<10)
        {q1.add(n);
       return new String("ok");}
        else if(qnumber(n)==2 && q2.size()<10)
        {q2.add(n);
       return new String("ok");}
        else if(qnumber(n)==3 && q3.size()<10)
       { q3.add(n);
       return new String("ok");}
        else if(qnumber(n) ==4 && q4.size()<10)
        {q4.add(n);
       return new String("ok");}
        else 
        return new String("full hai");


    }
    public int unpark(int n)
    {
        if(qnumber(n)==0 && q0.contains(n))
        {q0.remove(n);
        return (100*qnumber(n)+n);}

        else if(qnumber(n)==1 && q1.contains(n))
        {q1.remove(n);
        return (100*qnumber(n)+n);}

        else  if(qnumber(n)==2 && q2.contains(n))
        {q2.remove(n);
        return (100*qnumber(n)+n);}
        else  if(qnumber(n)==3 && q3.contains(n))
        {q3.remove(n);
        return (100*qnumber(n)+n);}

        else  if( q4.contains(n))
        {q4.remove(n);
        return (100*qnumber(n)+n);}
        else return -1;

    }
    public void displaystatus(){
    for(int i:q0)
    System.out.print(i+" ");
    System.out.println();
    for(int i:q1)
    System.out.print(i+" ");
    System.out.println();
    for(int i:q2)
    System.out.print(i+" ");
    System.out.println();
    for(int i:q3)
    System.out.print(i+" ");
    System.out.println();
    for(int i:q4)
    System.out.print(i+" ");
    System.out.println();

    }
    public int qnumber(int n)
    {
                if(n%5==0)
                return 0;
                else if(n%5==1)
                return 1;
                else if(n%5==2)
                return 2;
                else if(n%5==3)
                return 3;
                else return 4;
        
            
        
    }
    




    
}

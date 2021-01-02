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
    
    
    public String unpark(int n){
        if(contains(n)==null)
        return new String("Car not found imposter");
        contains(n).remove(n);
        return new String("Bye");


    }
    public Queue<Integer> contains(int n)
    {
        if(qnumber(n)==0 && q0.contains(n))
        {
        return q0; }

        else if(qnumber(n)==1 && q1.contains(n))
        {
        return q1;}

        else  if(qnumber(n)==2 && q2.contains(n))
        {
        return q2;}
        else  if(qnumber(n)==3 && q3.contains(n))
        {
        return q3;}

        else  if( qnumber(n)==4 && q4.contains(n))
        {
        return q4;}
        else return null;

    }
    public int[][] displaystatus(){
        int arr[][]=new int[5][10];
    int count=0;
    for(int i:q0)
    arr[0][count++]=i;
     count=0;
    for(int i:q1)
    arr[1][count++]=i;
    count=0;
    for(int i:q2)
    arr[2][count++]=i;
    count=0;
    for(int i:q3)
    arr[3][count++]=i;
    count=0;
    for(int i:q4)
    arr[4][count++]=i;
    count=0;
    return arr;

        
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

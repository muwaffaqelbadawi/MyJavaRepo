package com.company;

import java.util.Random;

public class tuna implements Runnable {

    private int time;
    private String name;
    Random r = new Random();

    public tuna(String x){
        name = x;
        time = r.nextInt(999);
    }
    public void run(){
        try{
            System.out.printf("%s is sleeping for %d\n",name,time);
            Thread.sleep(time);
            System.out.printf("%s is done\n",name);
        }catch (Exception e){}
    }

}

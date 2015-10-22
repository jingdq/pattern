package com.jing.pattern;

/**
 * Created by jingdongqi on 10/22/15.
 */
public class Singleton {

    private static volatile  Singleton instance;



    private void Singleton(){}


    public static Singleton getInstance(){
          if (instance == null){

              synchronized (Singleton.class){
                  if (instance == null){

                      instance = new Singleton();
                  }

              }
          }


        return instance;
    }



}

package com.jing.pattern;

import android.os.Build;

/**
 * Created by jingdongqi on 10/22/15.
 */
public class PersonBuilder {

       private String name;
       private int age;
       private int height;
       private int weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public  PersonBuilder(Builder builder){
        this.age = builder.age;
        this.name = builder.name;
        this.height = builder.height;
        this.weight = builder.weight;
    }


       public static class Builder{
           private String name;
           private int age;
           private int height;
           private int weight;

           public Builder name(String name){
               this.name = name;
               return this;

           }


           public  Builder age(int age){
               this.age = age;
               return this;
           }

           public Builder height(int height){
               this.height = height;

               return this;

           }

          public Builder weight(int weight){
              this.weight = weight;
              return this;
          }


           public PersonBuilder  build(){
               return  new PersonBuilder(this);
           }

    }

}

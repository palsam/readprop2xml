package com.palani.learn.readprop2xml.domain;
import lombok.*;

@Getter
@Setter
public class Resource {


    private String name;
    private String age;


    @Override
    public String toString(){
        return "Age of "+name+"is :"+age;
    }
}

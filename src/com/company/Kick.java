package com.company;

/**
 * Created by Admin on 7/24/17.
 */
interface Kick {

    default void print(){
        System.out.println("I am a solider man!");
    }


    public String kick();

}

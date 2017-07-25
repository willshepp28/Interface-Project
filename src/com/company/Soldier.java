package com.company;

/**
 * Created by Admin on 7/24/17.
 */
public abstract class Soldier {



    // instance variables
    private String name;
    private int rank;
    private int serialNumber;
    private java.util.Date dateCreated;






    // methods
    public String sleep(){
        return "ZZZZ";
    }

    public String eat() {
        return "munch , munch, munch";
    }

    public String walk(){
        return "making my way downtown, walking fast dun dun dun dun dun dun";
    }






    //abstract methods
    public abstract String speak();



}

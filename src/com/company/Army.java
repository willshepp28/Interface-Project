package com.company;

/**
 * Created by Admin on 7/25/17.
 */
public class Army extends Soldier implements ThrowBomb {

    @Override
    public Bomb throwBomb() {
        return new Bomb();
    }

    @Override
    public String speak() {
        return "iam a army solider";
    }

    public String kick() {
        return "a real solider kick";
    }
}

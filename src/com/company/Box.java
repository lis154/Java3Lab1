package com.company;

import java.util.ArrayList;

/**
 * Created by il on 13.08.2018.
 */
public  class Box<T> {
    ArrayList<T> array = new ArrayList<T>();

    public float getWeight()
    {
        float zn = 0;
        if (this.array.get(0).getClass().getName().equals("Orange"))
        {
            zn = 1.5f;
        }
        if (this.array.get(0).getClass().getName().equals("Apple"))
        {
            zn = 1.0f;
        }

        float sum = this.array.size()*zn;
        return sum;


    }

    public boolean compare (Box<T> box)
    {
        if (this.getWeight() == box.getWeight()) return true;
        else return false;
    }

    public boolean addFruit (T fruit)
    {
        if (this.array.getClass().getName().equals(fruit.getClass().getName()))
        {
            this.array.add(fruit);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean sovmest(Box<T> box)
    {

        for (T t: this.array) {
            if (!(box.array.getClass().getName().equals(t.getClass().getName())))
            {
                return false;
            }
            box.addFruit(t);
        }
        this.array = null;
        return true;
    }









}

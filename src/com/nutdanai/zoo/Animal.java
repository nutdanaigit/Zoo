package com.nutdanai.zoo;

import java.util.Scanner;

/**
 * Created by Nutdanai on 7/12/2016.
 */
public class Animal {
    protected String aName;
    protected String aTypeEat;
    protected String aType;

    public Animal() {
    }

    public Animal(String aName, String aType, String aTypeEat) {
        this.aName = aName;
        this.aTypeEat = aTypeEat;
        this.aType = aType;

    }

    public String getaName() { return aName; }
    public String getaTypeEat() { return aTypeEat; }
    public String getaType() { return aType; }


    public void sleep(String sSleep){
        System.out.println(sSleep);
    }

    public Scanner wakeup(String wWakeup){
        System.out.println(wWakeup);
        return null;
    }

    public void move(String mMove){
        System.out.println(mMove);
    }

}

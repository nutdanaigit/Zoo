package com.nutdanai.zoo;

import java.util.List;
import java.util.Random;

/**
 * Created by Nutdanai on 7/13/2016.
 */
public class Zookeeper {
    protected String nameZookeeper;
    protected String typeZookeeper;

    public Zookeeper(String nameZookeep ) {
        this.nameZookeeper = nameZookeep;
        Random rdZ = new Random();
        if(rdZ.nextInt(2)==0)
        {
            typeZookeeper = "Land animal        ";

        }else if(rdZ.nextInt(2)==1){
            typeZookeeper = "Poultry            ";
        }else {
            typeZookeeper = "Aquatic Animals    ";
        }


    }

    public String getTypeZookeeper() {
        return typeZookeeper;
    }

    public String getNameZookeeper() {return nameZookeeper;}

    public void setNameZookeeper(String nameZookeeper) {
        this.nameZookeeper = nameZookeeper;
    }
}

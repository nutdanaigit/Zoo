package com.nutdanai.zoo;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.patterns.StepPattern;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Nutdanai on 7/12/2016.
 */
public class Zoo {
    protected String time;
    protected String animal;
    protected String price;

    public static void main(String[] args){
      Zoo p1= new Zoo();
      Animal p2 = new Animal();
      Time p3 = new Time();
      List<Zookeeper> w = p1.work();
        int d = 1;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Do you want to go?(y/n): ");
            String s = scan.nextLine();
            if(s.equals("y")) {
                 System.out.println("Welcome to the Zoo!!!");
                 break;
            }
            d++;
        }while (d<5);
            if(d>=5){
                 System.out.println("Bye!!!");
                 System.exit(1);
            }
        p2.wakeup("Animal wake up : Have a good day");
        p1.setTime("Morning Open 8:00 a.m.");
        p1.setPrice("\tChildren price = 100 USD\n\tAdult price = 1000 USD\n\n");
        p1.printCollection(p1.setAnimal(),w);
        p2.move("Animal move : I'm waking");
        p1.setTime("\nEvening Close 17:00 p.m.");
        p2.sleep("Animal sleep : Don't touch Be quiet");

    }



    public List<Food> setAnimal() {
        List<Food> animals = new ArrayList<>();
        animals.add(new Food("Livebearer                ","Aquatic Animals    ","Herbivores"));
        animals.add(new Food("Platy                     ","Aquatic Animals    ","Herbivores"));
        animals.add(new Food("Red-tailed chalceus       ","Aquatic Animals    ","Herbivores"));
        animals.add(new Food("Ocellate River Stingray   ","Aquatic Animals    ","Carnivore"));
        animals.add(new Food("Pearl Gourami             ","Aquatic Animals    ","Carnivore"));
        animals.add(new Food("Shark                     ","Aquatic Animals    ","Carnivore"));
        animals.add(new Food("dolphin                   ","Aquatic Animals    ","Omnivore"));
        animals.add(new Food("Fighting fish             ","Aquatic Animals    ","Omnivore"));
        animals.add(new Food("whale                     ","Aquatic Animals    ","Omnivore"));
        animals.add(new Food("Butterfly                 ","Poultry            ","Herbivores"));
        animals.add(new Food("Hummingbird               ","Poultry            ","Herbivores"));
        animals.add(new Food("Cockatoo                  ","Poultry            ","Herbivores"));
        animals.add(new Food("Bald Eagle                ","Poultry            ","Carnivore"));
        animals.add(new Food("Red-Tailed Hawk           ","Poultry            ","Carnivore"));
        animals.add(new Food("Kingfisher                ","Poultry            ","Carnivore"));
        animals.add(new Food("Ostrich                   ","Poultry            ","Omnivore"));
        animals.add(new Food("Laughing Kookaburra       ","Poultry            ","Omnivore"));
        animals.add(new Food("Jacana                    ","Poultry            ","Omnivore"));
        animals.add(new Food("Guanaco                   ","Land animal        ","Herbivores"));
        animals.add(new Food("Prairie Dog               ","Land animal        ","Herbivores"));
        animals.add(new Food("Somali Wild Ass           ","Land animal        ","Herbivores"));
        animals.add(new Food("Andean (Spectacled) Bear  ","Land animal        ","Carnivore"));
        animals.add(new Food("Cheetah                   ","Land animal        ","Carnivore"));
        animals.add(new Food("Dhole                     ","Land animal        ","Carnivore"));
        animals.add(new Food("Ant                       ","Land animal        ","Omnivore"));
        animals.add(new Food("Bonobo                    ","Land animal        ","Omnivore"));
        animals.add(new Food("Brown Bear                ","Land animal        ","Omnivore"));
        return animals;
    }

    public void printCollection(Collection<Food> a,List<Zookeeper> w){
        for (Food str:a
             ) { if(str.getaType().equals(w.get(0).getTypeZookeeper())){
                    System.out.println( w.get(0).getNameZookeeper()+str.getaName()+str.getaType()+str.getaTypeEat()+" ("+str.getDetail()+")");

        }else if(str.getaType().equals(w.get(1).getTypeZookeeper())){
                    System.out.println( w.get(1).getNameZookeeper()+str.getaName()+str.getaType()+str.getaTypeEat()+" ("+str.getDetail()+")");
        }else {
                    System.out.println( w.get(2).getNameZookeeper()+str.getaName()+str.getaType()+str.getaTypeEat()+" ("+str.getDetail()+")");

            }
        }
    }


    public void setPrice(String price) {
        this.price = price;
        System.out.printf(price);
    }

    public void setTime(String time) {
        this.time = time;
        System.out.println(time);
    }



    public List<Zookeeper> work(){
        List<Zookeeper> namework = new ArrayList<>();
        namework.add(new Zookeeper("Pearl  "));
        namework.add(new Zookeeper("Dew    "));
        namework.add(new Zookeeper("Ten    "));
        return namework;
    }

}

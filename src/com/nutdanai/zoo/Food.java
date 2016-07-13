package com.nutdanai.zoo;

import java.util.Random;

/**
 * Created by Nutdanai on 7/13/2016.
 */
public class Food extends Animal {
    private String detail;

    public Food(String aName, String aType, String aTypeEat) {
              super(aName, aType, aTypeEat);
        setDetail();


    }

    public void setDetail(){
        Random rd = new Random();
        if(aTypeEat.equals("Herbivores")){
            switch (rd.nextInt(3))
            {//หญ้ารูซี่  หญ้ามอริชัสหรือหญ้าขน ถั่วเซนโตรซีมา ถั่วไมยรา
                case 0:detail = "Brachiaria ruziziensis"; break;
                case 1:detail = "Brachiaria mutica"; break;
                case 2:detail = "Centrosema pubescens"; break;
                case 3:detail = "Desmanthus virgatus"; break;
                default : break;
            }
        }else if(aTypeEat.equals("Carnivore")){
            switch (rd.nextInt(3))
            {//หญ้ารูซี่  หญ้ามอริชัสหรือหญ้าขน ถั่วเซนโตรซีมา ถั่วไมยรา
                case 0:detail = "Bone-In Ribeye"; break;
                case 1:detail = "Tenderloin"; break;
                case 2:detail = "New York Strip"; break;
                case 3:detail = "T-Bone"; break;
                default : break;
            }
        }else if(aTypeEat.equals("Omnivore")){
            switch (rd.nextInt(3))
            {//หญ้ารูซี่  หญ้ามอริชัสหรือหญ้าขน ถั่วเซนโตรซีมา ถั่วไมยรา
                case 0:detail = "Brachiaria ruziziensis & Bone-In Ribeye"; break;
                case 1:detail = "Brachiaria mutica & Tenderloin"; break;
                case 2:detail = "Centrosema pubescens & New York Strip"; break;
                case 3:detail = "Desmanthus virgatus & T-Bone"; break;
                default : break;
            }
        }
    }

    public String getDetail() {return detail;}

    public void eat(){
        //eat
    }

}

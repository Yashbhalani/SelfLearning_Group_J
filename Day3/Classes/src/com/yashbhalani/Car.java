package com.yashbhalani;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("audi") || validModel.equals("inova"))
            this.model=model;
        else
            this.model="unknown";
    }

     public String getModel(){
        return this.model;
     }


}

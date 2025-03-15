package com.app;

public class FullStackCourse implements Course{

   private PriceCalc priceCalc;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String duration;
//
//    public FullStackCourse(PriceCalc priceCalc) {
//        this.priceCalc = priceCalc;
//    }


     FullStackCourse() {
    }



    @Override
    public String getProgrammeName() {
        return "Full-stack";
    }

    @Override
    public String getPrice() {
        return priceCalc.showPrice();
    }


    public void setPriceCalc(PriceCalc priceCalc) {
        this.priceCalc = priceCalc;
    }

    public void start(){
        System.out.println("started");
    }
    public void destroyed(){
        System.out.println("Triggered");
    }
}

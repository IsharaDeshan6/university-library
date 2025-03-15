package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("FullStackCourse")
public class FullStackCourse implements Course{

    private PriceCalc priceCalc;

    @Autowired
    public FullStackCourse(PriceCalc priceCalc) {
        this.priceCalc = priceCalc;
    }

    @Override
    public String getProgrammeName() {
        return "Full-stack";
    }

    @Override
    public String calculateCost() {
        return priceCalc.getPrice();
    }


}

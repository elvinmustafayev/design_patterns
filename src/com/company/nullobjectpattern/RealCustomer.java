package com.company.nullobjectpattern;

public class RealCustomer extends AbstractCustomer {



    @Override
    public boolean isNill() {
        return false;
    }

    public RealCustomer(String name) {
        this.name= name;
    }

    @Override
    public String getName() {
        return name;
    }
}

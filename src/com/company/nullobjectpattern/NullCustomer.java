package com.company.nullobjectpattern;

public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNill() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available in Customer Database";
    }
}
